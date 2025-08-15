package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: dob  reason: default package */
public final class dob {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public dob(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean b(cob cob) {
        ty[] tyVarArr = cob.a.a;
        if (tyVarArr.length != 1 || tyVarArr[0].a != 0) {
            return false;
        }
        ty[] tyVarArr2 = cob.b.a;
        return tyVarArr2.length == 1 && tyVarArr2[0].a == 0;
    }

    public void c(hj3 hj3, xk0 xk0) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        hj3 hj32 = hj3;
        xk0 xk02 = xk0;
        if (hj32 != null) {
            if (hj32.g0 == 8) {
                xk02.g = 0;
                xk02.h = 0;
                xk02.i = 0;
            } else if (hj32.T != null) {
                int i9 = xk02.b;
                int i10 = xk02.d;
                int i11 = xk02.e;
                int i12 = xk02.f;
                int i13 = this.a + this.b;
                int i14 = this.c;
                View view = (View) hj32.f0;
                int s = au1.s(i9);
                oi3 oi3 = hj32.K;
                oi3 oi32 = hj32.I;
                if (s == 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else if (s == 1) {
                    i2 = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                } else if (s == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                    boolean z2 = hj32.r == 1;
                    int i15 = xk02.j;
                    if (i15 == 1 || i15 == 2) {
                        boolean z3 = view.getMeasuredHeight() == hj3.k();
                        if (xk02.j == 2 || !z2 || ((z2 && z3) || hj3.A())) {
                            i2 = View.MeasureSpec.makeMeasureSpec(hj3.q(), 1073741824);
                        }
                    }
                } else if (s != 3) {
                    i2 = 0;
                } else {
                    int i16 = this.e;
                    int i17 = oi32 != null ? oi32.g : 0;
                    if (oi3 != null) {
                        i17 += oi3.g;
                    }
                    i2 = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
                }
                int s2 = au1.s(i10);
                if (s2 == 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (s2 == 1) {
                    i3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                } else if (s2 == 2) {
                    i3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                    boolean z4 = hj32.s == 1;
                    int i18 = xk02.j;
                    if (i18 == 1 || i18 == 2) {
                        boolean z5 = view.getMeasuredWidth() == hj3.q();
                        if (xk02.j == 2 || !z4 || ((z4 && z5) || hj3.B())) {
                            i3 = View.MeasureSpec.makeMeasureSpec(hj3.k(), 1073741824);
                        }
                    }
                } else if (s2 != 3) {
                    i3 = 0;
                } else {
                    int i19 = this.f;
                    int i20 = oi32 != null ? hj32.J.g : 0;
                    if (oi3 != null) {
                        i20 += hj32.L.g;
                    }
                    i3 = ViewGroup.getChildMeasureSpec(i19, i13 + i20, -1);
                }
                ij3 ij3 = (ij3) hj32.T;
                ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
                if (ij3 == null || !v3c.k(constraintLayout.w0, 256) || view.getMeasuredWidth() != hj3.q() || view.getMeasuredWidth() >= ij3.q() || view.getMeasuredHeight() != hj3.k() || view.getMeasuredHeight() >= ij3.k() || view.getBaseline() != hj32.a0 || hj3.z() || !a(hj32.G, i2, hj3.q()) || !a(hj32.H, i3, hj3.k())) {
                    boolean z6 = i9 == 3;
                    boolean z7 = i10 == 3;
                    boolean z8 = i10 == 4 || i10 == 1;
                    boolean z9 = i9 == 4 || i9 == 1;
                    boolean z10 = z6 && hj32.W > 0.0f;
                    boolean z11 = z7 && hj32.W > 0.0f;
                    if (view != null) {
                        ti3 ti3 = (ti3) view.getLayoutParams();
                        int i21 = xk02.j;
                        if (i21 == 1 || i21 == 2 || !z6 || hj32.r != 0 || !z7 || hj32.s != 0) {
                            if (!(view instanceof cqf) || !(hj32 instanceof nn5)) {
                                view.measure(i2, i3);
                            } else {
                                ((cqf) view).l((nn5) hj32, i2, i3);
                            }
                            hj32.G = i2;
                            hj32.H = i3;
                            hj32.g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i22 = hj32.u;
                            i4 = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                            int i23 = hj32.v;
                            if (i23 > 0) {
                                i4 = Math.min(i23, i4);
                            }
                            int i24 = hj32.x;
                            if (i24 > 0) {
                                i5 = Math.max(i24, measuredHeight);
                                i8 = i2;
                            } else {
                                i8 = i2;
                                i5 = measuredHeight;
                            }
                            int i25 = hj32.y;
                            if (i25 > 0) {
                                i5 = Math.min(i25, i5);
                            }
                            if (!v3c.k(constraintLayout.w0, 1)) {
                                if (z10 && z8) {
                                    i4 = (int) ((((float) i5) * hj32.W) + 0.5f);
                                } else if (z11 && z9) {
                                    i5 = (int) ((((float) i4) / hj32.W) + 0.5f);
                                }
                            }
                            if (measuredWidth == i4 && measuredHeight == i5) {
                                i6 = baseline;
                                i7 = -1;
                                z = false;
                            } else {
                                int makeMeasureSpec = measuredWidth != i4 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : i8;
                                if (measuredHeight != i5) {
                                    i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i3);
                                hj32.G = makeMeasureSpec;
                                hj32.H = i3;
                                z = false;
                                hj32.g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i6 = view.getBaseline();
                                i4 = measuredWidth2;
                                i5 = measuredHeight2;
                                i7 = -1;
                            }
                        } else {
                            i7 = -1;
                            i6 = 0;
                            z = false;
                            i5 = 0;
                            i4 = 0;
                        }
                        boolean z12 = i6 != i7 ? true : z;
                        if (!(i4 == xk02.e && i5 == xk02.f)) {
                            z = true;
                        }
                        xk02.k = z;
                        boolean z13 = ti3.c0 ? true : z12;
                        if (!(!z13 || i6 == -1 || hj32.a0 == i6)) {
                            xk02.k = true;
                        }
                        xk02.g = i4;
                        xk02.h = i5;
                        xk02.c = z13;
                        xk02.i = i6;
                        return;
                    }
                    return;
                }
                xk02.g = hj3.q();
                xk02.h = hj3.k();
                xk02.i = hj32.a0;
            }
        }
    }
}
