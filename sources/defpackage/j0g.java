package defpackage;

/* renamed from: j0g  reason: default package */
public final class j0g {
    public final String a;
    public final a8g b;

    public j0g(String str, a8g a8g) {
        this.a = str;
        this.b = a8g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0g)) {
            return false;
        }
        j0g j0g = (j0g) obj;
        return tpa.f(this.a, j0g.a) && tpa.f(this.b, j0g.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a8g a8g = this.b;
        return hashCode + (a8g == null ? 0 : a8g.hashCode());
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", cryptoObject=" + this.b + ")";
    }
}
