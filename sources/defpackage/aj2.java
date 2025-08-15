package defpackage;

/* renamed from: aj2  reason: default package */
public final class aj2 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final zi2 d;

    public aj2(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, zi2 zi2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = zi2;
    }

    public static aj2 a(aj2 aj2, zi2 zi2) {
        CharSequence charSequence = aj2.a;
        CharSequence charSequence2 = aj2.b;
        CharSequence charSequence3 = aj2.c;
        aj2.getClass();
        return new aj2(charSequence, charSequence2, charSequence3, zi2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2)) {
            return false;
        }
        aj2 aj2 = (aj2) obj;
        return tpa.f(this.a, aj2.a) && tpa.f(this.b, aj2.b) && tpa.f(this.c, aj2.c) && tpa.f(this.d, aj2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rh4.f(this.c, rh4.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InfoPanelState(author=" + this.a + ", dateText=" + this.b + ", captionText=" + this.c + ", frameState=" + this.d + ")";
    }
}
