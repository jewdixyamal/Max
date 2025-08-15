package defpackage;

import java.util.List;

/* renamed from: v76  reason: default package */
public final class v76 extends a86 {
    public final String a;
    public final List b;
    public final r76 c;

    public v76(String str, String str2, List list) {
        r76 r76 = new r76(str2);
        this.a = str;
        this.b = list;
        this.c = r76;
    }

    public final String[] a(u76 u76) {
        return new String[]{this.a};
    }

    public final String b() {
        return this.a;
    }

    public final n3 c() {
        return this.c;
    }

    public final List d() {
        return this.b;
    }

    public final String e(u76 u76) {
        String b2 = u76.b();
        return u76.a + " AND " + b2 + " = ?";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v76)) {
            return false;
        }
        v76 v76 = (v76) obj;
        return tpa.f(this.a, v76.a) && tpa.f(this.b, v76.b) && tpa.f(this.c, v76.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Real(id=" + this.a + ", queryParams=" + this.b + ", name=" + this.c + ")";
    }
}
