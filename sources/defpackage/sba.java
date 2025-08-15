package defpackage;

/* renamed from: sba  reason: default package */
public final class sba {
    public static final sba d = new sba("OneMeGlobalThemeColorSpace", gka.m0, gka.d0);
    public static final sba e = new sba("OneMeGlobalThemeColorNature", gka.k, gka.b);
    public static final sba f = new sba("OneMeGlobalThemeColorNeon", gka.C, gka.t);
    public static final sba g = new sba("OneMeGlobalThemeColorSimple", gka.U, gka.L);
    public final String a;
    public final fka b;
    public final fka c;

    public sba(String str, fka fka, fka fka2) {
        this.a = str;
        this.b = fka;
        this.c = fka2;
    }

    public final fka a(boolean z) {
        return z ? this.c : this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sba)) {
            return false;
        }
        sba sba = (sba) obj;
        return tpa.f(this.a, sba.a) && tpa.f(this.b, sba.b) && tpa.f(this.c, sba.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OneMeGlobalTheme(name=" + this.a + ", lightMode=" + this.b + ", darkMode=" + this.c + ")";
    }
}
