package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: jn6  reason: default package */
public final class jn6 implements frc {
    public final int a;
    public final sn6 b;
    public int c = -1;

    public jn6(sn6 sn6, int i) {
        this.b = sn6;
        this.a = i;
    }

    public final void a() {
        np8.d(this.c == -1);
        sn6 sn6 = this.b;
        sn6.d();
        sn6.V0.getClass();
        int[] iArr = sn6.V0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = sn6.Y0;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.c = i2;
            }
        } else if (sn6.U0.contains(sn6.T0.a(i))) {
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
        sn6 sn6 = this.b;
        if (i == -2) {
            sn6.d();
            String str = sn6.T0.a(this.a).c[0].w0;
            StringBuilder sb = new StringBuilder(rh4.e(60, str));
            sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
            sb.append(str);
            sb.append(".");
            throw new IOException(sb.toString());
        } else if (i == -1) {
            sn6.u();
        } else if (i != -3) {
            sn6.u();
            sn6.G0[i].v();
        }
    }

    public final boolean d() {
        if (this.c != -3) {
            if (b()) {
                int i = this.c;
                sn6 sn6 = this.b;
                if (sn6.m() || !sn6.G0[i].t(sn6.e1)) {
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
        sn6 sn6 = this.b;
        if (sn6.m()) {
            return 0;
        }
        qn6 qn6 = sn6.G0[i2];
        int q = qn6.q(j, sn6.e1);
        cm6 cm6 = (cm6) mqd.n(sn6.y0);
        if (cm6 == null || cm6.V0) {
            i = q;
        } else {
            i = Math.min(q, cm6.f(i2) - qn6.o());
        }
        qn6.B(i);
        return i;
    }

    public final int g(imc imc, o54 o54, int i) {
        oy5 oy5;
        imc imc2 = imc;
        o54 o542 = o54;
        int i2 = -3;
        if (this.c == -3) {
            o542.a(4);
            return -4;
        }
        if (b()) {
            int i3 = this.c;
            sn6 sn6 = this.b;
            if (!sn6.m()) {
                ArrayList arrayList = sn6.y0;
                int i4 = 0;
                if (!arrayList.isEmpty()) {
                    int i5 = 0;
                    loop0:
                    while (i5 < arrayList.size() - 1) {
                        int i6 = ((cm6) arrayList.get(i5)).v0;
                        int length = sn6.G0.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (sn6.Y0[i7] && sn6.G0[i7].x() == i6) {
                                break loop0;
                            }
                        }
                        i5++;
                    }
                    maf.I(arrayList, 0, i5);
                    cm6 cm6 = (cm6) arrayList.get(0);
                    oy5 oy52 = cm6.o;
                    if (!oy52.equals(sn6.R0)) {
                        sn6.v0.b(sn6.b, oy52, cm6.X, cm6.Y, cm6.Z);
                    }
                    sn6.R0 = oy52;
                }
                if ((arrayList.isEmpty() || ((cm6) arrayList.get(0)).V0) && (i2 = sn6.G0[i3].y(imc2, o542, i, sn6.e1)) == -5) {
                    oy5 oy53 = (oy5) imc2.c;
                    oy53.getClass();
                    if (i3 == sn6.M0) {
                        int x = sn6.G0[i3].x();
                        while (i4 < arrayList.size() && ((cm6) arrayList.get(i4)).v0 != x) {
                            i4++;
                        }
                        if (i4 < arrayList.size()) {
                            oy5 = ((cm6) arrayList.get(i4)).o;
                        } else {
                            oy5 = sn6.Q0;
                            oy5.getClass();
                        }
                        oy53 = oy53.d(oy5);
                    }
                    imc2.c = oy53;
                }
            }
        }
        return i2;
    }
}
