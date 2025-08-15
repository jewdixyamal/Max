package defpackage;

/* renamed from: bed  reason: default package */
public final class bed extends ka1 {
    public final jqe b;

    public bed(eqe eqe) {
        super(12);
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bed) && tpa.f(this.b, ((bed) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowError(message="), this.b, ")");
    }
}
