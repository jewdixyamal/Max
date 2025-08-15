package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: c96  reason: default package */
public final /* synthetic */ class c96 implements n4d {
    public final /* synthetic */ z96 a;

    public /* synthetic */ c96(z96 z96) {
        this.a = z96;
    }

    public final void B1(Set set) {
        Boolean valueOf = Boolean.valueOf(set.size() >= 100);
        z96 z96 = this.a;
        z96.v0.m((Object) null, valueOf);
        int size = set.size();
        hm9.m("z96", "onSelectedMediasChangeListener(), selectedCount " + size, new Object[0]);
        if (!set.isEmpty()) {
            vxd vxd = z96.L0;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            z96.L0 = pnf.n(z96, z96.o, (vx3) null, new t96(z96, set, (Continuation) null), 2);
        } else {
            z96.r(z96, false, 1);
        }
        ArrayList x = dy7.x(z96.F0);
        s86 s86 = z96.Y;
        s86.getClass();
        pnf.o(s86.c, new m86(x));
    }
}
