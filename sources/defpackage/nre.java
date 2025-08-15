package defpackage;

import java.util.Arrays;

/* renamed from: nre  reason: default package */
public final class nre {
    public final int[] a;
    public final float b;

    public nre(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nre)) {
            return false;
        }
        nre nre = (nre) obj;
        return tpa.f(this.a, nre.a) && Float.compare(this.b, nre.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "Gradient(colors=" + arrays + ", angle=" + this.b + ")";
    }
}
