package defpackage;

/* renamed from: g48  reason: default package */
public final class g48 implements j48 {
    public final q4d a;
    public final int b;

    public g48(q4d q4d, int i) {
        this.a = q4d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g48)) {
            return false;
        }
        g48 g48 = (g48) obj;
        return tpa.f(this.a, g48.a) && this.b == g48.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
