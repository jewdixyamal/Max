package defpackage;

/* renamed from: wib  reason: default package */
public final class wib extends bjb {
    public final CharSequence a;
    public final jqe b;

    public wib(CharSequence charSequence, eqe eqe) {
        this.a = charSequence;
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wib)) {
            return false;
        }
        wib wib = (wib) obj;
        return tpa.f(this.a, wib.a) && tpa.f(this.b, wib.b);
    }

    public final long getItemId() {
        return (long) 65536;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jqe jqe = this.b;
        return hashCode + (jqe == null ? 0 : jqe.hashCode());
    }

    public final int l() {
        return 65536;
    }

    public final String toString() {
        return "ContactDescription(text=" + this.a + ", title=" + this.b + ")";
    }
}
