package defpackage;

/* renamed from: mk7  reason: default package */
public final class mk7 {
    public final String a;
    public final jqe b;

    public mk7(jqe jqe, String str) {
        this.a = str;
        this.b = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk7)) {
            return false;
        }
        mk7 mk7 = (mk7) obj;
        return tpa.f(this.a, mk7.a) && tpa.f(this.b, mk7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkValidationState(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
