package defpackage;

/* renamed from: opb  reason: default package */
public final class opb {
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public final Object g;
    public final Object h;

    public opb(int i) {
        switch (i) {
            case 1:
                this.g = new tue(0);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new wpa();
                return;
            default:
                this.g = new sue(0);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new yaf(3, false);
                return;
        }
    }

    public static int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long e(wpa wpa) {
        wpa wpa2 = wpa;
        int i = wpa2.b;
        if (wpa.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wpa2.e(0, bArr, 9);
        wpa2.G(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b2;
                    long j2 = (long) b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long f(yaf yaf) {
        yaf yaf2 = yaf;
        int i = yaf2.b;
        if (yaf.c() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yaf2.g(0, bArr, 9);
        yaf2.H(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b2;
                    long j2 = (long) b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public void a(ra4 ra4) {
        byte[] bArr = maf.f;
        yaf yaf = (yaf) this.h;
        yaf.getClass();
        yaf.F(bArr.length, bArr);
        this.a = true;
        ra4.Y = 0;
    }

    public void b(sa4 sa4) {
        byte[] bArr = oaf.f;
        wpa wpa = (wpa) this.h;
        wpa.getClass();
        wpa.E(bArr.length, bArr);
        this.a = true;
        sa4.Y = 0;
    }
}
