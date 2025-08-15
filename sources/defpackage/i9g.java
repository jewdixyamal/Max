package defpackage;

/* renamed from: i9g  reason: default package */
public final class i9g {
    public final h9g a;
    public final j9g b;
    public final k9g c;
    public final l9g d;

    public i9g(h9g h9g, j9g j9g, k9g k9g, l9g l9g) {
        this.a = h9g;
        this.b = j9g;
        this.c = k9g;
        this.d = l9g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9g)) {
            return false;
        }
        i9g i9g = (i9g) obj;
        return tpa.f(this.a, i9g.a) && tpa.f(this.b, i9g.b) && tpa.f(this.c, i9g.c) && tpa.f(this.d, i9g.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WritebarColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
