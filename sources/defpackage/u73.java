package defpackage;

import java.util.Arrays;

/* renamed from: u73  reason: default package */
public final class u73 {
    public final t73 a;
    public final int[] b;

    public u73(t73 t73, int[] iArr) {
        this.a = t73;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u73)) {
            return false;
        }
        u73 u73 = (u73) obj;
        return tpa.f(this.a, u73.a) && tpa.f(this.b, u73.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "CommonBackgroundSkeletonStickerSecondaryColors(baseGradient=" + this.a + ", tongueGradient=" + arrays + ")";
    }
}
