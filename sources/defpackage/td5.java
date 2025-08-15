package defpackage;

import java.util.concurrent.Callable;

/* renamed from: td5  reason: default package */
public final class td5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                ud5 ud5 = (ud5) this.c;
                th thVar = ud5.X;
                ilc ilc = ud5.a;
                q36 f = thVar.f();
                f.j(1, this.b);
                try {
                    ilc.c();
                    Integer valueOf = Integer.valueOf(f.n());
                    ilc.r();
                    ilc.l();
                    thVar.t(f);
                    return valueOf;
                } catch (Throwable th) {
                    thVar.t(f);
                    throw th;
                }
            case 1:
                ew9 ew9 = (ew9) this.c;
                p19 p19 = ew9.o;
                ilc ilc2 = ew9.a;
                q36 f2 = p19.f();
                f2.j(1, this.b);
                try {
                    ilc2.c();
                    f2.n();
                    ilc2.r();
                    ilc2.l();
                    p19.t(f2);
                    return e5f.a;
                } catch (Throwable th2) {
                    p19.t(f2);
                    throw th2;
                }
            case 2:
                yx9 yx9 = (yx9) this.c;
                p19 p192 = yx9.c;
                ilc ilc3 = yx9.a;
                q36 f3 = p192.f();
                f3.j(1, this.b);
                try {
                    ilc3.c();
                    Integer valueOf2 = Integer.valueOf(f3.n());
                    ilc3.r();
                    ilc3.l();
                    p192.t(f3);
                    return valueOf2;
                } catch (Throwable th3) {
                    p192.t(f3);
                    throw th3;
                }
            case 3:
                alc alc = (alc) this.c;
                p19 p193 = alc.j;
                ilc ilc4 = alc.a;
                q36 f4 = p193.f();
                f4.j(1, this.b);
                try {
                    ilc4.c();
                    f4.n();
                    ilc4.r();
                    ilc4.l();
                    p193.t(f4);
                    return e5f.a;
                } catch (Throwable th4) {
                    p193.t(f4);
                    throw th4;
                }
            default:
                w8f w8f = (w8f) this.c;
                zkc zkc = w8f.d;
                ilc ilc5 = w8f.a;
                q36 f5 = zkc.f();
                f5.j(1, this.b);
                try {
                    ilc5.c();
                    f5.n();
                    ilc5.r();
                    ilc5.l();
                    zkc.t(f5);
                    return null;
                } catch (Throwable th5) {
                    zkc.t(f5);
                    throw th5;
                }
        }
    }
}
