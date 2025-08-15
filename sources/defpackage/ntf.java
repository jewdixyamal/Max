package defpackage;

/* renamed from: ntf  reason: default package */
public final class ntf implements rtf {
    public final String a;
    public final String b;
    public final a8g c;

    public ntf(a8g a8g, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = a8g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntf)) {
            return false;
        }
        ntf ntf = (ntf) obj;
        return tpa.f(this.a, ntf.a) && tpa.f(this.b, ntf.b) && tpa.f(this.c, ntf.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a8g a8g = this.c;
        if (a8g != null) {
            i = a8g.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", reason=" + this.b + ", cryptoObject=" + this.c + ")";
    }
}
