package defpackage;

/* renamed from: fb1  reason: default package */
public final class fb1 extends gb1 {
    public final haf a;

    public fb1(haf haf) {
        this.a = haf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb1) && tpa.f(this.a, ((fb1) obj).a);
    }

    public final int hashCode() {
        haf haf = this.a;
        if (haf == null) {
            return 0;
        }
        return haf.hashCode();
    }

    public final String toString() {
        return "VideoState(participant=" + this.a + ")";
    }
}
