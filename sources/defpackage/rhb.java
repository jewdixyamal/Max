package defpackage;

/* renamed from: rhb  reason: default package */
public final class rhb extends ka1 {
    public final jqe b;

    public rhb(gqe gqe) {
        super(10);
        this.b = gqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhb) && tpa.f(this.b, ((rhb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShareLink(link="), this.b, ")");
    }
}
