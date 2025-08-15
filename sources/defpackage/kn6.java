package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: kn6  reason: default package */
public final class kn6 implements grc {
    public final int a;
    public final tn6 b;
    public int c = -1;

    public kn6(tn6 tn6, int i) {
        this.b = tn6;
        this.a = i;
    }

    public final void a() {
        fm9.f(this.c == -1);
        tn6 tn6 = this.b;
        tn6.d();
        tn6.V0.getClass();
        int[] iArr = tn6.V0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = tn6.Y0;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (tn6.U0.contains(tn6.T0.a(i))) {
            i2 = -3;
            this.c = i2;
        }
        i2 = -2;
        this.c = i2;
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public final void c() {
        int i = this.c;
        tn6 tn6 = this.b;
        if (i == -2) {
            tn6.d();
            throw new IOException(zr6.i("Unable to bind a sample queue to TrackGroup with MIME type ", tn6.T0.a(this.a).d[0].n, "."));
        } else if (i == -1) {
            tn6.D();
        } else if (i != -3) {
            tn6.D();
            tn6.G0[i].u();
        }
    }

    public final boolean d() {
        if (this.c != -3) {
            if (b()) {
                int i = this.c;
                tn6 tn6 = this.b;
                if (tn6.z() || !tn6.G0[i].s(tn6.e1)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int e(long j) {
        int i;
        if (!b()) {
            return 0;
        }
        int i2 = this.c;
        tn6 tn6 = this.b;
        if (tn6.z()) {
            return 0;
        }
        rn6 rn6 = tn6.G0[i2];
        int p = rn6.p(j, tn6.e1);
        dm6 dm6 = (dm6) mqd.n(tn6.y0);
        if (dm6 == null || dm6.W0) {
            i = p;
        } else {
            i = Math.min(p, dm6.f(i2) - rn6.n());
        }
        rn6.B(i);
        return i;
    }

    public final int j(y7g y7g, p54 p54, int i) {
        qy5 qy5;
        y7g y7g2 = y7g;
        p54 p542 = p54;
        int i2 = -3;
        if (this.c == -3) {
            p542.a(4);
            return -4;
        }
        if (b()) {
            int i3 = this.c;
            tn6 tn6 = this.b;
            if (!tn6.z()) {
                ArrayList arrayList = tn6.y0;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    loop0:
                    while (i5 < arrayList.size() - 1) {
                        int i6 = ((dm6) arrayList.get(i5)).v0;
                        int length = tn6.G0.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (tn6.Y0[i7] && tn6.G0[i7].w() == ((long) i6)) {
                                break loop0;
                            }
                        }
                        i5++;
                    }
                    oaf.X(arrayList, 0, i5);
                    dm6 dm6 = (dm6) arrayList.get(0);
                    qy5 qy52 = dm6.o;
                    if (!qy52.equals(tn6.R0)) {
                        tn6.v0.m(tn6.b, qy52, dm6.X, dm6.Y, dm6.Z);
                    }
                    tn6.R0 = qy52;
                }
                if ((arrayList.isEmpty() || ((dm6) arrayList.get(0)).W0) && (i2 = tn6.G0[i3].x(y7g2, p542, i, tn6.e1)) == -5) {
                    qy5 qy53 = (qy5) y7g2.c;
                    qy53.getClass();
                    if (i3 == tn6.M0) {
                        int l = s5c.l(tn6.G0[i3].w());
                        while (i4 < arrayList.size() && ((dm6) arrayList.get(i4)).v0 != l) {
                            i4++;
                        }
                        if (i4 < arrayList.size()) {
                            qy5 = ((dm6) arrayList.get(i4)).o;
                        } else {
                            qy5 = tn6.Q0;
                            qy5.getClass();
                        }
                        qy53 = qy53.f(qy5);
                    }
                    y7g2.c = qy53;
                }
            }
        }
        return i2;
    }
}
