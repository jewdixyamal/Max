package defpackage;

/* renamed from: nc1  reason: default package */
public final class nc1 implements qc1 {
    public final jqe a;

    public nc1(iqe iqe) {
        this.a = iqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc1) && tpa.f(this.a, ((nc1) obj).a);
    }

    public final jqe getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Error(text="), this.a, ")");
    }
}
