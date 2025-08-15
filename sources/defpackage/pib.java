package defpackage;

/* renamed from: pib  reason: default package */
public final class pib extends bjb {
    public final CharSequence a;

    public pib(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pib) && tpa.f(this.a, ((pib) obj).a);
    }

    public final long getItemId() {
        return (long) 32768;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final int l() {
        return 32768;
    }

    public final String toString() {
        return "ChannelLinkItem(link=" + this.a + ")";
    }
}
