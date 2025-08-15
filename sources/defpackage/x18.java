package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: x18  reason: default package */
public final class x18 extends AppCompatTextView {
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (kq0.E(tsb.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, z2c.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {z2c.MaterialTextAppearance_android_lineHeight, z2c.MaterialTextAppearance_lineHeight};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = ju0.r(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}
