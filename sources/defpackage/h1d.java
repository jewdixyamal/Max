package defpackage;

/* renamed from: h1d  reason: default package */
public final class h1d implements n3f {
    public final f1d a;
    public final wpa b = new wpa(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public h1d(f1d f1d) {
        this.a = f1d;
    }

    public final void a() {
        this.f = true;
    }

    public final void b(tue tue, pa5 pa5, l3f l3f) {
        this.a.b(tue, pa5, l3f);
        this.f = true;
    }

    public final void c(int i, wpa wpa) {
        boolean z = (i & 1) != 0;
        int u = z ? wpa.b + wpa.u() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                wpa.G(u);
                this.d = 0;
            } else {
                return;
            }
        }
        while (wpa.a() > 0) {
            int i2 = this.d;
            wpa wpa2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int u2 = wpa.u();
                    wpa.G(wpa.b - 1);
                    if (u2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(wpa.a(), 3 - this.d);
                wpa.e(this.d, wpa2.a, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    wpa2.G(0);
                    wpa2.F(3);
                    wpa2.H(1);
                    int u3 = wpa2.u();
                    int u4 = wpa2.u();
                    this.e = (u3 & 128) != 0;
                    int i4 = (((u3 & 15) << 8) | u4) + 3;
                    this.c = i4;
                    byte[] bArr = wpa2.a;
                    if (bArr.length < i4) {
                        wpa2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(wpa.a(), this.c - this.d);
                wpa.e(this.d, wpa2.a, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        wpa2.F(i6);
                    } else if (oaf.n(0, i6, -1, wpa2.a) != 0) {
                        this.f = true;
                        return;
                    } else {
                        wpa2.F(this.c - 4);
                    }
                    wpa2.G(0);
                    this.a.d(wpa2);
                    this.d = 0;
                }
            }
        }
    }
}
