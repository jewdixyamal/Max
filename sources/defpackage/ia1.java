package defpackage;

/* renamed from: ia1  reason: default package */
public final class ia1 extends ka1 {
    public final jqe b;

    public ia1(eqe eqe) {
        super(0);
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia1) && tpa.f(this.b, ((ia1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(message="), this.b, ")");
    }
}
