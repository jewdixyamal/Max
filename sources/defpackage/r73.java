package defpackage;

import java.util.Arrays;

/* renamed from: r73  reason: default package */
public final class r73 {
    public final int[] a;
    public final int b;

    public r73(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r73)) {
            return false;
        }
        r73 r73 = (r73) obj;
        return tpa.f(this.a, r73.a) && this.b == r73.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(au1.m("CommonBackgroundSkeletonStickerPrimaryBaseGradientColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
