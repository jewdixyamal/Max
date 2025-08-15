package defpackage;

import java.util.Arrays;

/* renamed from: ef6  reason: default package */
public final class ef6 {
    public final int[] a;
    public final int[] b;

    public ef6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef6)) {
            return false;
        }
        ef6 ef6 = (ef6) obj;
        return tpa.f(this.a, ef6.a) && tpa.f(this.b, ef6.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return k7d.j("GradientsEmptyBlockIconWrapperColors(shapeGradient=", Arrays.toString(this.a), ", strokeGradient=", Arrays.toString(this.b), ")");
    }
}
