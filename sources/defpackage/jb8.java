package defpackage;

/* renamed from: jb8  reason: default package */
public final class jb8 implements sb8 {
    public final boolean X;
    public final String Y;
    public final long Z;
    public final long a;
    public final long b;
    public final o00 c;
    public final yt6 o;
    public final int s0;

    public jb8(long j, long j2, o00 o00, yt6 yt6, String str, int i) {
        boolean z = yt6.e;
        if ((i & 32) != 0 && (str = yt6.k) == null) {
            str = "";
        }
        this.a = j;
        this.b = j2;
        this.c = o00;
        this.o = yt6;
        this.X = z;
        this.Y = str;
        String str2 = yt6.k;
        this.Z = str2 != null ? (long) str2.hashCode() : 0;
        this.s0 = k8a.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb8)) {
            return false;
        }
        jb8 jb8 = (jb8) obj;
        return this.a == jb8.a && this.b == jb8.b && tpa.f(this.c, jb8.c) && tpa.f(this.o, jb8.o) && this.X == jb8.X && tpa.f(this.Y, jb8.Y);
    }

    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        int m = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        return this.Y.hashCode() + ms2.d((this.o.hashCode() + ((this.c.hashCode() + m) * 31)) * 31, 31, this.X);
    }

    public final long i() {
        return this.b;
    }

    public final long j() {
        return this.a;
    }

    public final int l() {
        return this.s0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", imageAttachConfig=");
        sb.append(this.o);
        sb.append(", isGif=");
        sb.append(this.X);
        sb.append(", localId=");
        return zr6.l(sb, this.Y, ")");
    }

    public final String x() {
        return this.Y;
    }
}
