package defpackage;

/* renamed from: q3  reason: default package */
public final class q3 implements ka5 {
    public final s3 a = new s3((String) null, 0);
    public final yaf b = new yaf(2786);
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
            ra4.q(yaf.a, 0, 6, false);
            yaf.H(0);
            if (yaf.A() != 2935) {
                ra4.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                ra4.b(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = yaf.a;
                if (bArr.length < 6) {
                    i = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    i = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    i = kq0.m((b2 & 192) >> 6, b2 & 63);
                }
                if (i == -1) {
                    return false;
                }
                ra4.b(i - 6, false);
            }
        }
    }

    public final int i(ma5 ma5, lh4 lh4) {
        yaf yaf = this.b;
        int read = ((ra4) ma5).read(yaf.a, 0, 2786);
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
