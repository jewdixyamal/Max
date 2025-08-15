package defpackage;

/* renamed from: q5c  reason: default package */
public final class q5c extends r5c {
    public final long a;
    public final long b;
    public final float c;

    public q5c(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5c = (q5c) obj;
        return this.a == q5c.a && this.b == q5c.b && Float.compare(this.c, q5c.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ")";
    }
}
