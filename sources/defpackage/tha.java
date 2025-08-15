package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: tha  reason: default package */
public final class tha extends View implements kre {
    public final TextPaint A0;
    public final ArrayList B0;
    public final int a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    public final vsd b = new vsd();
    public final ysd c = new ysd();
    public final Paint o;
    public int s0;
    public int t0;
    public final sha u0;
    public final sha v0;
    public boolean w0;
    public float x0;
    public float y0;
    public final Paint z0;

    public tha(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        this.o = paint;
        this.u0 = new sha(this, 0);
        this.v0 = new sha(this, 1);
        this.y0 = -1.0f;
        Paint paint2 = new Paint();
        paint2.setShadowLayer(fk4.d().getDisplayMetrics().density * 4.0f, 0.0f, 0.0f, f8.G(-16777216, 0.12f));
        this.z0 = paint2;
        TextPaint textPaint = new TextPaint();
        i4f.j.a(textPaint, getResources().getDisplayMetrics(), du4.b);
        this.A0 = textPaint;
        this.B0 = new ArrayList();
        float f = (float) 16;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(qp4.u0.j(this));
    }

    private final void setLastThumbSnap(float f) {
        ysd ysd = this.c;
        float f2 = ysd.d;
        bc7 bc7 = ysd.g[2];
        xsd xsd = ysd.c;
        float floatValue = ((Number) xsd.b).floatValue() / ((float) 2);
        int i = ysd.e;
        for (int i2 = 0; i2 < i; i2++) {
            vsd vsd = this.b;
            RectF rectF = vsd.b;
            float a2 = vsd.q.a(i2);
            rectF.left = a2;
            rectF.right = a2;
            rectF.top = vsd.n;
            rectF.bottom = vsd.o;
            if (Math.abs(rectF.centerX() - f) <= floatValue) {
                float b2 = ysd.b();
                bc7 bc72 = ysd.g[2];
                ysd.c((((Number) xsd.b).floatValue() * ((float) i2)) + b2);
                if (ysd.d != f2) {
                    sha sha = this.u0;
                    removeCallbacks(sha);
                    removeCallbacks(this.v0);
                    post(sha);
                }
            }
        }
        this.x0 = f;
    }

