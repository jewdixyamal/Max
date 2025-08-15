package defpackage;

/* renamed from: rcb  reason: default package */
public final class rcb extends vcb {
    public final jqe b;

    public rcb(gqe gqe) {
        this.b = gqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcb) && tpa.f(this.b, ((rcb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShareLinkToChat(text="), this.b, ")");
    }
}
