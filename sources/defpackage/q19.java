package defpackage;

import java.util.concurrent.Callable;

/* renamed from: q19  reason: default package */
public final class q19 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ t19 o;

    public /* synthetic */ q19(t19 t19, long j, long j2, int i) {
        this.a = i;
        this.o = t19;
        this.b = j;
        this.c = j2;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                t19 t19 = this.o;
                p19 p19 = t19.r;
                ilc ilc = t19.a;
                q36 f = p19.f();
                f.j(1, this.b);
                f.j(2, this.c);
                try {
                    ilc.c();
                    f.n();
                    ilc.r();
                    ilc.l();
                    p19.t(f);
                    return e5f.a;
                } catch (Throwable th) {
                    p19.t(f);
                    throw th;
                }
            default:
                t19 t192 = this.o;
                p19 p192 = t192.s;
                ilc ilc2 = t192.a;
                q36 f2 = p192.f();
                f2.j(1, this.b);
                f2.j(2, this.c);
                try {
                    ilc2.c();
                    f2.n();
                    ilc2.r();
                    ilc2.l();
                    p192.t(f2);
                    return e5f.a;
                } catch (Throwable th2) {
                    p192.t(f2);
                    throw th2;
                }
        }
    }
}
