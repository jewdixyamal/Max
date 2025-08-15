package defpackage;

/* renamed from: cdf  reason: default package */
public final class cdf implements edf {
    public final long a;
    public final String b;
    public final o00 c;
    public final long d;
    public final long e;
    public final boolean f;

    public cdf(long j, String str, o00 o00, long j2, long j3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = o00;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdf)) {
            return false;
        }
        cdf cdf = (cdf) obj;
        return this.a == cdf.a && tpa.f(this.b, cdf.b) && tpa.f(this.c, cdf.c) && this.d == cdf.d && this.e == cdf.e && this.f == cdf.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + h4f.m(h4f.m((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenVideo(msgId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", playerPosition=");
        sb.append(this.d);
        sb.append(", videoDuration=");
        sb.append(this.e);
        sb.append(", isVideoLive=");
        return au1.j(sb, this.f, ")");
    }
}
