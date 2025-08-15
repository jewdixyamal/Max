package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: uo2  reason: default package */
public final class uo2 extends FrameLayout {
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getId() != t8a.b) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        int measuredHeight = findViewById(t8a.o).getMeasuredHeight();
        int measuredHeight2 = findViewById(t8a.l).getMeasuredHeight();
        Integer x = br7.x(this);
        int i5 = 0;
        int intValue = x != null ? x.intValue() : 0;
        Integer E = br7.E(this);
        if (E != null) {
            i5 = E.intValue();
        }
        super.measureChildWithMargins(view, i, i2, makeMeasureSpec, Math.max(i4, measuredHeight + measuredHeight2 + intValue + i5));
    }
}
