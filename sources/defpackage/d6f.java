package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: d6f  reason: default package */
public final class d6f implements hoc {
    public final List a;
    public final boolean b;

    public d6f(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d6f.class != obj.getClass()) {
            return false;
        }
        d6f d6f = (d6f) obj;
        return this.b == d6f.b && this.a.equals(d6f.a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        return "UpdateDisplayLayoutV2Command{layouts=" + this.a + ", isSnapshot=" + this.b + '}';
    }
}
