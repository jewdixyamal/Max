package defpackage;

/* renamed from: a22  reason: default package */
public final class a22 extends e22 {
    public final jqe a;

    public a22(iqe iqe) {
        this.a = iqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a22) && tpa.f(this.a, ((a22) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ErrorWithLocalizedMessage(text="), this.a, ")");
    }
}
