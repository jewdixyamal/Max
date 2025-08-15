package defpackage;

import android.content.Context;

/* renamed from: fwa  reason: default package */
public final class fwa {
    public final khe a;
    public final khe b;
    public final khe c = new khe(new zj7(29, this));

    public fwa(Context context, je7 je7) {
        this.a = new khe(new md(je7, context, 1));
        this.b = new khe(new md(je7, context, 2));
    }

    public final jic a(int i, int i2, boolean z) {
        int i3;
        int intValue = ((Number) this.b.getValue()).intValue();
        int intValue2 = ((Number) this.a.getValue()).intValue();
        if (!z) {
            intValue = intValue2;
        }
        if (i2 * i < intValue * intValue) {
            return null;
        }
        if (i2 <= intValue && i <= intValue) {
            return null;
        }
        if (i2 > i) {
            int i4 = intValue;
            intValue = (int) ((((float) i) / ((float) i2)) * ((float) intValue));
            i3 = i4;
        } else {
            i3 = (int) ((((float) i2) / ((float) i)) * ((float) intValue));
        }
        return new jic(0.0f, intValue, i3, 12);
    }
}
