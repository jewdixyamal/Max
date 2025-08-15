package defpackage;

/* renamed from: ow8  reason: default package */
public final class ow8 {
    public static final ow8 d = new ow8(-1, (CharSequence) null, (String) null);
    public final long a;
    public final String b;
    public final CharSequence c;

    public ow8(long j, CharSequence charSequence, String str) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow8)) {
            return false;
        }
        ow8 ow8 = (ow8) obj;
        return this.a == ow8.a && tpa.f(this.b, ow8.b) && tpa.f(this.c, ow8.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AvatarParams(id=" + this.a + ", url=" + this.b + ", placeholder=" + this.c + ")";
    }
}
