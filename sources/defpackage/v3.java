package defpackage;

/* renamed from: v3  reason: default package */
public final class v3 implements la5 {
    public final t3 a = new t3((String) null, 0, 1);
    public final wpa b = new wpa(16384);
    public boolean c;

    public final void S(pa5 pa5) {
        this.a.i(pa5, new l3f(0, 1, 1, (byte) 0));
        pa5.w();
        pa5.J(new wd0(-9223372036854775807L));
    }

    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final int g(na5 na5, lh4 lh4) {
        wpa wpa = this.b;
        int read = ((sa4) na5).read(wpa.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        wpa.G(0);
        wpa.F(read);
        boolean z = this.c;
        t3 t3Var = this.a;
        if (!z) {
            t3Var.n = 0;
            this.c = true;
        }
        t3Var.d(wpa);
        return 0;
    }

    public final boolean n(na5 na5) {
        int i;
        wpa wpa = new wpa(10);
        int i2 = 0;
        while (true) {
            ((sa4) na5).q(wpa.a, 0, 10, false);
            wpa.G(0);
            if (wpa.x() != 4801587) {
                break;
            }
            wpa.H(3);
            int t = wpa.t();
            i2 += t + 10;
            ((sa4) na5).b(t, false);
        }
        sa4 sa4 = (sa4) na5;
        sa4.Y = 0;
        sa4.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            sa4.q(wpa.a, 0, 7, false);
            wpa.G(0);
            int A = wpa.A();
            if (A == 44096 || A == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = wpa.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    byte b2 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (b2 == 65535) {
                        b2 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (A == 44097) {
                        i5 += 2;
                    }
                    i = b2 + i5;
                }
                if (i == -1) {
                    return false;
                }
                sa4.b(i - 7, false);
            } else {
                sa4.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                sa4.b(i4, false);
                i3 = 0;
            }
        }
    }

    public final void release() {
    }
}
