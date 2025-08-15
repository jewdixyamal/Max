package defpackage;

/* renamed from: wqb  reason: default package */
public final class wqb {
    public final tb8 a;
    public final long b;
    public final long c;

    public wqb(tb8 tb8, long j, long j2) {
        this.a = tb8;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqb)) {
            return false;
        }
        wqb wqb = (wqb) obj;
        return this.b == wqb.b && this.a.equals(wqb.a) && this.c == wqb.c;
    }

    public final int hashCode() {
        long j = this.b;
        int hashCode = this.a.hashCode();
        long j2 = this.c;
        return ((hashCode + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
