package defpackage;

/* renamed from: rtd  reason: default package */
public final class rtd implements ttd {
    public final tt7 a;

    public rtd(tt7 tt7) {
        this.a = tt7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtd) && tpa.f(this.a, ((rtd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
