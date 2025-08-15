package defpackage;

/* renamed from: hxe  reason: default package */
public final class hxe {
    public final exe a;
    public final ixe b;
    public final lxe c;
    public final oxe d;

    public hxe(exe exe, ixe ixe, lxe lxe, oxe oxe) {
        this.a = exe;
        this.b = ixe;
        this.c = lxe;
        this.d = oxe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe)) {
            return false;
        }
        hxe hxe = (hxe) obj;
        return tpa.f(this.a, hxe.a) && tpa.f(this.b, hxe.b) && tpa.f(this.c, hxe.c) && tpa.f(this.d, hxe.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopbarColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
