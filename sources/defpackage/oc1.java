package defpackage;

/* renamed from: oc1  reason: default package */
public final class oc1 implements qc1 {
    public final jqe a;

    public oc1(iqe iqe) {
        this.a = iqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc1) && tpa.f(this.a, ((oc1) obj).a);
    }

    public final jqe getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Loading(text="), this.a, ")");
    }
}
