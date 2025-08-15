package defpackage;

/* renamed from: xob  reason: default package */
public final class xob extends qw8 {
    public static volatile xob[] f;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 0.0f;
    public vob[] e;

    public xob() {
        if (vob.c == null) {
            synchronized (y37.b) {
                try {
                    if (vob.c == null) {
                        vob.c = new vob[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.e = vob.c;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int f2 = i != 0 ? y43.f(1, i) : 0;
        int i3 = this.b;
        if (i3 != 0) {
            f2 += y43.f(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            f2 += y43.f(3, i4);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            f2 += y43.e(4);
        }
        vob[] vobArr = this.e;
        if (vobArr != null && vobArr.length > 0) {
            while (true) {
                vob[] vobArr2 = this.e;
                if (i2 >= vobArr2.length) {
                    break;
                }
                vob vob = vobArr2[i2];
                if (vob != null) {
                    f2 = y43.i(5, vob) + f2;
                }
                i2++;
            }
        }
        return f2;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = x43.p();
            } else if (s == 16) {
                int p = x43.p();
                if (p == 0) {
                    this.b = p;
                }
            } else if (s == 24) {
                this.c = x43.p();
            } else if (s == 37) {
                this.d = x43.i();
            } else if (s == 42) {
                int w = nd7.w(x43, 42);
                vob[] vobArr = this.e;
                int length = vobArr == null ? 0 : vobArr.length;
                int i = w + length;
                vob[] vobArr2 = new vob[i];
                if (length != 0) {
                    System.arraycopy(vobArr, 0, vobArr2, 0, length);
                }
                while (length < i - 1) {
                    vob vob = new vob();
                    vobArr2[length] = vob;
                    x43.j(vob);
                    x43.s();
                    length++;
                }
                vob vob2 = new vob();
                vobArr2[length] = vob2;
                x43.j(vob2);
                this.e = vobArr2;
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        int i = this.a;
        if (i != 0) {
            y43.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            y43.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            y43.w(3, i3);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            y43.v(4, this.d);
        }
        vob[] vobArr = this.e;
        if (vobArr != null && vobArr.length > 0) {
            int i4 = 0;
            while (true) {
                vob[] vobArr2 = this.e;
                if (i4 < vobArr2.length) {
                    vob vob = vobArr2[i4];
                    if (vob != null) {
                        y43.y(5, vob);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }
}
