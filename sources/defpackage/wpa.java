package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: wpa  reason: default package */
public final class wpa {
    public static final char[] d = {13, 10};
    public static final char[] e = {10};
    public static final jx6 f = jx6.i(5, b52.a, b52.c, b52.f, b52.d, b52.e);
    public byte[] a;
    public int b;
    public int c;

    public wpa() {
        this.a = oaf.f;
    }

    public final int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long B() {
        int i;
        int i2;
        long j = (long) this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b2 = this.a[this.b + i];
                if ((b2 & 192) == 128) {
                    j = (j << 6) | ((long) (b2 & 63));
                    i++;
                } else {
                    throw new NumberFormatException(ey8.h(j, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException(ey8.h(j, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return b52.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b2 = bArr2[i2];
        if (b2 == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return b52.d;
        } else if (b2 != -1 || bArr2[i2 + 1] != -2) {
            return null;
        } else {
            this.b = i2 + 2;
            return b52.e;
        }
    }

    public final void D(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        E(i, bArr);
    }

    public final void E(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void F(int i) {
        fm9.f(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void G(int i) {
        fm9.f(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void H(int i) {
        G(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f.contains(charset);
        fm9.e("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b2;
        int i;
        byte b3;
        byte b4;
        boolean z = false;
        if ((charset.equals(b52.c) || charset.equals(b52.a)) && a() >= 1) {
            long j = (long) (this.a[this.b] & 255);
            char c2 = (char) ((int) j);
            z04.j(j, "Out of range: %s", ((long) c2) == j);
            b2 = (byte) c2;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(b52.f) || charset.equals(b52.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b3 = bArr[i2];
                b4 = bArr[i2 + 1];
            } else if (!charset.equals(b52.e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b3 = bArr2[i3 + 1];
                b4 = bArr2[i3];
            }
            b2 = (byte) ((char) ((b4 & 255) | (b3 << 8)));
        }
        long j2 = (long) b2;
        char c3 = (char) ((int) j2);
        if (((long) c3) == j2) {
            z = true;
        }
        z04.j(j2, "Out of range: %s", z);
        return (c3 << 16) + i;
    }

    public final void e(int i, byte[] bArr, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char f(Charset charset, char[] cArr) {
        int d2 = d(charset);
        if (d2 != 0) {
            char c2 = (char) (d2 >> 16);
            for (char c3 : cArr) {
                if (c3 == c2) {
                    this.b += d2 & 65535;
                    return c2;
                }
            }
        }
        return 0;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        byte b2 = ((bArr[i2] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (bArr[i4] & 255) | b2 | ((bArr[i3] & 255) << 8);
    }

    public final String h(Charset charset) {
        int i;
        boolean contains = f.contains(charset);
        fm9.e("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = b52.a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(b52.c) || charset.equals(charset2)) {
            i = 1;
        } else if (charset.equals(b52.f) || charset.equals(b52.e) || charset.equals(b52.d)) {
            i = 2;
        } else {
            throw new IllegalArgumentException("Unsupported charset: " + charset);
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            } else if ((charset.equals(b52.c) || charset.equals(b52.a)) && oaf.N(this.a[i2])) {
                break;
            } else {
                if (charset.equals(b52.f) || charset.equals(b52.d)) {
                    byte[] bArr = this.a;
                    if (bArr[i2] == 0 && oaf.N(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(b52.e)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i2 + 1] == 0 && oaf.N(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            }
        }
        String s = s(i2 - this.b, charset);
        if (this.b != this.c && f(charset, d) == 13) {
            f(charset, e);
        }
        return s;
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        byte b2 = ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((bArr[i4] & 255) << 24) | b2 | ((bArr[i3] & 255) << 16);
    }

    public final long j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        int i5 = i + 4;
        this.b = i5;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        int i7 = i + 6;
        this.b = i7;
        long j3 = j2 | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j3 | ((((long) bArr[i7]) & 255) << 48);
    }

    public final short k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(zr6.h(i, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j2 | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = oaf.a;
        String str = new String(bArr, i2, i - i2, b52.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String q(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = oaf.a;
        String str = new String(bArr, i2, i4, b52.c);
        this.b += i;
        return str;
    }

    public final short r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int t() {
        return u() | (u() << 21) | (u() << 14) | (u() << 7);
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        byte b2 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.b = i + 4;
        return b2;
    }

    public final long w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }

    public final int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i + 3;
        return (bArr[i3] & 255) | i4 | ((bArr[i] & 255) << 16);
    }

    public final int y() {
        int g = g();
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException(zr6.h(g, "Top bit not zero: "));
    }

    public final long z() {
        long o = o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException(ey8.h(o, "Top bit not zero: "));
    }

    public wpa(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public wpa(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public wpa(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}
