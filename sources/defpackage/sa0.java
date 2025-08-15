package defpackage;

/* renamed from: sa0  reason: default package */
public final class sa0 implements gag {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sa0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static sa0 e(gag gag) {
        return new sa0(gag.c(), gag.a(), gag.b(), gag.d());
    }

    public final float a() {
        return this.b;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa0)) {
            return false;
        }
        sa0 sa0 = (sa0) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(sa0.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(sa0.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(sa0.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(sa0.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
