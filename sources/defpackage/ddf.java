package defpackage;

/* renamed from: ddf  reason: default package */
public final class ddf implements edf {
    public final long a;
    public final wgf b;

    public ddf(long j, wgf wgf) {
        this.a = j;
        this.b = wgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddf)) {
            return false;
        }
        ddf ddf = (ddf) obj;
        return this.a == ddf.a && tpa.f(this.b, ddf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StartVideoMessage(msgId=" + this.a + ", attachModel=" + this.b + ")";
    }
}
