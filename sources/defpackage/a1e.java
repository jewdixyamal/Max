package defpackage;

/* renamed from: a1e  reason: default package */
public final class a1e {
    public final y0e a;
    public final b1e b;
    public final e1e c;

    public a1e(y0e y0e, b1e b1e, e1e e1e) {
        this.a = y0e;
        this.b = b1e;
        this.c = e1e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1e)) {
            return false;
        }
        a1e a1e = (a1e) obj;
        return tpa.f(this.a, a1e.a) && tpa.f(this.b, a1e.b) && tpa.f(this.c, a1e.c);
    }

    public final int hashCode() {
        int hashCode = this.b.a.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
