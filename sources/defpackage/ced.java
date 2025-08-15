package defpackage;

/* renamed from: ced  reason: default package */
public final class ced extends ka1 {
    public final jqe b;

    public ced(eqe eqe) {
        super(12);
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ced) && tpa.f(this.b, ((ced) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSuccess(message="), this.b, ")");
    }
}
