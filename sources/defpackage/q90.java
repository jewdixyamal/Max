package defpackage;

/* renamed from: q90  reason: default package */
public final class q90 {
    public final int a;
    public final long b;

    public q90(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90 = (q90) obj;
        return this.a == q90.a && this.b == q90.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return zr6.k(sb, this.b, "}");
    }
}
