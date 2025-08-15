package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import one.me.image.crop.view.ImageCropView;

/* renamed from: rv4  reason: default package */
public final /* synthetic */ class rv4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ rv4(View view, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.X;
        Object obj2 = this.o;
        Object obj3 = this.c;
        View view = this.b;
        int i = 0;
        switch (this.a) {
            case 0:
                uv4 uv4 = (uv4) view;
                uv4.getClass();
                Float f = (Float) valueAnimator.getAnimatedValue();
                while (true) {
                    float[] fArr = (float[]) obj3;
                    if (i < 9) {
                        fArr[i] = (f.floatValue() * ((float[]) obj)[i]) + ((1.0f - f.floatValue()) * ((float[]) obj2)[i]);
                        i++;
                    } else {
                        uv4.o.setValues(fArr);
                        uv4.invalidate();
                        return;
                    }
                }
            default:
                foa foa = (foa) view;
                foa.getClass();
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                RectF rectF = foa.a;
                RectF rectF2 = (RectF) obj3;
                rectF2.set(rectF);
                RectF rectF3 = (RectF) obj2;
                float f3 = rectF3.left;
                RectF rectF4 = (RectF) obj;
                rectF.left = (f2.floatValue() * (rectF4.left - f3)) + f3;
                float f4 = rectF3.top;
                rectF.top = (f2.floatValue() * (rectF4.top - f4)) + f4;
                float f5 = rectF3.right;
                rectF.right = (f2.floatValue() * (rectF4.right - f5)) + f5;
                float f6 = rectF3.bottom;
                rectF.bottom = (f2.floatValue() * (rectF4.bottom - f6)) + f6;
                foa.b();
                goa goa = foa.M0;
                if (goa != null) {
                    wa6 wa6 = ((ImageCropView) goa).a;
                    Matrix matrix = wa6.D0;
                    matrix.reset();
                    float currentScale = 1.0f / wa6.getCurrentScale();
                    matrix.postScale(currentScale, currentScale);
                    RectF rectF5 = wa6.E0;
                    rectF5.set(rectF2);
                    matrix.mapRect(rectF5);
                    Matrix matrix2 = wa6.u0;
                    float L = f46.L(matrix2, 2);
                    float[] fArr2 = f46.c;
                    matrix2.getValues(fArr2);
                    float[] fArr3 = {L - rectF2.left, fArr2[5] - rectF2.top};
                    matrix.mapPoints(fArr3);
                    float max = Math.max(rectF.width() / rectF5.width(), rectF.height() / rectF5.height()) / wa6.getCurrentScale();
                    matrix2.postScale(max, max, rectF.centerX(), rectF.centerY());
                    matrix2.getValues(fArr2);
                    matrix2.getValues(fArr2);
                    matrix2.postTranslate(-fArr2[2], -fArr2[5]);
                    matrix.reset();
                    float currentScale2 = wa6.getCurrentScale();
                    matrix.postScale(currentScale2, currentScale2);
                    matrix.mapPoints(fArr3);
                    matrix2.postTranslate(rectF.left + fArr3[0], rectF.top + fArr3[1]);
                    wa6.setImageMatrix(matrix2);
                    wa6.C0.set(rectF);
                    Drawable drawable = wa6.getDrawable();
                    if (drawable != null) {
                        wa6.h((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                    }
                    wa6.postInvalidateOnAnimation();
                }
                foa.postInvalidateOnAnimation();
                return;
        }
    }
}
