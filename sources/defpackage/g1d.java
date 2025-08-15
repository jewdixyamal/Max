package defpackage;

/* renamed from: g1d  reason: default package */
public final class g1d implements m3f {
    public final e1d a;
    public final yaf b = new yaf(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public g1d(e1d e1d) {
        this.a = e1d;
    }

    public final void a() {
        this.f = true;
    }

    public final void b(int i, yaf yaf) {
        boolean z = (i & 1) != 0;
        int v = z ? yaf.b + yaf.v() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                yaf.H(v);
                this.d = 0;
            } else {
                return;
            }
        }
        while (yaf.c() > 0) {
            int i2 = this.d;
            yaf yaf2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int v2 = yaf.v();
                    yaf.H(yaf.b - 1);
                    if (v2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(yaf.c(), 3 - this.d);
                yaf.g(this.d, yaf2.a, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    yaf2.H(0);
                    yaf2.G(3);
                    yaf2.I(1);
                    int v3 = yaf2.v();
                    int v4 = yaf2.v();
                    this.e = (v3 & 128) != 0;
                    int i4 = (((v3 & 15) << 8) | v4) + 3;
                    this.c = i4;
                    byte[] bArr = yaf2.a;
                    if (bArr.length < i4) {
                        yaf2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yaf.c(), this.c - this.d);
                yaf.g(this.d, yaf2.a, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = yaf2.a;
                        int i7 = maf.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = maf.m[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        yaf2.G(this.c - 4);
                    } else {
                        yaf2.G(i6);
                    }
                    yaf2.H(0);
                    this.a.f(yaf2);
                    this.d = 0;
                }
            }
        }
    }

    public final void e(sue sue, oa5 oa5, l3f l3f) {
        this.a.e(sue, oa5, l3f);
        this.f = true;
    }
}
