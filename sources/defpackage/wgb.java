package defpackage;

/* renamed from: wgb  reason: default package */
public final class wgb {
    public final long a;
    public final long b;
    public final bdb c;

    public wgb(long j, long j2, bdb bdb) {
        this.a = j;
        this.b = j2;
        this.c = bdb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgb)) {
            return false;
        }
        wgb wgb = (wgb) obj;
        return this.a == wgb.a && this.b == wgb.b && tpa.f(this.c, wgb.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ProfileEntity(id=" + this.a + ", serverId=" + this.b + ", profileData=" + this.c + ")";
    }
}
