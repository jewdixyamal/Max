package defpackage;

import android.content.Context;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: jkf  reason: default package */
public final class jkf extends OneMeDraweeView {
    public final int[] C0 = new int[2];
    public wcf D0;

    public jkf(Context context) {
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        wcf wcf = this.D0;
        if (wcf == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = wcf.c;
        int i4 = wcf.d;
        int[] iArr = this.C0;
        hm9.z(size, size2, i3, i4, iArr);
        setMeasuredDimension(iArr[0], iArr[1]);
    }
}
