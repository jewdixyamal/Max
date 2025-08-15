package defpackage;

/* renamed from: im5  reason: default package */
public final class im5 implements nm0 {
    public final qm5 a;
    public final int b;
    public final lh4 c = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [lh4, java.lang.Object] */
    public im5(qm5 qm5, int i) {
        this.a = qm5;
        this.b = i;
    }

    public final long a(sa4 sa4) {
        long j;
        lh4 lh4;
        qm5 qm5;
        boolean z;
        int d;
        sa4 sa42 = sa4;
        while (true) {
            long r = sa4.r();
            j = sa42.c;
            int i = (r > (j - 6) ? 1 : (r == (j - 6) ? 0 : -1));
            lh4 = this.c;
            qm5 = this.a;
            if (i >= 0) {
                break;
            }
            long r2 = sa4.r();
            int i2 = 2;
            byte[] bArr = new byte[2];
            sa42.q(bArr, 0, 2, false);
            byte b2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.b;
            if (b2 != i3) {
                sa42.Y = 0;
                sa42.b((int) (r2 - sa42.o), false);
                z = false;
            } else {
                wpa wpa = new wpa(16);
                System.arraycopy(bArr, 0, wpa.a, 0, 2);
                byte[] bArr2 = wpa.a;
                int i4 = 0;
                while (i4 < 14 && (d = sa42.d(i2 + i4, bArr2, 14 - i4)) != -1) {
                    i4 += d;
                    i2 = 2;
                }
                wpa.F(i4);
                sa42.Y = 0;
                sa42.b((int) (r2 - sa42.o), false);
                z = z7.b(wpa, qm5, i3, lh4);
            }
            if (z) {
                break;
            }
            sa42.b(1, false);
        }
        if (sa4.r() < j - 6) {
            return lh4.a;
        }
        sa42.b((int) (j - sa4.r()), false);
        return qm5.k;
    }

    public final lm0 g(sa4 sa4, long j) {
        sa4 sa42 = sa4;
        long j2 = sa42.o;
        long a2 = a(sa4);
        long r = sa4.r();
        sa42.b(Math.max(6, this.a.d), false);
        long a3 = a(sa4);
        return (a2 > j || a3 <= j) ? a3 <= j ? new lm0(-2, a3, sa4.r()) : new lm0(-1, a2, j2) : new lm0(0, -9223372036854775807L, r);
    }
}
