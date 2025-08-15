package defpackage;

/* renamed from: ch2  reason: default package */
public final class ch2 {
    public final tka a;
    public final CharSequence b;

    public ch2(tka tka, String str) {
        this.a = tka;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2 = (ch2) obj;
        return tpa.f(this.a, ch2.a) && tpa.f(this.b, ch2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMediaTabsViewState(avatarParams=" + this.a + ", chatName=" + this.b + ")";
    }
}
