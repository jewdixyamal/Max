package defpackage;

/* renamed from: iue  reason: default package */
public final class iue extends mue {
    public final zw6 e;
    public final zw6 f;
    public final int[] g;
    public final int[] h;

    public iue(ffc ffc, ffc ffc2, int[] iArr) {
        fm9.f(ffc.o == iArr.length);
        this.e = ffc;
        this.f = ffc2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    public final int a(boolean z) {
        if (q()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final int c(boolean z) {
        if (q()) {
            return -1;
        }
        zw6 zw6 = this.e;
        if (!z) {
            return zw6.size() - 1;
        }
        return this.g[zw6.size() - 1];
    }

    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        } else if (!z) {
            return i + 1;
        } else {
            return this.g[this.h[i] + 1];
        }
    }

    public final hue g(int i, hue hue, boolean z) {
        hue hue2 = (hue) this.f.get(i);
        hue.j(hue2.a, hue2.b, hue2.c, hue2.d, hue2.e, hue2.g, hue2.f);
        return hue;
    }

    public final int i() {
        return this.f.size();
    }

    public final int l(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        } else if (!z) {
            return i - 1;
        } else {
            return this.g[this.h[i] - 1];
        }
    }

    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    public final kue n(int i, kue kue, long j) {
        kue kue2 = kue;
        kue kue3 = (kue) this.e.get(i);
        Object obj = kue3.a;
        tb8 tb8 = kue3.c;
        kue kue4 = kue3;
        long j2 = kue4.m;
        int i2 = kue4.n;
        int i3 = kue4.o;
        long j3 = kue4.p;
        kue kue5 = kue4;
        kue kue6 = kue;
        kue6.b(obj, tb8, kue3.d, kue3.e, kue3.f, kue3.g, kue3.h, kue3.i, kue3.j, kue3.l, j2, i2, i3, j3);
        kue kue7 = kue;
        kue7.k = kue5.k;
        return kue7;
    }

    public final int p() {
        return this.e.size();
    }
}
