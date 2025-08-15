package defpackage;

import java.util.Arrays;

/* renamed from: s73  reason: default package */
public final class s73 {
    public final r73 a;
    public final int[] b;

    public s73(r73 r73, int[] iArr) {
        this.a = r73;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s73)) {
            return false;
        }
        s73 s73 = (s73) obj;
        return tpa.f(this.a, s73.a) && tpa.f(this.b, s73.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "CommonBackgroundSkeletonStickerPrimaryColors(baseGradient=" + this.a + ", tongueGradient=" + arrays + ")";
    }
}
