package defpackage;

import java.util.Arrays;

/* renamed from: o73  reason: default package */
public final class o73 {
    public final int[] a;
    public final int b;

    public o73(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73 = (o73) obj;
        return tpa.f(this.a, o73.a) && this.b == o73.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(au1.m("CommonBackgroundSkeletonBubbleGradientPrimaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
