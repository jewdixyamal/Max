package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class SideSheetBehavior<V extends View> extends ow3 implements w08 {
    public static final int x = wzb.side_sheet_accessibility_pane_title;
    public static final int y = m2c.Widget_Material3_SideSheet;
    public z04 a;
    public final q18 b;
    public final ColorStateList c;
    public final gjd d;
    public final er0 e = new er0(this);
    public final float f;
    public final boolean g = true;
    public int h = 5;
    public dnf i;
    public boolean j;
    public final float k = 0.1f;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r = -1;
    public VelocityTracker s;
    public w18 t;
    public int u;
    public final LinkedHashSet v = new LinkedHashSet();
    public final br0 w = new br0(1, this);

    public SideSheetBehavior() {
    }

    public final void A(int i2, View view, boolean z) {
        int i3;
        if (i2 == 3) {
            i3 = this.a.A();
        } else if (i2 == 5) {
            i3 = this.a.C();
        } else {
            throw new IllegalArgumentException(zr6.h(i2, "Invalid state to get outer edge offset: "));
        }
        dnf dnf = this.i;
        if (dnf == null || (!z ? !dnf.p(view, i3, view.getTop()) : !dnf.n(i3, view.getTop()))) {
            y(i2);
            return;
        }
        y(2);
        this.e.b(i2);
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            zmf.h(view, 262144);
            zmf.e(view, 0);
            zmf.h(view, 1048576);
            zmf.e(view, 0);
            if (this.h != 5) {
                zmf.i(view, f4.j, new hd0(5, 9, this));
            }
            if (this.h != 3) {
                zmf.i(view, f4.h, new hd0(3, 9, this));
            }
        }
    }

    public final void a() {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        w18 w18 = this.t;
        if (w18 != null) {
            ge0 ge0 = w18.f;
            fod fod = null;
            w18.f = null;
            int i3 = 5;
            if (ge0 == null || Build.VERSION.SDK_INT < 34) {
                x(5);
                return;
            }
            z04 z04 = this.a;
            if (!(z04 == null || z04.H() == 0)) {
                i3 = 3;
            }
            h6 h6Var = new h6(9, (Object) this);
            WeakReference weakReference = this.q;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (!(view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null)) {
                fod = new fod(this, marginLayoutParams, this.a.z(marginLayoutParams), view);
            }
            boolean z = ge0.d == 0;
            WeakHashMap weakHashMap = zmf.a;
            View view2 = w18.b;
            boolean z2 = (Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 3) == 3;
            float scaleX = view2.getScaleX() * ((float) view2.getWidth());
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                i2 = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
            } else {
                i2 = 0;
            }
            float f2 = scaleX + ((float) i2);
            Property property = View.TRANSLATION_X;
            if (z2) {
                f2 = -f2;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, new float[]{f2});
            if (fod != null) {
                ofFloat.addUpdateListener(fod);
            }
            ofFloat.setInterpolator(new wb5());
            ofFloat.setDuration((long) og.c(w18.c, ge0.c, w18.d));
            ofFloat.addListener(new v18(w18, z, i3));
            ofFloat.addListener(h6Var);
            ofFloat.start();
        }
    }

    public final void b(ge0 ge0) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        w18 w18 = this.t;
        if (w18 != null) {
            z04 z04 = this.a;
            int i2 = 5;
            if (!(z04 == null || z04.H() == 0)) {
                i2 = 3;
            }
            ge0 ge02 = w18.f;
            w18.f = ge0;
            if (ge02 != null) {
                w18.a(ge0.c, ge0.d == 0, i2);
            }
            WeakReference weakReference = this.p;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.p.get();
                WeakReference weakReference2 = this.q;
                View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    this.a.a0(marginLayoutParams, (int) ((view.getScaleX() * ((float) this.l)) + ((float) this.o)));
                    view2.requestLayout();
                }
            }
        }
    }

    public final void c(ge0 ge0) {
        w18 w18 = this.t;
        if (w18 != null) {
            w18.f = ge0;
        }
    }

    public final void d() {
        w18 w18 = this.t;
        if (w18 != null) {
            ge0 ge0 = w18.f;
            w18.f = null;
            if (ge0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                View view = w18.b;
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f})});
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), View.SCALE_Y, new float[]{1.0f})});
                    }
                }
                animatorSet.setDuration((long) w18.e);
                animatorSet.start();
            }
        }
    }

    public final void g(rw3 rw3) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r2 = r2.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (defpackage.tmf.b(r4) != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x0012
            java.util.WeakHashMap r3 = defpackage.zmf.a
            java.lang.CharSequence r3 = defpackage.tmf.b(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x005c
        L_0x0012:
            boolean r3 = r2.g
            if (r3 == 0) goto L_0x005c
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L_0x0026
            android.view.VelocityTracker r4 = r2.s
            if (r4 == 0) goto L_0x0026
            r4.recycle()
            r4 = 0
            r2.s = r4
        L_0x0026:
            android.view.VelocityTracker r4 = r2.s
            if (r4 != 0) goto L_0x0030
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.s = r4
        L_0x0030:
            android.view.VelocityTracker r4 = r2.s
            r4.addMovement(r5)
            if (r3 == 0) goto L_0x0044
            if (r3 == r0) goto L_0x003d
            r4 = 3
            if (r3 == r4) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            boolean r3 = r2.j
            if (r3 == 0) goto L_0x004b
            r2.j = r1
            return r1
        L_0x0044:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.u = r3
        L_0x004b:
            boolean r3 = r2.j
            if (r3 != 0) goto L_0x005a
            dnf r2 = r2.i
            if (r2 == 0) goto L_0x005a
            boolean r2 = r2.o(r5)
            if (r2 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            return r0
        L_0x005c:
            r2.j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v26, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            q18 r2 = r10.b
            java.util.WeakHashMap r3 = defpackage.zmf.a
            boolean r3 = r11.getFitsSystemWindows()
            if (r3 == 0) goto L_0x0015
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 != 0) goto L_0x0015
            r12.setFitsSystemWindows(r1)
        L_0x0015:
            java.lang.ref.WeakReference r3 = r10.p
            r4 = 5
            if (r3 != 0) goto L_0x0075
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r12)
            r10.p = r3
            w18 r3 = new w18
            r3.<init>(r12)
            r10.t = r3
            if (r2 == 0) goto L_0x003d
            r12.setBackground(r2)
            float r3 = r10.f
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0039
            float r3 = defpackage.omf.i(r12)
        L_0x0039:
            r2.k(r3)
            goto L_0x0044
        L_0x003d:
            android.content.res.ColorStateList r3 = r10.c
            if (r3 == 0) goto L_0x0044
            defpackage.omf.q(r12, r3)
        L_0x0044:
            int r3 = r10.h
            if (r3 != r4) goto L_0x004a
            r3 = 4
            goto L_0x004b
        L_0x004a:
            r3 = r0
        L_0x004b:
            int r5 = r12.getVisibility()
            if (r5 == r3) goto L_0x0054
            r12.setVisibility(r3)
        L_0x0054:
            r10.B()
            int r3 = r12.getImportantForAccessibility()
            if (r3 != 0) goto L_0x0060
            r12.setImportantForAccessibility(r1)
        L_0x0060:
            java.lang.CharSequence r3 = defpackage.tmf.b(r12)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 != 0) goto L_0x0075
            android.content.res.Resources r3 = r12.getResources()
            int r5 = x
            java.lang.String r3 = r3.getString(r5)
            defpackage.zmf.k(r12, r3)
        L_0x0075:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            rw3 r3 = (defpackage.rw3) r3
            int r3 = r3.c
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r13)
            r5 = 3
            if (r3 != r5) goto L_0x0086
            r3 = r1
            goto L_0x0087
        L_0x0086:
            r3 = r0
        L_0x0087:
            z04 r6 = r10.a
            if (r6 == 0) goto L_0x0091
            int r6 = r6.H()
            if (r6 == r3) goto L_0x0126
        L_0x0091:
            gjd r6 = r10.d
            r7 = 0
            r8 = 0
            if (r3 != 0) goto L_0x00de
            xe7 r3 = new xe7
            r3.<init>(r10, r1)
            r10.a = r3
            if (r6 == 0) goto L_0x0126
            java.lang.ref.WeakReference r3 = r10.p
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00bb
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof defpackage.rw3
            if (r9 == 0) goto L_0x00bb
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r7 = r3
            rw3 r7 = (defpackage.rw3) r7
        L_0x00bb:
            if (r7 == 0) goto L_0x00c2
            int r3 = r7.rightMargin
            if (r3 <= 0) goto L_0x00c2
            goto L_0x0126
        L_0x00c2:
            i8g r3 = r6.e()
            a0 r6 = new a0
            r6.<init>(r8)
            r3.f = r6
            a0 r6 = new a0
            r6.<init>(r8)
            r3.g = r6
            gjd r3 = r3.c()
            if (r2 == 0) goto L_0x0126
            r2.setShapeAppearanceModel(r3)
            goto L_0x0126
        L_0x00de:
            if (r3 != r1) goto L_0x01c4
            xe7 r3 = new xe7
            r3.<init>(r10, r0)
            r10.a = r3
            if (r6 == 0) goto L_0x0126
            java.lang.ref.WeakReference r3 = r10.p
            if (r3 == 0) goto L_0x0104
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0104
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof defpackage.rw3
            if (r9 == 0) goto L_0x0104
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r7 = r3
            rw3 r7 = (defpackage.rw3) r7
        L_0x0104:
            if (r7 == 0) goto L_0x010b
            int r3 = r7.leftMargin
            if (r3 <= 0) goto L_0x010b
            goto L_0x0126
        L_0x010b:
            i8g r3 = r6.e()
            a0 r6 = new a0
            r6.<init>(r8)
            r3.e = r6
            a0 r6 = new a0
            r6.<init>(r8)
            r3.h = r6
            gjd r3 = r3.c()
            if (r2 == 0) goto L_0x0126
            r2.setShapeAppearanceModel(r3)
        L_0x0126:
            dnf r2 = r10.i
            if (r2 != 0) goto L_0x0137
            dnf r2 = new dnf
            android.content.Context r3 = r11.getContext()
            br0 r6 = r10.w
            r2.<init>(r3, r11, r6)
            r10.i = r2
        L_0x0137:
            z04 r2 = r10.a
            int r2 = r2.F(r12)
            r11.p(r12, r13)
            int r13 = r11.getWidth()
            r10.m = r13
            z04 r13 = r10.a
            int r13 = r13.G(r11)
            r10.n = r13
            int r13 = r12.getWidth()
            r10.l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L_0x0163
            z04 r3 = r10.a
            int r13 = r3.h(r13)
            goto L_0x0164
        L_0x0163:
            r13 = r0
        L_0x0164:
            r10.o = r13
            int r13 = r10.h
            if (r13 == r1) goto L_0x018e
            r3 = 2
            if (r13 == r3) goto L_0x018e
            if (r13 == r5) goto L_0x0196
            if (r13 != r4) goto L_0x0178
            z04 r13 = r10.a
            int r0 = r13.C()
            goto L_0x0196
        L_0x0178:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r10 = r10.h
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x018e:
            z04 r13 = r10.a
            int r13 = r13.F(r12)
            int r0 = r2 - r13
        L_0x0196:
            r12.offsetLeftAndRight(r0)
            java.lang.ref.WeakReference r12 = r10.q
            if (r12 != 0) goto L_0x01af
            int r12 = r10.r
            r13 = -1
            if (r12 == r13) goto L_0x01af
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L_0x01af
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.q = r12
        L_0x01af:
            java.util.LinkedHashSet r10 = r10.v
            java.util.Iterator r10 = r10.iterator()
        L_0x01b5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01c3
            java.lang.Object r11 = r10.next()
            defpackage.au1.r(r11)
            goto L_0x01b5
        L_0x01c3:
            return r1
        L_0x01c4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid sheet edge position value: "
            java.lang.String r12 = ". Must be 0 or 1."
            java.lang.String r11 = defpackage.wg0.g(r3, r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final void r(View view, Parcelable parcelable) {
        int i2 = ((god) parcelable).c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.h = i2;
    }

    public final Parcelable s(View view) {
        return new god(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.j && z()) {
            float abs = Math.abs(((float) this.u) - motionEvent.getX());
            dnf dnf = this.i;
            if (abs > ((float) dnf.b)) {
                dnf.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void x(int i2) {
        if (i2 == 1 || i2 == 2) {
            throw new IllegalArgumentException(zr6.l(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            y(i2);
            return;
        }
        View view = (View) this.p.get();
        l40 l40 = new l40(i2, 16, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = zmf.a;
            if (view.isAttachedToWindow()) {
                view.post(l40);
                return;
            }
        }
        l40.run();
    }

    public final void y(int i2) {
        View view;
        if (this.h != i2) {
            this.h = i2;
            WeakReference weakReference = this.p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i3 = this.h == 5 ? 4 : 0;
                if (view.getVisibility() != i3) {
                    view.setVisibility(i3);
                }
                Iterator it = this.v.iterator();
                if (!it.hasNext()) {
                    B();
                } else {
                    au1.r(it.next());
                    throw null;
                }
            }
        }
    }

    public final boolean z() {
        return this.i != null && (this.g || this.h == 1);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(z2c.SideSheetBehavior_Layout_backgroundTint)) {
            this.c = ju0.q(context, obtainStyledAttributes, z2c.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(z2c.SideSheetBehavior_Layout_shapeAppearance)) {
            this.d = gjd.b(context, attributeSet, 0, y).c();
        }
        if (obtainStyledAttributes.hasValue(z2c.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = obtainStyledAttributes.getResourceId(z2c.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        gjd gjd = this.d;
        if (gjd != null) {
            q18 q18 = new q18(gjd);
            this.b = q18;
            q18.j(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(z2c.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(z2c.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
