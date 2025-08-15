package defpackage;

/* renamed from: azc  reason: default package */
public final class azc implements bzc {
    public final jl2 a;

    public azc(jl2 jl2) {
        this.a = jl2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azc) && tpa.f(this.a, ((azc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResult(result=" + this.a + ")";
    }
}
