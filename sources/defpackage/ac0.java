package defpackage;

import java.util.List;

/* renamed from: ac0  reason: default package */
public final class ac0 {
    public final iee a;
    public final List b;

    public ac0(iee iee, List list) {
        if (iee != null) {
            this.a = iee;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0 = (ac0) obj;
        return this.a.equals(ac0.a) && this.b.equals(ac0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return au1.i(sb, this.b, "}");
    }
}
