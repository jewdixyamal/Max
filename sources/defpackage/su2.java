package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* renamed from: su2  reason: default package */
public final class su2 implements tu2 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Map e;
    public final m56 f;
    public final Comparator g;

    public su2(Set set, Set set2, Set set3, Set set4, Map map) {
        we1 we1 = xxc.o;
        v00 v00 = p82.I;
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = map;
        this.f = we1;
        this.g = v00;
    }

    public final Comparator a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su2)) {
            return false;
        }
        su2 su2 = (su2) obj;
        return tpa.f(this.a, su2.a) && tpa.f(this.b, su2.b) && tpa.f(this.c, su2.c) && tpa.f(this.d, su2.d) && tpa.f(this.e, su2.e) && tpa.f(this.f, su2.f) && tpa.f(this.g, su2.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(includedChats=" + this.a + ", includedFilters=" + this.b + ", excludedChats=" + this.c + ", excludedFilters=" + this.d + ", subjects=" + this.e + ", filterPredicate=" + this.f + ", comparator=" + this.g + ")";
    }
}
