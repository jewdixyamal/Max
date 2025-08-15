package defpackage;

/* renamed from: et3  reason: default package */
public final class et3 implements ht3 {
    public final jqe a;

    public et3(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et3) && tpa.f(this.a, ((et3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Gallery(toolbarTitle="), this.a, ")");
    }
}
