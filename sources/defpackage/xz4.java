package defpackage;

/* renamed from: xz4  reason: default package */
public final class xz4 implements a05 {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final yt6 d;
    public final jqe e;
    public final jqe f;

    public xz4(String str, CharSequence charSequence, long j, yt6 yt6, jqe jqe, jqe jqe2) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = yt6;
        this.e = jqe;
        this.f = jqe2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz4)) {
            return false;
        }
        xz4 xz4 = (xz4) obj;
        return tpa.f(this.a, xz4.a) && tpa.f(this.b, xz4.b) && this.c == xz4.c && tpa.f(this.d, xz4.d) && tpa.f(this.e, xz4.e) && tpa.f(this.f, xz4.f);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int m = h4f.m((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
        yt6 yt6 = this.d;
        if (yt6 != null) {
            i = yt6.hashCode();
        }
        return this.f.hashCode() + k7d.f((m + i) * 31, 31, this.e);
    }

    public final String toString() {
        return "EmptyBot(avatar=" + this.a + ", avatarPlaceholder=" + this.b + ", avatarPlaceholderId=" + this.c + ", imageAttachConfig=" + this.d + ", title=" + this.e + ", subtitle=" + this.f + ")";
    }
}
