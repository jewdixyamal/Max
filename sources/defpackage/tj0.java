package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: tj0  reason: default package */
public abstract class tj0 {
    public int a;
    public int b;
    public int[] c = new int[0];
    public int d;
    public int e;
    public int f;
    public int g;

    public tj0(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(stb.mtrl_progress_track_thickness);
        int[] iArr = z2c.BaseProgressIndicator;
        sre.a(context, attributeSet, i, i2);
        sre.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = ju0.r(context, obtainStyledAttributes, z2c.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.b = Math.min(ju0.r(context, obtainStyledAttributes, z2c.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = obtainStyledAttributes.getInt(z2c.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = obtainStyledAttributes.getInt(z2c.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(z2c.BaseProgressIndicator_indicatorTrackGapSize, 0);
        if (!obtainStyledAttributes.hasValue(z2c.BaseProgressIndicator_indicatorColor)) {
            this.c = new int[]{mr0.x(tsb.colorPrimary, -1, context)};
        } else if (obtainStyledAttributes.peekValue(z2c.BaseProgressIndicator_indicatorColor).type != 1) {
            this.c = new int[]{obtainStyledAttributes.getColor(z2c.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(z2c.BaseProgressIndicator_indicatorColor, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(z2c.BaseProgressIndicator_trackColor)) {
            this.d = obtainStyledAttributes.getColor(z2c.BaseProgressIndicator_trackColor, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f2 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.d = mr0.j(this.d, (int) (f2 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
