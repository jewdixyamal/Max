package defpackage;

import java.util.List;

/* renamed from: ch0  reason: default package */
public final class ch0 implements ol7 {
    public final long a;
    public final List b;

    public ch0(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0)) {
            return false;
        }
        ch0 ch0 = (ch0) obj;
        return this.a == ch0.a && tpa.f(this.b, ch0.b);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        return "BannerViewPagerListItem(itemId=" + this.a + ", items=" + this.b + ")";
    }
}
