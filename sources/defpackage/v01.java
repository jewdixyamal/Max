package defpackage;

/* renamed from: v01  reason: default package */
public final class v01 implements w01 {
    public final long a;
    public final boolean b;

    public v01(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01 = (v01) obj;
        return this.a == v01.a && this.b == v01.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        return au1.j(sb, this.b, ")");
    }
}
