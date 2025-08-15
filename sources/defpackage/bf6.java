package defpackage;

import java.util.Arrays;

/* renamed from: bf6  reason: default package */
public final class bf6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;

    public bf6(int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf6)) {
            return false;
        }
        bf6 bf6 = (bf6) obj;
        return tpa.f(this.a, bf6.a) && tpa.f(this.b, bf6.b) && tpa.f(this.c, bf6.c);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + ((hashCode + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        return zr6.l(k7d.k("GradientsButtonTextPromoColors(defaultGradient=", arrays, ", disabledGradient=", arrays2, ", pressedGradient="), Arrays.toString(this.c), ")");
    }
}
