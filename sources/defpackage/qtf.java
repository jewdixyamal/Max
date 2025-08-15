package defpackage;

import java.util.List;

/* renamed from: qtf  reason: default package */
public final class qtf implements rtf {
    public final jqe a;
    public final List b;

    public qtf(eqe eqe, List list) {
        this.a = eqe;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtf)) {
            return false;
        }
        qtf qtf = (qtf) obj;
        return tpa.f(this.a, qtf.a) && tpa.f(this.b, qtf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestOpenSettings(title=" + this.a + ", buttons=" + this.b + ")";
    }
}
