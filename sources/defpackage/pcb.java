package defpackage;

/* renamed from: pcb  reason: default package */
public final class pcb extends vcb {
    public final jqe b;

    public pcb(gqe gqe) {
        this.b = gqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcb) && tpa.f(this.b, ((pcb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ExternalShareLink(text="), this.b, ")");
    }
}
