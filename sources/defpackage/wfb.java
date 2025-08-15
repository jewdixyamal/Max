package defpackage;

/* renamed from: wfb  reason: default package */
public final class wfb implements xfb {
    public final i24 a;

    public wfb(i24 i24) {
        this.a = i24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfb) && tpa.f(this.a, ((wfb) obj).a);
    }

    public final int hashCode() {
        i24 i24 = this.a;
        if (i24 == null) {
            return 0;
        }
        return i24.hashCode();
    }

    public final String toString() {
        return "ShortLinkPayload(state=" + this.a + ")";
    }
}
