package defpackage;

import java.io.IOException;

/* renamed from: qnb  reason: default package */
public final class qnb implements frc {
    public final int a;
    public final /* synthetic */ unb b;

    public qnb(unb unb, int i) {
        this.b = unb;
        this.a = i;
    }

    public final void c() {
        unb unb = this.b;
        unb.D0[this.a].v();
        int v = unb.o.v(unb.M0);
        jo7 jo7 = unb.v0;
        IOException iOException = (IOException) jo7.c;
        if (iOException == null) {
            eo7 eo7 = (eo7) jo7.b;
            if (eo7 != null) {
                if (v == Integer.MIN_VALUE) {
                    v = eo7.b;
                }
                IOException iOException2 = eo7.o;
                if (iOException2 != null && eo7.X > v) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean d() {
        unb unb = this.b;
        return !unb.v() && unb.D0[this.a].t(unb.V0);
    }

    public final int e(long j) {
        unb unb = this.b;
        if (unb.v()) {
            return 0;
        }
        int i = this.a;
        unb.j(i);
        drc drc = unb.D0[i];
        int q = drc.q(j, unb.V0);
        drc.B(q);
        if (q == 0) {
            unb.m(i);
        }
        return q;
    }

    public final int g(imc imc, o54 o54, int i) {
        unb unb = this.b;
        if (unb.v()) {
            return -3;
        }
        int i2 = this.a;
        unb.j(i2);
        int y = unb.D0[i2].y(imc, o54, i, unb.V0);
        if (y == -3) {
            unb.m(i2);
        }
        return y;
    }
}
