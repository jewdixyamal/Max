package defpackage;

/* renamed from: ohb  reason: default package */
public final class ohb extends phb {
    public final jqe a;
    public final int b;

    public ohb(int i, eqe eqe) {
        this.a = eqe;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohb)) {
            return false;
        }
        ohb ohb = (ohb) obj;
        return tpa.f(this.a, ohb.a) && this.b == ohb.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
