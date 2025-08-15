package defpackage;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: e28  reason: default package */
public final class e28 extends ScrollView {
    public int a;

    public final void onMeasure(int i, int i2) {
        if (this.a > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            super.onMeasure(i, mode == 0 ? View.MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(this.a, View.MeasureSpec.getSize(i2)), mode));
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(int i) {
        this.a = i;
    }
}
