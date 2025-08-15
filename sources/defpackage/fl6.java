package defpackage;

/* renamed from: fl6  reason: default package */
public final class fl6 extends hl6 {
    public final CharSequence a;

    public fl6(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl6) && tpa.f(this.a, ((fl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + this.a + ")";
    }
}
