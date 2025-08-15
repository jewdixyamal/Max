package defpackage;

/* renamed from: s83  reason: default package */
public final class s83 implements t83 {
    public final e52 a;
    public final CharSequence b;
    public final CharSequence c;
    public final long d;

    static {
        s83.class.hashCode();
    }

    public s83(e52 e52, CharSequence charSequence, String str) {
        this.a = e52;
        this.b = charSequence;
        this.c = str;
        this.d = e52.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s83)) {
            return false;
        }
        s83 s83 = (s83) obj;
        return this.d == s83.d && tpa.f(this.b, s83.b) && tpa.f(this.c, s83.c);
    }

    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.f(this.b, h4f.m(s83.class.getName().hashCode() * 31, 31, this.d), 31);
    }
}
