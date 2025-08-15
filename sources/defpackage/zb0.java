package defpackage;

/* renamed from: zb0  reason: default package */
public final class zb0 {
    public final int a = 0;
    public final kee b;

    public zb0(kee kee) {
        if (kee != null) {
            this.b = kee;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0 = (zb0) obj;
        return this.a == zb0.a && this.b.equals(zb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Event{eventCode=" + this.a + ", surfaceOutput=" + this.b + "}";
    }
}
