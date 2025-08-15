package defpackage;

/* renamed from: la0  reason: default package */
public final class la0 {
    public static final la0 c = new la0(mb0.j, 0);
    public final mb0 a;
    public final int b;

    public la0(mb0 mb0, int i) {
        if (mb0 != null) {
            this.a = mb0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0 = (la0) obj;
        return this.a.equals(la0.a) && this.b == la0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return zr6.j(sb, this.b, "}");
    }
}
