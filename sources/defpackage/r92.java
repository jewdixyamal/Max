package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: r92  reason: default package */
public final class r92 implements r29 {
    public final y7g a;

    public r92(y7g y7g) {
        this.a = y7g;
    }

    public final List a(e52 e52) {
        CharSequence charSequence;
        od0 od0;
        e52 e522 = e52;
        jk0 jk0 = jk0.a;
        kk0 kk0 = kk0.b;
        if (e522 != null && e52.K()) {
            eqe eqe = new eqe(oda.S);
            iqe iqe = jqe.a;
            String g = e522.g(kk0, jk0);
            if (e52.K()) {
                charSequence = null;
            } else {
                e52.l0();
                charSequence = e522.x0;
            }
            long f = e52.f();
            y7g y7g = this.a;
            if (e52.K()) {
                od0 = (od0) ((je7) y7g.c).getValue();
            } else {
                y7g.getClass();
                od0 = null;
            }
            return Collections.singletonList(new v92((jqe) eqe, (jqe) iqe, g, charSequence, f, od0, y53.M(new eqe(oda.P), new eqe(oda.Q), new eqe(oda.R))));
        } else if (e522 == null || !e52.J()) {
            return nz4.a;
        } else {
            iqe iqe2 = new iqe(e52.q());
            eqe eqe2 = new eqe(oda.P0);
            String g2 = e522.g(kk0, jk0);
            e52.l0();
            return Collections.singletonList(new v92((jqe) iqe2, eqe2, g2, e522.x0, e52.f(), y53.M(new eqe(oda.M0), new eqe(oda.N0), new eqe(oda.O0)), 32));
        }
    }
}
