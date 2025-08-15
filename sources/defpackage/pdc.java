package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: pdc  reason: default package */
public class pdc extends ViewGroup.MarginLayoutParams {
    public dec a;
    public final Rect b = new Rect();
    public boolean c = true;
    public boolean o = false;

    public pdc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public pdc(int i, int i2) {
        super(i, i2);
    }

    public pdc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public pdc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public pdc(pdc pdc) {
        super(pdc);
    }
}
