package defpackage;

import java.util.concurrent.Callable;

/* renamed from: itf  reason: default package */
public final class itf implements Callable {
    public final /* synthetic */ mtf X;
    public final /* synthetic */ boolean a = true;
    public final /* synthetic */ boolean b = true;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public itf(mtf mtf, long j, long j2) {
        this.X = mtf;
        this.c = j;
        this.o = j2;
    }

    public final Object call() {
        mtf mtf = this.X;
        zkc zkc = mtf.e;
        ilc ilc = mtf.a;
        q36 f = zkc.f();
        f.j(1, this.a ? 1 : 0);
        f.j(2, this.b ? 1 : 0);
        f.j(3, this.c);
        f.j(4, this.o);
        try {
            ilc.c();
            Integer valueOf = Integer.valueOf(f.n());
            ilc.r();
            ilc.l();
            zkc.t(f);
            return valueOf;
        } catch (Throwable th) {
            zkc.t(f);
            throw th;
        }
    }
}
