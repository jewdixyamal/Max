package defpackage;

import java.util.Map;

/* renamed from: kp4  reason: default package */
public final class kp4 {
    public final Map a;
    public final Map b;

    public kp4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp4)) {
            return false;
        }
        kp4 kp4 = (kp4) obj;
        return tpa.f(this.a, kp4.a) && tpa.f(this.b, kp4.b);
    }

    public final int hashCode() {
        int i = 0;
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftUpdates(discarded=" + this.a + ", saved=" + this.b + ")";
    }
}
