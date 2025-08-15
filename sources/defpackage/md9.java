package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: md9  reason: default package */
public final class md9 {
    public final List a;

    public md9(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md9) && tpa.f(this.a, ((md9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieStateUpdates(updates=" + this.a + ")";
    }
}
