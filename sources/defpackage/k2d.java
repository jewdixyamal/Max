package defpackage;

/* renamed from: k2d  reason: default package */
public final class k2d {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public k2d f;
    public k2d g;

    public k2d() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final k2d a() {
        k2d k2d = this.f;
        k2d k2d2 = k2d != this ? k2d : null;
        k2d k2d3 = this.g;
        k2d3.f = k2d;
        this.f.g = k2d3;
        this.f = null;
        this.g = null;
        return k2d2;
    }

    public final void b(k2d k2d) {
        k2d.g = this;
        k2d.f = this.f;
        this.f.g = k2d;
        this.f = k2d;
    }

    public final k2d c() {
        this.d = true;
        return new k2d(this.a, this.b, this.c, true, false);
    }

    public final void d(k2d k2d, int i) {
        if (k2d.e) {
            int i2 = k2d.c;
            int i3 = i2 + i;
            byte[] bArr = k2d.a;
            if (i3 > 8192) {
                if (!k2d.d) {
                    int i4 = k2d.b;
                    if (i3 - i4 <= 8192) {
                        ys.Y(bArr, i4, bArr, i2);
                        k2d.c -= k2d.b;
                        k2d.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = k2d.c;
            int i6 = this.b;
            System.arraycopy(this.a, i6, bArr, i5, (i6 + i) - i6);
            k2d.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public k2d(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
