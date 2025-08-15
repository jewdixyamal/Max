package defpackage;

/* renamed from: d26  reason: default package */
public final class d26 {
    public final yze a;
    public final pze b = new pze(1);
    public final wpa c = new wpa();
    public a0f d;
    public id4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final wpa j = new wpa(1);
    public final wpa k = new wpa();
    public boolean l;

    public d26(yze yze, a0f a0f, id4 id4) {
        this.a = yze;
        this.d = a0f;
        this.e = id4;
        this.d = a0f;
        this.e = id4;
        yze.e(a0f.a.f);
        d();
    }

    public final oze a() {
        if (!this.l) {
            return null;
        }
        pze pze = this.b;
        int i2 = oaf.a;
        int i3 = ((id4) pze.o).a;
        oze oze = (oze) pze.p;
        if (oze == null) {
            oze[] ozeArr = this.d.a.k;
            oze = ozeArr == null ? null : ozeArr[i3];
        }
        if (oze == null || !oze.a) {
            return null;
        }
        return oze;
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
        wpa wpa;
        oze a2 = a();
        if (a2 == null) {
            return 0;
        }
        pze pze = this.b;
        int i4 = a2.d;
        if (i4 != 0) {
            wpa = (wpa) pze.q;
        } else {
            int i5 = oaf.a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            wpa wpa2 = this.k;
            wpa2.E(length, bArr);
            i4 = bArr.length;
            wpa = wpa2;
        }
        boolean z = pze.j && pze.k[this.f];
        boolean z2 = z || i3 != 0;
        wpa wpa3 = this.j;
        wpa3.a[0] = (byte) ((z2 ? 128 : 0) | i4);
        wpa3.G(0);
        yze yze = this.a;
        yze.b(wpa3, 1, 1);
        yze.b(wpa, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        wpa wpa4 = this.c;
        if (!z) {
            wpa4.D(8);
            byte[] bArr2 = wpa4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i3 & 255);
            bArr2[4] = (byte) ((i2 >> 24) & 255);
            bArr2[5] = (byte) ((i2 >> 16) & 255);
            bArr2[6] = (byte) ((i2 >> 8) & 255);
            bArr2[7] = (byte) (i2 & 255);
            yze.b(wpa4, 8, 1);
            return i4 + 9;
        }
        wpa wpa5 = (wpa) pze.q;
        int A = wpa5.A();
        wpa5.H(-2);
        int i6 = (A * 6) + 2;
        if (i3 != 0) {
            wpa4.D(i6);
            byte[] bArr3 = wpa4.a;
            wpa5.e(0, bArr3, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            wpa4 = wpa5;
        }
        yze.b(wpa4, i6, 1);
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
