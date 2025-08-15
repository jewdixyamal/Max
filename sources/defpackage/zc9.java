package defpackage;

/* renamed from: zc9  reason: default package */
public final class zc9 {
    public final cd9 a;
    public final String b;
    public final String c;
    public final id9 d;
    public final kp e;
    public final pd9 f;

    public zc9(cd9 cd9, String str, String str2, id9 id9, kp kpVar, pd9 pd9) {
        this.a = cd9;
        this.b = str;
        this.c = str2;
        this.d = id9;
        this.e = kpVar;
        this.f = pd9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc9)) {
            return false;
        }
        zc9 zc9 = (zc9) obj;
        return tpa.f(this.a, zc9.a) && tpa.f(this.b, zc9.b) && tpa.f(this.c, zc9.c) && this.d == zc9.d && tpa.f(this.e, zc9.e) && tpa.f(this.f, zc9.f);
    }

    public final int hashCode() {
        int d2 = rh4.d(rh4.d(Long.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        int hashCode = this.e.hashCode();
        return this.f.a.hashCode() + ((hashCode + ((this.d.hashCode() + d2) * 31)) * 31);
    }

    public final String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
