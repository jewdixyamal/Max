package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: pte  reason: default package */
public final class pte {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public float f = 1.0f;
    public Paint g;
    public final khe h;
    public final Shader.TileMode i;
    public boolean j;

    public pte(String str, int i2, int i3) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = i2;
        this.e = i3;
        Paint paint = new Paint(2);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.g = paint;
        this.h = new khe(new rzd(5, this));
        this.i = Shader.TileMode.REPEAT;
    }
}
