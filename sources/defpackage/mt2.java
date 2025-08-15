package defpackage;

import java.util.List;

/* renamed from: mt2  reason: default package */
public final class mt2 {
    public static final mt2 c = new mt2(nz4.a, true);
    public final List a;
    public final boolean b;

    public mt2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt2)) {
            return false;
        }
        mt2 mt2 = (mt2) obj;
        return tpa.f(this.a, mt2.a) && this.b == mt2.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatsList(chats=" + this.a + ", hasMore=" + this.b + ")";
    }
}
