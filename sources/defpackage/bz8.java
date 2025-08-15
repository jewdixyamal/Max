package defpackage;

/* renamed from: bz8  reason: default package */
public final class bz8 {
    public final CharSequence a;
    public final Integer b;

    public bz8(CharSequence charSequence, Integer num) {
        this.a = charSequence;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz8)) {
            return false;
        }
        bz8 bz8 = (bz8) obj;
        return tpa.f(this.a, bz8.a) && tpa.f(this.b, bz8.b);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InputTextData(inputText=" + this.a + ", inputCursorPosition=" + this.b + ")";
    }
}
