package defpackage;

/* renamed from: cs0  reason: default package */
public final class cs0 {
    public final ds0 a;
    public final es0 b;
    public final fs0 c;

    public cs0(ds0 ds0, es0 es0, fs0 fs0) {
        this.a = ds0;
        this.b = es0;
        this.c = fs0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs0)) {
            return false;
        }
        cs0 cs0 = (cs0) obj;
        return tpa.f(this.a, cs0.a) && tpa.f(this.b, cs0.b) && tpa.f(this.c, cs0.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BubbleBackgroundFocusColors(regular=" + this.a + ", singleMedia=" + this.b + ", transparent=" + this.c + ")";
    }
}
