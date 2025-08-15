package defpackage;

/* renamed from: ql1  reason: default package */
public final class ql1 {
    public final zad a;
    public final tad b;

    public ql1(zad zad, tad tad) {
        this.a = zad;
        this.b = tad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1 = (ql1) obj;
        return tpa.f(this.a, ql1.a) && tpa.f(this.b, ql1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
