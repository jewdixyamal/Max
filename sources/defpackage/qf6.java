package defpackage;

import java.util.Arrays;

/* renamed from: qf6  reason: default package */
public final class qf6 {
    public final pf6 a;
    public final rf6 b;
    public final int[] c;
    public final int[] d;

    public qf6(pf6 pf6, rf6 rf6, int[] iArr, int[] iArr2) {
        this.a = pf6;
        this.b = rf6;
        this.c = iArr;
        this.d = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf6)) {
            return false;
        }
        qf6 qf6 = (qf6) obj;
        return tpa.f(this.a, qf6.a) && tpa.f(this.b, qf6.b) && tpa.f(this.c, qf6.c) && tpa.f(this.d, qf6.d);
    }

    public final int hashCode() {
        int e = k7d.e(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
        return Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + e) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(this.d);
        return "GradientsSkeletonGradientColors(cell=" + this.a + ", grid=" + this.b + ", cellGradient=" + arrays + ", gridGradient=" + arrays2 + ")";
    }
}
