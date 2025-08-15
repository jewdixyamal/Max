package defpackage;

/* renamed from: j73  reason: default package */
public final class j73 {
    public final i73 a;
    public final k73 b;

    public j73(i73 i73, k73 k73) {
        this.a = i73;
        this.b = k73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73 = (j73) obj;
        return tpa.f(this.a, j73.a) && tpa.f(this.b, j73.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonActionColors(background=" + this.a + ", icon=" + this.b + ")";
    }
}
