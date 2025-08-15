package defpackage;

/* renamed from: rnd  reason: default package */
public final class rnd extends tt2 {
    public final jqe a;

    public rnd(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnd) && tpa.f(this.a, ((rnd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(text="), this.a, ")");
    }
}
