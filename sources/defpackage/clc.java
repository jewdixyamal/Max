package defpackage;

/* renamed from: clc  reason: default package */
public final /* synthetic */ class clc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ elc b;
    public final /* synthetic */ long c;

    public /* synthetic */ clc(elc elc, long j, int i) {
        this.a = i;
        this.b = elc;
        this.c = j;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke() {
        la2 e;
        switch (this.a) {
            case 0:
                elc elc = this.b;
                yrc a2 = elc.d().a(this.c);
                if (a2 == null || (e = elc.c().e(a2.b)) == null) {
                    return null;
                }
                return elc.a(e);
            default:
                long j = this.c;
                elc elc2 = this.b;
                dt2 c2 = elc2.c();
                ilc ilc = c2.a;
                ilc.c();
                try {
                    dt2.c(c2, j);
                    ilc.r();
                    ilc.l();
                    ((t19) elc2.d.getValue()).e(j);
                    xrc d = elc2.d();
                    ilc ilc2 = d.a;
                    ilc2.b();
                    zkc zkc = d.c;
                    q36 f = zkc.f();
                    f.j(1, j);
                    try {
                        ilc2.c();
                        f.n();
                        ilc2.r();
                        ilc2.l();
                        zkc.t(f);
                        return e5f.a;
                    } catch (Throwable th) {
                        zkc.t(f);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ilc.l();
                    throw th2;
                }
        }
    }
}
