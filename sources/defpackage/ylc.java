package defpackage;

/* renamed from: ylc  reason: default package */
public final class ylc {
    public final bg1 a;
    public final String b;
    public final zad c;

    public ylc(bg1 bg1, String str, zad zad) {
        this.a = bg1;
        this.b = str;
        this.c = zad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylc)) {
            return false;
        }
        ylc ylc = (ylc) obj;
        return tpa.f(this.a, ylc.a) && tpa.f(this.b, ylc.b) && tpa.f(this.c, ylc.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
