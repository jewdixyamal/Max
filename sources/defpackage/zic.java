package defpackage;

/* renamed from: zic  reason: default package */
public final class zic {
    public final CharSequence a;
    public final Long b;
    public final Long c;

    public zic(CharSequence charSequence, Long l, Long l2) {
        this.a = charSequence;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zic)) {
            return false;
        }
        zic zic = (zic) obj;
        return tpa.f(this.a, zic.a) && tpa.f(this.b, zic.b) && tpa.f(this.c, zic.c);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Result(text=" + this.a + ", editMsgId=" + this.b + ", replyMsgId=" + this.c + ")";
    }
}
