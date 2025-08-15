package defpackage;

/* renamed from: xka  reason: default package */
public final class xka implements yka {
    public final bha a;

    public xka(bha bha) {
        this.a = bha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xka) && tpa.f(this.a, ((xka) obj).a);
    }

    public final int hashCode() {
        bha bha = this.a;
        if (bha == null) {
            return 0;
        }
        return bha.hashCode();
    }

    public final String toString() {
        return "Search(listener=" + this.a + ")";
    }
}
