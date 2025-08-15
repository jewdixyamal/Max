package defpackage;

import java.security.MessageDigest;

/* renamed from: c3d  reason: default package */
public final class c3d extends aw0 {
    public final transient byte[][] X;
    public final transient int[] Y;

    public c3d(byte[][] bArr, int[] iArr) {
        super(aw0.o.c);
        this.X = bArr;
        this.Y = iArr;
    }

    public final String a() {
        throw null;
    }

    public final aw0 b(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.Y;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new aw0(instance.digest());
    }

    public final int c() {
        return this.Y[this.X.length - 1];
    }

    public final String d() {
        byte[] l = l();
        char[] cArr = new char[(l.length * 2)];
        int i = 0;
        for (byte b : l) {
            int i2 = i + 1;
            char[] cArr2 = z04.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final byte[] e() {
        return l();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aw0) {
            aw0 aw0 = (aw0) obj;
            if (aw0.c() == c() && h(c(), aw0)) {
                return true;
            }
        }
        return false;
    }

    public final byte f(int i) {
        byte[][] bArr = this.X;
        int[] iArr = this.Y;
        hm9.g((long) iArr[bArr.length - 1], (long) i, 1);
        int z = f8.z(this, i);
        return bArr[z][(i - (z == 0 ? 0 : iArr[z - 1])) + iArr[bArr.length + z]];
    }

    public final boolean g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int z = f8.z(this, i);
        while (i < i4) {
            int[] iArr = this.Y;
            int i5 = z == 0 ? 0 : iArr[z - 1];
            byte[][] bArr2 = this.X;
            int i6 = iArr[bArr2.length + z];
            int min = Math.min(i4, (iArr[z] - i5) + i5) - i;
            int i7 = (i - i5) + i6;
            byte[] bArr3 = bArr2[z];
            for (int i8 = 0; i8 < min; i8++) {
                if (bArr3[i8 + i7] != bArr[i8 + i2]) {
                    return false;
                }
            }
            i2 += min;
            i += min;
            z++;
        }
        return true;
    }

    public final boolean h(int i, aw0 aw0) {
        if (c() - i < 0) {
            return false;
        }
        int z = f8.z(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.Y;
            int i4 = z == 0 ? 0 : iArr[z - 1];
            byte[][] bArr = this.X;
            int i5 = iArr[bArr.length + z];
            int min = Math.min(i, (iArr[z] - i4) + i4) - i2;
            if (!aw0.g(i3, (i2 - i4) + i5, min, bArr[z])) {
                return false;
            }
            i3 += min;
            i2 += min;
            z++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.Y;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    public final aw0 i() {
        return new aw0(l()).i();
    }

    public final void k(bt0 bt0, int i) {
        int z = f8.z(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.Y;
            int i3 = z == 0 ? 0 : iArr[z - 1];
            byte[][] bArr = this.X;
            int i4 = iArr[bArr.length + z];
            int min = Math.min(i, (iArr[z] - i3) + i3) - i2;
            int i5 = (i2 - i3) + i4;
            k2d k2d = new k2d(bArr[z], i5, i5 + min, true, false);
            k2d k2d2 = bt0.a;
            if (k2d2 == null) {
                k2d.g = k2d;
                k2d.f = k2d;
                bt0.a = k2d;
            } else {
                k2d2.g.b(k2d);
            }
            i2 += min;
            z++;
        }
        bt0.b += (long) c();
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.X;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.Y;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final String toString() {
        return new aw0(l()).toString();
    }
}
