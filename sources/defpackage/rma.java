package defpackage;

/* renamed from: rma  reason: default package */
public final class rma {
    public final sma a;

    public rma(sma sma) {
        this.a = sma;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rma) && tpa.f(this.a, ((rma) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentPayload(page=" + this.a + ")";
    }
}
