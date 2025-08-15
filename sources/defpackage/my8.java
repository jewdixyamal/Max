package defpackage;

import java.util.concurrent.Callable;

/* renamed from: my8  reason: default package */
public final class my8 implements Callable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public my8(oy8 oy8, long j, long j2, String str) {
        this.X = oy8;
        this.c = j;
        this.o = j2;
        this.b = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                oy8 oy8 = (oy8) this.X;
                th thVar = oy8.c;
                ilc ilc = oy8.a;
                q36 f = thVar.f();
                f.j(1, this.c);
                f.j(2, this.o);
                String str = this.b;
                if (str == null) {
                    f.W(3);
                } else {
                    f.f(3, str);
                }
                try {
                    ilc.c();
                    f.n();
                    ilc.r();
                    ilc.l();
                    thVar.t(f);
                    return null;
                } catch (Throwable th) {
                    thVar.t(f);
                    throw th;
                }
            default:
                mtf mtf = (mtf) this.X;
                zkc zkc = mtf.d;
                ilc ilc2 = mtf.a;
                q36 f2 = zkc.f();
                String str2 = this.b;
                if (str2 == null) {
                    f2.W(1);
                } else {
                    f2.f(1, str2);
                }
                f2.j(2, this.c);
                f2.j(3, this.o);
                try {
                    ilc2.c();
                    Integer valueOf = Integer.valueOf(f2.n());
                    ilc2.r();
                    ilc2.l();
                    zkc.t(f2);
                    return valueOf;
                } catch (Throwable th2) {
                    zkc.t(f2);
                    throw th2;
                }
        }
    }

    public my8(mtf mtf, String str, long j, long j2) {
        this.X = mtf;
        this.b = str;
        this.c = j;
        this.o = j2;
    }
}
