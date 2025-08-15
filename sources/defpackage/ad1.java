package defpackage;

/* renamed from: ad1  reason: default package */
public final class ad1 implements bd1 {
    public final long a;
    public final String b;
    public final boolean c;
    public final CharSequence d;

    public ad1(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad1)) {
            return false;
        }
        ad1 ad1 = (ad1) obj;
        return this.a == ad1.a && tpa.f(this.b, ad1.b) && this.c == ad1.c && tpa.f(this.d, ad1.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ms2.d(rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Exist(serverChatId=" + this.a + ", link=" + this.b + ", isLinkCall=" + this.c + ", title=" + this.d + ")";
    }
}
