package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: wjc  reason: default package */
public final class wjc implements ide {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public ide b = null;

    public final void a(ide ide) {
        this.b = ide;
        for (vjc vjc : this.a) {
            if (!vjc.g()) {
                vjc.p(ide);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g0, java.lang.Object, vjc] */
    public final Object get() {
        ? g0Var = new g0();
        g0Var.h = null;
        g0Var.p(this.b);
        this.a.add(g0Var);
        return g0Var;
    }
}
