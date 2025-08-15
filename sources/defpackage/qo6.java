package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: qo6  reason: default package */
public final class qo6 {
    public final ArrayList a = new ArrayList();
    public final y7c b;
    public vi6[] c;
    public int d;
    public int e;
    public int f;
    public int g = 4096;

    public qo6(mp6 mp6) {
        this.b = new y7c(mp6);
        this.c = new vi6[8];
        this.d = 7;
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.c.length;
            while (true) {
                length--;
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    vi6[] vi6Arr = this.c;
                    System.arraycopy(vi6Arr, i2 + 1, vi6Arr, i2 + 1 + i3, this.e);
                    this.d += i3;
                } else {
                    int i4 = this.c[length].a;
                    i -= i4;
                    this.f -= i4;
                    this.e--;
                    i3++;
                }
            }
            vi6[] vi6Arr2 = this.c;
            System.arraycopy(vi6Arr2, i2 + 1, vi6Arr2, i2 + 1 + i3, this.e);
            this.d += i3;
        }
        return i3;
    }

    public final aw0 b(int i) {
        if (i >= 0) {
            vi6[] vi6Arr = so6.a;
            if (i <= vi6Arr.length - 1) {
                return vi6Arr[i].b;
            }
        }
        int length = this.d + 1 + (i - so6.a.length);
        if (length >= 0) {
            vi6[] vi6Arr2 = this.c;
            if (length < vi6Arr2.length) {
                return vi6Arr2[length].b;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(vi6 vi6) {
        this.a.add(vi6);
        int i = this.g;
        int i2 = vi6.a;
        if (i2 > i) {
            ys.c0(this.c, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i2) - i);
        int i3 = this.e + 1;
        vi6[] vi6Arr = this.c;
        if (i3 > vi6Arr.length) {
            vi6[] vi6Arr2 = new vi6[(vi6Arr.length * 2)];
            System.arraycopy(vi6Arr, 0, vi6Arr2, vi6Arr.length, vi6Arr.length);
            this.d = this.c.length - 1;
            this.c = vi6Arr2;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        this.c[i4] = vi6;
        this.e++;
        this.f += i2;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, bt0] */
    public final aw0 d() {
        int i;
        y7c y7c = this.b;
        byte readByte = y7c.readByte();
        byte[] bArr = naf.a;
        byte b2 = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e2 = (long) e(b2, 127);
        if (!z) {
            return y7c.e(e2);
        }
        ? obj = new Object();
        l2a l2a = cr6.c;
        l2a l2a2 = l2a;
        int i3 = 0;
        for (long j = 0; j < e2; j++) {
            int readByte2 = y7c.readByte();
            byte[] bArr2 = naf.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                l2a2 = ((l2a[]) l2a2.o)[(i2 >>> i4) & 255];
                if (((l2a[]) l2a2.o) == null) {
                    obj.u0(l2a2.b);
                    i3 -= l2a2.c;
                    l2a2 = l2a;
                } else {
                    i3 = i4;
                }
            }
        }
        while (i3 > 0) {
            l2a l2a3 = ((l2a[]) l2a2.o)[(i2 << (8 - i3)) & 255];
            if (((l2a[]) l2a3.o) != null || (i = l2a3.c) > i3) {
                break;
            }
            obj.u0(l2a3.b);
            i3 -= i;
            l2a2 = l2a;
        }
        return obj.e(obj.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.b.readByte();
            byte[] bArr = naf.a;
            byte b2 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (b2 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
