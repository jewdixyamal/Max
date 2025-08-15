package defpackage;

/* renamed from: qib  reason: default package */
public final class qib extends bjb {
    public final CharSequence a;

    public qib(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qib) && tpa.f(this.a, ((qib) obj).a);
    }

    public final long getItemId() {
        return (long) 8;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 8;
    }

    public final String toString() {
        return "ChatDescription(text=" + this.a + ")";
    }
}
