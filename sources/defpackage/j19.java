package defpackage;

/* renamed from: j19  reason: default package */
public final class j19 implements m19 {
    public final long a;
    public final wgf b;
    public final float c;

    public j19(long j, wgf wgf, float f) {
        this.a = j;
        this.b = wgf;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j19)) {
            return false;
        }
        j19 j19 = (j19) obj;
        return this.a == j19.a && tpa.f(this.b, j19.b) && Float.compare(this.c, j19.c) == 0;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Float.hashCode(this.c) + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnSeek(messageId=" + this.a + ", model=" + this.b + ", progress=" + this.c + ")";
    }
}
