package defpackage;

/* renamed from: g7b  reason: default package */
public final class g7b {
    public final String a;
    public final Long b;

    public g7b(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7b)) {
            return false;
        }
        g7b g7b = (g7b) obj;
        return tpa.f(this.a, g7b.a) && tpa.f(this.b, g7b.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
