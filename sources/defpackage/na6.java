package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import java.util.Arrays;

/* renamed from: na6  reason: default package */
public abstract class na6 extends uq4 {
    public na6(Context context) {
        super(context);
        k(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [g06, android.graphics.drawable.Drawable, h90] */
    public final void k(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        int i3;
        int i4;
        int i5;
        boolean z5;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        f46.I();
        f46.I();
        ma6 ma6 = new ma6(context.getResources());
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, w2c.GenericDraweeHierarchy);
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                boolean z6 = true;
                int i6 = 0;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int i7 = 0;
                int i8 = 0;
                while (i6 < indexCount) {
                    try {
                        int index = obtainStyledAttributes.getIndex(i6);
                        if (index == w2c.GenericDraweeHierarchy_actualImageScaleType) {
                            ma6.l = v3c.t(obtainStyledAttributes, index);
                        } else if (index == w2c.GenericDraweeHierarchy_placeholderImage) {
                            ma6.d = v3c.n(context2, obtainStyledAttributes, index);
                        } else {
                            i3 = indexCount;
                            if (index == w2c.GenericDraweeHierarchy_pressedStateOverlayImage) {
                                Drawable n = v3c.n(context2, obtainStyledAttributes, index);
                                if (n == null) {
                                    ma6.o = null;
                                } else {
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{16842919}, n);
                                    ma6.o = stateListDrawable;
                                }
                            } else if (index == w2c.GenericDraweeHierarchy_progressBarImage) {
                                ma6.j = v3c.n(context2, obtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_fadeDuration) {
                                ma6.b = obtainStyledAttributes.getInt(index, 0);
                            } else if (index == w2c.GenericDraweeHierarchy_viewAspectRatio) {
                                ma6.c = obtainStyledAttributes.getFloat(index, 0.0f);
                            } else if (index == w2c.GenericDraweeHierarchy_placeholderImageScaleType) {
                                ma6.e = v3c.t(obtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_retryImage) {
                                ma6.f = v3c.n(context2, obtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_retryImageScaleType) {
                                ma6.g = v3c.t(obtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_failureImage) {
                                ma6.h = v3c.n(context2, obtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_failureImageScaleType) {
                                ma6.i = v3c.t(obtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_progressBarImageScaleType) {
                                ma6.k = v3c.t(obtainStyledAttributes, index);
                            } else {
                                if (index == w2c.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                                    i7 = obtainStyledAttributes.getInteger(index, i7);
                                } else {
                                    int i9 = i7;
                                    if (index == w2c.GenericDraweeHierarchy_backgroundImage) {
                                        ma6.m = v3c.n(context2, obtainStyledAttributes, index);
                                    } else if (index == w2c.GenericDraweeHierarchy_overlayImage) {
                                        Drawable n2 = v3c.n(context2, obtainStyledAttributes, index);
                                        if (n2 == null) {
                                            ma6.n = null;
                                        } else {
                                            ma6.n = Arrays.asList(new Drawable[]{n2});
                                        }
                                    } else if (index == w2c.GenericDraweeHierarchy_roundAsCircle) {
                                        v3c.s(ma6).b = obtainStyledAttributes.getBoolean(index, false);
                                    } else {
                                        if (index == w2c.GenericDraweeHierarchy_roundedCornerRadius) {
                                            i8 = obtainStyledAttributes.getDimensionPixelSize(index, i8);
                                        } else {
                                            int i10 = i8;
                                            if (index == w2c.GenericDraweeHierarchy_roundTopLeft) {
                                                z7 = obtainStyledAttributes.getBoolean(index, z7);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundTopRight) {
                                                z9 = obtainStyledAttributes.getBoolean(index, z9);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomLeft) {
                                                z13 = obtainStyledAttributes.getBoolean(index, z13);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomRight) {
                                                z11 = obtainStyledAttributes.getBoolean(index, z11);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundTopStart) {
                                                z8 = obtainStyledAttributes.getBoolean(index, z8);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundTopEnd) {
                                                z10 = obtainStyledAttributes.getBoolean(index, z10);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomStart) {
                                                z6 = obtainStyledAttributes.getBoolean(index, z6);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomEnd) {
                                                z12 = obtainStyledAttributes.getBoolean(index, z12);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundWithOverlayColor) {
                                                wnc s = v3c.s(ma6);
                                                i5 = i10;
                                                s.d = obtainStyledAttributes.getColor(index, 0);
                                                s.a = 1;
                                                i4 = i9;
                                                int i11 = i4;
                                                i8 = i5;
                                                i7 = i11;
                                            } else {
                                                i5 = i10;
                                                if (index == w2c.GenericDraweeHierarchy_roundingBorderWidth) {
                                                    wnc s2 = v3c.s(ma6);
                                                    float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                    s2.getClass();
                                                    if (dimensionPixelSize >= 0.0f) {
                                                        i4 = i9;
                                                        z5 = true;
                                                    } else {
                                                        i4 = i9;
                                                        z5 = false;
                                                    }
                                                    od2.k("the border width cannot be < 0", z5);
                                                    s2.e = dimensionPixelSize;
                                                } else {
                                                    i4 = i9;
                                                    if (index == w2c.GenericDraweeHierarchy_roundingBorderColor) {
                                                        v3c.s(ma6).f = obtainStyledAttributes.getColor(index, 0);
                                                    } else if (index == w2c.GenericDraweeHierarchy_roundingBorderPadding) {
                                                        wnc s3 = v3c.s(ma6);
                                                        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                        s3.getClass();
                                                        od2.k("the padding cannot be < 0", dimensionPixelSize2 >= 0.0f);
                                                        s3.g = dimensionPixelSize2;
                                                    }
                                                }
                                                int i112 = i4;
                                                i8 = i5;
                                                i7 = i112;
                                            }
                                            i8 = i10;
                                        }
                                        i7 = i9;
                                    }
                                    i5 = i8;
                                    i4 = i9;
                                    int i1122 = i4;
                                    i8 = i5;
                                    i7 = i1122;
                                }
                                i6++;
                                context2 = context;
                                indexCount = i3;
                            }
                            int i12 = i8;
                            i4 = i7;
                            i5 = i12;
                            int i11222 = i4;
                            i8 = i5;
                            i7 = i11222;
                            i6++;
                            context2 = context;
                            indexCount = i3;
                        }
                        i3 = indexCount;
                        int i122 = i8;
                        i4 = i7;
                        i5 = i122;
                        int i112222 = i4;
                        i8 = i5;
                        i7 = i112222;
                        i6++;
                        context2 = context;
                        indexCount = i3;
                    } catch (Throwable th) {
                        th = th;
                        obtainStyledAttributes.recycle();
                        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                int i13 = i8;
                int i14 = i7;
                int i15 = i13;
                obtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z4 = z7 && z10;
                    z3 = z9 && z8;
                    z2 = z11 && z6;
                    z = z13 && z12;
                    i = i15;
                    i2 = i14;
                } else {
                    z4 = z7 && z8;
                    z3 = z9 && z10;
                    i = i15;
                    i2 = i14;
                    boolean z14 = z11 && z12;
                    z = z13 && z6;
                    z2 = z14;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                int layoutDirection2 = context.getResources().getConfiguration().getLayoutDirection();
                throw th;
            }
        } else {
            z4 = true;
            z3 = true;
            z2 = true;
            z = true;
            i2 = 0;
            i = 0;
        }
        if (ma6.j == null || i2 <= 0) {
            f = 0.0f;
        } else {
            Drawable drawable = ma6.j;
            drawable.getClass();
            ? g06 = new g06(drawable);
            f = 0.0f;
            g06.Z = 0.0f;
            g06.s0 = false;
            g06.X = i2;
            g06.Y = true;
            ma6.j = g06;
        }
        if (i > 0) {
            v3c.s(ma6).c(z4 ? (float) i : f, z3 ? (float) i : f, z2 ? (float) i : f, z ? (float) i : f);
        }
        f46.I();
        setAspectRatio(ma6.c);
        setHierarchy(ma6.a());
        f46.I();
    }

    public na6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k(context, attributeSet);
    }

    public na6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k(context, attributeSet);
    }
}
