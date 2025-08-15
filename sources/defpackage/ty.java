package defpackage;

/* renamed from: ty  reason: default package */
public final class ty implements mm0 {
    public int a;
    public int b;
    public Object c;
    public Object o;

    public ty(int i, int i2, lx3 lx3, mn5 mn5) {
        this.c = mn5;
        this.a = i;
        this.b = i2;
        this.o = lx3;
    }

    public f1f a() {
        return new f1f((String) this.c, this.a, this.b, (String) this.o);
    }

    public void b(String str) {
        String l = ia9.l(str);
        boolean z = l == null || ia9.h(l);
        fm9.e("Not an audio MIME type: " + l, z);
        this.c = l;
    }

    public void c(String str) {
        String l = ia9.l(str);
        boolean z = l == null || ia9.k(l);
        fm9.e("Not a video MIME type: " + l, z);
        this.o = l;
    }

    public void f() {
        byte[] bArr = maf.f;
        yaf yaf = (yaf) this.o;
        yaf.getClass();
        yaf.F(bArr.length, bArr);
    }

    public lm0 h(ra4 ra4, long j) {
        ra4 ra42 = ra4;
        long j2 = ra42.o;
        int min = (int) Math.min((long) this.b, ra42.c - j2);
        yaf yaf = (yaf) this.o;
        yaf.E(min);
        ra42.q(yaf.a, 0, min, false);
        int i = yaf.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (yaf.c() >= 188) {
            byte[] bArr = yaf.a;
            int i2 = yaf.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long X = s5c.X(yaf, i2, this.a);
            if (X != -9223372036854775807L) {
                long b2 = ((sue) this.c).b(X);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new lm0(-1, b2, j2) : new lm0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + b2 > j) {
                    return new lm0(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = b2;
                j4 = (long) i2;
            }
            yaf.H(i3);
            j3 = (long) i3;
        }
        return j5 != -9223372036854775807L ? new lm0(-2, j5, j2 + j3) : lm0.d;
    }

    public ty(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        np8.d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.o = fArr2;
        this.b = i2;
    }
}
