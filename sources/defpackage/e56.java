package defpackage;

/* renamed from: e56  reason: default package */
public final class e56 {
    public final String a;
    public final String b;
    public final e56 c;

    public e56(String str, String str2, e56 e56) {
        this.a = str;
        this.b = str2;
        this.c = e56;
    }

    public static e56 a(e56 e56, String str) {
        String str2 = e56.a;
        e56 e562 = e56.c;
        e56.getClass();
        return new e56(str2, str, e562);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e56)) {
            return false;
        }
        e56 e56 = (e56) obj;
        return tpa.f(this.a, e56.a) && tpa.f(this.b, e56.b) && tpa.f(this.c, e56.c);
    }

    public final int hashCode() {
        int d = rh4.d(this.a.hashCode() * 31, 31, this.b);
        e56 e56 = this.c;
        return d + (e56 == null ? 0 : e56.hashCode());
    }

    public final String toString() {
        return "Result(normalized=" + this.a + ", original=" + this.b + ", noEmoji=" + this.c + ")";
    }
}
