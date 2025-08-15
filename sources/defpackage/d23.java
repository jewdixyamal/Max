package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: d23  reason: default package */
public abstract class d23 extends sj0 {
    public static final int A0 = m2c.Widget_MaterialComponents_CircularProgressIndicator;

    public final tj0 a(Context context, AttributeSet attributeSet) {
        return new e23(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((e23) this.a).j;
    }

    public int getIndicatorInset() {
        return ((e23) this.a).i;
    }

    public int getIndicatorSize() {
        return ((e23) this.a).h;
    }

    public void setIndicatorDirection(int i) {
        ((e23) this.a).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        tj0 tj0 = this.a;
        if (((e23) tj0).i != i) {
            ((e23) tj0).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        tj0 tj0 = this.a;
        if (((e23) tj0).h != max) {
            ((e23) tj0).h = max;
            ((e23) tj0).a();
            requestLayout();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((e23) this.a).a();
    }
}
