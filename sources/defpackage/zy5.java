package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: zy5  reason: default package */
public final class zy5 {
    public final Set a;
    public final wuc b;

    public zy5(LinkedHashSet linkedHashSet, wuc wuc) {
        this.a = linkedHashSet;
        this.b = wuc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy5)) {
            return false;
        }
        zy5 zy5 = (zy5) obj;
        return tpa.f(this.a, zy5.a) && this.b == zy5.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ForwardInAppReviewData(triggeredConditions=" + this.a + ", screen=" + this.b + ")";
    }
}
