package defpackage;

/* renamed from: fde  reason: default package */
public final class fde {
    public final ybe a;
    public final boolean b;

    public fde(ybe ybe, boolean z) {
        this.a = ybe;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fde)) {
            return false;
        }
        fde fde = (fde) obj;
        return tpa.f(this.a, fde.a) && this.b == fde.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(suggest=" + this.a + ", fromContacts=" + this.b + ")";
    }
}
