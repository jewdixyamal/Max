package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: sj0  reason: default package */
public abstract class sj0 extends ProgressBar {
    public static final int z0 = m2c.Widget_MaterialComponents_ProgressIndicator;
    public final tj0 a;
    public int b;
    public final boolean c;
    public final int o;
    public dh s0;
    public boolean t0 = false;
    public int u0 = 4;
    public final qj0 v0 = new qj0(this, 0);
    public final qj0 w0 = new qj0(this, 1);
    public final rj0 x0 = new rj0(this, 0);
    public final rj0 y0 = new rj0(this, 1);

    /* JADX WARNING: type inference failed for: r9v4, types: [dh, java.lang.Object] */
    public sj0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(y18.a(context, attributeSet, i, z0), attributeSet, i);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray d = sre.d(context2, attributeSet, z2c.BaseProgressIndicator, i, i2, new int[0]);
        d.getInt(z2c.BaseProgressIndicator_showDelay, -1);
        this.o = Math.min(d.getInt(z2c.BaseProgressIndicator_minHideDelay, -1), 1000);
        d.recycle();
        this.s0 = new Object();
        this.c = true;
    }

    private wq4 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().w0;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().w0;
        }
    }

    public abstract tj0 a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.b = i;
            this.t0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                dh dhVar = this.s0;
                ContentResolver contentResolver = getContext().getContentResolver();
                dhVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().x0.c0();
                    return;
                }
            }
            this.x0.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = zmf.a;
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (true) {
                if (view.getVisibility() != 0) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                } else if (!(parent instanceof View)) {
                    break;
                } else {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().x0.a0(this.x0);
        }
        di4 progressDrawable = getProgressDrawable();
        rj0 rj0 = this.y0;
        if (progressDrawable != null) {
            getProgressDrawable().c(rj0);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(rj0);
        }
        if (c()) {
            if (this.o > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.w0);
        removeCallbacks(this.v0);
        ((jq4) getCurrentDrawable()).d(false, false, false);
        tz6 indeterminateDrawable = getIndeterminateDrawable();
        rj0 rj0 = this.y0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(rj0);
            getIndeterminateDrawable().x0.f0();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(rj0);
        }
        super.onDetachedFromWindow();
    }

    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void onMeasure(int i, int i2) {
        try {
            wq4 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate != null) {
                setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((jq4) getCurrentDrawable()).d(c(), false, z);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((jq4) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(dh dhVar) {
        this.s0 = dhVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = dhVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = dhVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z != isIndeterminate()) {
                jq4 jq4 = (jq4) getCurrentDrawable();
                if (jq4 != null) {
                    jq4.d(false, false, false);
                }
                super.setIndeterminate(z);
                jq4 jq42 = (jq4) getCurrentDrawable();
                if (jq42 != null) {
                    jq42.d(c(), false, false);
                }
                if ((jq42 instanceof tz6) && c()) {
                    ((tz6) jq42).x0.e0();
                }
                this.t0 = false;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof tz6) {
            ((jq4) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{mr0.x(tsb.colorPrimary, -1, getContext())};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.a.c = iArr;
            getIndeterminateDrawable().x0.S();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i) {
        tj0 tj0 = this.a;
        if (tj0.g != i) {
            tj0.g = i;
            tj0.a();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            b(i);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof di4) {
            di4 di4 = (di4) drawable;
            di4.d(false, false, false);
            super.setProgressDrawable(di4);
            di4.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        tj0 tj0 = this.a;
        if (tj0.d != i) {
            tj0.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        tj0 tj0 = this.a;
        if (tj0.b != i) {
            tj0.b = Math.min(i, tj0.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        tj0 tj0 = this.a;
        if (tj0.a != i) {
            tj0.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.u0 = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public tz6 getIndeterminateDrawable() {
        return (tz6) super.getIndeterminateDrawable();
    }

    public di4 getProgressDrawable() {
        return (di4) super.getProgressDrawable();
    }
}
