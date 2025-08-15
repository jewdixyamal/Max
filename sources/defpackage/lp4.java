package defpackage;

/* renamed from: lp4  reason: default package */
public final class lp4 {
    public final ep4 a;
    public final String b;
    public final long c;
    public final int d;
    public final ref e;

    public lp4(ep4 ep4, String str, long j, int i, ref ref) {
        this.a = ep4;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = ref;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp4)) {
            return false;
        }
        lp4 lp4 = (lp4) obj;
        return tpa.f(this.a, lp4.a) && tpa.f(this.b, lp4.b) && this.c == lp4.c && this.d == lp4.d && tpa.f(this.e, lp4.e);
    }

    public final int hashCode() {
        int g = ey8.g(this.d, h4f.m(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        ref ref = this.e;
        return g + (ref == null ? 0 : ref.hashCode());
    }

    public final String toString() {
        return "DraftUpload(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + h4f.t(this.d) + ", videoConvertOptions=" + this.e + ")";
    }
}
