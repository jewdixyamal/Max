package defpackage;

/* renamed from: y21  reason: default package */
public final class y21 {
    public static final y21 h = new y21((Long) null, (String) null, (String) null, (Long) null, 124);
    public final Long a;
    public final Long b;
    public final CharSequence c;
    public final String d;
    public final Long e;
    public final CharSequence f;
    public final boolean g;

    public y21(Long l, Long l2, CharSequence charSequence, String str, Long l3, CharSequence charSequence2, boolean z) {
        this.a = l;
        this.b = l2;
        this.c = charSequence;
        this.d = str;
        this.e = l3;
        this.f = charSequence2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21 = (y21) obj;
        return tpa.f(this.a, y21.a) && tpa.f(this.b, y21.b) && tpa.f(this.c, y21.c) && tpa.f(this.d, y21.d) && tpa.f(this.e, y21.e) && tpa.f(this.f, y21.f) && this.g == y21.g;
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.e;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return Boolean.hashCode(this.g) + ((hashCode5 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallChatInfo(chatId=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", avatarColorId=");
        sb.append(this.e);
        sb.append(", avatarAbbreviation=");
        sb.append(this.f);
        sb.append(", isLinkCall=");
        return au1.j(sb, this.g, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y21(Long l, String str, String str2, Long l2, int i) {
        this((Long) null, l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l2, (CharSequence) null, false);
    }
}
