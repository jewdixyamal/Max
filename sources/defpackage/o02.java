package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;

/* renamed from: o02  reason: default package */
public final class o02 {
    public static final v00 c = new v00(7);
    public final xz3 a;
    public final int b;

    public o02(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        int i5;
        boolean z2;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = -16777216;
        }
        this.a = new xz3(spannableStringBuilder, alignment, (Layout.Alignment) null, (Bitmap) null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
        this.b = i4;
    }
}
