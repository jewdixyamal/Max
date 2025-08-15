package defpackage;

/* renamed from: n5c  reason: default package */
public final class n5c extends r5c {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final Long e;
    public final Long f;

    public n5c(long j, long j2, float f2, long j3, Long l, Long l2) {
        this.a = j;
        this.b = j2;
        this.c = f2;
        this.d = j3;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5c)) {
            return false;
        }
        n5c n5c = (n5c) obj;
        return this.a == n5c.a && this.b == n5c.b && Float.compare(this.c, n5c.c) == 0 && this.d == n5c.d && tpa.f(this.e, n5c.e) && tpa.f(this.f, n5c.f);
    }

    public final int hashCode() {
        int m = h4f.m(ms2.c(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d);
        int i = 0;
        Long l = this.e;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ", bytesDownloaded=" + this.d + ", fileId=" + this.e + ", fileSize=" + this.f + ")";
    }
}
