package defpackage;

/* renamed from: m31  reason: default package */
public final class m31 {
    public final Long a;
    public final CharSequence b;
    public final md0 c;
    public final od0 d;
    public final boolean e;

    public m31(Long l, CharSequence charSequence, md0 md0, od0 od0, boolean z) {
        this.a = l;
        this.b = charSequence;
        this.c = md0;
        this.d = od0;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m31)) {
            return false;
        }
        m31 m31 = (m31) obj;
        return tpa.f(this.a, m31.a) && tpa.f(this.b, m31.b) && tpa.f(this.c, m31.c) && tpa.f(this.d, m31.d) && this.e == m31.e;
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        md0 md0 = this.c;
        int hashCode3 = (hashCode2 + (md0 == null ? 0 : md0.hashCode())) * 31;
        od0 od0 = this.d;
        if (od0 != null) {
            i = od0.hashCode();
        }
        return Boolean.hashCode(this.e) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallChatState(chatId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", overlay=");
        sb.append(this.d);
        sb.append(", isLinkCall=");
        return au1.j(sb, this.e, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m31(Long l, CharSequence charSequence, md0 md0, boolean z, int i) {
        this((i & 1) != 0 ? null : l, charSequence, md0, (od0) null, z);
    }
}
