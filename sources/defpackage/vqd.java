package defpackage;

/* renamed from: vqd  reason: default package */
public final class vqd implements x38 {
    public final long a;
    public final String b;
    public final yt6 c;
    public final boolean d;

    public vqd(long j, String str, yt6 yt6, boolean z) {
        this.a = j;
        this.b = str;
        this.c = yt6;
        this.d = z;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqd)) {
            return false;
        }
        vqd vqd = (vqd) obj;
        return this.a == vqd.a && tpa.f(this.b, vqd.b) && tpa.f(this.c, vqd.c) && this.d == vqd.d;
    }

    public final int hashCode() {
        int d2 = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + d2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleImageAttach(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", imageAttach=");
        sb.append(this.c);
        sb.append(", isMediaOrderedFirst=");
        return au1.j(sb, this.d, ")");
    }
}
