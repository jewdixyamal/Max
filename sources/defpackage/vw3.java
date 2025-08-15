package defpackage;

/* renamed from: vw3  reason: default package */
public final class vw3 implements xw3 {
    public final jqe a;

    public vw3(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw3) && tpa.f(this.a, ((vw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Failed(message="), this.a, ")");
    }
}
