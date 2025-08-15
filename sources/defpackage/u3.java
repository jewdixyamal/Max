package defpackage;

/* renamed from: u3  reason: default package */
public final class u3 implements ka5 {
    public final s3 a = new s3((String) null, 1);
    public final yaf b = new yaf(16384);
    public boolean c;

    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final void g(oa5 oa5) {
        this.a.j(oa5, new l3f(0, 1, 0, (byte) 0));
        oa5.w();
        oa5.M(new pm5(-9223372036854775807L));
    }

    public final boolean h(ma5 ma5) {
        ra4 ra4;
        int i;
        yaf yaf = new yaf(10);
        int i2 = 0;
        while (true) {
            ra4 = (ra4) ma5;
            ra4.q(yaf.a, 0, 10, false);
            yaf.H(0);
            if (yaf.x() != 4801587) {
                break;
            }
            yaf.I(3);
            int u = yaf.u();
            i2 += u + 10;
            ra4.b(u, false);
        }
        ra4.Y = 0;
        ra4.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            ra4.q(yaf.a, 0, 7, false);
            yaf.H(0);
            int A = yaf.A();
            if (A == 44096 || A == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = yaf.a;
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
                ra4.b(i - 7, false);
            } else {
                ra4.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                ra4.b(i4, false);
                i3 = 0;
            }
        }
    }

    public final int i(ma5 ma5, lh4 lh4) {
        yaf yaf = this.b;
        int read = ((ra4) ma5).read(yaf.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        yaf.H(0);
        yaf.G(read);
        boolean z = this.c;
        s3 s3Var = this.a;
        if (!z) {
            s3Var.g(4, 0);
            this.c = true;
        }
        s3Var.f(yaf);
        return 0;
    }

    public final void release() {
    }
}
