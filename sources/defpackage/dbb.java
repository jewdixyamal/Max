package defpackage;

/* renamed from: dbb  reason: default package */
public final class dbb implements ebb {
    public final jqe a;

    public dbb(iqe iqe) {
        this.a = iqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbb) && tpa.f(this.a, ((dbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Text(text="), this.a, ")");
    }
}
