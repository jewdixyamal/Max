package defpackage;

/* renamed from: nl1  reason: default package */
public final class nl1 {
    public final zad a;
    public final tad b;

    public nl1(zad zad, tad tad) {
        this.a = zad;
        this.b = tad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1 = (nl1) obj;
        return tpa.f(this.a, nl1.a) && tpa.f(this.b, nl1.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tad tad = this.b;
        return hashCode + (tad == null ? 0 : tad.hashCode());
    }

    public final String toString() {
        return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
