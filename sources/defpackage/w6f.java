package defpackage;

/* renamed from: w6f  reason: default package */
public final class w6f {
    public final long a;
    public final long b;
    public long c;

    public /* synthetic */ w6f(long j, long j2) {
        this(j, j2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6f)) {
            return false;
        }
        w6f w6f = (w6f) obj;
        return this.a == w6f.a && this.b == w6f.b && this.c == w6f.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.a;
        StringBuilder k = au1.k(j2, "Chunk[", " -> ");
        k.append(j + j2);
        k.append(" (position: ");
        k.append(this.c + j2);
        k.append(")]");
        return k.toString();
    }

    public w6f(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
