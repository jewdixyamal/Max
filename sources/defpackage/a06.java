package defpackage;

/* renamed from: a06  reason: default package */
public final class a06 {
    public final jqe a;
    public final boolean b;
    public final ez c;
    public final boolean d;

    public a06(jqe jqe, boolean z, ez ezVar, boolean z2) {
        this.a = jqe;
        this.b = z;
        this.c = ezVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a06)) {
            return false;
        }
        a06 a06 = (a06) obj;
        return tpa.f(this.a, a06.a) && this.b == a06.b && tpa.f(this.c, a06.c) && this.d == a06.d;
    }

    public final int hashCode() {
        int d2 = ms2.d(this.a.hashCode() * 31, 31, this.b);
        ez ezVar = this.c;
        return Boolean.hashCode(this.d) + ((d2 + (ezVar == null ? 0 : ezVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ForwardQuoteData(title=" + this.a + ", showVerificationMark=" + this.b + ", attachDescription=" + this.c + ", isAuthorVisibilityAvailable=" + this.d + ")";
    }
}
