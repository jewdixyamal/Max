package defpackage;

/* renamed from: py  reason: default package */
public final class py {
    public final /* synthetic */ int a = 1;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public py(yaf yaf, yaf yaf2, boolean z) {
        this.j = yaf;
        this.i = yaf2;
        this.f = z;
        yaf2.H(12);
        this.b = yaf2.y();
        yaf.H(12);
        this.h = yaf.y();
        dy7.k("first_chunk must be 1", yaf.h() != 1 ? false : true);
        this.c = -1;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                int i2 = this.c + 1;
                this.c = i2;
                if (i2 == this.b) {
                    return false;
                }
                boolean z = this.f;
                yaf yaf = (yaf) this.i;
                this.e = z ? yaf.z() : yaf.w();
                if (this.c != this.g) {
                    return true;
                }
                yaf yaf2 = (yaf) this.j;
                this.d = yaf2.y();
                yaf2.I(4);
                int i3 = this.h - 1;
                this.h = i3;
                this.g = i3 > 0 ? yaf2.y() - 1 : -1;
                return true;
            default:
                int i4 = this.c + 1;
                this.c = i4;
                if (i4 == this.b) {
                    return false;
                }
                boolean z2 = this.f;
                wpa wpa = (wpa) this.i;
                this.e = z2 ? wpa.z() : wpa.w();
                if (this.c != this.g) {
                    return true;
                }
                wpa wpa2 = (wpa) this.j;
                this.d = wpa2.y();
                wpa2.H(4);
                int i5 = this.h - 1;
                this.h = i5;
                this.g = i5 > 0 ? wpa2.y() - 1 : -1;
                return true;
        }
    }

    public py(wpa wpa, wpa wpa2, boolean z) {
        this.j = wpa;
        this.i = wpa2;
        this.f = z;
        wpa2.G(12);
        this.b = wpa2.y();
        wpa.G(12);
        this.h = wpa.y();
        lz7.f("first_chunk must be 1", wpa.g() != 1 ? false : true);
        this.c = -1;
    }
}
