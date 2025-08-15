package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

public class Group extends ri3 {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    public final void j() {
        ti3 ti3 = (ti3) getLayoutParams();
        ti3.p0.O(0);
        ti3.p0.L(0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
