package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: q1d  reason: default package */
public final class q1d extends ndc implements kre {
    public final RectF X;
    public final Rect Y;
    public final bi9 Z;
    public final o1d a;
    public final int b;
    public final m56 c;
    public final Paint o;
    public final bi9 s0;
    public final bi9 t0;
    public final float[] u0;
    public final Path v0;
    public final gaa w0;

    public q1d(fka fka, o1d o1d, l lVar, int i) {
        int i2 = (i & 4) != 0 ? 4 : 0;
        m56 w8c = (i & 8) != 0 ? new w8c(4) : lVar;
        this.a = o1d;
        this.b = i2;
        this.c = w8c;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        this.X = new RectF();
        this.Y = new Rect();
        bi9 bi9 = k37.a;
        this.Z = new bi9();
        this.s0 = new bi9();
        this.t0 = new bi9();
        this.u0 = new float[8];
        this.v0 = new Path();
        this.w0 = new gaa(17);
        onThemeChanged(fka);
    }

    public static final void i(q1d q1d, Canvas canvas) {
        Path path = q1d.v0;
        RectF rectF = q1d.X;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = q1d.u0;
        path.addRoundRect(rectF, fArr, direction);
        Path path2 = q1d.v0;
        canvas.drawPath(path2, q1d.o);
        path2.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ys.a0(fArr, 0.0f);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        Rect rect2 = rect;
        View view2 = view;
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R != -1) {
            int i = this.a.i(R);
            bi9 bi9 = this.Z;
            bi9.h(R);
            bi9 bi92 = this.s0;
            bi92.h(R);
            bi9 bi93 = this.t0;
            bi93.h(R);
            int i2 = i == 0 ? -1 : p1d.$EnumSwitchMapping$0[au1.s(i)];
            if (i2 != -1) {
                int i3 = this.b;
                if (i2 == 1) {
                    rect2.top = rh4.c((float) i3, fk4.d().getDisplayMetrics().density, rect2.top);
                    bi9.a(R);
                    mkc mkc = view2 instanceof mkc ? (mkc) view2 : null;
                    if (mkc != null) {
                        mkc.setRippleMask(new RoundRectShape(new float[]{fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, 0.0f, 0.0f, 0.0f, 0.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i2 == 2) {
                    rect2.bottom = rh4.c((float) i3, fk4.d().getDisplayMetrics().density, rect2.bottom);
                    bi93.a(R);
                    mkc mkc2 = view2 instanceof mkc ? (mkc) view2 : null;
                    if (mkc2 != null) {
                        mkc2.setRippleMask(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i2 == 3) {
                    float f = (float) i3;
                    rect2.top = rh4.c(f, fk4.d().getDisplayMetrics().density, rect2.top);
                    rect2.bottom = rh4.c(f, fk4.d().getDisplayMetrics().density, rect2.bottom);
                    bi9.a(R);
                    bi93.a(R);
                    mkc mkc3 = view2 instanceof mkc ? (mkc) view2 : null;
                    if (mkc3 != null) {
                        mkc3.setRippleMask(new RoundRectShape(new float[]{fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f, fk4.d().getDisplayMetrics().density * 16.0f}, (RectF) null, (float[]) null));
                    }
                } else if (i2 == 4) {
                    bi92.a(R);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.w0.E(rect2, view2, recyclerView);
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        RectF rectF = this.X;
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int R = RecyclerView.R(childAt);
            gaa gaa = this.w0;
            Rect rect = this.Y;
            gaa.v(rect, childAt, R);
            bi9 bi9 = this.Z;
            boolean c2 = bi9.c(R);
            int i2 = this.b;
            float[] fArr = this.u0;
            if (c2) {
                float f = fk4.d().getDisplayMetrics().density * 16.0f;
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                int i3 = -tu0.G(((float) i2) * fk4.d().getDisplayMetrics().density);
                Drawable background = childAt.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    f8.D(rippleDrawable, 0, i3, 0, 13);
                }
            }
            boolean c3 = this.s0.c(R);
            bi9 bi92 = this.t0;
            if (c3 || bi92.c(R)) {
                rectF.left = Math.min(rectF.left, (float) rect.left);
                rectF.top = Math.min(rectF.top, (float) rect.top);
                rectF.right = Math.max(rectF.right, (float) rect.right);
                rectF.bottom = Math.max(rectF.bottom, (float) rect.bottom);
                if (bi92.c(R)) {
                    float f2 = fk4.d().getDisplayMetrics().density * 16.0f;
                    fArr[4] = f2;
                    fArr[5] = f2;
                    fArr[6] = f2;
                    fArr[7] = f2;
                    int q = bi9.c(R) ? rh4.q((float) i2, fk4.d().getDisplayMetrics().density, rect.height()) : rect.height();
                    Drawable background2 = childAt.getBackground();
                    RippleDrawable rippleDrawable2 = background2 instanceof RippleDrawable ? (RippleDrawable) background2 : null;
                    if (rippleDrawable2 != null) {
                        f8.D(rippleDrawable2, 0, 0, q, 7);
                    }
                    i(this, canvas);
                }
            }
        }
        if (rectF.height() > 0.0f) {
            i(this, canvas);
        }
    }

    public final void onThemeChanged(fka fka) {
        this.o.setColor(((Number) this.c.invoke(fka)).intValue());
    }
}
