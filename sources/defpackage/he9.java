package defpackage;

/* renamed from: he9  reason: default package */
public final class he9 implements dw4 {
    public final wpa a;
    public final ie9 b;
    public final String c;
    public final int d;
    public yze e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public he9(String str, int i2) {
        wpa wpa = new wpa(4);
        this.a = wpa;
        wpa.a[0] = -1;
        this.b = new ie9(1);
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i2;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    public final void d(wpa wpa) {
        fm9.l(this.e);
        while (wpa.a() > 0) {
            int i2 = this.g;
            boolean z = true;
            wpa wpa2 = this.a;
            if (i2 == 0) {
                byte[] bArr = wpa.a;
                int i3 = wpa.b;
                int i4 = wpa.c;
                while (true) {
                    if (i3 >= i4) {
                        wpa.G(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z2 = (b2 & 255) == 255;
                    boolean z3 = this.j && (b2 & 224) == 224;
                    this.j = z2;
                    if (z3) {
                        wpa.G(i3 + 1);
                        this.j = false;
                        wpa2.a[1] = bArr[i3];
                        this.h = 2;
                        this.g = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(wpa.a(), 4 - this.h);
                wpa.e(this.h, wpa2.a, min);
                int i5 = this.h + min;
                this.h = i5;
                if (i5 >= 4) {
                    wpa2.G(0);
                    int g2 = wpa2.g();
                    ie9 ie9 = this.b;
                    if (!ie9.a(g2)) {
                        this.h = 0;
                        this.g = 1;
                    } else {
                        this.l = ie9.d;
                        if (!this.i) {
                            this.k = (((long) ie9.h) * 1000000) / ((long) ie9.e);
                            ny5 ny5 = new ny5();
                            ny5.a = this.f;
                            ny5.m = ia9.l(ie9.c);
                            ny5.n = 4096;
                            ny5.A = ie9.f;
                            ny5.B = ie9.e;
                            ny5.d = this.c;
                            ny5.f = this.d;
                            this.e.e(new qy5(ny5));
                            this.i = true;
                        }
                        wpa2.G(0);
                        this.e.b(wpa2, 4, 0);
                        this.g = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(wpa.a(), this.l - this.h);
                this.e.b(wpa, min2, 0);
                int i6 = this.h + min2;
                this.h = i6;
                if (i6 >= this.l) {
                    if (this.m == -9223372036854775807L) {
                        z = false;
                    }
                    fm9.k(z);
                    this.e.a(this.m, 1, this.l, 0, (wze) null);
                    this.m += this.k;
                    this.h = 0;
                    this.g = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void e(boolean z) {
    }

    public final void g(int i2, long j2) {
        this.m = j2;
    }

    public final void i(pa5 pa5, l3f l3f) {
        l3f.a();
        l3f.b();
        this.f = l3f.f;
        l3f.b();
        this.e = pa5.B(l3f.e, 1);
    }
}
