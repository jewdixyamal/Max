package defpackage;

import java.io.IOException;

/* renamed from: rnb  reason: default package */
public final class rnb implements grc {
    public final int a;
    public final /* synthetic */ vnb b;

    public rnb(vnb vnb, int i) {
        this.b = vnb;
        this.a = i;
    }

    public final void c() {
        vnb vnb = this.b;
        vnb.E0[this.a].u();
        int p = vnb.o.p(vnb.O0);
        vq7 vq7 = vnb.w0;
        IOException iOException = (IOException) vq7.o;
        if (iOException == null) {
            eo7 eo7 = (eo7) vq7.c;
            if (eo7 != null) {
                if (p == Integer.MIN_VALUE) {
                    p = eo7.b;
                }
                IOException iOException2 = eo7.o;
                if (iOException2 != null && eo7.X > p) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean d() {
        vnb vnb = this.b;
        return !vnb.D() && vnb.E0[this.a].s(vnb.X0);
    }

    public final int e(long j) {
        vnb vnb = this.b;
        if (vnb.D()) {
            return 0;
        }
        int i = this.a;
        vnb.x(i);
        erc erc = vnb.E0[i];
        int p = erc.p(j, vnb.X0);
        erc.B(p);
        if (p == 0) {
            vnb.y(i);
        }
        return p;
    }

    public final int j(y7g y7g, p54 p54, int i) {
        vnb vnb = this.b;
        if (vnb.D()) {
            return -3;
        }
        int i2 = this.a;
        vnb.x(i2);
        int x = vnb.E0[i2].x(y7g, p54, i, vnb.X0);
        if (x == -3) {
            vnb.y(i2);
        }
        return x;
    }
}
