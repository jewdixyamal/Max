package defpackage;

/* renamed from: b86  reason: default package */
public final class b86 {
    public final a86 a;
    public int b;
    public boolean c;
    public final boolean d;

    public b86(a86 a86, int i, boolean z, boolean z2) {
        this.a = a86;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static b86 a(b86 b86, int i, boolean z, int i2) {
        a86 a86 = b86.a;
        if ((i2 & 4) != 0) {
            z = b86.c;
        }
        boolean z2 = b86.d;
        b86.getClass();
        return new b86(a86, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b86)) {
            return false;
        }
        b86 b86 = (b86) obj;
        return tpa.f(this.a, b86.a) && this.b == b86.b && this.c == b86.c && this.d == b86.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d(k7d.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.c;
        return "GalleryAlbum(type=" + this.a + ", totalCount=" + i + ", isLoaded=" + z + ", hasImages=" + this.d + ")";
    }
}
