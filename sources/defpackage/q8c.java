package defpackage;

/* renamed from: q8c  reason: default package */
public final class q8c extends tfg {
    public final CharSequence h;

    public q8c(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8c) && tpa.f(this.h, ((q8c) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + this.h + ")";
    }
}
