package defpackage;

/* renamed from: y97  reason: default package */
public final class y97 implements z97 {
    public final f1g a;
    public final c1g b;

    public y97(f1g f1g, c1g c1g) {
        this.a = f1g;
        this.b = c1g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97 = (y97) obj;
        return tpa.f(this.a, y97.a) && tpa.f(this.b, y97.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c1g c1g = this.b;
        return hashCode + (c1g == null ? 0 : c1g.hashCode());
    }

    public final String toString() {
        return "RequestShare(data=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
