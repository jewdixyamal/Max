package defpackage;

import java.util.Arrays;

/* renamed from: ye6  reason: default package */
public final class ye6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;

    public ye6(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye6)) {
            return false;
        }
        ye6 ye6 = (ye6) obj;
        return tpa.f(this.a, ye6.a) && tpa.f(this.b, ye6.b) && tpa.f(this.c, ye6.c) && tpa.f(this.d, ye6.d);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        int hashCode2 = Arrays.hashCode(this.c);
        return Arrays.hashCode(this.d) + ((hashCode2 + ((hashCode + (Arrays.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        String arrays3 = Arrays.toString(this.c);
        String arrays4 = Arrays.toString(this.d);
        StringBuilder k = k7d.k("GradientsBannerDKBackgroundColors(fantasyGradient=", arrays, ", iconContainerGradient=", arrays2, ", paleBlueGradient=");
        k.append(arrays3);
        k.append(", vibrantGradient=");
        k.append(arrays4);
        k.append(")");
        return k.toString();
    }
}
