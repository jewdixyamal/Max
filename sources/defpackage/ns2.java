package defpackage;

/* renamed from: ns2  reason: default package */
public final class ns2 {
    public final long a;
    public final CharSequence b;

    public ns2(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns2)) {
            return false;
        }
        ns2 ns2 = (ns2) obj;
        return this.a == ns2.a && tpa.f(this.b, ns2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChatTyping(chatId=" + this.a + ", typingText=" + this.b + ")";
    }
}
