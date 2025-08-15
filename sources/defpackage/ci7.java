package defpackage;

/* renamed from: ci7  reason: default package */
public final class ci7 extends di7 {
    public final long a;
    public final Long b;
    public final Long c;
    public final kq3 d;
    public final dh6 e;
    public final def f;
    public final Long g;
    public final String h;

    public ci7(long j, Long l, Long l2, kq3 kq3, dh6 dh6, def def, Long l3, String str) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = kq3;
        this.e = dh6;
        this.f = def;
        this.g = l3;
        this.h = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci7)) {
            return false;
        }
        ci7 ci7 = (ci7) obj;
        return this.a == ci7.a && tpa.f(this.b, ci7.b) && tpa.f(this.c, ci7.c) && tpa.f(this.d, ci7.d) && tpa.f(this.e, ci7.e) && tpa.f(this.f, ci7.f) && tpa.f(this.g, ci7.g) && tpa.f(this.h, ci7.h);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        kq3 kq3 = this.d;
        int hashCode4 = (hashCode3 + (kq3 == null ? 0 : kq3.hashCode())) * 31;
        dh6 dh6 = this.e;
        int hashCode5 = (hashCode4 + (dh6 == null ? 0 : dh6.hashCode())) * 31;
        def def = this.f;
        int hashCode6 = (hashCode5 + (def == null ? 0 : def.hashCode())) * 31;
        Long l3 = this.g;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "SuccessLinkInfo(requestId=" + this.a + ", chatId=" + this.b + ", messageId=" + this.c + ", contactSearchResult=" + this.d + ", groupChatInfo=" + this.e + ", videoConference=" + this.f + ", stickerSetId=" + this.g + ", startPayload=" + this.h + ")";
    }
}
