package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* renamed from: wh7  reason: default package */
public final class wh7 extends sj0 {
    public static final int A0 = m2c.Widget_MaterialComponents_LinearProgressIndicator;

    /* JADX WARNING: type inference failed for: r10v1, types: [xh7, tj0] */
    public final tj0 a(Context context, AttributeSet attributeSet) {
        int i = tsb.linearProgressIndicatorStyle;
        int i2 = A0;
        ? tj0 = new tj0(context, attributeSet, i, i2);
        int[] iArr = z2c.LinearProgressIndicator;
        int i3 = tsb.linearProgressIndicatorStyle;
        boolean z = false;
        sre.a(context, attributeSet, i3, i2);
        sre.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        tj0.h = obtainStyledAttributes.getInt(z2c.LinearProgressIndicator_indeterminateAnimationType, 1);
        tj0.i = obtainStyledAttributes.getInt(z2c.LinearProgressIndicator_indicatorDirectionLinear, 0);
        tj0.k = Math.min(obtainStyledAttributes.getDimensionPixelSize(z2c.LinearProgressIndicator_trackStopIndicatorSize, 0), tj0.a);
        obtainStyledAttributes.recycle();
        tj0.a();
        if (tj0.i == 1) {
            z = true;
        }
        tj0.j = z;
        return tj0;
    }

    public final void b(int i) {
        tj0 tj0 = this.a;
        if (tj0 == null || ((xh7) tj0).h != 0 || !isIndeterminate()) {
            super.b(i);
        }
    }

    public int getIndeterminateAnimationType() {
        return ((xh7) this.a).h;
    }

    public int getIndicatorDirection() {
        return ((xh7) this.a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((xh7) this.a).k;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tj0 tj0 = this.a;
        xh7 xh7 = (xh7) tj0;
        boolean z2 = true;
        if (((xh7) tj0).i != 1) {
            WeakHashMap weakHashMap = zmf.a;
            if (!((getLayoutDirection() == 1 && ((xh7) tj0).i == 2) || (getLayoutDirection() == 0 && ((xh7) tj0).i == 3))) {
                z2 = false;
            }
        }
        xh7.j = z2;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        tz6 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        di4 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        tj0 tj0 = this.a;
        if (((xh7) tj0).h != i) {
            if (!c() || !isIndeterminate()) {
                ((xh7) tj0).h = i;
                ((xh7) tj0).a();
                if (i == 0) {
                    tz6 indeterminateDrawable = getIndeterminateDrawable();
                    oh7 oh7 = new oh7((xh7) tj0);
                    indeterminateDrawable.x0 = oh7;
                    oh7.b = indeterminateDrawable;
                } else {
                    tz6 indeterminateDrawable2 = getIndeterminateDrawable();
                    qh7 qh7 = new qh7(getContext(), (xh7) tj0);
                    indeterminateDrawable2.x0 = qh7;
                    qh7.b = indeterminateDrawable2;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((xh7) this.a).a();
    }

    public void setIndicatorDirection(int i) {
        tj0 tj0 = this.a;
        ((xh7) tj0).i = i;
        xh7 xh7 = (xh7) tj0;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = zmf.a;
            if (!((getLayoutDirection() == 1 && ((xh7) tj0).i == 2) || (getLayoutDirection() == 0 && i == 3))) {
                z = false;
            }
        }
        xh7.j = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((xh7) this.a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        tj0 tj0 = this.a;
        if (((xh7) tj0).k != i) {
            ((xh7) tj0).k = Math.min(i, ((xh7) tj0).a);
            ((xh7) tj0).a();
            invalidate();
        }
    }
}
