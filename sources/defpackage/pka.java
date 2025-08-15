package defpackage;

/* renamed from: pka  reason: default package */
public final class pka implements ska {
    public final yka a;
    public final yka b;

    public pka(yka yka, yka yka2) {
        this.a = yka;
        this.b = yka2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pka)) {
            return false;
        }
        pka pka = (pka) obj;
        return tpa.f(this.a, pka.a) && tpa.f(this.b, pka.b);
    }

    public final int hashCode() {
        int i = 0;
        yka yka = this.a;
        int hashCode = (yka == null ? 0 : yka.hashCode()) * 31;
        yka yka2 = this.b;
        if (yka2 != null) {
            i = yka2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IconButtons(secondaryButton=" + this.a + ", primaryButton=" + this.b + ")";
    }
}
