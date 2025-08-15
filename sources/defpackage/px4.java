package defpackage;

/* renamed from: px4  reason: default package */
public final class px4 {
    public final String a;
    public final ox4 b;
    public final ox4 c;

    public px4(String str, ox4 ox4, ox4 ox42) {
        this.a = str;
        this.b = ox4;
        this.c = ox42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px4)) {
            return false;
        }
        px4 px4 = (px4) obj;
        return tpa.f(this.a, px4.a) && tpa.f(this.b, px4.b) && tpa.f(this.c, px4.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        ox4 ox4 = this.b;
        int hashCode2 = (hashCode + (ox4 == null ? 0 : ox4.hashCode())) * 31;
        ox4 ox42 = this.c;
        if (ox42 != null) {
            i = ox42.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EmojiLottie(emoji=" + this.a + ", emojiAnimation=" + this.b + ", reactionAnimation=" + this.c + ")";
    }
}
