package defpackage;

/* renamed from: j93  reason: default package */
public final class j93 {
    public final h93 a;
    public final k93 b;
    public final m93 c;

    public j93(h93 h93, k93 k93, m93 m93) {
        this.a = h93;
        this.b = k93;
        this.c = m93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j93)) {
            return false;
        }
        j93 j93 = (j93) obj;
        return tpa.f(this.a, j93.a) && tpa.f(this.b, j93.b) && tpa.f(this.c, j93.c);
    }

    public final int hashCode() {
        int hashCode = this.b.a.hashCode();
        return this.c.a.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CommonStatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
