package defpackage;

/* renamed from: ge9  reason: default package */
public final class ge9 implements cw4 {
    public final yaf a;
    public final ie9 b;
    public final String c;
    public xze d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public ge9(String str) {
        yaf yaf = new yaf(4);
        this.a = yaf;
        yaf.a[0] = -1;
        this.b = new ie9(0);
        this.l = -9223372036854775807L;
        this.c = str;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public final void f(yaf yaf) {
        np8.g(this.d);
        while (yaf.c() > 0) {
            int i2 = this.f;
            yaf yaf2 = this.a;
            if (i2 == 0) {
                byte[] bArr = yaf.a;
                int i3 = yaf.b;
                int i4 = yaf.c;
                while (true) {
                    if (i3 >= i4) {
                        yaf.H(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.i && (b2 & 224) == 224;
                    this.i = z;
                    if (z2) {
                        yaf.H(i3 + 1);
                        this.i = false;
                        yaf2.a[1] = bArr[i3];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(yaf.c(), 4 - this.g);
                yaf.g(this.g, yaf2.a, min);
                int i5 = this.g + min;
                this.g = i5;
                if (i5 >= 4) {
                    yaf2.H(0);
                    int h2 = yaf2.h();
                    ie9 ie9 = this.b;
                    if (!ie9.a(h2)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = ie9.d;
                        if (!this.h) {
                            int i6 = ie9.e;
                            this.j = (((long) ie9.h) * 1000000) / ((long) i6);
                            my5 my5 = new my5();
                            my5.a = this.e;
                            my5.k = ie9.c;
                            my5.l = 4096;
                            my5.x = ie9.f;
                            my5.y = i6;
                            my5.c = this.c;
                            this.d.d(new oy5(my5));
                            this.h = true;
                        }
                        yaf2.H(0);
                        this.d.c(4, yaf2);
                        this.f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(yaf.c(), this.k - this.g);
                this.d.c(min2, yaf);
                int i7 = this.g + min2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j2 = this.l;
                    if (j2 != -9223372036854775807L) {
                        this.d.b(j2, 1, i8, 0, (vze) null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void g(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.l = j2;
        }
    }

    public final void h() {
    }

    public final void j(oa5 oa5, l3f l3f) {
        l3f.a();
        l3f.b();
        this.e = l3f.f;
        l3f.b();
        this.d = oa5.B(l3f.e, 1);
    }
}
