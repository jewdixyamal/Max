package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: xma  reason: default package */
public final class xma extends a9e {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean g(yaf yaf, byte[] bArr) {
        if (yaf.c() < bArr.length) {
            return false;
        }
        int i = yaf.b;
        byte[] bArr2 = new byte[bArr.length];
        yaf.g(0, bArr2, bArr.length);
        yaf.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long c(yaf yaf) {
        byte b;
        byte[] bArr = yaf.a;
        byte b2 = bArr[0];
        byte b3 = b2 & 255;
        byte b4 = b2 & 3;
        if (b4 != 0) {
            b = 2;
            if (!(b4 == 1 || b4 == 2)) {
                b = bArr[1] & 63;
            }
        } else {
            b = 1;
        }
        int i = b3 >> 3;
        int i2 = i & 3;
        return (((long) this.f) * (((long) b) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i & 1) : i2 == 3 ? 60000 : 10000 << i2)))) / 1000000;
    }

    public final boolean e(yaf yaf, long j, l7b l7b) {
        boolean z = false;
        if (g(yaf, o)) {
            byte[] copyOf = Arrays.copyOf(yaf.a, yaf.c);
            byte b = copyOf[9] & 255;
            ArrayList j2 = s5c.j(copyOf);
            if (((oy5) l7b.b) == null) {
                z = true;
            }
            np8.f(z);
            my5 my5 = new my5();
            my5.k = "audio/opus";
            my5.x = b;
            my5.y = 48000;
            my5.m = j2;
            l7b.b = new oy5(my5);
            return true;
        } else if (g(yaf, p)) {
            np8.g((oy5) l7b.b);
            yaf.I(8);
            e99 v = f8.v(zw6.k((String[]) f8.y(yaf, false, false).a));
            if (v == null) {
                return true;
            }
            my5 a = ((oy5) l7b.b).a();
            e99 e99 = ((oy5) l7b.b).u0;
            if (e99 != null) {
                c99[] c99Arr = e99.a;
                if (c99Arr.length != 0) {
                    int i = maf.a;
                    c99[] c99Arr2 = v.a;
                    Object[] copyOf2 = Arrays.copyOf(c99Arr2, c99Arr2.length + c99Arr.length);
                    System.arraycopy(c99Arr, 0, copyOf2, c99Arr2.length, c99Arr.length);
                    v = new e99((c99[]) copyOf2);
                }
            }
            a.i = v;
            l7b.b = new oy5(a);
            return true;
        } else {
            np8.g((oy5) l7b.b);
            return false;
        }
    }
}
