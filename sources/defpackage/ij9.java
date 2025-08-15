package defpackage;

/* renamed from: ij9  reason: default package */
public final /* synthetic */ class ij9 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj9 b;

    public /* synthetic */ ij9(lj9 lj9, int i) {
        this.a = i;
        this.b = lj9;
    }

    public final void accept(Object obj) {
        lj9 lj9 = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                lj9.getClass();
                hm9.k("lj9", "hideControls");
                hkf a2 = lj9.z0.a();
                a2.a = false;
                hkf hkf = new hkf(a2);
                lj9.z0 = hkf;
                ((pl9) ((kk9) lj9.b)).d(hkf);
                kj9 kj9 = lj9.u0;
                if (kj9 != null) {
                    kj9.r(false);
                    return;
                }
                return;
            case 1:
                fef fef = (fef) obj;
                g8c g8c = lj9.B0;
                if (g8c != null) {
                    g8c.d = fef;
                    hm9.m("g8c", "sendVideoRePlayStat", new Object[0]);
                    int i = g8c.b;
                    g8c.f("replay", (Object) null, (String) null, (String) null, i == 1, g8c.a(), i == 5, i == 3 ? "auto" : null);
                }
                String str = lj9.A0.d;
                ((bq7) lj9.c).s(fef, lj9);
                hkf a3 = lj9.z0.a();
                a3.n = fef;
                a3.p = null;
                a3.q = null;
                hkf hkf2 = new hkf(a3);
                lj9.z0 = hkf2;
                pl9 pl9 = (pl9) ((kk9) lj9.b);
                pl9.d(hkf2);
                lj9.n2();
                pl9.b(lj9);
                return;
            case 2:
                lj9.d2((Throwable) obj);
                return;
            case 3:
                Long l2 = (Long) obj;
                lj9.getClass();
                hkf a4 = lj9.z0.a();
                k20 k20 = lj9.A0;
                m7b m7b = lj9.t0;
                a4.h = s5c.a0(m7b, k20);
                hkf hkf3 = new hkf(a4);
                lj9.z0 = hkf3;
                ((pl9) ((kk9) lj9.b)).d(hkf3);
                if (!s5c.Q(m7b, lj9.A0)) {
                    cqc.b(lj9.F0);
                    lj9.i2();
                    return;
                }
                return;
            default:
                Long l3 = (Long) obj;
                hkf a5 = lj9.z0.a();
                bq7 bq7 = (bq7) lj9.c;
                a5.k = bq7.f();
                a5.l = bq7.d();
                a5.q = null;
                a5.p = null;
                hkf hkf4 = new hkf(a5);
                lj9.z0 = hkf4;
                ((pl9) ((kk9) lj9.b)).d(hkf4);
                return;
        }
    }
}
