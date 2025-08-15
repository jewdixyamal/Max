package defpackage;

/* renamed from: jpd  reason: default package */
public final class jpd {
    public final bg1 a;
    public final String b;

    public jpd(bg1 bg1, String str) {
        this.a = bg1;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpd)) {
            return false;
        }
        jpd jpd = (jpd) obj;
        return tpa.f(this.a, jpd.a) && tpa.f(this.b, jpd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
