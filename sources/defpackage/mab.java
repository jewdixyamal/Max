package defpackage;

import java.util.List;

/* renamed from: mab  reason: default package */
public final class mab {
    public final tab a;
    public final List b;
    public final List c;

    public mab(tab tab, List list, List list2) {
        this.a = tab;
        this.b = list;
        this.c = list2;
    }

    public static mab a(mab mab, tab tab, List list, int i) {
        if ((i & 2) != 0) {
            list = mab.b;
        }
        return new mab(tab, list, mab.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mab)) {
            return false;
        }
        mab mab = (mab) obj;
        return tpa.f(this.a, mab.a) && tpa.f(this.b, mab.b) && tpa.f(this.c, mab.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(appBarState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", commonItems=");
        return au1.i(sb, this.c, ")");
    }

    public /* synthetic */ mab(tab tab, kl7 kl7) {
        this(tab, kl7, nz4.a);
    }
}
