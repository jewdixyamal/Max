package defpackage;

/* renamed from: f3f  reason: default package */
public final class f3f implements nm0 {
    public final tue a;
    public final wpa b = new wpa();
    public final int c;
    public final int o = 112800;

    public f3f(int i, tue tue) {
        this.c = i;
        this.a = tue;
    }

    public final void f() {
        byte[] bArr = oaf.f;
        wpa wpa = this.b;
        wpa.getClass();
        wpa.E(bArr.length, bArr);
    }

    public final lm0 g(sa4 sa4, long j) {
        sa4 sa42 = sa4;
        long j2 = sa42.o;
        int min = (int) Math.min((long) this.o, sa42.c - j2);
        wpa wpa = this.b;
        wpa.D(min);
        sa42.q(wpa.a, 0, min, false);
        int i = wpa.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (wpa.a() >= 188) {
            byte[] bArr = wpa.a;
            int i2 = wpa.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long C = wmd.C(wpa, i2, this.c);
            if (C != -9223372036854775807L) {
                long b2 = this.a.b(C);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new lm0(-1, b2, j2) : new lm0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + b2 > j) {
                    return new lm0(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = b2;
                j4 = (long) i2;
            }
            wpa.G(i3);
            j3 = (long) i3;
        }
        return j5 != -9223372036854775807L ? new lm0(-2, j5, j2 + j3) : lm0.e;
    }
}
