package defpackage;

/* renamed from: vab  reason: default package */
public final class vab extends pi0 {
    public final long b;
    public final long c;

    public vab(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vab)) {
            return false;
        }
        vab vab = (vab) obj;
        return this.b == vab.b && this.c == vab.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAvatarUpdatedEvent(requestId=");
        sb.append(this.b);
        sb.append(", photoId=");
        return zr6.k(sb, this.c, ")");
    }
}
