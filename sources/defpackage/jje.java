package defpackage;

import java.util.List;

/* renamed from: jje  reason: default package */
public final class jje {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public jje(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jje)) {
            return false;
        }
        jje jje = (jje) obj;
        if (tpa.f(this.a, jje.a) && tpa.f(this.b, jje.b) && tpa.f(this.c, jje.c) && tpa.f(this.d, jje.d)) {
            return tpa.f(this.e, jje.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.g(this.d, rh4.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
