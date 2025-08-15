package defpackage;

/* renamed from: lyd  reason: default package */
public final class lyd {
    public final kyd a;
    public final boolean b;
    public final boolean c;
    public final k56 d;

    public lyd(kyd kyd, boolean z, boolean z2, k56 k56) {
        this.a = kyd;
        this.b = z;
        this.c = z2;
        this.d = k56;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyd)) {
            return false;
        }
        lyd lyd = (lyd) obj;
        return tpa.f(this.a, lyd.a) && this.b == lyd.b && this.c == lyd.c && tpa.f(this.d, lyd.d);
    }

    public final int hashCode() {
        int d2 = ms2.d(ms2.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        k56 k56 = this.d;
        return d2 + (k56 == null ? 0 : k56.hashCode());
    }

    public final String toString() {
        return "StartCallParams(type=" + this.a + ", isVideo=" + this.b + ", isAudio=" + this.c + ", callbackPrepare=" + this.d + ")";
    }
}
