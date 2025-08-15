package defpackage;

import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: tdf  reason: default package */
public final class tdf extends ol implements lme {
    public final int X = 100;
    public final boolean Y;
    public final String Z;
    public final long o;

    public tdf(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.Y = z;
        this.Z = tdf.class.getName();
    }

    public final void e(gle gle) {
        udf udf = (udf) gle;
        jc7 jc7 = new jc7();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (r71 r71 : udf.c) {
            e52 z = m().z(r71.a);
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            fs8 fs8 = r71.b;
            if (i == 0 || fs8.b < j2) {
                j2 = fs8.b;
            }
            if (j3 == 0 || fs8.b > j3) {
                j3 = fs8.b;
            }
            if (z != null) {
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((k24) ((c34) plVar.Q.getValue())).c.e(z.a, ((p7b) r()).a.t(), fs8);
            } else {
                jc7.a(Long.valueOf(r71.a), Long.valueOf(fs8.a));
            }
            j = 0;
        }
        String G = nu0.G(Long.valueOf(j2));
        String G2 = nu0.G(Long.valueOf(j3));
        int b = jc7.b();
        StringBuilder k = k7d.k("onSuccess: startTime: ", G, " endTime: ", G2, " missedMessages: ");
        k.append(b);
        hm9.m(this.Z, k.toString(), new Object[0]);
        av0 l = l();
        long j4 = udf.o;
        long j5 = udf.X;
        boolean z2 = udf.Y;
        long j6 = this.a;
        vdf vdf = r2;
        vdf vdf2 = new vdf(j6, j2, j3, j4, j5, z2, jc7);
        l.c(vdf);
    }

    public final void g(pke pke) {
        l().c(new oi0(this.a, pke));
    }

    public final dle i() {
        gs9 gs9 = new gs9((sla) null, 14);
        long j = this.o;
        if (j > 0) {
            gs9.i(j, "marker");
        }
        gs9.e(this.X, NewHtcHomeBadger.COUNT);
        gs9.d("forward", this.Y);
        return gs9;
    }
}
