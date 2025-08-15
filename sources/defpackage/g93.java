package defpackage;

/* renamed from: g93  reason: default package */
public final class g93 {
    public final f93 a;
    public final int b;

    public g93(f93 f93, int i) {
        this.a = f93;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g93)) {
            return false;
        }
        g93 g93 = (g93) obj;
        return tpa.f(this.a, g93.a) && this.b == g93.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStatesBackgroundActiveColors(action=");
        sb.append(this.a);
        sb.append(", neutralFadeTertiary=");
        return zr6.j(sb, this.b, ")");
    }
}
