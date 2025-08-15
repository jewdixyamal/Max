package defpackage;

/* renamed from: ixe  reason: default package */
public final class ixe {
    public final jxe a;
    public final kxe b;

    public ixe(jxe jxe, kxe kxe) {
        this.a = jxe;
        this.b = kxe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixe)) {
            return false;
        }
        ixe ixe = (ixe) obj;
        return tpa.f(this.a, ixe.a) && tpa.f(this.b, ixe.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarIconColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
