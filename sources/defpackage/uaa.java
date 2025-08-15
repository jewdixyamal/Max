package defpackage;

/* renamed from: uaa  reason: default package */
public final class uaa {
    public final long a;
    public final xd7 b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final boolean f;
    public final k8g g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uaa(long j, xd7 xd7, Long l, Long l2, Long l3, boolean z, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : xd7, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) == 0 ? l3 : null, (i & 32) != 0 ? false : z, (k8g) null);
    }

    public final k8g a() {
        return this.g;
    }

    public final Long b() {
        return this.e;
    }

    public final String c() {
        xd7 xd7 = this.b;
        if (xd7 != null) {
            return xd7.a;
        }
        return null;
    }

    public final boolean d() {
        return fm9.G(this.b) && this.d == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa)) {
            return false;
        }
        uaa uaa = (uaa) obj;
        if (this.a != uaa.a) {
            return false;
        }
        xd7 xd7 = this.b;
        return ((fm9.G(xd7) && fm9.G(uaa.b)) || tpa.f(xd7, uaa.b)) && tpa.f(this.c, uaa.c) && tpa.f(this.d, uaa.d);
    }

    public final int hashCode() {
        int i = 0;
        xd7 xd7 = this.b;
        int m = h4f.m((xd7 != null ? xd7.hashCode() : 0) * 31, 31, this.a);
        Long l = this.c;
        int hashCode = (m + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.d;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OneMeDraft(cid=" + this.a + ", lastInputText=" + this.b + ", replyMessageId=" + this.c + ", editMessageId=" + this.d + ", serverTime=" + this.e + ", fromServer=" + this.f + ", attaches=" + this.g + ")";
    }

    public uaa(long j, xd7 xd7, Long l, Long l2, Long l3, boolean z, k8g k8g) {
        this.a = j;
        this.b = xd7;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = z;
        this.g = k8g;
    }
}
