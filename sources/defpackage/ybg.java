package defpackage;

import android.opengl.GLES20;

/* renamed from: ybg  reason: default package */
public final class ybg implements gcg {
    public static final float[] b = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] c = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public final gcg a;

    public ybg(int i, int i2) {
        float[] fArr = b;
        float[] fArr2 = c;
        String glGetString = GLES20.glGetString(7938);
        this.a = (glGetString == null || !glGetString.contains("3.")) ? new qxd(i, i2, fArr, fArr2) : new h8c(i, i2, fArr, fArr2);
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        this.a.b();
    }
}
