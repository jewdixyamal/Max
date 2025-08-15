package defpackage;

/* renamed from: jt0  reason: default package */
public abstract class jt0 {
    public static final byte[] a = "0123456789abcdef".getBytes(a52.a);

    public static final String a(bt0 bt0, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (bt0.S(j2) == ((byte) 13)) {
                String o0 = bt0.o0(j2, a52.a);
                bt0.R(2);
                return o0;
            }
        }
        String o02 = bt0.o0(j, a52.a);
        bt0.R(1);
        return o02;
    }

    public static final int b(bt0 bt0, vma vma, boolean z) {
        int i;
        int i2;
        byte[] bArr;
        k2d k2d;
        int i3;
        k2d k2d2 = bt0.a;
        int i4 = -2;
        if (k2d2 == null) {
            return z ? -2 : -1;
        }
        int i5 = k2d2.b;
        int i6 = k2d2.c;
        byte[] bArr2 = k2d2.a;
        k2d k2d3 = k2d2;
        int i7 = -1;
        int i8 = 0;
        loop0:
        while (true) {
            int i9 = i8 + 1;
            int[] iArr = vma.b;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (k2d3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = (i10 * -1) + i11;
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr2[i5] & 255) != iArr[i11]) {
                        return i7;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        k2d k2d4 = k2d3.f;
                        i3 = k2d4.b;
                        int i16 = k2d4.c;
                        bArr = k2d4.a;
                        if (k2d4 != k2d2) {
                            int i17 = i16;
                            k2d = k2d4;
                            i6 = i17;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            i6 = i16;
                            k2d = null;
                        }
                    } else {
                        k2d = k2d3;
                        bArr = bArr2;
                        i3 = i14;
                    }
                    if (z2) {
                        i = iArr[i15];
                        i2 = i3;
                        bArr2 = bArr;
                        k2d3 = k2d;
                        break;
                    }
                    i5 = i3;
                    bArr2 = bArr;
                    k2d3 = k2d;
                    i11 = i15;
                }
            } else {
                int i18 = i5 + 1;
                byte b = bArr2[i5] & 255;
                int i19 = i11 + i10;
                while (i11 != i19) {
                    if (b == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i18 == i6) {
                            k2d3 = k2d3.f;
                            i2 = k2d3.b;
                            i6 = k2d3.c;
                            bArr2 = k2d3.a;
                            if (k2d3 == k2d2) {
                                k2d3 = null;
                            }
                        } else {
                            i2 = i18;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i7;
    }
}
