package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: e12  reason: default package */
public final class e12 {
    public static final e12 c = new e12(x53.H0(new ArrayList()), (a14) null);
    public final Set a;
    public final a14 b;

    public e12(Set set, a14 a14) {
        this.a = set;
        this.b = a14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e12) {
            e12 e12 = (e12) obj;
            return tpa.f(e12.a, this.a) && tpa.f(e12.b, this.b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        a14 a14 = this.b;
        return hashCode + (a14 != null ? a14.hashCode() : 0);
    }
}
