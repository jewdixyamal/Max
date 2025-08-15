package defpackage;

import java.util.Arrays;

/* renamed from: bbf  reason: default package */
public final class bbf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float[] f;

    public bbf(float f2, float f3, float f4, float f5, float f6, float[] fArr) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbf)) {
            return false;
        }
        bbf bbf = (bbf) obj;
        return Float.compare(this.a, bbf.a) == 0 && Float.compare(this.b, bbf.b) == 0 && Float.compare(this.c, bbf.c) == 0 && Float.compare(this.d, bbf.d) == 0 && Float.compare(this.e, bbf.e) == 0 && tpa.f(this.f, bbf.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ms2.c(ms2.c(ms2.c(ms2.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f);
        return "GradientEllipse(cx=" + this.a + ", cy=" + this.b + ", rx=" + this.c + ", ry=" + this.d + ", rotation=" + this.e + ", stops=" + arrays + ")";
    }
}
