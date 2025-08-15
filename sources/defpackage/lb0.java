package defpackage;

/* renamed from: lb0  reason: default package */
public final class lb0 {
    public final mb0 a;
    public final int b;

    public lb0(mb0 mb0, int i) {
        if (mb0 != null) {
            this.a = mb0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0 = (lb0) obj;
        return this.a.equals(lb0.a) && this.b == lb0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return zr6.j(sb, this.b, "}");
    }
}
