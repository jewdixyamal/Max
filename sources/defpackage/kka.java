package defpackage;

/* renamed from: kka  reason: default package */
public final class kka implements qka {
    public final m56 a;

    public kka(m56 m56) {
        this.a = m56;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kka) && tpa.f(this.a, ((kka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Back(onClick=" + this.a + ")";
    }
}
