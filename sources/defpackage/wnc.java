package defpackage;

import java.util.Arrays;

/* renamed from: wnc  reason: default package */
public final class wnc {
    public int a = 2;
    public boolean b = false;
    public float[] c = null;
    public int d = 0;
    public float e = 0.0f;
    public int f = 0;
    public float g = 0.0f;
    public boolean h = false;

    public static wnc a(float f2, float f3, float f4, float f5) {
        wnc wnc = new wnc();
        wnc.c(f2, f3, f4, f5);
        return wnc;
    }

    public static wnc b(float[] fArr) {
        wnc wnc = new wnc();
        fArr.getClass();
        od2.k("radii should have exactly 8 values", fArr.length == 8);
        if (wnc.c == null) {
            wnc.c = new float[8];
        }
        System.arraycopy(fArr, 0, wnc.c, 0, 8);
        return wnc;
    }

    public final void c(float f2, float f3, float f4, float f5) {
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f5;
        fArr[6] = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wnc.class != obj.getClass()) {
            return false;
        }
        wnc wnc = (wnc) obj;
        if (this.b == wnc.b && this.d == wnc.d && Float.compare(wnc.e, this.e) == 0 && this.f == wnc.f && Float.compare(wnc.g, this.g) == 0 && this.a == wnc.a && this.h == wnc.h) {
            return Arrays.equals(this.c, wnc.c);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 0;
        int s = (((i != 0 ? au1.s(i) : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int hashCode = (((s + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f2 = this.e;
        int floatToIntBits = (((hashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f) * 31;
        float f3 = this.g;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return ((floatToIntBits + i2) * 961) + (this.h ? 1 : 0);
    }
}
