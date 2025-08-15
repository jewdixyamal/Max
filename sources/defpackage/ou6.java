package defpackage;

/* renamed from: ou6  reason: default package */
public final class ou6 {
    public static final ou6 c = new ou6("UNKNOWN", (String) null);
    public final String a;
    public final String b;

    public ou6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou6)) {
            return false;
        }
        ou6 ou6 = (ou6) obj;
        return tpa.f(this.a, ou6.a) && tpa.f(this.b, ou6.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
