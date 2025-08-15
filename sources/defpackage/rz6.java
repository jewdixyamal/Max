package defpackage;

import java.util.List;

/* renamed from: rz6  reason: default package */
public final class rz6 implements ide {
    public final List a;
    public final boolean b;

    public rz6(List list, boolean z) {
        od2.k("List of suppliers is empty!", !list.isEmpty());
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rz6)) {
            return false;
        }
        return j47.B(this.a, ((rz6) obj).a);
    }

    public final Object get() {
        return new qz6(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.e(this.a, "list");
        return r0.toString();
    }
}
