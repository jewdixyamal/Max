package defpackage;

/* renamed from: q73  reason: default package */
public final class q73 {
    public final o73 a;
    public final p73 b;
    public final s73 c;
    public final u73 d;

    public q73(o73 o73, p73 p73, s73 s73, u73 u73) {
        this.a = o73;
        this.b = p73;
        this.c = s73;
        this.d = u73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q73)) {
            return false;
        }
        q73 q73 = (q73) obj;
        return tpa.f(this.a, q73.a) && tpa.f(this.b, q73.b) && tpa.f(this.c, q73.c) && tpa.f(this.d, q73.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonColors(bubbleGradientPrimary=" + this.a + ", bubbleGradientSecondary=" + this.b + ", stickerPrimary=" + this.c + ", stickerSecondary=" + this.d + ")";
    }
}
