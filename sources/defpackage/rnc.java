package defpackage;

/* renamed from: rnc  reason: default package */
public final class rnc extends hm9 {
    public final void B(pjd pjd, float f, float f2) {
        pjd.d(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        ljd ljd = new ljd(0.0f, 0.0f, f3, f3);
        ljd.f = 180.0f;
        ljd.g = 90.0f;
        pjd.g.add(ljd);
        jjd jjd = new jjd(ljd);
        pjd.a(180.0f);
        pjd.h.add(jjd);
        pjd.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = (double) 270.0f;
        pjd.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        pjd.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
