package defpackage;

/* renamed from: jh1  reason: default package */
public final class jh1 {
    public final Integer a;
    public final bi9 b;
    public final CharSequence c;

    public jh1(Integer num, bi9 bi9, CharSequence charSequence) {
        this.a = num;
        this.b = bi9;
        this.c = charSequence;
    }

    public static jh1 a(jh1 jh1, Integer num, bi9 bi9, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            num = jh1.a;
        }
        if ((i & 2) != 0) {
            bi9 = jh1.b;
        }
        if ((i & 4) != 0) {
            charSequence = jh1.c;
        }
        jh1.getClass();
        return new jh1(num, bi9, charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh1)) {
            return false;
        }
        jh1 jh1 = (jh1) obj;
        return tpa.f(this.a, jh1.a) && tpa.f(this.b, jh1.b) && tpa.f(this.c, jh1.c);
    }

    public final int hashCode() {
        int i = 0;
        Integer num = this.a;
        int hashCode = (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "State(selectedEmoji=" + this.a + ", selectedReasons=" + this.b + ", otherReasonText=" + this.c + ")";
    }
}
