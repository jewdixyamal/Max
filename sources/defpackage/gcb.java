package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: gcb  reason: default package */
public final class gcb {
    public final khe a = new khe(new lab(1));

    public final vlb a(int i, CharSequence charSequence, boolean z) {
        int i2;
        jqe jqe;
        int i3;
        int s = au1.s(i);
        if (s == 0 || s == 1) {
            gqe gqe = new gqe(yea.p1, ys.m0(new Object[]{charSequence}));
            kl7 l = j1e.l();
            l.add(new mg3(wea.R, new eqe(yea.o1), 1, false));
            l.add(new mg3(wea.y, new eqe(yea.n1), 3, false));
            return new vlb(gqe, (jqe) null, j1e.d(l), (Bundle) null);
        } else if (s == 2) {
            if (z) {
                jqe = new eqe(yea.l1);
                i3 = yea.j1;
                i2 = yea.n1;
            } else {
                gqe gqe2 = new gqe(yea.K2, ys.m0(new Object[]{charSequence}));
                i3 = yea.J2;
                gqe gqe3 = gqe2;
                i2 = yea.I2;
                jqe = gqe3;
            }
            eqe eqe = z ? new eqe(yea.i1) : null;
            kl7 l2 = j1e.l();
            l2.add(new mg3(wea.R, new eqe(i3), 1, false));
            l2.add(new mg3(wea.y, new eqe(i2), 3, false));
            return new vlb(jqe, eqe, j1e.d(l2), (Bundle) null);
        } else if (s == 3) {
            return c();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final mg3 b() {
        return (mg3) this.a.getValue();
    }

    public final vlb c() {
        iqe iqe = new iqe("Unsupported chat type");
        kl7 l = j1e.l();
        l.add(new mg3(wea.B, new eqe(yea.L0), 1, false));
        l.add(b());
        return new vlb(iqe, (jqe) null, j1e.d(l), (Bundle) null);
    }
}
