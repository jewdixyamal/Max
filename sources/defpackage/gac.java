package defpackage;

/* renamed from: gac  reason: default package */
public final class gac implements iac {
    public final jqe a;

    public gac(eqe eqe) {
        this.a = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gac) && tpa.f(this.a, ((gac) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(textSource="), this.a, ")");
    }
}
