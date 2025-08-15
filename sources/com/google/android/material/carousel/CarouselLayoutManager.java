package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.List;

public class CarouselLayoutManager extends a implements ydc {
    public final bu4 p;
    public oy q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        bu4 bu4 = new bu4();
        new wz1();
        this.r = new i61(1, this);
        this.p = bu4;
        w0();
        Q0(0);
    }

    public static kj6 N0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((kd7) list.get(i5)).getClass();
            float abs = Math.abs(0.0f - f);
            if (0.0f <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (0.0f > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (0.0f <= f5) {
                f5 = 0.0f;
                i2 = i5;
            }
            if (0.0f > f3) {
                f3 = 0.0f;
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new kj6((kd7) list.get(i), (kd7) list.get(i3));
    }

    public final void A(Rect rect, View view) {
        RecyclerView.V(rect, view);
        rect.centerY();
        if (O0()) {
            rect.centerX();
        }
        throw null;
    }

    public final void I0(RecyclerView recyclerView, int i) {
        vz1 vz1 = new vz1(this, recyclerView.getContext(), 0);
        vz1.a = i;
        J0(vz1);
    }

    public final float L0(int i) {
        this.q.l();
        throw null;
    }

    public final int M0() {
        return O0() ? this.n : this.o;
    }

    public final boolean O0() {
        return this.q.b == 0;
    }

    public final boolean P0() {
        return O0() && H() == 1;
    }

    public final boolean Q() {
        return true;
    }

    public final void Q0(int i) {
        xz1 xz1;
        if (i == 0 || i == 1) {
            c((String) null);
            oy oyVar = this.q;
            if (oyVar == null || i != oyVar.b) {
                if (i == 0) {
                    xz1 = new xz1(this, 1);
                } else if (i == 1) {
                    xz1 = new xz1(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.q = xz1;
                w0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(zr6.h(i, "invalid orientation:"));
    }

    public final void W(RecyclerView recyclerView) {
        bu4 bu4 = this.p;
        Context context = recyclerView.getContext();
        float f = bu4.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(stb.m3_carousel_small_item_size_min);
        }
        bu4.a = f;
        float f2 = bu4.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(stb.m3_carousel_small_item_size_max);
        }
        bu4.b = f2;
        p0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    public final void X(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r10 != 1) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (P0() != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r10 == 1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (P0() != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Y(android.view.View r7, int r8, defpackage.vdc r9, defpackage.zdc r10) {
        /*
            r6 = this;
            int r10 = r6.w()
            r0 = 0
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            oy r10 = r6.q
            int r10 = r10.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r8 == r3) goto L_0x0040
            r4 = 2
            if (r8 == r4) goto L_0x003e
            r4 = 17
            if (r8 == r4) goto L_0x0036
            r4 = 33
            if (r8 == r4) goto L_0x0033
            r4 = 66
            if (r8 == r4) goto L_0x002a
            r4 = 130(0x82, float:1.82E-43)
            if (r8 == r4) goto L_0x0027
        L_0x0025:
            r8 = r1
            goto L_0x0041
        L_0x0027:
            if (r10 != r3) goto L_0x0025
            goto L_0x003e
        L_0x002a:
            if (r10 != 0) goto L_0x0025
            boolean r8 = r6.P0()
            if (r8 == 0) goto L_0x003e
            goto L_0x0040
        L_0x0033:
            if (r10 != r3) goto L_0x0025
            goto L_0x0040
        L_0x0036:
            if (r10 != 0) goto L_0x0025
            boolean r8 = r6.P0()
            if (r8 == 0) goto L_0x0040
        L_0x003e:
            r8 = r3
            goto L_0x0041
        L_0x0040:
            r8 = r2
        L_0x0041:
            if (r8 != r1) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.String r10 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 0
            if (r8 != r2) goto L_0x0087
            int r7 = androidx.recyclerview.widget.a.M(r7)
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            android.view.View r7 = r6.v(r1)
            int r7 = androidx.recyclerview.widget.a.M(r7)
            int r7 = r7 - r3
            if (r7 < 0) goto L_0x0076
            int r8 = r6.G()
            if (r7 < r8) goto L_0x0067
            goto L_0x0076
        L_0x0067:
            r6.L0(r7)
            dec r6 = r9.j(r7, r4)
            android.view.View r6 = r6.a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r10)
            throw r6
        L_0x0076:
            boolean r7 = r6.P0()
            if (r7 == 0) goto L_0x0082
            int r7 = r6.w()
            int r1 = r7 + -1
        L_0x0082:
            android.view.View r6 = r6.v(r1)
            goto L_0x00ca
        L_0x0087:
            int r7 = androidx.recyclerview.widget.a.M(r7)
            int r8 = r6.G()
            int r8 = r8 - r3
            if (r7 != r8) goto L_0x0093
            return r0
        L_0x0093:
            int r7 = r6.w()
            int r7 = r7 - r3
            android.view.View r7 = r6.v(r7)
            int r7 = androidx.recyclerview.widget.a.M(r7)
            int r7 = r7 + r3
            if (r7 < 0) goto L_0x00b9
            int r8 = r6.G()
            if (r7 < r8) goto L_0x00aa
            goto L_0x00b9
        L_0x00aa:
            r6.L0(r7)
            dec r6 = r9.j(r7, r4)
            android.view.View r6 = r6.a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r10)
            throw r6
        L_0x00b9:
            boolean r7 = r6.P0()
            if (r7 == 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r7 = r6.w()
            int r1 = r7 + -1
        L_0x00c6:
            android.view.View r6 = r6.v(r1)
        L_0x00ca:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.Y(android.view.View, int, vdc, zdc):android.view.View");
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(a.M(v(0)));
            accessibilityEvent.setToIndex(a.M(v(w() - 1)));
        }
    }

    public final PointF a(int i) {
        return null;
    }

    public final void d0(int i, int i2) {
        G();
    }

    public final boolean e() {
        return O0();
    }

    public final boolean f() {
        return !O0();
    }

    public final void g0(int i, int i2) {
        G();
    }

    public final void j0(vdc vdc, zdc zdc) {
        if (zdc.b() <= 0 || ((float) M0()) <= 0.0f) {
            r0(vdc);
            return;
        }
        P0();
        View view = vdc.j(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int k(zdc zdc) {
        w();
        return 0;
    }

    public final void k0(zdc zdc) {
        if (w() != 0) {
            a.M(v(0));
        }
    }

    public final int l(zdc zdc) {
        return 0;
    }

    public final int m(zdc zdc) {
        return 0;
    }

    public final int n(zdc zdc) {
        w();
        return 0;
    }

    public final int o(zdc zdc) {
        return 0;
    }

    public final int p(zdc zdc) {
        return 0;
    }

    public final pdc s() {
        return new pdc(-2, -2);
    }

    public final boolean v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    public final int x0(int i, vdc vdc, zdc zdc) {
        if (!O0() || w() == 0 || i == 0) {
            return 0;
        }
        View view = vdc.j(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void y0(int i) {
    }

    public final int z0(int i, vdc vdc, zdc zdc) {
        if (!f() || w() == 0 || i == 0) {
            return 0;
        }
        View view = vdc.j(0, Long.MAX_VALUE).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new wz1();
        this.r = new i61(1, this);
        this.p = new bu4();
        w0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.Carousel);
            obtainStyledAttributes.getInt(z2c.Carousel_carousel_alignment, 0);
            w0();
            Q0(obtainStyledAttributes.getInt(z2c.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
