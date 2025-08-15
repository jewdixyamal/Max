package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends ow3 {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public final /* bridge */ /* synthetic */ boolean e(View view) {
        zr6.o(view);
        throw null;
    }

    public final void g(rw3 rw3) {
        if (rw3.h == 0) {
            rw3.h = 80;
        }
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zr6.o(view);
        throw null;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        zr6.o(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.ExtendedFloatingActionButton_Behavior_Layout);
        obtainStyledAttributes.getBoolean(z2c.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
        obtainStyledAttributes.getBoolean(z2c.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
        obtainStyledAttributes.recycle();
    }
}
