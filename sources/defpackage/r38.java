package defpackage;

/* renamed from: r38  reason: default package */
public final class r38 {
    public final p38 a;
    public final q38 b;

    public r38() {
        p38 p38 = new p38();
        q38 q38 = new q38();
        this.a = p38;
        this.b = q38;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r38)) {
            return false;
        }
        r38 r38 = (r38) obj;
        return tpa.f(this.a, r38.a) && tpa.f(this.b, r38.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }
}
