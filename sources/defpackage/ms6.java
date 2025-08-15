package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ms6  reason: default package */
public final class ms6 extends View {
    public final m56 a;
    public Drawable b = kt3.b(getContext(), woc.e2);
    public float c;
    public final Rect o = new Rect();
    public final int s0 = 3;
    public final float t0 = 0.9f;
    public final Paint u0;
    public final Matrix v0;
    public final int[] w0;

    public ms6(Context context, m56 m56) {
        super(context, (AttributeSet) null);
        this.a = m56;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.u0 = paint;
        this.v0 = new Matrix();
        this.w0 = new int[]{f8.G(0, 0.75f), -16777216};
    }

    public final void a(Canvas canvas, float f, float f2, float f3, int i, ks6 ks6) {
        List<Number> list;
        Drawable.ConstantState constantState;
        int i2 = i;
        ks6 ks62 = ks6;
        if (i2 < this.s0) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 45;
                double radians = Math.toRadians((double) i4);
                ks6 ks63 = ks6.o;
                if (ks62 == ks63 || ks62.a.contains(Double.valueOf(radians))) {
                    float cos = (((float) Math.cos(radians)) * f3) + f;
                    float sin = (((float) Math.sin(radians)) * f3) + f2;
                    float G = (float) (tu0.G(((float) ((Number) this.a.invoke((ks62 != ks63 || i4 % 90 == 0) ? Integer.valueOf(i) : Integer.valueOf(i2 + 1))).intValue()) * fk4.d().getDisplayMetrics().density) / 2);
                    int i5 = (int) (sin + G);
                    Rect rect = this.o;
                    rect.set((int) (cos - G), (int) (sin - G), (int) (cos + G), i5);
                    Drawable drawable = this.b;
                    Drawable newDrawable = (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
                    if (newDrawable != null) {
                        newDrawable.setBounds(rect);
                    }
                    Canvas canvas2 = canvas;
                    if (newDrawable != null) {
                        newDrawable.draw(canvas);
                    }
                    rect.setEmpty();
                } else {
                    Canvas canvas3 = canvas;
                }
            }
            Canvas canvas4 = canvas;
            int i6 = ls6.$EnumSwitchMapping$0[ks6.ordinal()];
            if (i6 == 1) {
                list = Collections.singletonList(Double.valueOf(Math.toRadians(180.0d)));
            } else if (i6 == 2) {
                list = Collections.singletonList(Double.valueOf(Math.toRadians(0.0d)));
            } else if (i6 == 3) {
                list = y53.M(Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(0.0d)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (Number doubleValue : list) {
                double doubleValue2 = doubleValue.doubleValue();
                arrayList.add(new kpa(Float.valueOf((((float) Math.cos(doubleValue2)) * f3) + f), Float.valueOf((((float) Math.sin(doubleValue2)) * f3) + f2)));
            }
            int ordinal = ks6.ordinal();
            float f4 = this.t0;
            if (ordinal == 0) {
                kpa kpa = (kpa) arrayList.get(0);
                a(canvas, ((Number) kpa.a).floatValue(), ((Number) kpa.b).floatValue(), f3 * f4, i2 + 1, ks6.b);
            } else if (ordinal == 1) {
                kpa kpa2 = (kpa) arrayList.get(0);
                a(canvas, ((Number) kpa2.a).floatValue(), ((Number) kpa2.b).floatValue(), f3 * f4, i2 + 1, ks6.c);
            } else if (ordinal == 2) {
                kpa kpa3 = (kpa) arrayList.get(0);
                float floatValue = ((Number) kpa3.a).floatValue();
                float floatValue2 = ((Number) kpa3.b).floatValue();
                kpa kpa4 = (kpa) arrayList.get(1);
                float floatValue3 = ((Number) kpa4.a).floatValue();
                float floatValue4 = ((Number) kpa4.b).floatValue();
                float f5 = f3 * f4;
                int i7 = i2 + 1;
                Canvas canvas5 = canvas;
                float f6 = floatValue2;
                float f7 = f5;
                int i8 = i7;
                a(canvas5, floatValue, f6, f7, i8, ks6.b);
                a(canvas5, floatValue3, floatValue4, f7, i8, ks6.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float f = width;
        float f2 = height;
        RadialGradient radialGradient = new RadialGradient(f, f2, Math.max(width, height), this.w0, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.v0;
        matrix.reset();
        matrix.setScale(1.0f, 0.4f, width, height);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.u0;
        paint.setShader(radialGradient);
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        a(canvas2, width, height, this.c, 0, ks6.o);
        canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), paint);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void setIcon$common_release(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public final void setInitialRadius$common_release(float f) {
        this.c = f;
        invalidate();
    }

    public final void setIcon$common_release(int i) {
        this.b = kt3.b(getContext(), i);
        invalidate();
    }
}
