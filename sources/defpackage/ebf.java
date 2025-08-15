package defpackage;

import java.util.Arrays;

/* renamed from: ebf  reason: default package */
public final class ebf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int[] f;
    public final float[] g;

    public ebf(float f2, float f3, float f4, float f5, float f6, float[] fArr, int[] iArr) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = iArr;
        this.g = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebf)) {
            return false;
        }
        ebf ebf = (ebf) obj;
        return Float.compare(this.a, ebf.a) == 0 && Float.compare(this.b, ebf.b) == 0 && Float.compare(this.c, ebf.c) == 0 && Float.compare(this.d, ebf.d) == 0 && Float.compare(this.e, ebf.e) == 0 && tpa.f(this.f, ebf.f) && tpa.f(this.g, ebf.g);
    }

    public final int hashCode() {
        int c2 = ms2.c(ms2.c(ms2.c(ms2.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + c2) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f);
        String arrays2 = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("GradientEllipse(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", radiusX=");
        sb.append(this.c);
        sb.append(", radiusY=");
        sb.append(this.d);
        sb.append(", angle=");
        sb.append(this.e);
        sb.append(", color=");
        sb.append(arrays);
        sb.append(", stops=");
        return zr6.l(sb, arrays2, ")");
    }
}
