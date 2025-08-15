package defpackage;

/* renamed from: wob  reason: default package */
public final class wob extends qw8 {
    public xob[] a;
    public tob[] b;
    public zob c;
    public boolean d;

    public final int computeSerializedSize() {
        int i;
        xob[] xobArr = this.a;
        int i2 = 0;
        if (xobArr != null && xobArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                xob[] xobArr2 = this.a;
                if (i3 >= xobArr2.length) {
                    break;
                }
                xob xob = xobArr2[i3];
                if (xob != null) {
                    i += y43.i(1, xob);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        tob[] tobArr = this.b;
        if (tobArr != null && tobArr.length > 0) {
            while (true) {
                tob[] tobArr2 = this.b;
                if (i2 >= tobArr2.length) {
                    break;
                }
                tob tob = tobArr2[i2];
                if (tob != null) {
                    i = y43.i(2, tob) + i;
                }
                i2++;
            }
        }
        zob zob = this.c;
        if (zob != null) {
            i += y43.i(3, zob);
        }
        return this.d ? i + y43.a(4) : i;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int w = nd7.w(x43, 10);
                xob[] xobArr = this.a;
                int length = xobArr == null ? 0 : xobArr.length;
                int i = w + length;
                xob[] xobArr2 = new xob[i];
                if (length != 0) {
                    System.arraycopy(xobArr, 0, xobArr2, 0, length);
                }
                while (length < i - 1) {
                    xob xob = new xob();
                    xobArr2[length] = xob;
                    x43.j(xob);
                    x43.s();
                    length++;
                }
                xob xob2 = new xob();
                xobArr2[length] = xob2;
                x43.j(xob2);
                this.a = xobArr2;
            } else if (s == 18) {
                int w2 = nd7.w(x43, 18);
                tob[] tobArr = this.b;
                int length2 = tobArr == null ? 0 : tobArr.length;
                int i2 = w2 + length2;
                tob[] tobArr2 = new tob[i2];
                if (length2 != 0) {
                    System.arraycopy(tobArr, 0, tobArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    tob tob = new tob();
                    tobArr2[length2] = tob;
                    x43.j(tob);
                    x43.s();
                    length2++;
                }
                tob tob2 = new tob();
                tobArr2[length2] = tob2;
                x43.j(tob2);
                this.b = tobArr2;
            } else if (s == 26) {
                if (this.c == null) {
                    this.c = new zob();
                }
                x43.j(this.c);
            } else if (s == 32) {
                this.d = x43.f();
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        xob[] xobArr = this.a;
        int i = 0;
        if (xobArr != null && xobArr.length > 0) {
            int i2 = 0;
            while (true) {
                xob[] xobArr2 = this.a;
                if (i2 >= xobArr2.length) {
                    break;
                }
                xob xob = xobArr2[i2];
                if (xob != null) {
                    y43.y(1, xob);
                }
                i2++;
            }
        }
        tob[] tobArr = this.b;
        if (tobArr != null && tobArr.length > 0) {
            while (true) {
                tob[] tobArr2 = this.b;
                if (i >= tobArr2.length) {
                    break;
                }
                tob tob = tobArr2[i];
                if (tob != null) {
                    y43.y(2, tob);
                }
                i++;
            }
        }
        zob zob = this.c;
        if (zob != null) {
            y43.y(3, zob);
        }
        boolean z = this.d;
        if (z) {
            y43.r(4, z);
        }
    }
}
