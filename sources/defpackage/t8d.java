package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: t8d  reason: default package */
public final class t8d extends d8d {
    public static long c = 0;
    public static final /* synthetic */ int o = 0;
    public final boolean b;

    static {
        int i = ft4.o;
    }

    public t8d(boolean z) {
        this.b = z;
    }

    public final ExecutorService k(iba iba, vi4 vi4) {
        ExecutorService i = iba.i(iba.b().a(10, "logout"), "logout");
        i.submit(new kc(11));
        return i;
    }

    public final boolean v() {
        return true;
    }

    public final void x() {
        Class<t8d> cls = t8d.class;
        String name = cls.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            int i = ft4.o;
            ir6.d(us7, name, "process ".concat(ft4.j(ft4.g(z7.S(System.nanoTime(), kt4.NANOSECONDS), c))), (Throwable) null);
        }
        int i2 = ft4.o;
        long nanoTime = System.nanoTime();
        kt4 kt4 = kt4.NANOSECONDS;
        long S = z7.S(nanoTime, kt4);
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        ((ku7) e8d.G.getValue()).a(this.b);
        t().c(new pi0());
        String name2 = cls.getName();
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.X, name2, "process finish ".concat(ft4.j(ft4.g(z7.S(System.nanoTime(), kt4), S))), (Throwable) null);
        }
    }
}
