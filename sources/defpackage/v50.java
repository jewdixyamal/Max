package defpackage;

/* renamed from: v50  reason: default package */
public final class v50 {
    public final Long a;
    public final float b;
    public final l30 c;

    public v50(Long l, float f, l30 l30) {
        this.a = l;
        this.b = f;
        this.c = l30;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50 = (v50) obj;
        return tpa.f(this.a, v50.a) && Float.compare(this.b, v50.b) == 0 && tpa.f(this.c, v50.c);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.c.hashCode() + ms2.c((l == null ? 0 : l.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return "AudioMessageState(messageId=" + this.a + ", currentPosition=" + this.b + ", audioButtonState=" + this.c + ")";
    }
}
