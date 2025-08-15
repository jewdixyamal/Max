package defpackage;

/* renamed from: mkb  reason: default package */
public final class mkb extends ka1 {
    public final long b;
    public final hdb c;
    public final boolean d;
    public final String e;

    public mkb(long j, hdb hdb, boolean z, String str) {
        super(11);
        this.b = j;
        this.c = hdb;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkb)) {
            return false;
        }
        mkb mkb = (mkb) obj;
        return this.b == mkb.b && this.c == mkb.c && this.d == mkb.d && tpa.f(this.e, mkb.e);
    }

    public final int hashCode() {
        int d2 = ms2.d((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        String str = this.e;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OpenCall(id=" + this.b + ", type=" + this.c + ", isVideo=" + this.d + ", joinLink=" + this.e + ")";
    }
}
