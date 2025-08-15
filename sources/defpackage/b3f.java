package defpackage;

/* renamed from: b3f  reason: default package */
public final class b3f {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public b3f(int i) {
        switch (i) {
            case 1:
                this.a = new byte[10];
                return;
            default:
                this.a = new byte[10];
                return;
        }
    }

    public void a(xze xze, vze vze) {
        if (this.c > 0) {
            xze.b(this.d, this.e, this.f, this.g, vze);
            this.c = 0;
        }
    }

    public void b(yze yze, wze wze) {
        if (this.c > 0) {
            yze.a(this.d, this.e, this.f, this.g, wze);
            this.c = 0;
        }
    }

    public void c(xze xze, long j, int i, int i2, int i3, vze vze) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(xze, vze);
            }
        }
    }

    public void d(yze yze, long j, int i, int i2, int i3, wze wze) {
        fm9.j("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                b(yze, wze);
            }
        }
    }

    public void e(ma5 ma5) {
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            ma5.l(0, bArr, 10);
            ma5.y();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b2 = bArr[7];
                if ((b2 & 254) == 186) {
                    i = 40 << ((bArr[(b2 & 255) == 187 ? (char) 9 : 8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.b = true;
            }
        }
    }

    public void f(na5 na5) {
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            na5.l(0, bArr, 10);
            na5.y();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b2 = bArr[7];
                if ((b2 & 254) == 186) {
                    i = 40 << ((bArr[(b2 & 255) == 187 ? (char) 9 : 8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.b = true;
            }
        }
    }
}
