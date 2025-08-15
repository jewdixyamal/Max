package defpackage;

import java.util.List;

/* renamed from: p83  reason: default package */
public final class p83 implements u83 {
    public final List a;
    public final boolean b;
    public final Long c;

    public p83(Long l, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = l;
    }

    public static p83 a(p83 p83, List list, int i) {
        boolean z = (i & 2) != 0 ? p83.b : false;
        Long l = p83.c;
        p83.getClass();
        return new p83(l, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p83)) {
            return false;
        }
        p83 p83 = (p83) obj;
        return tpa.f(this.a, p83.a) && this.b == p83.b && tpa.f(this.c, p83.c);
    }

    public final int hashCode() {
        int d = ms2.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return d + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Result(items=" + this.a + ", hasMore=" + this.b + ", marker=" + this.c + ")";
    }
}
