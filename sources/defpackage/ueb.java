package defpackage;

/* renamed from: ueb  reason: default package */
public final class ueb implements xeb {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public ueb(Long l, String str, String str2, String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueb)) {
            return false;
        }
        ueb ueb = (ueb) obj;
        return tpa.f(this.a, ueb.a) && tpa.f(this.b, ueb.b) && tpa.f(this.c, ueb.c) && tpa.f(this.d, ueb.d);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int d2 = rh4.d(rh4.d((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "ContactUpdate(requestId=" + this.a + ", fullName=" + this.b + ", nickName=" + this.c + ", avatarUrl=" + this.d + ")";
    }
}
