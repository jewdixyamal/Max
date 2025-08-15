package defpackage;

/* renamed from: i4d  reason: default package */
public final class i4d extends j4d {
    public final String b;
    public final String c;
    public final a20 d;
    public final int e;

    public i4d(String str, String str2, a20 a20, int i) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = a20;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4d)) {
            return false;
        }
        i4d i4d = (i4d) obj;
        return tpa.f(this.b, i4d.b) && tpa.f(this.c, i4d.c) && tpa.f(this.d, i4d.d) && this.e == i4d.e;
    }

    public final int hashCode() {
        int d2 = rh4.d(this.b.hashCode() * 31, 31, this.c);
        return au1.s(this.e) + ((this.d.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "Photo(localCroppedUri=" + this.b + ", originalUri=" + this.c + ", relativeCrop=" + this.d + ", source=" + au1.u(this.e) + ")";
    }
}
