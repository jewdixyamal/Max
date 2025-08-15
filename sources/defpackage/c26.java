package defpackage;

/* renamed from: c26  reason: default package */
public final class c26 {
    public final xze a;
    public final pze b = new pze(0);
    public final yaf c = new yaf(3, false);
    public zze d;
    public hd4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final yaf j = new yaf(1);
    public final yaf k = new yaf(3, false);
    public boolean l;

    public c26(xze xze, zze zze, hd4 hd4) {
        this.a = xze;
        this.d = zze;
        this.e = hd4;
        this.d = zze;
        this.e = hd4;
        xze.d(zze.a.f);
        d();
    }

    public final nze a() {
        if (!this.l) {
            return null;
        }
        pze pze = this.b;
        int i2 = maf.a;
        int i3 = ((hd4) pze.o).a;
        nze nze = (nze) pze.p;
        if (nze == null) {
            nze[] nzeArr = this.d.a.k;
            nze = nzeArr == null ? null : nzeArr[i3];
        }
        if (nze == null || !nze.a) {
            return null;
        }
        return nze;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i2 = this.g + 1;
        this.g = i2;
        int[] iArr = this.b.f;
        int i3 = this.h;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.h = i3 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i2, int i3) {
        yaf yaf;
        nze a2 = a();
        if (a2 == null) {
            return 0;
        }
        pze pze = this.b;
        int i4 = a2.d;
        if (i4 != 0) {
            yaf = (yaf) pze.q;
        } else {
            int i5 = maf.a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            yaf yaf2 = this.k;
            yaf2.F(length, bArr);
            i4 = bArr.length;
            yaf = yaf2;
        }
        boolean z = pze.j && pze.k[this.f];
        boolean z2 = z || i3 != 0;
        yaf yaf3 = this.j;
        yaf3.a[0] = (byte) ((z2 ? 128 : 0) | i4);
        yaf3.H(0);
        xze xze = this.a;
        xze.c(1, yaf3);
        xze.c(i4, yaf);
        if (!z2) {
            return i4 + 1;
        }
        yaf yaf4 = this.c;
        if (!z) {
            yaf4.E(8);
            byte[] bArr2 = yaf4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i3 & 255);
            bArr2[4] = (byte) ((i2 >> 24) & 255);
            bArr2[5] = (byte) ((i2 >> 16) & 255);
            bArr2[6] = (byte) ((i2 >> 8) & 255);
            bArr2[7] = (byte) (i2 & 255);
            xze.c(8, yaf4);
            return i4 + 9;
        }
        yaf yaf5 = (yaf) pze.q;
        int A = yaf5.A();
        yaf5.I(-2);
        int i6 = (A * 6) + 2;
        if (i3 != 0) {
            yaf4.E(i6);
            byte[] bArr3 = yaf4.a;
            yaf5.g(0, bArr3, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            yaf4 = yaf5;
        }
        xze.c(i6, yaf4);
        return i4 + 1 + i6;
    }

    public final void d() {
        pze pze = this.b;
        pze.c = 0;
        pze.m = 0;
        pze.n = false;
        pze.j = false;
        pze.l = false;
        pze.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
