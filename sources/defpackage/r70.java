package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: r70  reason: default package */
public final class r70 extends View implements kre {
    public static final IntEvaluator F0 = new IntEvaluator();
    public hs A0;
    public Byte B0;
    public long C0;
    public boolean D0;
    public q70 E0;
    public final int[] a = new int[2];
    public final float b;
    public final float c;
    public final float o;
    public byte[] s0;
    public long t0;
    public boolean u0;
    public boolean v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Path z0 = new Path();

    public r70(Context context) {
        super(context, (AttributeSet) null, 0);
        setLayerType(1, (Paint) null);
        setPadding((int) ((fk4.d().getDisplayMetrics().density * 2.0f) + (fk4.d().getDisplayMetrics().density * 4.0f)), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.b = fk4.d().getDisplayMetrics().density * 4.0f;
        this.c = fk4.d().getDisplayMetrics().density * 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.w0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.y0 = paint2;
        this.x0 = new Paint(paint);
        c54.c(this);
        if (c54.K(this)) {
            setScaleX(-1.0f);
        }
        onThemeChanged(qp4.u0.j(this));
    }

    public final float a(MotionEvent motionEvent) {
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        int paddingLeft = getPaddingLeft() + iArr[0];
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        if (rawX >= ((float) (paddingLeft + width))) {
            return 1.0f;
        }
        float f = (float) paddingLeft;
        if (rawX <= f) {
            return 0.0f;
        }
        return (rawX - f) / ((float) width);
    }

    public final long getDuration() {
        return this.C0;
    }

    public final int getPeaksCount() {
        return (int) (((float) (getMeasuredWidth() - getPaddingLeft())) / (this.c + this.o));
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.z0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float width = ((((float) this.t0) / ((float) this.C0)) * ((float) getWidth())) + ((float) getPaddingLeft());
            boolean z = this.v0 || this.D0;
            float f2 = fk4.d().getDisplayMetrics().density * 4.0f;
            if (this.D0) {
                f2 += fk4.d().getDisplayMetrics().density * 2.0f;
            }
            if (z) {
                canvas.save();
                f = width > ((float) getWidth()) - f2 ? ((float) getWidth()) - f2 : width;
            } else {
                f = 0.0f;
            }
            Paint paint = this.w0;
            if (!z) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(0.0f, 0.0f, width, (float) canvas.getHeight());
                canvas.drawPath(path, this.x0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(width, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, f2, this.y0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.s0 == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    public final void onThemeChanged(fka fka) {
        int i;
        if (this.u0) {
            fka.getIcon();
            i = f8.G(-1, 0.5f);
        } else {
            i = f8.G(fka.getIcon().k, 0.5f);
        }
        this.w0.setColor(i);
        fka.getIcon();
        this.y0.setColor(-1);
        this.x0.setColor(-1);
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.v0 && !this.D0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else if (!this.D0) {
                    return false;
                } else {
                    this.t0 = (long) (a(motionEvent) * ((float) this.C0));
                    q70 q70 = this.E0;
                    if (q70 != null) {
                        wva wva = (wva) q70;
                        ((lsf) wva.c).x0.setText(tfg.d((long) (((float) ((r70) wva.b).getDuration()) * a(motionEvent))));
                    }
                    postInvalidate();
                }
            }
            this.D0 = false;
            q70 q702 = this.E0;
            if (q702 != null) {
                float a2 = a(motionEvent);
                isf isf = ((lsf) ((wva) q702).c).o;
                if (isf != null) {
                    bc7[] bc7Arr = RecordControlsWidget.b1;
                    cbc I0 = ((RecordControlsWidget) ((y8) isf).a).I0();
                    Long l = (Long) I0.x0.a.getValue();
                    if (l != null) {
                        I0.u().seekTo((long) (a2 * ((float) l.longValue())));
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (!this.u0) {
            return false;
        } else {
            this.D0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final void setLinesColor(int i) {
        this.w0.setColor(i);
        invalidate();
    }

    public final void setListener(q70 q70) {
        this.E0 = q70;
    }
}
