package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* renamed from: bt5  reason: default package */
public final class bt5 extends hqd {
    public static final ShapeDrawable F0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = fk4.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        F0 = shapeDrawable;
    }

    public final void A(ol7 ol7) {
    }
}
