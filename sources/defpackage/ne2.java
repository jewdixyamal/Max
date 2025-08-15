package defpackage;

/* renamed from: ne2  reason: default package */
public final class ne2 {
    public final long a;
    public final long b;
    public final String c;
    public final en4 d;
    public final boolean e;

    public ne2(long j, long j2, String str, en4 en4, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = en4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne2)) {
            return false;
        }
        ne2 ne2 = (ne2) obj;
        return this.a == ne2.a && this.b == ne2.b && tpa.f(this.c, ne2.c) && this.d == ne2.d && this.e == ne2.e;
    }

    public final int hashCode() {
        int d2 = rh4.d(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + d2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadData(msgId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", localAttachId=");
        sb.append(this.c);
        sb.append(", cause=");
        sb.append(this.d);
        sb.append(", completed=");
        return au1.j(sb, this.e, ")");
    }
}
