package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

class ClockHandView extends View {
    public int A0;
    public final ValueAnimator a = new ValueAnimator();
    public boolean b;
    public final ArrayList c = new ArrayList();
    public final int o;
    public final float s0;
    public final Paint t0;
    public final RectF u0;
    public final int v0;
    public float w0;
    public boolean x0;
    public double y0;
    public int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockHandView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.tsb.materialClockStyle
            r5.<init>(r6, r7, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.c = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.t0 = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r5.u0 = r2
            r2 = 1
            r5.A0 = r2
            int[] r3 = defpackage.z2c.ClockHandView
            int r4 = defpackage.m2c.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4)
            int r0 = defpackage.tsb.motionDurationLong2
            r3 = 200(0xc8, float:2.8E-43)
            defpackage.z7.P(r0, r3, r6)
            int r0 = defpackage.tsb.motionEasingEmphasizedInterpolator
            wb5 r3 = defpackage.og.b
            defpackage.z7.Q(r6, r0, r3)
            int r0 = defpackage.z2c.ClockHandView_materialCircleRadius
            r3 = 0
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.z0 = r0
            int r0 = defpackage.z2c.ClockHandView_selectorSize
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.o = r0
            android.content.res.Resources r0 = r5.getResources()
            int r4 = defpackage.stb.material_clock_hand_stroke_width
            int r4 = r0.getDimensionPixelSize(r4)
            r5.v0 = r4
            int r4 = defpackage.stb.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r4)
            float r0 = (float) r0
            r5.s0 = r0
            int r0 = defpackage.z2c.ClockHandView_clockHandColor
            int r0 = r7.getColor(r0, r3)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r5.b(r0)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            r6.getScaledTouchSlop()
            java.util.WeakHashMap r6 = defpackage.zmf.a
            r6 = 2
            r5.setImportantForAccessibility(r6)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(int i) {
        int i2 = this.z0;
        return i == 2 ? Math.round(((float) i2) * 0.66f) : i2;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.w0 = f2;
        this.y0 = Math.toRadians((double) (f2 - 90.0f));
        float a2 = (float) a(this.A0);
        float cos = (((float) Math.cos(this.y0)) * a2) + ((float) (getWidth() / 2));
        float sin = (a2 * ((float) Math.sin(this.y0))) + ((float) (getHeight() / 2));
        float f3 = (float) this.o;
        this.u0.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f43) it.next());
            if (Math.abs(clockFaceView.W0 - f2) > 0.001f) {
                clockFaceView.W0 = f2;
                clockFaceView.x();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a2 = a(this.A0);
        float f = (float) width;
        float f2 = (float) a2;
        float f3 = (float) height;
        Paint paint = this.t0;
        paint.setStrokeWidth(0.0f);
        int i = this.o;
        canvas.drawCircle((((float) Math.cos(this.y0)) * f2) + f, (f2 * ((float) Math.sin(this.y0))) + f3, (float) i, paint);
        double sin = Math.sin(this.y0);
        double d = (double) ((float) (a2 - i));
        paint.setStrokeWidth((float) this.v0);
        canvas.drawLine(f, f3, (float) (width + ((int) (Math.cos(this.y0) * d))), (float) (height + ((int) (d * sin))), paint);
        canvas.drawCircle(f, f3, this.s0, paint);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.a.isRunning()) {
            b(this.w0);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.x0 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.x0;
            if (this.b) {
                this.A0 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + mqd.h(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.x0;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y - ((float) (getHeight() / 2))), (double) (x - ((float) (getWidth() / 2)))));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = (float) i;
        boolean z5 = this.w0 != f;
        if (!z || !z5) {
            if (z5 || z2) {
                b(f);
            }
            this.x0 = z4 | z3;
            return true;
        }
        z3 = true;
        this.x0 = z4 | z3;
        return true;
    }
}
