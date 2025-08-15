package defpackage;

import java.util.Arrays;

/* renamed from: ore  reason: default package */
public final class ore {
    public final float a;
    public final float b;
    public final int[] c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float g;

    public ore(float f2, float f3, float f4, float f5, float f6, float[] fArr, int[] iArr) {
        this.a = f2;
        this.b = f3;
        this.c = iArr;
        this.d = fArr;
        this.e = f4;
        this.f = f5;
        this.g = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ore)) {
            return false;
        }
        ore ore = (ore) obj;
        return Float.compare(this.a, ore.a) == 0 && Float.compare(this.b, ore.b) == 0 && tpa.f(this.c, ore.c) && tpa.f(this.d, ore.d) && Float.compare(this.e, ore.e) == 0 && Float.compare(this.f, ore.f) == 0 && Float.compare(this.g, ore.g) == 0;
    }

    public final int hashCode() {
        int c2 = ms2.c(Float.hashCode(this.a) * 31, this.b, 31);
        return Float.hashCode(this.g) + ms2.c(ms2.c((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + c2) * 31)) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(this.d);
        return "GradientEllipse(x=" + this.a + ", y=" + this.b + ", color=" + arrays + ", stops=" + arrays2 + ", radiusX=" + this.e + ", radiusY=" + this.f + ", angle=" + this.g + ")";
    }
}
