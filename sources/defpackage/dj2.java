package defpackage;

/* renamed from: dj2  reason: default package */
public final class dj2 {
    public final jqe a;

    public dj2(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj2) && tpa.f(this.a, ((dj2) obj).a);
    }

    public final int hashCode() {
        jqe jqe = this.a;
        if (jqe == null) {
            return 0;
        }
        return jqe.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ToolbarState(title="), this.a, ")");
    }
}
