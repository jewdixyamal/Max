package defpackage;

/* renamed from: w04  reason: default package */
public final class w04 extends hm9 {
    public final void B(pjd pjd, float f, float f2) {
        pjd.d(0.0f, f2 * f, 180.0f, 90.0f);
        double d = (double) f2;
        double d2 = (double) f;
        pjd.c((float) (Math.sin(Math.toRadians((double) 90.0f)) * d * d2), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d * d2));
    }
}
