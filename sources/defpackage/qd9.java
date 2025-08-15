package defpackage;

/* renamed from: qd9  reason: default package */
public abstract class qd9 {
    public static final float a = 1.0f;

    static {
        a(0.0f);
        a(1.0f);
    }

    public static void a(float f) {
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException("Gain must be in range of 0f and 1f");
        }
    }
}
