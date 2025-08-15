package defpackage;

/* renamed from: ty7  reason: default package */
public final class ty7 {
    public final long a;
    public final i08 b;
    public final boolean c;

    public ty7(long j, i08 i08, boolean z) {
        this.a = j;
        this.b = i08;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ty7.class != obj.getClass()) {
            return false;
        }
        ty7 ty7 = (ty7) obj;
        if (this.a == ty7.a && this.c == ty7.c) {
            return this.b == ty7.b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        return "Key{contactId=" + this.a + ", markerWeight=" + this.b + ", active=" + this.c + '}';
    }
}
