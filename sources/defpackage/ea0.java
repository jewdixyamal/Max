package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ea0  reason: default package */
public final class ea0 {
    public final iee a;
    public final iee b;
    public final List c;

    public ea0(iee iee, iee iee2, ArrayList arrayList) {
        if (iee != null) {
            this.a = iee;
            if (iee2 != null) {
                this.b = iee2;
                this.c = arrayList;
                return;
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0 = (ea0) obj;
        return this.a.equals(ea0.a) && this.b.equals(ea0.b) && this.c.equals(ea0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return au1.i(sb, this.c, "}");
    }
}
