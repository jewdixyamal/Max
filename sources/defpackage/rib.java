package defpackage;

/* renamed from: rib  reason: default package */
public final class rib extends cjb {
    public final nc2 a;

    public rib(nc2 nc2) {
        this.a = nc2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rib) && tpa.f(this.a, ((rib) obj).a);
    }

    public final long getItemId() {
        return (long) 16384;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 16384;
    }

    public final String toString() {
        return "ChatLinkItem(model=" + this.a + ")";
    }
}
