package defpackage;

/* renamed from: ua0  reason: default package */
public final class ua0 {
    public final String a;
    public final long b;
    public final long c;

    public ua0(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0 = (ua0) obj;
        return this.a.equals(ua0.a) && this.b == ua0.b && this.c == ua0.c;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return zr6.k(sb, this.c, "}");
    }
}
