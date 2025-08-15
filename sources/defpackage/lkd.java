package defpackage;

/* renamed from: lkd  reason: default package */
public final class lkd {
    public final jqe a;
    public final String b;

    public lkd(jqe jqe, String str) {
        this.a = jqe;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkd)) {
            return false;
        }
        lkd lkd = (lkd) obj;
        return tpa.f(this.a, lkd.a) && tpa.f(this.b, lkd.b);
    }

    public final int hashCode() {
        int i = 0;
        jqe jqe = this.a;
        int hashCode = (jqe == null ? 0 : jqe.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=" + this.b + ")";
    }
}
