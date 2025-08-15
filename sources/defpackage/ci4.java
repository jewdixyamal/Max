package defpackage;

/* renamed from: ci4  reason: default package */
public final class ci4 extends ju0 {
    public final void G(Object obj, float f) {
        di4 di4 = (di4) obj;
        di4.z0.b = f / 10000.0f;
        di4.invalidateSelf();
    }

    public final float u(Object obj) {
        return ((di4) obj).z0.b * 10000.0f;
    }
}
