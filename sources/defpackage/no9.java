package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: no9  reason: default package */
public final class no9 extends bmd {
    public static final /* synthetic */ bc7[] j;
    public final Path g = new Path();
    public final RectF h = new RectF();
    public final yj i = new yj(this);

    static {
        oi9 oi9 = new oi9(no9.class, "cornerRadius", "getCornerRadius()F");
        nec.a.getClass();
        j = new bc7[]{oi9};
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.h;
        rectF.set(getBounds());
        Path path = this.g;
        path.reset();
        bc7[] bc7Arr = j;
        bc7 bc7 = bc7Arr[0];
        yj yjVar = this.i;
        float floatValue = ((Number) yjVar.b).floatValue();
        bc7 bc72 = bc7Arr[0];
        path.addRoundRect(rectF, floatValue, ((Number) yjVar.b).floatValue(), Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
    }
}
