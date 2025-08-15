package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: ohf  reason: default package */
public final class ohf extends View implements kre {
    public static final /* synthetic */ bc7[] N0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public Float D0;
    public ValueAnimator E0;
    public float F0;
    public float G0;
    public ValueAnimator H0;
    public boolean I0;
    public final RectF J0;
    public final je7 K0;
    public final je7 L0;
    public final GestureDetector M0;
    public mhf a;
    public boolean b = true;
    public int c;
    public final Paint o;
    public int s0;
    public PorterDuffColorFilter t0;
    public final je7 u0;
    public final Paint v0;
    public int w0;
    public final Paint x0;
    public final yj y0;
    public float z0;

    static {
        oi9 oi9 = new oi9(ohf.class, "isInPause", "isInPause()Z");
        nec.a.getClass();
        N0 = new bc7[]{oi9};
    }

    public ohf(Context context) {
        super(context);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        this.o = paint;
        this.u0 = tu0.r(3, new bse(11));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.v0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.x0 = paint3;
        this.y0 = new yj(this);
        this.F0 = fk4.d().getDisplayMetrics().density * 4.0f;
        this.G0 = fk4.d().getDisplayMetrics().density * 12.0f;
        this.J0 = new RectF();
        this.K0 = o19.a.getAccessor().d(go0.class);
        je7 r = tu0.r(3, new khf(this, 0, context));
        this.L0 = r;
        this.M0 = new GestureDetector(context, new q00(17, this));
        onThemeChanged(qp4.u0.j(this));
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new o50(this, 13, this));
        } else if (r.a()) {
            getBitmapPool().e(r.getValue());
        }
    }

    public static Bitmap a(ohf ohf, Context context) {
        return i24.l(ohf.getBitmapPool(), context, gpc.z0);
    }

    /* access modifiers changed from: private */
    public final go0 getBitmapPool() {
        return (go0) this.K0.getValue();
    }

    private final Paint getDragPaint() {
        return (Paint) this.u0.getValue();
    }

    public static void k(ohf ohf, float f) {
        if (ohf.i()) {
            ohf.setInPause(false);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{ohf.z0, ote.d(f, 0.0f, 100.0f)});
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new lhf(ohf, 1));
        ofFloat.start();
        ohf.A0 = ofFloat;
    }

    /* access modifiers changed from: private */
    public final void setInPause(boolean z) {
        this.y0.o1(this, N0[0], Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        ValueAnimator valueAnimator = this.H0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f5 = this.G0;
        if (z) {
            f = fk4.d().getDisplayMetrics().density;
            f2 = 16.0f;
        } else {
            f = fk4.d().getDisplayMetrics().density;
            f2 = 12.0f;
        }
        float f6 = f * f2;
        float f7 = this.F0;
        if (z) {
            f3 = fk4.d().getDisplayMetrics().density;
            f4 = 5.0f;
        } else {
            f3 = fk4.d().getDisplayMetrics().density;
            f4 = 4.0f;
        }
        float f8 = f3 * f4;
        if (!z) {
            this.I0 = true;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new nrb(this, f5, f6, f7, f8, 1));
        ofFloat.addListener(new nhf(this, 0));
        ofFloat.start();
        this.H0 = ofFloat;
    }

    public final void dispatchDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        ValueAnimator valueAnimator = this.E0;
        if ((valueAnimator != null && valueAnimator.isRunning() && !this.I0) || (i() && !this.C0)) {
            Paint paint = this.x0;
            paint.setAlpha(f(this.w0));
            canvas.drawOval(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), paint);
            getDragPaint().setAlpha(f(this.s0));
            RectF rectF = this.J0;
            float f = (fk4.d().getDisplayMetrics().density * 48.0f) / 2.0f;
            rectF.set(width - f, height - f, width + f, f + height);
            canvas.drawBitmap((Bitmap) this.L0.getValue(), (Rect) null, rectF, getDragPaint());
        }
        ValueAnimator valueAnimator2 = this.E0;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || i()) {
            Paint paint2 = this.o;
            paint2.setAlpha(f(this.c));
            canvas.drawCircle(width, height, this.B0, paint2);
            h(canvas, width, height);
            getDragPaint().setAlpha(f(this.s0));
            long e = e(width, height);
            float intBitsToFloat = Float.intBitsToFloat((int) (e >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (e & 4294967295L));
            ValueAnimator valueAnimator3 = this.E0;
            float animatedFraction = valueAnimator3 != null ? valueAnimator3.getAnimatedFraction() : 0.0f;
            ValueAnimator valueAnimator4 = this.E0;
            canvas.drawCircle(intBitsToFloat, intBitsToFloat2, (valueAnimator4 == null || !valueAnimator4.isRunning() || !i()) ? this.G0 * (((float) 1) - animatedFraction) : animatedFraction * this.G0, getDragPaint());
        } else if (!i()) {
            h(canvas, width, height);
        }
    }

    public final long e(float f, float f2) {
        double radians = Math.toRadians((double) (((this.z0 * 360.0f) / 100.0f) - ((float) 90)));
        return mr0.k((this.B0 * ((float) Math.cos(radians))) + f, (this.B0 * ((float) Math.sin(radians))) + f2);
    }

    public final int f(int i) {
        ValueAnimator valueAnimator = this.E0;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.E0;
        return (valueAnimator2 == null || !valueAnimator2.isRunning() || !i()) ? rh4.q(animatedFraction, (float) i, i) : tu0.G(animatedFraction * ((float) i));
    }

    public final float g() {
        int min = Math.min(getWidth(), getHeight());
        return ((float) (i() ? wg0.m((float) 27, fk4.d().getDisplayMetrics().density, 2, min) : wg0.m((float) 8, fk4.d().getDisplayMetrics().density, 2, min))) / 2.0f;
    }

    public final mhf getListener() {
        return this.a;
    }

    public final void h(Canvas canvas, float f, float f2) {
        float f3 = (this.z0 * 360.0f) / 100.0f;
        RectF rectF = this.J0;
        float f4 = this.B0;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawArc(rectF, -90.0f, f3, false, this.v0);
    }

    public final boolean i() {
        bc7 bc7 = N0[0];
        return ((Boolean) this.y0.b).booleanValue();
    }

    public final void j() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.z0 = 0.0f;
        setInPause(false);
    }

    public final void l(float f, float f2) {
        float f3 = (float) 360;
        this.z0 = ((((((float) Math.toDegrees(Math.atan2((double) f2, (double) f))) + ((float) 90)) + f3) % f3) / 360.0f) * 100.0f;
        postInvalidateOnAnimation();
        Float f4 = this.D0;
        if (!(f4 == null || Math.signum(f) == Math.signum(f4.floatValue()) || f2 >= 0.0f)) {
            pag.F(this, ni6.LONG_PRESS);
        }
        this.D0 = Float.valueOf(f);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.B0 = g();
    }

    public final void onThemeChanged(fka fka) {
        fka.a().s().b.getClass();
        Paint paint = this.o;
        paint.setColor(1392508927);
        this.c = paint.getAlpha();
        fka.a().s().a.b.getClass();
        this.t0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        Paint dragPaint = getDragPaint();
        fka.a().s().a.b.getClass();
        dragPaint.setColor(-1);
        Paint dragPaint2 = getDragPaint();
        PorterDuffColorFilter porterDuffColorFilter = this.t0;
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = null;
        }
        dragPaint2.setColorFilter(porterDuffColorFilter);
        this.s0 = getDragPaint().getAlpha();
        fka.a().s().b.getClass();
        this.v0.setColor(-1191182337);
        ne0 b2 = fka.b();
        Paint paint2 = this.x0;
        paint2.setColor(b2.e);
        this.w0 = paint2.getAlpha();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        if (this.C0 && motionEvent.getAction() == 1) {
            l(motionEvent.getX() - (((float) getWidth()) / 2.0f), motionEvent.getY() - (((float) getHeight()) / 2.0f));
            mhf mhf = this.a;
            if (mhf != null) {
                ((dif) mhf).v();
            }
            setInPause(false);
            this.C0 = false;
            this.D0 = null;
            getParent().requestDisallowInterceptTouchEvent(false);
            d(false);
            return true;
        } else if (!this.C0 || motionEvent.getAction() != 2) {
            return this.M0.onTouchEvent(motionEvent);
        } else {
            l(motionEvent.getX() - (((float) getWidth()) / 2.0f), motionEvent.getY() - (((float) getHeight()) / 2.0f));
            mhf mhf2 = this.a;
            if (mhf2 != null) {
                ((dif) mhf2).w(this.z0);
            }
            return true;
        }
    }

    public final void setListener(mhf mhf) {
        this.a = mhf;
    }

    public final void setPausingEnabled(boolean z) {
        this.b = z;
    }
}
