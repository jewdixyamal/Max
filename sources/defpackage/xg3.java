package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: xg3  reason: default package */
public final /* synthetic */ class xg3 implements zg3 {
    public final /* synthetic */ m5d a;
    public final /* synthetic */ oh8 b;

    public /* synthetic */ xg3(m5d m5d, oh8 oh8, k3b k3b) {
        this.a = m5d;
        this.b = oh8;
    }

    public final bm7 run() {
        ii8 ii8 = (ii8) ((WeakReference) this.a.X).get();
        if (ii8 != null) {
            ii8.p(this.b);
        }
        return ew6.b;
    }
}
