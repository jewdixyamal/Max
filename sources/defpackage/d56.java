package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: d56  reason: default package */
public final class d56 {
    public final ConcurrentHashMap a;

    public /* synthetic */ d56(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d56)) {
            return false;
        }
        return tpa.f(this.a, ((d56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FtsCache(titles=" + this.a + ")";
    }
}
