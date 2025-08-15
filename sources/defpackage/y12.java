package defpackage;

import java.util.List;

/* renamed from: y12  reason: default package */
public final class y12 {
    public final m22 a;
    public final List b;

    public y12(m22 m22, List list) {
        this.a = m22;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y12)) {
            return false;
        }
        y12 y12 = (y12) obj;
        return tpa.f(this.a, y12.a) && tpa.f(this.b, y12.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(screenState=" + this.a + ", items=" + this.b + ")";
    }
}
