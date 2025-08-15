package defpackage;

/* renamed from: is0  reason: default package */
public final class is0 {
    public final bs0 a;
    public final js0 b;
    public final ks0 c;
    public final ls0 d;

    public is0(bs0 bs0, js0 js0, ks0 ks0, ls0 ls0) {
        this.a = bs0;
        this.b = js0;
        this.c = ks0;
        this.d = ls0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0 = (is0) obj;
        return tpa.f(this.a, is0.a) && tpa.f(this.b, is0.b) && tpa.f(this.c, is0.c) && tpa.f(this.d, is0.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BubbleColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