    public final boolean a() {
        ViewParent parent = getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public final float getValue() {
        return this.c.d;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint textPaint = this.A0;
        textPaint.setTextSize(TypedValue.applyDimension(2, 12.0f, fk4.d().getDisplayMetrics()));
        vsd vsd = this.b;
        PointF pointF = vsd.a;
        float f = (float) vsd.e;
        pointF.x = f;
        float f2 = (((float) vsd.d) / 2.0f) + vsd.j;
        pointF.y = f2;
        canvas.drawText("A", f, f2, textPaint);
        textPaint.setTextSize(TypedValue.applyDimension(2, 18.0f, fk4.d().getDisplayMetrics()));
        PointF pointF2 = vsd.a;
        float f3 = ((float) (vsd.c - vsd.g)) - vsd.l;
        pointF2.x = f3;
        float f4 = (((float) vsd.d) / 2.0f) + vsd.m;
        pointF2.y = f4;
        canvas.drawText("A", f3, f4, textPaint);
        RectF rectF = vsd.r;
        pointF2.x = vsd.s;
        pointF2.y = rectF.centerY();
        float f5 = pointF2.x;
        Paint paint = this.o;
        paint.setColor(this.s0);
        canvas.drawLine(rectF.left, rectF.top, f5, rectF.bottom, paint);
        int i = this.c.e;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF2 = vsd.b;
            float a2 = vsd.q.a(i2);
            rectF2.left = a2;
            rectF2.right = a2;
            rectF2.top = vsd.n;
            rectF2.bottom = vsd.o;
            if (a2 > f5) {
                paint.setColor(this.t0);
            }
            canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, paint);
        }
        canvas.drawLine(f5, rectF.top, rectF.right, rectF.bottom, paint);
        pointF2.x = vsd.s;
        float centerY = rectF.centerY();
        pointF2.y = centerY;
        canvas.drawCircle(pointF2.x, centerY, fk4.d().getDisplayMetrics().density * 12.0f, this.z0);
    }

    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.A0;
        textPaint.setTextSize(fk4.d().getDisplayMetrics().density * 12.0f);
        textPaint.measureText("A");
        float f = (float) 20;
        tu0.G(fk4.d().getDisplayMetrics().density * f);
        float measureText = textPaint.measureText("A");
        float f2 = textPaint.getFontMetrics().descent;
        float b2 = ote.b(measureText, 0.0f);
        vsd vsd = this.b;
        vsd.getClass();
        vsd.i = b2 + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f));
        vsd.j = f2;
        vsd.d();
        vsd.b(vsd.p);
        textPaint.setTextSize(fk4.d().getDisplayMetrics().density * 18.0f);
        textPaint.measureText("A");
        tu0.G(fk4.d().getDisplayMetrics().density * f);
        float measureText2 = textPaint.measureText("A");
        float f3 = textPaint.getFontMetrics().descent;
        float b3 = ote.b(measureText2, 0.0f);
        vsd.l = b3;
        vsd.k = b3 + ((float) tu0.G(f * fk4.d().getDisplayMetrics().density));
        vsd.m = f3;
        vsd.d();
        vsd.b(vsd.p);
        setMeasuredDimension(View.MeasureSpec.getSize(i), tu0.G(((float) 68) * fk4.d().getDisplayMetrics().density));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        vsd.c = measuredWidth;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        vsd.d = measuredHeight;
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        vsd.e = paddingLeft;
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        vsd.f = paddingTop;
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        vsd.g = paddingRight;
        if (paddingBottom < 0) {
            paddingBottom = 0;
        }
        vsd.h = paddingBottom;
        vsd.d();
        vsd.b(vsd.p);
        vsd.c(vsd.s);
        ysd ysd = this.c;
        vsd.b(ysd.e);
        RectF rectF = vsd.r;
        if (!this.w0) {
            vsd.c(vsd.a((rectF.width() * ysd.f) + rectF.left));
        }
    }

    public final void onThemeChanged(fka fka) {
        this.s0 = fka.getIcon().k;
        this.t0 = s63.g(fka.i().b.b, fka.b().g);
        this.o.setColor(this.s0);
        this.z0.setColor(-1);
        this.A0.setColor(fka.getText().g);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != 3) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r6.getAction()
            vsd r2 = r5.b
            r3 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 == r3) goto L_0x0063
            r4 = 2
            if (r0 == r4) goto L_0x001b
            r4 = 3
            if (r0 == r4) goto L_0x0063
            goto L_0x00a6
        L_0x001b:
            boolean r0 = r5.w0
            if (r0 != 0) goto L_0x003f
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0038
            float r0 = r6.getX()
            float r4 = r5.y0
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r5.a
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            return r1
        L_0x0038:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x003f:
            r5.w0 = r3
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            float r0 = r5.x0
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            li6 r0 = defpackage.li6.CLOCK_TICK
            defpackage.pag.F(r5, r0)
            r5.setLastThumbSnap(r6)
            r2.c(r6)
            goto L_0x00a6
        L_0x0063:
            r5.w0 = r1
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            r5.setLastThumbSnap(r6)
            float r6 = r5.x0
            r2.c(r6)
            goto L_0x00a6
        L_0x0076:
            float r0 = r6.getX()
            r5.y0 = r0
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0083
            goto L_0x00a6
        L_0x0083:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.requestFocus()
            r5.w0 = r3
            float r0 = r6.getX()
            float r0 = r2.a(r0)
            r5.setLastThumbSnap(r0)
            float r6 = r6.getX()
            r2.c(r6)
            mi6 r6 = defpackage.mi6.GESTURE_START
            defpackage.pag.F(r5, r6)
        L_0x00a6:
            r5.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tha.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setStepSize(float f) {
        ysd ysd = this.c;
        float f2 = ysd.d;
        ysd.c.o1(ysd, ysd.g[2], Float.valueOf(f));
        int i = ysd.e;
        vsd vsd = this.b;
        vsd.b(i);
        RectF rectF = vsd.r;
        vsd.c(vsd.a((rectF.width() * ysd.f) + rectF.left));
        if (f2 != ysd.d) {
            removeCallbacks(this.u0);
            sha sha = this.v0;
            removeCallbacks(sha);
            post(sha);
        }
        postInvalidate();
    }

    public final void setValue(float f) {
        ysd ysd = this.c;
        float f2 = ysd.d;
        ysd.c(f);
        int i = ysd.e;
        vsd vsd = this.b;
        vsd.b(i);
        RectF rectF = vsd.r;
        vsd.c(vsd.a((rectF.width() * ysd.f) + rectF.left));
        if (f2 != ysd.d) {
            removeCallbacks(this.u0);
            sha sha = this.v0;
            removeCallbacks(sha);
            post(sha);
        }
        postInvalidate();
    }

    public final void setValueFrom(float f) {
        ysd ysd = this.c;
        float f2 = ysd.d;
        ysd.a.o1(ysd, ysd.g[0], Float.valueOf(f));
        int i = ysd.e;
        vsd vsd = this.b;
        vsd.b(i);
        RectF rectF = vsd.r;
        vsd.c(vsd.a((rectF.width() * ysd.f) + rectF.left));
        if (f2 != ysd.d) {
            removeCallbacks(this.u0);
            sha sha = this.v0;
            removeCallbacks(sha);
            post(sha);
        }
        postInvalidate();
    }

    public final void setValueTo(float f) {
        ysd ysd = this.c;
        float f2 = ysd.d;
        ysd.b.o1(ysd, ysd.g[1], Float.valueOf(f));
        int i = ysd.e;
        vsd vsd = this.b;
        vsd.b(i);
        RectF rectF = vsd.r;
        vsd.c(vsd.a((rectF.width() * ysd.f) + rectF.left));
        if (f2 != ysd.d) {
            removeCallbacks(this.u0);
            sha sha = this.v0;
            removeCallbacks(sha);
            post(sha);
        }
        postInvalidate();
    }
}
