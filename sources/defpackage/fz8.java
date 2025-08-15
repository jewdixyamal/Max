package defpackage;

/* renamed from: fz8  reason: default package */
public final class fz8 implements kz8 {
    public final CharSequence a;

    public fz8(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz8) && tpa.f(this.a, ((fz8) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "FinishEditMessage(text=" + this.a + ")";
    }
}
