package defpackage;

/* renamed from: f08  reason: default package */
public final class f08 extends vu4 {
    public final float Z;

    public f08(float f) {
        this.Z = f - 0.001f;
    }

    public final void p(float f, float f2, float f3, pjd pjd) {
        double d = (double) this.Z;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow((double) sqrt, 2.0d));
        pjd.d(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, 0.0f);
        pjd.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        pjd.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
