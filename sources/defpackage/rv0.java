package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: rv0  reason: default package */
public final class rv0 extends zma implements Serializable {
    public final w56 a;
    public final zma b;

    public rv0(w56 w56, zma zma) {
        this.a = w56;
        zma.getClass();
        this.b = zma;
    }

    public final int compare(Object obj, Object obj2) {
        w56 w56 = this.a;
        return this.b.compare(w56.apply(obj), w56.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rv0)) {
            return false;
        }
        rv0 rv0 = (rv0) obj;
        return this.a.equals(rv0.a) && this.b.equals(rv0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
