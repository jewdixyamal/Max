package defpackage;

/* renamed from: g50  reason: default package */
public final class g50 extends h50 {
    public final jqe a;

    public g50(eqe eqe) {
        this.a = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g50) && tpa.f(this.a, ((g50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowTooltipEvent(textSource="), this.a, ")");
    }
}
