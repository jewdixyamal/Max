package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

public class RecyclerView extends ViewGroup implements ixc, hn9 {
    public static boolean L1 = false;
    public static boolean M1 = false;
    public static final int[] N1 = {16843830};
    public static final float O1 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final boolean P1 = true;
    public static final boolean Q1 = true;
    public static final boolean R1 = true;
    public static final Class[] S1;
    public static final c77 T1 = new c77(2);
    public static final aec U1 = new Object();
    public hdc A0;
    public final int[] A1;
    public a B0;
    public jn9 B1;
    public final ArrayList C0;
    public final int[] C1;
    public final ArrayList D0;
    public final int[] D1;
    public final ArrayList E0;
    public final int[] E1;
    public sdc F0;
    public final ArrayList F1;
    public boolean G0;
    public final gdc G1;
    public boolean H0;
    public boolean H1;
    public boolean I0;
    public int I1;
    public int J0;
    public int J1;
    public boolean K0;
    public final ey1 K1;
    public boolean L0;
    public boolean M0;
    public int N0;
    public boolean O0;
    public final AccessibilityManager P0;
    public ArrayList Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public int U0;
    public ldc V0;
    public EdgeEffect W0;
    public EdgeEffect X0;
    public EdgeEffect Y0;
    public EdgeEffect Z0;
    public final float a;
    public mdc a1;
    public final pz4 b;
    public int b1;
    public final vdc c;
    public int c1;
    public VelocityTracker d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public rdc j1;
    public final int k1;
    public final int l1;
    public final float m1;
    public final float n1;
    public xdc o;
    public boolean o1;
    public final cec p1;
    public ca6 q1;
    public final b23 r1;
    public final x8 s0;
    public final zdc s1;
    public final l0f t0;
    public tdc t1;
    public final djb u0;
    public ArrayList u1;
    public boolean v0;
    public boolean v1;
    public final gdc w0;
    public boolean w1;
    public final Rect x0;
    public final re6 x1;
    public final Rect y0;
    public boolean y1;
    public final RectF z0;
    public fec z1;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, aec] */
    static {
        Class cls = Integer.TYPE;
        S1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ssb.recyclerViewStyle);
    }

    public static RecyclerView L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView L = L(viewGroup.getChildAt(i));
            if (L != null) {
                return L;
            }
        }
        return null;
    }

    public static int R(View view) {
        dec U = U(view);
        if (U != null) {
            return U.g();
        }
        return -1;
    }

    public static int S(View view) {
        dec U = U(view);
        if (U != null) {
            return U.i();
        }
        return -1;
    }

    public static dec U(View view) {
        if (view == null) {
            return null;
        }
        return ((pdc) view.getLayoutParams()).a;
    }

    public static void V(Rect rect, View view) {
        pdc pdc = (pdc) view.getLayoutParams();
        Rect rect2 = pdc.b;
        rect.set((view.getLeft() - rect2.left) - pdc.leftMargin, (view.getTop() - rect2.top) - pdc.topMargin, view.getRight() + rect2.right + pdc.rightMargin, view.getBottom() + rect2.bottom + pdc.bottomMargin);
    }

    private jn9 getScrollingChildHelper() {
        if (this.B1 == null) {
            this.B1 = new jn9(this);
        }
        return this.B1;
    }

    public static void o(dec dec) {
        WeakReference weakReference = dec.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != dec.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            dec.b = null;
        }
    }

    public static int r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && kp.k(edgeEffect) != 0.0f) {
            int round = Math.round(kp.q(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f) * (((float) (-i2)) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i >= 0 || edgeEffect2 == null || kp.k(edgeEffect2) == 0.0f) {
            return i;
        } else {
            float f = (float) i2;
            int round2 = Math.round(kp.q(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        L1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        M1 = z;
    }

    public final void A(int i, int i2) {
        this.U0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        tdc tdc = this.t1;
        if (tdc != null) {
            tdc.b(this, i, i2);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((tdc) this.u1.get(size)).b(this, i, i2);
            }
        }
        this.U0--;
    }

    public final void A0(int i, int i2, boolean z) {
        a aVar = this.B0;
        if (aVar != null && !this.L0) {
            int i3 = 0;
            if (!aVar.e()) {
                i = 0;
            }
            if (!this.B0.f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().h(i3, 1);
                }
                this.p1.c(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void B() {
        if (this.Z0 == null) {
            EdgeEffect a2 = this.V0.a(this, 3);
            this.Z0 = a2;
            if (this.v0) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void B0(int i) {
        a aVar;
        if (!this.L0 && (aVar = this.B0) != null) {
            aVar.I0(this, i);
        }
    }

    public final void C() {
        if (this.W0 == null) {
            EdgeEffect a2 = this.V0.a(this, 0);
            this.W0 = a2;
            if (this.v0) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void C0() {
        int i = this.J0 + 1;
        this.J0 = i;
        if (i == 1 && !this.L0) {
            this.K0 = false;
        }
    }

    public final void D() {
        if (this.Y0 == null) {
            EdgeEffect a2 = this.V0.a(this, 2);
            this.Y0 = a2;
            if (this.v0) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void D0(boolean z) {
        if (this.J0 < 1) {
            if (!L1) {
                this.J0 = 1;
            } else {
                throw new IllegalStateException(ms2.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z && !this.L0) {
            this.K0 = false;
        }
        if (this.J0 == 1) {
            if (z && this.K0 && !this.L0 && this.B0 != null && this.A0 != null) {
                v();
            }
            if (!this.L0) {
                this.K0 = false;
            }
        }
        this.J0--;
    }

    public final void E() {
        if (this.X0 == null) {
            EdgeEffect a2 = this.V0.a(this, 1);
            this.X0 = a2;
            if (this.v0) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void E0() {
        yh7 yh7;
        setScrollState(0);
        cec cec = this.p1;
        cec.Z.removeCallbacks(cec);
        cec.c.abortAnimation();
        a aVar = this.B0;
        if (aVar != null && (yh7 = aVar.e) != null) {
            yh7.l();
        }
    }

    public final String F() {
        return " " + super.toString() + ", adapter:" + this.A0 + ", layout:" + this.B0 + ", context:" + getContext();
    }

    public final void G(zdc zdc) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.p1.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            zdc.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        zdc.getClass();
    }

    public final View H(float f, float f2) {
        for (int z = this.t0.z() - 1; z >= 0; z--) {
            View y = this.t0.y(z);
            float translationX = y.getTranslationX();
            float translationY = y.getTranslationY();
            if (f >= ((float) y.getLeft()) + translationX && f <= ((float) y.getRight()) + translationX && f2 >= ((float) y.getTop()) + translationY && f2 <= ((float) y.getBottom()) + translationY) {
                return y;
            }
        }
        return null;
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sdc sdc = (sdc) arrayList.get(i);
            if (!sdc.c(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.F0 = sdc;
                return true;
            }
        }
        return false;
    }

    public final void K(int[] iArr) {
        int z = this.t0.z();
        if (z == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < z; i3++) {
            dec U = U(this.t0.y(i3));
            if (!U.w()) {
                int i4 = U.i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final dec M(int i) {
        dec dec = null;
        if (this.R0) {
            return null;
        }
        int D = this.t0.D();
        for (int i2 = 0; i2 < D; i2++) {
            dec U = U(this.t0.C(i2));
            if (U != null && !U.p() && P(U) == i) {
                if (!this.t0.H(U.a)) {
                    return U;
                }
                dec = U;
            }
        }
        return dec;
    }

    public final dec N(long j) {
        hdc hdc = this.A0;
        dec dec = null;
        if (hdc != null && hdc.b) {
            int D = this.t0.D();
            for (int i = 0; i < D; i++) {
                dec U = U(this.t0.C(i));
                if (U != null && !U.p() && U.X == j) {
                    if (!this.t0.H(U.a)) {
                        return U;
                    }
                    dec = U;
                }
            }
        }
        return dec;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O(int r12, int r13) {
        /*
            r11 = this;
            androidx.recyclerview.widget.a r0 = r11.B0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r11.L0
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r0 = r0.e()
            androidx.recyclerview.widget.a r2 = r11.B0
            boolean r2 = r2.f()
            int r3 = r11.k1
            if (r0 == 0) goto L_0x001f
            int r4 = java.lang.Math.abs(r12)
            if (r4 >= r3) goto L_0x0020
        L_0x001f:
            r12 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x0028
            int r4 = java.lang.Math.abs(r13)
            if (r4 >= r3) goto L_0x0029
        L_0x0028:
            r13 = r1
        L_0x0029:
            if (r12 != 0) goto L_0x002e
            if (r13 != 0) goto L_0x002e
            return r1
        L_0x002e:
            r3 = 0
            if (r12 == 0) goto L_0x0071
            android.widget.EdgeEffect r4 = r11.W0
            if (r4 == 0) goto L_0x0053
            float r4 = defpackage.kp.k(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            android.widget.EdgeEffect r4 = r11.W0
            int r5 = -r12
            int r6 = r11.getWidth()
            boolean r4 = r11.z0(r4, r5, r6)
            if (r4 == 0) goto L_0x0050
            android.widget.EdgeEffect r12 = r11.W0
            r12.onAbsorb(r5)
        L_0x004f:
            r12 = r1
        L_0x0050:
            r4 = r12
            r12 = r1
            goto L_0x0072
        L_0x0053:
            android.widget.EdgeEffect r4 = r11.Y0
            if (r4 == 0) goto L_0x0071
            float r4 = defpackage.kp.k(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0071
            android.widget.EdgeEffect r4 = r11.Y0
            int r5 = r11.getWidth()
            boolean r4 = r11.z0(r4, r12, r5)
            if (r4 == 0) goto L_0x0050
            android.widget.EdgeEffect r4 = r11.Y0
            r4.onAbsorb(r12)
            goto L_0x004f
        L_0x0071:
            r4 = r1
        L_0x0072:
            if (r13 == 0) goto L_0x00b3
            android.widget.EdgeEffect r5 = r11.X0
            if (r5 == 0) goto L_0x0095
            float r5 = defpackage.kp.k(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0095
            android.widget.EdgeEffect r3 = r11.X0
            int r5 = -r13
            int r6 = r11.getHeight()
            boolean r3 = r11.z0(r3, r5, r6)
            if (r3 == 0) goto L_0x0093
            android.widget.EdgeEffect r13 = r11.X0
            r13.onAbsorb(r5)
        L_0x0092:
            r13 = r1
        L_0x0093:
            r3 = r1
            goto L_0x00b5
        L_0x0095:
            android.widget.EdgeEffect r5 = r11.Z0
            if (r5 == 0) goto L_0x00b3
            float r5 = defpackage.kp.k(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00b3
            android.widget.EdgeEffect r3 = r11.Z0
            int r5 = r11.getHeight()
            boolean r3 = r11.z0(r3, r13, r5)
            if (r3 == 0) goto L_0x0093
            android.widget.EdgeEffect r3 = r11.Z0
            r3.onAbsorb(r13)
            goto L_0x0092
        L_0x00b3:
            r3 = r13
            r13 = r1
        L_0x00b5:
            cec r5 = r11.p1
            int r6 = r11.l1
            if (r4 != 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00d1
        L_0x00bd:
            int r7 = -r6
            int r4 = java.lang.Math.min(r4, r6)
            int r4 = java.lang.Math.max(r7, r4)
            int r13 = java.lang.Math.min(r13, r6)
            int r13 = java.lang.Math.max(r7, r13)
            r5.a(r4, r13)
        L_0x00d1:
            r7 = 1
            if (r12 != 0) goto L_0x00dc
            if (r3 != 0) goto L_0x00dc
            if (r4 != 0) goto L_0x00da
            if (r13 == 0) goto L_0x00db
        L_0x00da:
            r1 = r7
        L_0x00db:
            return r1
        L_0x00dc:
            float r13 = (float) r12
            float r4 = (float) r3
            boolean r8 = r11.dispatchNestedPreFling(r13, r4)
            if (r8 != 0) goto L_0x0155
            if (r0 != 0) goto L_0x00eb
            if (r2 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r8 = r1
            goto L_0x00ec
        L_0x00eb:
            r8 = r7
        L_0x00ec:
            r11.dispatchNestedFling(r13, r4, r8)
            rdc r13 = r11.j1
            if (r13 == 0) goto L_0x0133
            g34 r13 = (defpackage.g34) r13
            androidx.recyclerview.widget.RecyclerView r4 = r13.a
            androidx.recyclerview.widget.a r4 = r4.getLayoutManager()
            if (r4 != 0) goto L_0x00fe
            goto L_0x0133
        L_0x00fe:
            androidx.recyclerview.widget.RecyclerView r9 = r13.a
            hdc r9 = r9.getAdapter()
            if (r9 != 0) goto L_0x0107
            goto L_0x0133
        L_0x0107:
            androidx.recyclerview.widget.RecyclerView r9 = r13.a
            int r9 = r9.getMinFlingVelocity()
            int r10 = java.lang.Math.abs(r3)
            if (r10 > r9) goto L_0x0119
            int r10 = java.lang.Math.abs(r12)
            if (r10 <= r9) goto L_0x0133
        L_0x0119:
            boolean r9 = r4 instanceof defpackage.ydc
            if (r9 != 0) goto L_0x011e
            goto L_0x0133
        L_0x011e:
            yh7 r9 = r13.c(r4)
            if (r9 != 0) goto L_0x0125
            goto L_0x0133
        L_0x0125:
            int r13 = r13.j(r4, r12, r3)
            r10 = -1
            if (r13 != r10) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            r9.a = r13
            r4.J0(r9)
            return r7
        L_0x0133:
            if (r8 == 0) goto L_0x0155
            if (r2 == 0) goto L_0x0139
            r0 = r0 | 2
        L_0x0139:
            jn9 r11 = r11.getScrollingChildHelper()
            r11.h(r0, r7)
            int r11 = -r6
            int r12 = java.lang.Math.min(r12, r6)
            int r12 = java.lang.Math.max(r11, r12)
            int r13 = java.lang.Math.min(r3, r6)
            int r11 = java.lang.Math.max(r11, r13)
            r5.a(r12, r11)
            return r7
        L_0x0155:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.O(int, int):boolean");
    }

    public final int P(dec dec) {
        if (dec.k(524) || !dec.m()) {
            return -1;
        }
        x8 x8Var = this.s0;
        int i = dec.c;
        ArrayList arrayList = (ArrayList) x8Var.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w8 w8Var = (w8) arrayList.get(i2);
            int i3 = w8Var.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = w8Var.b;
                    if (i4 <= i) {
                        int i5 = w8Var.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = w8Var.b;
                    if (i6 == i) {
                        i = w8Var.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (w8Var.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (w8Var.b <= i) {
                i += w8Var.d;
            }
        }
        return i;
    }

    public final long Q(dec dec) {
        return this.A0.b ? dec.X : (long) dec.c;
    }

    public final dec T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect W(View view) {
        pdc pdc = (pdc) view.getLayoutParams();
        boolean z = pdc.c;
        Rect rect = pdc.b;
        if (!z) {
            return rect;
        }
        zdc zdc = this.s1;
        if (zdc.h && (pdc.a.s() || pdc.a.n())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.x0;
            rect2.set(0, 0, 0, 0);
            ((ndc) arrayList.get(i)).f(rect2, view, this, zdc);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pdc.c = false;
        return rect;
    }

    public final boolean X() {
        return !this.I0 || this.R0 || this.s0.D();
    }

    public void Y() {
        if (this.D0.size() != 0) {
            a aVar = this.B0;
            if (aVar != null) {
                aVar.c("Cannot invalidate item decorations during a scroll or layout");
            }
            b0();
            requestLayout();
        }
    }

    public final boolean Z() {
        return this.T0 > 0;
    }

    public final void a(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void a0(int i) {
        if (this.B0 != null) {
            setScrollState(2);
            this.B0.y0(i);
            awakenScrollBars();
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        a aVar = this.B0;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        int D = this.t0.D();
        for (int i = 0; i < D; i++) {
            ((pdc) this.t0.C(i).getLayoutParams()).c = true;
        }
        vdc vdc = this.c;
        int size = vdc.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pdc pdc = (pdc) ((dec) vdc.c.get(i2)).a.getLayoutParams();
            if (pdc != null) {
                pdc.c = true;
            }
        }
    }

    public final void c0(int i) {
        int z = this.t0.z();
        for (int i2 = 0; i2 < z; i2++) {
            this.t0.y(i2).offsetTopAndBottom(i);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof pdc) && this.B0.g((pdc) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        a aVar = this.B0;
        if (aVar != null && aVar.e()) {
            return this.B0.k(this.s1);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        a aVar = this.B0;
        if (aVar != null && aVar.e()) {
            return this.B0.l(this.s1);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        a aVar = this.B0;
        if (aVar != null && aVar.e()) {
            return this.B0.m(this.s1);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        a aVar = this.B0;
        if (aVar != null && aVar.f()) {
            return this.B0.n(this.s1);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        a aVar = this.B0;
        if (aVar != null && aVar.f()) {
            return this.B0.o(this.s1);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        a aVar = this.B0;
        if (aVar != null && aVar.f()) {
            return this.B0.p(this.s1);
        }
        return 0;
    }

    public final void d0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int D = this.t0.D();
        for (int i4 = 0; i4 < D; i4++) {
            dec U = U(this.t0.C(i4));
            if (U != null && !U.w()) {
                int i5 = U.c;
                zdc zdc = this.s1;
                if (i5 >= i3) {
                    if (M1) {
                        U.toString();
                    }
                    U.t(-i2, z);
                    zdc.g = true;
                } else if (i5 >= i) {
                    if (M1) {
                        U.toString();
                    }
                    U.f(8);
                    U.t(-i2, z);
                    U.c = i - 1;
                    zdc.g = true;
                }
            }
        }
        vdc vdc = this.c;
        for (int size = vdc.c.size() - 1; size >= 0; size--) {
            dec dec = (dec) vdc.c.get(size);
            if (dec != null) {
                int i6 = dec.c;
                if (i6 >= i3) {
                    if (M1) {
                        dec.toString();
                    }
                    dec.t(-i2, z);
                } else if (i6 >= i) {
                    dec.f(8);
                    vdc.f(size);
                }
            }
        }
        requestLayout();
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        super.draw(canvas);
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((ndc) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.W0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.v0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.W0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.X0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.v0) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.X0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.Y0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.v0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.Y0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.Z0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.v0) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.Z0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save4);
        }
        if (z || this.a1 == null || arrayList.size() <= 0 || !this.a1.f()) {
            z2 = z;
        }
        if (z2) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        this.T0++;
    }

    public final void f0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.T0 - 1;
        this.T0 = i2;
        if (i2 >= 1) {
            return;
        }
        if (!L1 || i2 >= 0) {
            this.T0 = 0;
            if (z) {
                int i3 = this.N0;
                this.N0 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.P0) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.F1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    dec dec = (dec) arrayList.get(size);
                    if (dec.a.getParent() == this && !dec.w() && (i = dec.B0) != -1) {
                        WeakHashMap weakHashMap = zmf.a;
                        dec.a.setImportantForAccessibility(i);
                        dec.B0 = -1;
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0162, code lost:
        if (r7 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0179, code lost:
        if (r5 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x017c, code lost:
        if (r7 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x017f, code lost:
        if (r5 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0187, code lost:
        if ((r5 * r6) <= 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018f, code lost:
        if ((r5 * r6) >= 0) goto L_0x0192;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.a r3 = r0.B0
            r3.getClass()
            hdc r3 = r0.A0
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            androidx.recyclerview.widget.a r3 = r0.B0
            if (r3 == 0) goto L_0x0021
            boolean r3 = r16.Z()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.L0
            if (r3 != 0) goto L_0x0021
            r3 = r4
            goto L_0x0022
        L_0x0021:
            r3 = r5
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            zdc r7 = r0.s1
            r8 = 17
            r10 = 33
            r12 = 0
            r13 = 2
            if (r3 == 0) goto L_0x0093
            if (r2 == r13) goto L_0x0034
            if (r2 != r4) goto L_0x0093
        L_0x0034:
            androidx.recyclerview.widget.a r3 = r0.B0
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x004a
            if (r2 != r13) goto L_0x0041
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0042
        L_0x0041:
            r3 = r10
        L_0x0042:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004a
            r3 = r4
            goto L_0x004b
        L_0x004a:
            r3 = r5
        L_0x004b:
            if (r3 != 0) goto L_0x0075
            androidx.recyclerview.widget.a r14 = r0.B0
            boolean r14 = r14.e()
            if (r14 == 0) goto L_0x0075
            androidx.recyclerview.widget.a r3 = r0.B0
            int r3 = r3.H()
            if (r3 != r4) goto L_0x005f
            r3 = r4
            goto L_0x0060
        L_0x005f:
            r3 = r5
        L_0x0060:
            if (r2 != r13) goto L_0x0064
            r14 = r4
            goto L_0x0065
        L_0x0064:
            r14 = r5
        L_0x0065:
            r3 = r3 ^ r14
            if (r3 == 0) goto L_0x006b
            r3 = 66
            goto L_0x006c
        L_0x006b:
            r3 = r8
        L_0x006c:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0074
            r3 = r4
            goto L_0x0075
        L_0x0074:
            r3 = r5
        L_0x0075:
            if (r3 == 0) goto L_0x008e
            r16.s()
            android.view.View r3 = r16.I(r17)
            if (r3 != 0) goto L_0x0081
            return r12
        L_0x0081:
            r16.C0()
            androidx.recyclerview.widget.a r3 = r0.B0
            vdc r14 = r0.c
            r3.Y(r1, r2, r14, r7)
            r0.D0(r5)
        L_0x008e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b5
        L_0x0093:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00b4
            r16.s()
            android.view.View r3 = r16.I(r17)
            if (r3 != 0) goto L_0x00a5
            return r12
        L_0x00a5:
            r16.C0()
            androidx.recyclerview.widget.a r3 = r0.B0
            vdc r6 = r0.c
            android.view.View r3 = r3.Y(r1, r2, r6, r7)
            r0.D0(r5)
            goto L_0x00b5
        L_0x00b4:
            r3 = r6
        L_0x00b5:
            if (r3 == 0) goto L_0x00cc
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00cc
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00c8
            android.view.View r0 = super.focusSearch(r17, r18)
            return r0
        L_0x00c8:
            r0.t0(r3, r12)
            return r1
        L_0x00cc:
            if (r3 == 0) goto L_0x0192
            if (r3 == r0) goto L_0x0192
            if (r3 != r1) goto L_0x00d4
            goto L_0x0192
        L_0x00d4:
            android.view.View r6 = r0.I(r3)
            if (r6 != 0) goto L_0x00dd
            r4 = r5
            goto L_0x0193
        L_0x00dd:
            if (r1 != 0) goto L_0x00e1
            goto L_0x0193
        L_0x00e1:
            android.view.View r6 = r16.I(r17)
            if (r6 != 0) goto L_0x00e9
            goto L_0x0193
        L_0x00e9:
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            android.graphics.Rect r12 = r0.x0
            r12.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r14 = r0.y0
            r14.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r12)
            r0.offsetDescendantRectToMyCoords(r3, r14)
            androidx.recyclerview.widget.a r6 = r0.B0
            int r6 = r6.H()
            if (r6 != r4) goto L_0x0113
            r6 = -1
            goto L_0x0114
        L_0x0113:
            r6 = r4
        L_0x0114:
            int r15 = r12.left
            int r5 = r14.left
            if (r15 < r5) goto L_0x011e
            int r7 = r12.right
            if (r7 > r5) goto L_0x0126
        L_0x011e:
            int r7 = r12.right
            int r11 = r14.right
            if (r7 >= r11) goto L_0x0126
            r5 = r4
            goto L_0x0133
        L_0x0126:
            int r7 = r12.right
            int r11 = r14.right
            if (r7 > r11) goto L_0x012e
            if (r15 < r11) goto L_0x0132
        L_0x012e:
            if (r15 <= r5) goto L_0x0132
            r5 = -1
            goto L_0x0133
        L_0x0132:
            r5 = 0
        L_0x0133:
            int r7 = r12.top
            int r11 = r14.top
            if (r7 < r11) goto L_0x013d
            int r15 = r12.bottom
            if (r15 > r11) goto L_0x0145
        L_0x013d:
            int r15 = r12.bottom
            int r9 = r14.bottom
            if (r15 >= r9) goto L_0x0145
            r7 = r4
            goto L_0x0152
        L_0x0145:
            int r9 = r12.bottom
            int r12 = r14.bottom
            if (r9 > r12) goto L_0x014d
            if (r7 < r12) goto L_0x0151
        L_0x014d:
            if (r7 <= r11) goto L_0x0151
            r7 = -1
            goto L_0x0152
        L_0x0151:
            r7 = 0
        L_0x0152:
            if (r2 == r4) goto L_0x018a
            if (r2 == r13) goto L_0x0182
            if (r2 == r8) goto L_0x017f
            if (r2 == r10) goto L_0x017c
            r6 = 66
            if (r2 == r6) goto L_0x0179
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0165
            if (r7 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x0165:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r0 = defpackage.ms2.e(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0179:
            if (r5 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x017c:
            if (r7 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x017f:
            if (r5 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x0182:
            if (r7 > 0) goto L_0x0193
            if (r7 != 0) goto L_0x0192
            int r5 = r5 * r6
            if (r5 <= 0) goto L_0x0192
            goto L_0x0193
        L_0x018a:
            if (r7 < 0) goto L_0x0193
            if (r7 != 0) goto L_0x0192
            int r5 = r5 * r6
            if (r5 >= 0) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r4 = 0
        L_0x0193:
            if (r4 == 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x019a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.c1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.c1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.g1 = x;
            this.e1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.h1 = y;
            this.f1 = y;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.B0;
        if (aVar != null) {
            return aVar.s();
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.B0;
        if (aVar != null) {
            return aVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public hdc getAdapter() {
        return this.A0;
    }

    public int getBaseline() {
        a aVar = this.B0;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.v0;
    }

    public fec getCompatAccessibilityDelegate() {
        return this.z1;
    }

    public ldc getEdgeEffectFactory() {
        return this.V0;
    }

    public mdc getItemAnimator() {
        return this.a1;
    }

    public int getItemDecorationCount() {
        return this.D0.size();
    }

    public a getLayoutManager() {
        return this.B0;
    }

    public int getMaxFlingVelocity() {
        return this.l1;
    }

    public int getMinFlingVelocity() {
        return this.k1;
    }

    public long getNanoTime() {
        if (R1) {
            return System.nanoTime();
        }
        return 0;
    }

    public rdc getOnFlingListener() {
        return this.j1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o1;
    }

    public b getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.b1;
    }

    public void h0() {
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(dec dec) {
        View view = dec.a;
        boolean z = view.getParent() == this;
        this.c.k(T(view));
        if (dec.r()) {
            this.t0.g(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.t0.a(-1, view, true);
        } else {
            l0f l0f = this.t0;
            int indexOfChild = ((RecyclerView) ((sy4) l0f.o).b).indexOfChild(view);
            if (indexOfChild >= 0) {
                ((g03) l0f.X).b0(indexOfChild);
                l0f.E(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void i0() {
        if (!this.y1 && this.G0) {
            WeakHashMap weakHashMap = zmf.a;
            postOnAnimation(this.G1);
            this.y1 = true;
        }
    }

    public final boolean isAttachedToWindow() {
        return this.G0;
    }

    public final boolean isLayoutSuppressed() {
        return this.L0;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(ndc ndc) {
        a aVar = this.B0;
        if (aVar != null) {
            aVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.D0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(ndc);
        b0();
        requestLayout();
    }

    public final void j0() {
        boolean z;
        boolean z2 = false;
        if (this.R0) {
            x8 x8Var = this.s0;
            x8Var.M((ArrayList) x8Var.c);
            x8Var.M((ArrayList) x8Var.o);
            x8Var.a = 0;
            if (this.S0) {
                this.B0.e0();
            }
        }
        if (this.a1 == null || !this.B0.K0()) {
            this.s0.m();
        } else {
            this.s0.K();
        }
        boolean z3 = this.v1 || this.w1;
        boolean z4 = this.I0 && this.a1 != null && ((z = this.R0) || z3 || this.B0.f) && (!z || this.A0.b);
        zdc zdc = this.s1;
        zdc.k = z4;
        if (z4 && z3 && !this.R0 && this.a1 != null && this.B0.K0()) {
            z2 = true;
        }
        zdc.l = z2;
    }

    public final void k(qdc qdc) {
        if (this.Q0 == null) {
            this.Q0 = new ArrayList();
        }
        this.Q0.add(qdc);
    }

    public final void k0(boolean z) {
        this.S0 = z | this.S0;
        this.R0 = true;
        int D = this.t0.D();
        for (int i = 0; i < D; i++) {
            dec U = U(this.t0.C(i));
            if (U != null && !U.w()) {
                U.f(6);
            }
        }
        b0();
        vdc vdc = this.c;
        int size = vdc.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            dec dec = (dec) vdc.c.get(i2);
            if (dec != null) {
                dec.f(6);
                dec.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
        }
        hdc hdc = vdc.h.A0;
        if (hdc == null || !hdc.b) {
            vdc.e();
        }
    }

    public final void l(sdc sdc) {
        this.E0.add(sdc);
    }

    public final void l0(dec dec, jt jtVar) {
        dec.u0 &= -8193;
        boolean z = this.s1.i;
        djb djb = this.u0;
        if (z && dec.s() && !dec.p() && !dec.w()) {
            ((wv7) djb.c).f(Q(dec), dec);
        }
        qpd qpd = (qpd) djb.b;
        inf inf = (inf) qpd.get(dec);
        if (inf == null) {
            inf = inf.a();
            qpd.put(dec, inf);
        }
        inf.b = jtVar;
        inf.a |= 4;
    }

    public void m(tdc tdc) {
        if (this.u1 == null) {
            this.u1 = new ArrayList();
        }
        this.u1.add(tdc);
    }

    public final int m0(int i, float f) {
        float height = f / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect = this.W0;
        float f2 = 0.0f;
        if (edgeEffect == null || kp.k(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Y0;
            if (!(edgeEffect2 == null || kp.k(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.Y0.onRelease();
                } else {
                    float q = kp.q(this.Y0, width, height);
                    if (kp.k(this.Y0) == 0.0f) {
                        this.Y0.onRelease();
                    }
                    f2 = q;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.W0.onRelease();
            } else {
                float f3 = -kp.q(this.W0, -width, 1.0f - height);
                if (kp.k(this.W0) == 0.0f) {
                    this.W0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getWidth()));
    }

    public final void n(String str) {
        if (Z()) {
            if (str == null) {
                throw new IllegalStateException(ms2.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.U0 > 0) {
            new IllegalStateException(ms2.e(this, new StringBuilder("")));
        }
    }

    public final int n0(int i, float f) {
        float width = f / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect = this.X0;
        float f2 = 0.0f;
        if (edgeEffect == null || kp.k(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Z0;
            if (!(edgeEffect2 == null || kp.k(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.Z0.onRelease();
                } else {
                    float q = kp.q(this.Z0, height, 1.0f - width);
                    if (kp.k(this.Z0) == 0.0f) {
                        this.Z0.onRelease();
                    }
                    f2 = q;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.X0.onRelease();
            } else {
                float f3 = -kp.q(this.X0, -height, width);
                if (kp.k(this.X0) == 0.0f) {
                    this.X0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getHeight()));
    }

    public final void o0() {
        mdc mdc = this.a1;
        if (mdc != null) {
            mdc.e();
        }
        a aVar = this.B0;
        if (aVar != null) {
            aVar.r0(this.c);
            this.B0.s0(this.c);
        }
        vdc vdc = this.c;
        vdc.a.clear();
        vdc.e();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [ca6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r1 >= 30.0f) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.T0 = r0
            r1 = 1
            r5.G0 = r1
            boolean r2 = r5.I0
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.I0 = r2
            vdc r2 = r5.c
            r2.d()
            androidx.recyclerview.widget.a r2 = r5.B0
            if (r2 == 0) goto L_0x0026
            r2.g = r1
            r2.W(r5)
        L_0x0026:
            r5.y1 = r0
            boolean r0 = R1
            if (r0 == 0) goto L_0x0091
            java.lang.ThreadLocal r0 = defpackage.ca6.X
            java.lang.Object r1 = r0.get()
            ca6 r1 = (defpackage.ca6) r1
            r5.q1 = r1
            if (r1 != 0) goto L_0x0074
            ca6 r1 = new ca6
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.o = r2
            r5.q1 = r1
            java.util.WeakHashMap r1 = defpackage.zmf.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0068:
            ca6 r2 = r5.q1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L_0x0074:
            ca6 r0 = r5.q1
            r0.getClass()
            boolean r1 = L1
            java.util.ArrayList r0 = r0.a
            if (r1 == 0) goto L_0x008e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView already present in worker list!"
            r5.<init>(r0)
            throw r5
        L_0x008e:
            r0.add(r5)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        ca6 ca6;
        super.onDetachedFromWindow();
        mdc mdc = this.a1;
        if (mdc != null) {
            mdc.e();
        }
        E0();
        int i = 0;
        this.G0 = false;
        a aVar = this.B0;
        if (aVar != null) {
            aVar.g = false;
            aVar.X(this);
        }
        this.F1.clear();
        removeCallbacks(this.G1);
        this.u0.getClass();
        do {
        } while (inf.d.f() != null);
        vdc vdc = this.c;
        for (int i2 = 0; i2 < vdc.c.size(); i2++) {
            r5b.a(((dec) vdc.c.get(i2)).a);
        }
        hdc hdc = vdc.h.A0;
        b bVar = vdc.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(hdc, false);
        }
        int i3 = r5b.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                int i5 = r5b.a;
                s5b s5b = (s5b) childAt.getTag(i5);
                if (s5b == null) {
                    s5b = new s5b();
                    childAt.setTag(i5, s5b);
                }
                ArrayList arrayList = s5b.a;
                int L = y53.L(arrayList);
                if (-1 >= L) {
                    i = i4;
                } else {
                    au1.r(arrayList.get(L));
                    throw null;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (R1 && (ca6 = this.q1) != null) {
            boolean remove = ca6.a.remove(this);
            if (!L1 || remove) {
                this.q1 = null;
                return;
            }
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ndc) arrayList.get(i)).g(canvas, this, this.s1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            androidx.recyclerview.widget.a r0 = r6.B0
            r8 = 0
            if (r0 != 0) goto L_0x000a
            return r8
        L_0x000a:
            boolean r0 = r6.L0
            if (r0 == 0) goto L_0x000f
            return r8
        L_0x000f:
            int r0 = r17.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00ef
            int r0 = r17.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0042
            androidx.recyclerview.widget.a r0 = r6.B0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0030
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            androidx.recyclerview.widget.a r2 = r6.B0
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0040
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0068
        L_0x0040:
            r2 = r1
            goto L_0x0068
        L_0x0042:
            int r0 = r17.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0066
            r0 = 26
            float r0 = r7.getAxisValue(r0)
            androidx.recyclerview.widget.a r2 = r6.B0
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x005b
            float r0 = -r0
            goto L_0x0040
        L_0x005b:
            androidx.recyclerview.widget.a r2 = r6.B0
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0066
            r2 = r0
            r0 = r1
            goto L_0x0068
        L_0x0066:
            r0 = r1
            r2 = r0
        L_0x0068:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00ef
        L_0x0070:
            float r1 = r6.m1
            float r2 = r2 * r1
            int r1 = (int) r2
            float r2 = r6.n1
            float r0 = r0 * r2
            int r0 = (int) r0
            androidx.recyclerview.widget.a r2 = r6.B0
            if (r2 != 0) goto L_0x007e
            goto L_0x00ef
        L_0x007e:
            boolean r3 = r6.L0
            if (r3 == 0) goto L_0x0084
            goto L_0x00ef
        L_0x0084:
            int[] r9 = r6.E1
            r9[r8] = r8
            r10 = 1
            r9[r10] = r8
            boolean r11 = r2.e()
            androidx.recyclerview.widget.a r2 = r6.B0
            boolean r12 = r2.f()
            if (r12 == 0) goto L_0x009a
            r2 = r11 | 2
            goto L_0x009b
        L_0x009a:
            r2 = r11
        L_0x009b:
            float r3 = r17.getY()
            float r4 = r17.getX()
            int r3 = r6.m0(r1, r3)
            int r13 = r1 - r3
            int r1 = r6.n0(r0, r4)
            int r14 = r0 - r1
            jn9 r0 = r16.getScrollingChildHelper()
            r15 = 1
            r0.h(r2, r15)
            if (r11 == 0) goto L_0x00bb
            r1 = r13
            goto L_0x00bc
        L_0x00bb:
            r1 = r8
        L_0x00bc:
            if (r12 == 0) goto L_0x00c0
            r2 = r14
            goto L_0x00c1
        L_0x00c0:
            r2 = r8
        L_0x00c1:
            int[] r4 = r6.E1
            int[] r5 = r6.C1
            r0 = r16
            r3 = r15
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d4
            r0 = r9[r8]
            int r13 = r13 - r0
            r0 = r9[r10]
            int r14 = r14 - r0
        L_0x00d4:
            if (r11 == 0) goto L_0x00d8
            r0 = r13
            goto L_0x00d9
        L_0x00d8:
            r0 = r8
        L_0x00d9:
            if (r12 == 0) goto L_0x00dd
            r1 = r14
            goto L_0x00de
        L_0x00dd:
            r1 = r8
        L_0x00de:
            r6.v0(r0, r1, r7, r15)
            ca6 r0 = r6.q1
            if (r0 == 0) goto L_0x00ec
            if (r13 != 0) goto L_0x00e9
            if (r14 == 0) goto L_0x00ec
        L_0x00e9:
            r0.a(r6, r13, r14)
        L_0x00ec:
            r6.a(r15)
        L_0x00ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.L0) {
            return false;
        }
        this.F0 = null;
        if (J(motionEvent)) {
            u0();
            setScrollState(0);
            return true;
        }
        a aVar = this.B0;
        if (aVar == null) {
            return false;
        }
        boolean e = aVar.e();
        boolean f = this.B0.f();
        if (this.d1 == null) {
            this.d1 = VelocityTracker.obtain();
        }
        this.d1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.M0) {
                this.M0 = false;
            }
            this.c1 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.g1 = x;
            this.e1 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.h1 = y;
            this.f1 = y;
            EdgeEffect edgeEffect = this.W0;
            if (edgeEffect == null || kp.k(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                kp.q(this.W0, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.Y0;
            if (!(edgeEffect2 == null || kp.k(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
                kp.q(this.Y0, 0.0f, motionEvent.getY() / ((float) getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect3 = this.X0;
            if (!(edgeEffect3 == null || kp.k(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
                kp.q(this.X0, 0.0f, motionEvent.getX() / ((float) getWidth()));
                z = true;
            }
            EdgeEffect edgeEffect4 = this.Z0;
            if (!(edgeEffect4 == null || kp.k(edgeEffect4) == 0.0f || canScrollVertically(1))) {
                kp.q(this.Z0, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
                z = true;
            }
            if (z || this.b1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                a(1);
            }
            int[] iArr = this.D1;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f) {
                e |= true;
            }
            getScrollingChildHelper().h(e ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.d1.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c1);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.b1 != 1) {
                int i = x2 - this.e1;
                int i2 = y2 - this.f1;
                if (!e || Math.abs(i) <= this.i1) {
                    z2 = false;
                } else {
                    this.g1 = x2;
                    z2 = true;
                }
                if (f && Math.abs(i2) > this.i1) {
                    this.h1 = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            u0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.c1 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.g1 = x3;
            this.e1 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.h1 = y3;
            this.f1 = y3;
        } else if (actionMasked == 6) {
            g0(motionEvent);
        }
        return this.b1 == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        v();
        Trace.endSection();
        this.I0 = true;
    }

    public void onMeasure(int i, int i2) {
        a aVar = this.B0;
        if (aVar == null) {
            t(i, i2);
            return;
        }
        boolean Q = aVar.Q();
        boolean z = false;
        zdc zdc = this.s1;
        if (Q) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.B0.b.t(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.H1 = z;
            if (!z && this.A0 != null) {
                if (zdc.e == 1) {
                    w();
                }
                this.B0.B0(i, i2);
                zdc.j = true;
                x();
                this.B0.D0(i, i2);
                if (this.B0.G0()) {
                    this.B0.B0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    zdc.j = true;
                    x();
                    this.B0.D0(i, i2);
                }
                this.I1 = getMeasuredWidth();
                this.J1 = getMeasuredHeight();
            }
        } else if (this.H0) {
            this.B0.b.t(i, i2);
        } else {
            if (this.O0) {
                C0();
                e0();
                j0();
                f0(true);
                if (zdc.l) {
                    zdc.h = true;
                } else {
                    this.s0.m();
                    zdc.h = false;
                }
                this.O0 = false;
                D0(false);
            } else if (zdc.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            hdc hdc = this.A0;
            if (hdc != null) {
                zdc.f = hdc.j();
            } else {
                zdc.f = 0;
            }
            C0();
            this.B0.b.t(i, i2);
            D0(false);
            zdc.h = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Z()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xdc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xdc xdc = (xdc) parcelable;
        this.o = xdc;
        super.onRestoreInstanceState(xdc.a);
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, xdc, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        xdc xdc = this.o;
        if (xdc != null) {
            zVar.c = xdc.c;
        } else {
            a aVar = this.B0;
            if (aVar != null) {
                zVar.c = aVar.m0();
            } else {
                zVar.c = null;
            }
        }
        return zVar;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.Z0 = null;
            this.X0 = null;
            this.Y0 = null;
            this.W0 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            boolean r0 = r6.L0
            r8 = 0
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r6.M0
            if (r0 == 0) goto L_0x000f
            goto L_0x01fa
        L_0x000f:
            sdc r0 = r6.F0
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r21.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = r8
            goto L_0x0031
        L_0x001d:
            boolean r0 = r20.J(r21)
            goto L_0x0031
        L_0x0022:
            r0.a(r7)
            int r0 = r21.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.F0 = r0
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r20.u0()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.a r0 = r6.B0
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.e()
            androidx.recyclerview.widget.a r0 = r6.B0
            boolean r11 = r0.f()
            android.view.VelocityTracker r0 = r6.d1
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.d1 = r0
        L_0x0053:
            int r0 = r21.getActionMasked()
            int r2 = r21.getActionIndex()
            int[] r12 = r6.D1
            if (r0 != 0) goto L_0x0063
            r12[r9] = r8
            r12[r8] = r8
        L_0x0063:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r21)
            r3 = r12[r8]
            float r3 = (float) r3
            r4 = r12[r9]
            float r4 = (float) r4
            r13.offsetLocation(r3, r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01cc
            if (r0 == r9) goto L_0x018b
            r4 = 2
            if (r0 == r4) goto L_0x00ac
            if (r0 == r1) goto L_0x00a4
            r1 = 5
            if (r0 == r1) goto L_0x0088
            r1 = 6
            if (r0 == r1) goto L_0x0083
            goto L_0x01f1
        L_0x0083:
            r20.g0(r21)
            goto L_0x01f1
        L_0x0088:
            int r0 = r7.getPointerId(r2)
            r6.c1 = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.g1 = r0
            r6.e1 = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.h1 = r0
            r6.f1 = r0
            goto L_0x01f1
        L_0x00a4:
            r20.u0()
            r6.setScrollState(r8)
            goto L_0x01f1
        L_0x00ac:
            int r0 = r6.c1
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b5
            return r8
        L_0x00b5:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r15 = (int) r0
            int r0 = r6.g1
            int r0 = r0 - r14
            int r1 = r6.h1
            int r1 = r1 - r15
            int r2 = r6.b1
            if (r2 == r9) goto L_0x00fe
            if (r10 == 0) goto L_0x00e2
            if (r0 <= 0) goto L_0x00d7
            int r2 = r6.i1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00de
        L_0x00d7:
            int r2 = r6.i1
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00de:
            if (r0 == 0) goto L_0x00e2
            r2 = r9
            goto L_0x00e3
        L_0x00e2:
            r2 = r8
        L_0x00e3:
            if (r11 == 0) goto L_0x00f9
            if (r1 <= 0) goto L_0x00ef
            int r3 = r6.i1
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f6
        L_0x00ef:
            int r3 = r6.i1
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f6:
            if (r1 == 0) goto L_0x00f9
            r2 = r9
        L_0x00f9:
            if (r2 == 0) goto L_0x00fe
            r6.setScrollState(r9)
        L_0x00fe:
            int r2 = r6.b1
            if (r2 != r9) goto L_0x01f1
            int[] r5 = r6.E1
            r5[r8] = r8
            r5[r9] = r8
            float r2 = r21.getY()
            int r2 = r6.m0(r0, r2)
            int r16 = r0 - r2
            float r0 = r21.getX()
            int r0 = r6.n0(r1, r0)
            int r17 = r1 - r0
            if (r10 == 0) goto L_0x0121
            r1 = r16
            goto L_0x0122
        L_0x0121:
            r1 = r8
        L_0x0122:
            if (r11 == 0) goto L_0x0127
            r2 = r17
            goto L_0x0128
        L_0x0127:
            r2 = r8
        L_0x0128:
            r3 = 0
            int[] r4 = r6.E1
            int[] r0 = r6.C1
            r18 = r0
            r0 = r20
            r19 = r5
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            int[] r1 = r6.C1
            if (r0 == 0) goto L_0x015a
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r20.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015a:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.g1 = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.h1 = r15
            if (r10 == 0) goto L_0x016c
            r1 = r0
            goto L_0x016d
        L_0x016c:
            r1 = r8
        L_0x016d:
            if (r11 == 0) goto L_0x0171
            r3 = r2
            goto L_0x0172
        L_0x0171:
            r3 = r8
        L_0x0172:
            boolean r1 = r6.v0(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x017f
            android.view.ViewParent r1 = r20.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017f:
            ca6 r1 = r6.q1
            if (r1 == 0) goto L_0x01f1
            if (r0 != 0) goto L_0x0187
            if (r2 == 0) goto L_0x01f1
        L_0x0187:
            r1.a(r6, r0, r2)
            goto L_0x01f1
        L_0x018b:
            android.view.VelocityTracker r0 = r6.d1
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.d1
            int r1 = r6.l1
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a7
            android.view.VelocityTracker r1 = r6.d1
            int r2 = r6.c1
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a8
        L_0x01a7:
            r1 = r0
        L_0x01a8:
            if (r11 == 0) goto L_0x01b4
            android.view.VelocityTracker r2 = r6.d1
            int r3 = r6.c1
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b5
        L_0x01b4:
            r2 = r0
        L_0x01b5:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01bd
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c5
        L_0x01bd:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.O(r0, r1)
            if (r0 != 0) goto L_0x01c8
        L_0x01c5:
            r6.setScrollState(r8)
        L_0x01c8:
            r20.u0()
            goto L_0x01f6
        L_0x01cc:
            int r0 = r7.getPointerId(r8)
            r6.c1 = r0
            float r0 = r21.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.g1 = r0
            r6.e1 = r0
            float r0 = r21.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.h1 = r0
            r6.f1 = r0
            if (r11 == 0) goto L_0x01ea
            r10 = r10 | 2
        L_0x01ea:
            jn9 r0 = r20.getScrollingChildHelper()
            r0.h(r10, r8)
        L_0x01f1:
            android.view.VelocityTracker r0 = r6.d1
            r0.addMovement(r13)
        L_0x01f6:
            r13.recycle()
            return r9
        L_0x01fa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        int D = this.t0.D();
        for (int i = 0; i < D; i++) {
            dec U = U(this.t0.C(i));
            if (!U.w()) {
                U.o = -1;
                U.Z = -1;
            }
        }
        vdc vdc = this.c;
        int size = vdc.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            dec dec = (dec) vdc.c.get(i2);
            dec.o = -1;
            dec.Z = -1;
        }
        int size2 = vdc.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            dec dec2 = (dec) vdc.a.get(i3);
            dec2.o = -1;
            dec2.Z = -1;
        }
        ArrayList arrayList = vdc.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                dec dec3 = (dec) vdc.b.get(i4);
                dec3.o = -1;
                dec3.Z = -1;
            }
        }
    }

    public final void p0(ndc ndc) {
        a aVar = this.B0;
        if (aVar != null) {
            aVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.D0;
        arrayList.remove(ndc);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        b0();
        requestLayout();
    }

    public final void q(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.W0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.W0.onRelease();
            z = this.W0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Y0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Y0.onRelease();
            z |= this.Y0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.X0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.X0.onRelease();
            z |= this.X0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Z0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.Z0.onRelease();
            z |= this.Z0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public final void q0(qdc qdc) {
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            arrayList.remove(qdc);
        }
    }

    public final void r0(sdc sdc) {
        this.E0.remove(sdc);
        if (this.F0 == sdc) {
            this.F0 = null;
        }
    }

    public final void removeDetachedView(View view, boolean z) {
        dec U = U(view);
        if (U != null) {
            if (U.r()) {
                U.u0 &= -257;
            } else if (!U.w()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(U);
                throw new IllegalArgumentException(ms2.e(this, sb));
            }
        } else if (L1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(ms2.e(this, sb2));
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z);
    }

    public final void requestChildFocus(View view, View view2) {
        yh7 yh7 = this.B0.e;
        if ((yh7 == null || !yh7.e) && !Z() && view2 != null) {
            t0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.B0.v0(this, view, rect, z, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sdc) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.J0 != 0 || this.L0) {
            this.K0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (!this.I0 || this.R0) {
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
        } else if (this.s0.D()) {
            x8 x8Var = this.s0;
            int i = x8Var.a;
            if ((i & 4) != 0 && (i & 11) == 0) {
                Trace.beginSection("RV PartialInvalidate");
                C0();
                e0();
                this.s0.K();
                if (!this.K0) {
                    int z = this.t0.z();
                    int i2 = 0;
                    while (true) {
                        if (i2 < z) {
                            dec U = U(this.t0.y(i2));
                            if (U != null && !U.w() && U.s()) {
                                v();
                                break;
                            }
                            i2++;
                        } else {
                            this.s0.l();
                            break;
                        }
                    }
                }
                D0(true);
                f0(true);
                Trace.endSection();
            } else if (x8Var.D()) {
                Trace.beginSection("RV FullInvalidate");
                v();
                Trace.endSection();
            }
        }
    }

    public void s0(tdc tdc) {
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            arrayList.remove(tdc);
        }
    }

    public final void scrollBy(int i, int i2) {
        a aVar = this.B0;
        if (aVar != null && !this.L0) {
            boolean e = aVar.e();
            boolean f = this.B0.f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                v0(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (Z()) {
            int i = 0;
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.N0 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(fec fec) {
        this.z1 = fec;
        zmf.j(this, fec);
    }

    public void setAdapter(hdc hdc) {
        setLayoutFrozen(false);
        y0(hdc, false, true);
        k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(kdc kdc) {
        if (kdc != null) {
            setChildrenDrawingOrderEnabled(kdc != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.v0) {
            this.Z0 = null;
            this.X0 = null;
            this.Y0 = null;
            this.W0 = null;
        }
        this.v0 = z;
        super.setClipToPadding(z);
        if (this.I0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(ldc ldc) {
        ldc.getClass();
        this.V0 = ldc;
        this.Z0 = null;
        this.X0 = null;
        this.Y0 = null;
        this.W0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.H0 = z;
    }

    public void setItemAnimator(mdc mdc) {
        mdc mdc2 = this.a1;
        if (mdc2 != null) {
            mdc2.e();
            this.a1.a = null;
        }
        this.a1 = mdc;
        if (mdc != null) {
            mdc.a = this.x1;
        }
    }

    public void setItemViewCacheSize(int i) {
        vdc vdc = this.c;
        vdc.e = i;
        vdc.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(a aVar) {
        sy4 sy4;
        if (aVar != this.B0) {
            E0();
            if (this.B0 != null) {
                mdc mdc = this.a1;
                if (mdc != null) {
                    mdc.e();
                }
                this.B0.r0(this.c);
                this.B0.s0(this.c);
                vdc vdc = this.c;
                vdc.a.clear();
                vdc.e();
                if (this.G0) {
                    a aVar2 = this.B0;
                    aVar2.g = false;
                    aVar2.X(this);
                }
                this.B0.E0((RecyclerView) null);
                this.B0 = null;
            } else {
                vdc vdc2 = this.c;
                vdc2.a.clear();
                vdc2.e();
            }
            l0f l0f = this.t0;
            ((g03) l0f.X).a0();
            ArrayList arrayList = (ArrayList) l0f.Y;
            int size = arrayList.size() - 1;
            while (true) {
                sy4 = (sy4) l0f.o;
                if (size < 0) {
                    break;
                }
                sy4.getClass();
                dec U = U((View) arrayList.get(size));
                if (U != null) {
                    int i = U.A0;
                    RecyclerView recyclerView = (RecyclerView) sy4.b;
                    if (recyclerView.Z()) {
                        U.B0 = i;
                        recyclerView.F1.add(U);
                    } else {
                        WeakHashMap weakHashMap = zmf.a;
                        U.a.setImportantForAccessibility(i);
                    }
                    U.A0 = 0;
                }
                arrayList.remove(size);
                size--;
            }
            RecyclerView recyclerView2 = (RecyclerView) sy4.b;
            int childCount = recyclerView2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView2.getChildAt(i2);
                recyclerView2.u(childAt);
                childAt.clearAnimation();
            }
            recyclerView2.removeAllViews();
            this.B0 = aVar;
            if (aVar != null) {
                if (aVar.b == null) {
                    aVar.E0(this);
                    if (this.G0) {
                        a aVar3 = this.B0;
                        aVar3.g = true;
                        aVar3.W(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(aVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(ms2.e(aVar.b, sb));
                }
            }
            this.c.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        jn9 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = zmf.a;
            omf.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(rdc rdc) {
        this.j1 = rdc;
    }

    @Deprecated
    public void setOnScrollListener(tdc tdc) {
        this.t1 = tdc;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.o1 = z;
    }

    public void setRecycledViewPool(b bVar) {
        vdc vdc = this.c;
        RecyclerView recyclerView = vdc.h;
        hdc hdc = recyclerView.A0;
        b bVar2 = vdc.g;
        if (bVar2 != null) {
            bVar2.detachForPoolingContainer(hdc, false);
        }
        b bVar3 = vdc.g;
        if (bVar3 != null) {
            bVar3.detach();
        }
        vdc.g = bVar;
        if (!(bVar == null || recyclerView.getAdapter() == null)) {
            vdc.g.attach();
        }
        vdc.d();
    }

    @Deprecated
    public void setRecyclerListener(wdc wdc) {
    }

    public void setScrollState(int i) {
        yh7 yh7;
        if (i != this.b1) {
            if (M1) {
                new Exception();
            }
            this.b1 = i;
            if (i != 2) {
                cec cec = this.p1;
                cec.Z.removeCallbacks(cec);
                cec.c.abortAnimation();
                a aVar = this.B0;
                if (!(aVar == null || (yh7 = aVar.e) == null)) {
                    yh7.l();
                }
            }
            a aVar2 = this.B0;
            if (aVar2 != null) {
                aVar2.n0(i);
            }
            h0();
            tdc tdc = this.t1;
            if (tdc != null) {
                tdc.a(this, i);
            }
            ArrayList arrayList = this.u1;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((tdc) this.u1.get(size)).a(this, i);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.i1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.i1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(bec bec) {
        this.c.getClass();
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public final void suppressLayout(boolean z) {
        if (z != this.L0) {
            n("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.L0 = false;
                if (!(!this.K0 || this.B0 == null || this.A0 == null)) {
                    requestLayout();
                }
                this.K0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.L0 = true;
            this.M0 = true;
            E0();
        }
    }

    public final void t(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = zmf.a;
        setMeasuredDimension(a.h(i, paddingRight, getMinimumWidth()), a.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void t0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.x0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof pdc) {
            pdc pdc = (pdc) layoutParams;
            if (!pdc.c) {
                int i = rect.left;
                Rect rect2 = pdc.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.B0.v0(this, view, this.x0, !this.I0, view2 == null);
    }

    public final void u(View view) {
        dec U = U(view);
        hdc hdc = this.A0;
        if (!(hdc == null || U == null)) {
            hdc.x(U);
        }
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qdc) this.Q0.get(size)).b(view);
            }
        }
    }

    public final void u0() {
        VelocityTracker velocityTracker = this.d1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        a(0);
        EdgeEffect edgeEffect = this.W0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.W0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.X0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.X0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Y0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.Y0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Z0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.Z0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0319, code lost:
        if (((java.util.ArrayList) r0.t0.Y).contains(getFocusedChild()) == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0343, code lost:
        if (r3.hasFocusable() != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0346, code lost:
        r6 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r17 = this;
            r0 = r17
            hdc r1 = r0.A0
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.recyclerview.widget.a r1 = r0.B0
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            zdc r1 = r0.s1
            r2 = 0
            r1.j = r2
            boolean r3 = r0.H1
            r4 = 1
            if (r3 == 0) goto L_0x0028
            int r3 = r0.I1
            int r5 = r17.getWidth()
            if (r3 != r5) goto L_0x0026
            int r3 = r0.J1
            int r5 = r17.getHeight()
            if (r3 == r5) goto L_0x0028
        L_0x0026:
            r3 = r4
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            r0.I1 = r2
            r0.J1 = r2
            r0.H1 = r2
            int r5 = r1.e
            if (r5 != r4) goto L_0x003f
            r17.w()
            androidx.recyclerview.widget.a r3 = r0.B0
            r3.A0(r0)
            r17.x()
            goto L_0x007b
        L_0x003f:
            x8 r5 = r0.s0
            java.lang.Object r6 = r5.o
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0056
            java.lang.Object r5 = r5.c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            if (r3 != 0) goto L_0x0073
            androidx.recyclerview.widget.a r3 = r0.B0
            int r3 = r3.n
            int r5 = r17.getWidth()
            if (r3 != r5) goto L_0x0073
            androidx.recyclerview.widget.a r3 = r0.B0
            int r3 = r3.o
            int r5 = r17.getHeight()
            if (r3 == r5) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            androidx.recyclerview.widget.a r3 = r0.B0
            r3.A0(r0)
            goto L_0x007b
        L_0x0073:
            androidx.recyclerview.widget.a r3 = r0.B0
            r3.A0(r0)
            r17.x()
        L_0x007b:
            r3 = 4
            r1.a(r3)
            r17.C0()
            r17.e0()
            r1.e = r4
            boolean r5 = r1.k
            r6 = 0
            djb r7 = r0.u0
            if (r5 == 0) goto L_0x0277
            l0f r5 = r0.t0
            int r5 = r5.z()
            int r5 = r5 - r4
        L_0x0095:
            if (r5 < 0) goto L_0x01a3
            l0f r8 = r0.t0
            android.view.View r8 = r8.y(r5)
            dec r8 = U(r8)
            boolean r9 = r8.w()
            if (r9 == 0) goto L_0x00a9
            goto L_0x019f
        L_0x00a9:
            long r9 = r0.Q(r8)
            mdc r11 = r0.a1
            r11.getClass()
            jt r11 = new jt
            r12 = 7
            r11.<init>(r12)
            r11.c(r8)
            java.lang.Object r12 = r7.c
            wv7 r12 = (defpackage.wv7) r12
            java.lang.Object r12 = r12.c(r9)
            dec r12 = (defpackage.dec) r12
            if (r12 == 0) goto L_0x019c
            boolean r13 = r12.w()
            if (r13 != 0) goto L_0x019c
            java.lang.Object r13 = r7.b
            qpd r13 = (defpackage.qpd) r13
            java.lang.Object r14 = r13.get(r12)
            inf r14 = (defpackage.inf) r14
            if (r14 == 0) goto L_0x00e0
            int r14 = r14.a
            r14 = r14 & r4
            if (r14 == 0) goto L_0x00e0
            r14 = r4
            goto L_0x00e1
        L_0x00e0:
            r14 = r2
        L_0x00e1:
            java.lang.Object r13 = r13.get(r8)
            inf r13 = (defpackage.inf) r13
            if (r13 == 0) goto L_0x00f0
            int r13 = r13.a
            r13 = r13 & r4
            if (r13 == 0) goto L_0x00f0
            r13 = r4
            goto L_0x00f1
        L_0x00f0:
            r13 = r2
        L_0x00f1:
            if (r14 == 0) goto L_0x00fa
            if (r12 != r8) goto L_0x00fa
            r7.b(r8, r11)
            goto L_0x019f
        L_0x00fa:
            jt r15 = r7.l(r12, r3)
            r7.b(r8, r11)
            r11 = 8
            jt r11 = r7.l(r8, r11)
            if (r15 != 0) goto L_0x0172
            l0f r11 = r0.t0
            int r11 = r11.z()
            r13 = r2
        L_0x0110:
            if (r13 >= r11) goto L_0x0168
            l0f r14 = r0.t0
            android.view.View r14 = r14.y(r13)
            dec r14 = U(r14)
            if (r14 != r8) goto L_0x011f
            goto L_0x0165
        L_0x011f:
            long r15 = r0.Q(r14)
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0165
            hdc r1 = r0.A0
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x014b
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x014b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r0 = defpackage.ms2.e(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x014b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r0 = defpackage.ms2.e(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0165:
            int r13 = r13 + 1
            goto L_0x0110
        L_0x0168:
            java.util.Objects.toString(r12)
            java.util.Objects.toString(r8)
            r17.F()
            goto L_0x019f
        L_0x0172:
            r12.v(r2)
            if (r14 == 0) goto L_0x017a
            r0.i(r12)
        L_0x017a:
            if (r12 == r8) goto L_0x0190
            if (r13 == 0) goto L_0x0181
            r0.i(r8)
        L_0x0181:
            r12.s0 = r8
            r0.i(r12)
            vdc r9 = r0.c
            r9.k(r12)
            r8.v(r2)
            r8.t0 = r12
        L_0x0190:
            mdc r9 = r0.a1
            boolean r8 = r9.a(r12, r8, r15, r11)
            if (r8 == 0) goto L_0x019f
            r17.i0()
            goto L_0x019f
        L_0x019c:
            r7.b(r8, r11)
        L_0x019f:
            int r5 = r5 + -1
            goto L_0x0095
        L_0x01a3:
            java.lang.Object r3 = r7.b
            qpd r3 = (defpackage.qpd) r3
            int r5 = r3.c
            int r5 = r5 - r4
        L_0x01aa:
            if (r5 < 0) goto L_0x0277
            java.lang.Object r8 = r3.f(r5)
            r10 = r8
            dec r10 = (defpackage.dec) r10
            java.lang.Object r8 = r3.g(r5)
            inf r8 = (defpackage.inf) r8
            int r9 = r8.a
            r11 = r9 & 3
            r12 = 3
            ey1 r13 = r0.K1
            if (r11 != r12) goto L_0x01d1
            java.lang.Object r9 = r13.b
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            androidx.recyclerview.widget.a r11 = r9.B0
            android.view.View r10 = r10.a
            vdc r9 = r9.c
            r11.t0(r10, r9)
            goto L_0x0266
        L_0x01d1:
            r11 = r9 & 1
            if (r11 == 0) goto L_0x01ef
            jt r9 = r8.b
            if (r9 != 0) goto L_0x01e8
            java.lang.Object r9 = r13.b
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            androidx.recyclerview.widget.a r11 = r9.B0
            android.view.View r10 = r10.a
            vdc r9 = r9.c
            r11.t0(r10, r9)
            goto L_0x0266
        L_0x01e8:
            jt r11 = r8.c
            r13.p(r10, r9, r11)
            goto L_0x0266
        L_0x01ef:
            r11 = r9 & 14
            r12 = 14
            if (r11 != r12) goto L_0x01fe
            jt r9 = r8.b
            jt r11 = r8.c
            r13.o(r10, r9, r11)
            goto L_0x0266
        L_0x01fe:
            r11 = r9 & 12
            r12 = 12
            if (r11 != r12) goto L_0x0250
            jt r9 = r8.b
            jt r11 = r8.c
            r13.getClass()
            r10.v(r2)
            java.lang.Object r12 = r13.b
            r15 = r12
            androidx.recyclerview.widget.RecyclerView r15 = (androidx.recyclerview.widget.RecyclerView) r15
            boolean r12 = r15.R0
            if (r12 == 0) goto L_0x0223
            mdc r12 = r15.a1
            boolean r9 = r12.a(r10, r10, r9, r11)
            if (r9 == 0) goto L_0x024e
            r15.i0()
            goto L_0x024e
        L_0x0223:
            mdc r12 = r15.a1
            yb4 r12 = (defpackage.yb4) r12
            r12.getClass()
            int r13 = r9.b
            int r14 = r11.b
            if (r13 != r14) goto L_0x023c
            int r4 = r9.c
            int r2 = r11.c
            if (r4 == r2) goto L_0x0237
            goto L_0x023c
        L_0x0237:
            r12.c(r10)
            r2 = 0
            goto L_0x0249
        L_0x023c:
            int r2 = r9.c
            int r4 = r11.c
            r9 = r12
            r11 = r13
            r12 = r2
            r13 = r14
            r14 = r4
            boolean r2 = r9.g(r10, r11, r12, r13, r14)
        L_0x0249:
            if (r2 == 0) goto L_0x024e
            r15.i0()
        L_0x024e:
            r2 = 0
            goto L_0x0266
        L_0x0250:
            r2 = r9 & 4
            if (r2 == 0) goto L_0x025a
            jt r2 = r8.b
            r13.p(r10, r2, r6)
            goto L_0x024e
        L_0x025a:
            r2 = r9 & 8
            if (r2 == 0) goto L_0x024e
            jt r2 = r8.b
            jt r4 = r8.c
            r13.o(r10, r2, r4)
            goto L_0x024e
        L_0x0266:
            r8.a = r2
            r8.b = r6
            r8.c = r6
            u5b r2 = defpackage.inf.d
            r2.e(r8)
            int r5 = r5 + -1
            r2 = 0
            r4 = 1
            goto L_0x01aa
        L_0x0277:
            androidx.recyclerview.widget.a r2 = r0.B0
            vdc r3 = r0.c
            r2.s0(r3)
            int r2 = r1.f
            r1.c = r2
            r2 = 0
            r0.R0 = r2
            r0.S0 = r2
            r1.k = r2
            r1.l = r2
            androidx.recyclerview.widget.a r3 = r0.B0
            r3.f = r2
            vdc r3 = r0.c
            java.util.ArrayList r3 = r3.b
            if (r3 == 0) goto L_0x0298
            r3.clear()
        L_0x0298:
            androidx.recyclerview.widget.a r3 = r0.B0
            boolean r4 = r3.k
            if (r4 == 0) goto L_0x02a7
            r3.j = r2
            r3.k = r2
            vdc r3 = r0.c
            r3.l()
        L_0x02a7:
            androidx.recyclerview.widget.a r3 = r0.B0
            r3.k0(r1)
            r3 = 1
            r0.f0(r3)
            r0.D0(r2)
            java.lang.Object r3 = r7.b
            qpd r3 = (defpackage.qpd) r3
            r3.clear()
            java.lang.Object r3 = r7.c
            wv7 r3 = (defpackage.wv7) r3
            r3.a()
            int[] r3 = r0.A1
            r4 = r3[r2]
            r5 = 1
            r7 = r3[r5]
            r0.K(r3)
            r8 = r3[r2]
            if (r8 != r4) goto L_0x02d6
            r3 = r3[r5]
            if (r3 == r7) goto L_0x02d4
            goto L_0x02d6
        L_0x02d4:
            r3 = r2
            goto L_0x02d7
        L_0x02d6:
            r3 = 1
        L_0x02d7:
            if (r3 == 0) goto L_0x02dc
            r0.A(r2, r2)
        L_0x02dc:
            boolean r3 = r0.o1
            r4 = -1
            r7 = -1
            if (r3 == 0) goto L_0x03a4
            hdc r3 = r0.A0
            if (r3 == 0) goto L_0x03a4
            boolean r3 = r17.hasFocus()
            if (r3 == 0) goto L_0x03a4
            int r3 = r17.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r8) goto L_0x03a4
            int r3 = r17.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r8) goto L_0x0305
            boolean r3 = r17.isFocused()
            if (r3 == 0) goto L_0x0305
            goto L_0x03a4
        L_0x0305:
            boolean r3 = r17.isFocused()
            if (r3 != 0) goto L_0x031d
            android.view.View r3 = r17.getFocusedChild()
            l0f r8 = r0.t0
            java.lang.Object r8 = r8.Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r3 = r8.contains(r3)
            if (r3 != 0) goto L_0x031d
            goto L_0x03a4
        L_0x031d:
            long r8 = r1.n
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x032e
            hdc r3 = r0.A0
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x032e
            dec r3 = r0.N(r8)
            goto L_0x032f
        L_0x032e:
            r3 = r6
        L_0x032f:
            if (r3 == 0) goto L_0x0348
            l0f r8 = r0.t0
            java.lang.Object r8 = r8.Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            android.view.View r3 = r3.a
            boolean r8 = r8.contains(r3)
            if (r8 != 0) goto L_0x0348
            boolean r8 = r3.hasFocusable()
            if (r8 != 0) goto L_0x0346
            goto L_0x0348
        L_0x0346:
            r6 = r3
            goto L_0x038b
        L_0x0348:
            l0f r3 = r0.t0
            int r3 = r3.z()
            if (r3 <= 0) goto L_0x038b
            int r3 = r1.m
            if (r3 == r7) goto L_0x0355
            r2 = r3
        L_0x0355:
            int r3 = r1.b()
            r8 = r2
        L_0x035a:
            if (r8 >= r3) goto L_0x0370
            dec r9 = r0.M(r8)
            if (r9 != 0) goto L_0x0363
            goto L_0x0370
        L_0x0363:
            android.view.View r9 = r9.a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L_0x036d
            r6 = r9
            goto L_0x038b
        L_0x036d:
            int r8 = r8 + 1
            goto L_0x035a
        L_0x0370:
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 1
            int r2 = r2 - r3
        L_0x0376:
            if (r2 < 0) goto L_0x038b
            dec r3 = r0.M(r2)
            if (r3 != 0) goto L_0x037f
            goto L_0x038b
        L_0x037f:
            android.view.View r3 = r3.a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L_0x0388
            goto L_0x0346
        L_0x0388:
            int r2 = r2 + -1
            goto L_0x0376
        L_0x038b:
            if (r6 == 0) goto L_0x03a4
            int r0 = r1.o
            long r2 = (long) r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03a1
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x03a1
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L_0x03a1
            r6 = r0
        L_0x03a1:
            r6.requestFocus()
        L_0x03a4:
            r1.n = r4
            r1.m = r7
            r1.o = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.s()
            hdc r0 = r8.A0
            int[] r11 = r8.E1
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.w0(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList r0 = r8.D0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.C1
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r22
            r7 = r11
            r0.z(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r13
            goto L_0x005c
        L_0x005b:
            r0 = r12
        L_0x005c:
            int r2 = r8.g1
            int[] r4 = r8.C1
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.g1 = r2
            int r2 = r8.h1
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.h1 = r2
            int[] r2 = r8.D1
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0119
            if (r21 == 0) goto L_0x0116
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008c
            goto L_0x0116
        L_0x008c:
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b6
            r18.C()
            android.widget.EdgeEffect r6 = r8.W0
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            defpackage.kp.q(r6, r11, r4)
        L_0x00b4:
            r4 = 1
            goto L_0x00d1
        L_0x00b6:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r18.D()
            android.widget.EdgeEffect r6 = r8.Y0
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            defpackage.kp.q(r6, r11, r4)
            goto L_0x00b4
        L_0x00d0:
            r4 = r13
        L_0x00d1:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ec
            r18.E()
            android.widget.EdgeEffect r4 = r8.X0
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            defpackage.kp.q(r4, r6, r2)
        L_0x00ea:
            r4 = 1
            goto L_0x0107
        L_0x00ec:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0107
            r18.B()
            android.widget.EdgeEffect r4 = r8.Z0
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            defpackage.kp.q(r4, r6, r7)
            goto L_0x00ea
        L_0x0107:
            if (r4 != 0) goto L_0x0111
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0111
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0116
        L_0x0111:
            java.util.WeakHashMap r1 = defpackage.zmf.a
            r18.postInvalidateOnAnimation()
        L_0x0116:
            r18.q(r19, r20)
        L_0x0119:
            if (r14 != 0) goto L_0x011d
            if (r15 == 0) goto L_0x0120
        L_0x011d:
            r8.A(r14, r15)
        L_0x0120:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0129
            r18.invalidate()
        L_0x0129:
            if (r0 != 0) goto L_0x0132
            if (r14 != 0) goto L_0x0132
            if (r15 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r12 = r13
            goto L_0x0133
        L_0x0132:
            r12 = 1
        L_0x0133:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void w() {
        inf inf;
        View I;
        zdc zdc = this.s1;
        zdc.a(1);
        G(zdc);
        zdc.j = false;
        C0();
        djb djb = this.u0;
        ((qpd) djb.b).clear();
        wv7 wv7 = (wv7) djb.c;
        wv7.a();
        e0();
        j0();
        dec dec = null;
        View focusedChild = (!this.o1 || !hasFocus() || this.A0 == null) ? null : getFocusedChild();
        if (!(focusedChild == null || (I = I(focusedChild)) == null)) {
            dec = T(I);
        }
        long j = -1;
        if (dec == null) {
            zdc.n = -1;
            zdc.m = -1;
            zdc.o = -1;
        } else {
            if (this.A0.b) {
                j = dec.X;
            }
            zdc.n = j;
            zdc.m = this.R0 ? -1 : dec.p() ? dec.o : dec.g();
            View view = dec.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            zdc.o = id;
        }
        zdc.i = zdc.k && this.w1;
        this.w1 = false;
        this.v1 = false;
        zdc.h = zdc.l;
        zdc.f = this.A0.j();
        K(this.A1);
        boolean z = zdc.k;
        qpd qpd = (qpd) djb.b;
        if (z) {
            int z2 = this.t0.z();
            for (int i = 0; i < z2; i++) {
                dec U = U(this.t0.y(i));
                if (!U.w() && (!U.n() || this.A0.b)) {
                    mdc mdc = this.a1;
                    mdc.b(U);
                    U.j();
                    mdc.getClass();
                    jt jtVar = new jt(7);
                    jtVar.c(U);
                    inf inf2 = (inf) qpd.get(U);
                    if (inf2 == null) {
                        inf2 = inf.a();
                        qpd.put(U, inf2);
                    }
                    inf2.b = jtVar;
                    inf2.a |= 4;
                    if (zdc.i && U.s() && !U.p() && !U.w() && !U.n()) {
                        wv7.f(Q(U), U);
                    }
                }
            }
        }
        if (zdc.l) {
            int D = this.t0.D();
            int i2 = 0;
            while (i2 < D) {
                dec U2 = U(this.t0.C(i2));
                if (!L1 || U2.c != -1 || U2.p()) {
                    if (!U2.w() && U2.o == -1) {
                        U2.o = U2.c;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException(ms2.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
            }
            boolean z3 = zdc.g;
            zdc.g = false;
            this.B0.j0(this.c, zdc);
            zdc.g = z3;
            for (int i3 = 0; i3 < this.t0.z(); i3++) {
                dec U3 = U(this.t0.y(i3));
                if (!U3.w() && ((inf = (inf) qpd.get(U3)) == null || (inf.a & 4) == 0)) {
                    mdc.b(U3);
                    boolean k = U3.k(8192);
                    mdc mdc2 = this.a1;
                    U3.j();
                    mdc2.getClass();
                    jt jtVar2 = new jt(7);
                    jtVar2.c(U3);
                    if (k) {
                        l0(U3, jtVar2);
                    } else {
                        inf inf3 = (inf) qpd.get(U3);
                        if (inf3 == null) {
                            inf3 = inf.a();
                            qpd.put(U3, inf3);
                        }
                        inf3.a |= 2;
                        inf3.b = jtVar2;
                    }
                }
            }
            p();
        } else {
            p();
        }
        f0(true);
        D0(false);
        zdc.e = 2;
    }

    public final void w0(int i, int i2, int[] iArr) {
        dec dec;
        C0();
        e0();
        Trace.beginSection("RV Scroll");
        zdc zdc = this.s1;
        G(zdc);
        int x02 = i != 0 ? this.B0.x0(i, this.c, zdc) : 0;
        int z02 = i2 != 0 ? this.B0.z0(i2, this.c, zdc) : 0;
        Trace.endSection();
        int z = this.t0.z();
        for (int i3 = 0; i3 < z; i3++) {
            View y = this.t0.y(i3);
            dec T = T(y);
            if (!(T == null || (dec = T.t0) == null)) {
                int left = y.getLeft();
                int top = y.getTop();
                View view = dec.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        f0(true);
        D0(false);
        if (iArr != null) {
            iArr[0] = x02;
            iArr[1] = z02;
        }
    }

    public final void x() {
        C0();
        e0();
        zdc zdc = this.s1;
        zdc.a(6);
        this.s0.m();
        zdc.f = this.A0.j();
        zdc.d = 0;
        if (this.o != null) {
            hdc hdc = this.A0;
            int s = au1.s(hdc.c);
            if (s == 1 ? hdc.j() > 0 : s != 2) {
                Parcelable parcelable = this.o.c;
                if (parcelable != null) {
                    this.B0.l0(parcelable);
                }
                this.o = null;
            }
        }
        zdc.h = false;
        this.B0.j0(this.c, zdc);
        zdc.g = false;
        zdc.k = zdc.k && this.a1 != null;
        zdc.e = 4;
        f0(true);
        D0(false);
    }

    public final void x0(int i) {
        if (!this.L0) {
            E0();
            a aVar = this.B0;
            if (aVar != null) {
                aVar.y0(i);
                awakenScrollBars();
            }
        }
    }

    public final boolean y(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void y0(hdc hdc, boolean z, boolean z2) {
        hdc hdc2 = this.A0;
        pz4 pz4 = this.b;
        if (hdc2 != null) {
            hdc2.B(pz4);
            this.A0.u(this);
        }
        if (!z || z2) {
            o0();
        }
        x8 x8Var = this.s0;
        x8Var.M((ArrayList) x8Var.c);
        x8Var.M((ArrayList) x8Var.o);
        x8Var.a = 0;
        hdc hdc3 = this.A0;
        this.A0 = hdc;
        if (hdc != null) {
            hdc.z(pz4);
            hdc.q(this);
        }
        a aVar = this.B0;
        if (aVar != null) {
            aVar.V();
        }
        vdc vdc = this.c;
        hdc hdc4 = this.A0;
        vdc.a.clear();
        vdc.e();
        b bVar = vdc.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(hdc3, true);
        }
        vdc.c().onAdapterChanged(hdc3, hdc4, z);
        vdc.d();
        this.s1.g = true;
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean z0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float f = this.a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) O1;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < kp.k(edgeEffect) * ((float) i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: b23} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: b23} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: b23} */
    /* JADX WARNING: type inference failed for: r1v16, types: [zdc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v20, types: [k61, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r0 = 25
            r18.<init>(r19, r20, r21)
            pz4 r1 = new pz4
            r2 = 6
            r1.<init>(r2, r10)
            r10.b = r1
            vdc r1 = new vdc
            r1.<init>(r10)
            r10.c = r1
            djb r1 = new djb
            r2 = 12
            r1.<init>((int) r2)
            r10.u0 = r1
            gdc r1 = new gdc
            r14 = 0
            r1.<init>(r10, r14)
            r10.w0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.x0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.y0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r10.z0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.C0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.D0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.E0 = r1
            r10.J0 = r14
            r10.R0 = r14
            r10.S0 = r14
            r10.T0 = r14
            r10.U0 = r14
            aec r1 = U1
            r10.V0 = r1
            yb4 r1 = new yb4
            r1.<init>()
            r10.a1 = r1
            r10.b1 = r14
            r8 = -1
            r10.c1 = r8
            r1 = 1
            r10.m1 = r1
            r10.n1 = r1
            r15 = 1
            r10.o1 = r15
            cec r1 = new cec
            r1.<init>(r10)
            r10.p1 = r1
            boolean r1 = R1
            if (r1 == 0) goto L_0x008a
            b23 r1 = new b23
            r1.<init>()
            goto L_0x008b
        L_0x008a:
            r1 = 0
        L_0x008b:
            r10.r1 = r1
            zdc r1 = new zdc
            r1.<init>()
            r1.a = r8
            r1.c = r14
            r1.d = r14
            r1.e = r15
            r1.f = r14
            r1.g = r14
            r1.h = r14
            r1.i = r14
            r1.j = r14
            r1.k = r14
            r1.l = r14
            r10.s1 = r1
            r10.v1 = r14
            r10.w1 = r14
            re6 r1 = new re6
            r1.<init>((int) r0, (java.lang.Object) r10)
            r10.x1 = r1
            r10.y1 = r14
            r7 = 2
            int[] r2 = new int[r7]
            r10.A1 = r2
            int[] r2 = new int[r7]
            r10.C1 = r2
            int[] r2 = new int[r7]
            r10.D1 = r2
            int[] r2 = new int[r7]
            r10.E1 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.F1 = r2
            gdc r2 = new gdc
            r2.<init>(r10, r15)
            r10.G1 = r2
            r10.I1 = r14
            r10.J1 = r14
            ey1 r2 = new ey1
            r2.<init>(r0, r10)
            r10.K1 = r2
            r10.setScrollContainer(r15)
            r10.setFocusableInTouchMode(r15)
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r19)
            int r3 = r2.getScaledTouchSlop()
            r10.i1 = r3
            float r3 = defpackage.anf.a(r2)
            r10.m1 = r3
            float r3 = defpackage.anf.b(r2)
            r10.n1 = r3
            int r3 = r2.getScaledMinimumFlingVelocity()
            r10.k1 = r3
            int r2 = r2.getScaledMaximumFlingVelocity()
            r10.l1 = r2
            android.content.res.Resources r2 = r19.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 * r3
            r3 = 1136724797(0x43c10b3d, float:386.0878)
            float r2 = r2 * r3
            r3 = 1062668861(0x3f570a3d, float:0.84)
            float r2 = r2 * r3
            r10.a = r2
            int r2 = r18.getOverScrollMode()
            if (r2 != r7) goto L_0x0128
            r2 = r15
            goto L_0x0129
        L_0x0128:
            r2 = r14
        L_0x0129:
            r10.setWillNotDraw(r2)
            mdc r2 = r10.a1
            r2.a = r1
            x8 r1 = new x8
            k61 r2 = new k61
            r2.<init>()
            r2.a = r10
            r1.<init>((defpackage.k61) r2)
            r10.s0 = r1
            l0f r1 = new l0f
            sy4 r2 = new sy4
            r2.<init>((int) r0, (java.lang.Object) r10)
            r1.<init>((defpackage.sy4) r2)
            r10.t0 = r1
            java.util.WeakHashMap r0 = defpackage.zmf.a
            int r0 = defpackage.rmf.c(r18)
            if (r0 != 0) goto L_0x0157
            r0 = 8
            defpackage.rmf.m(r10, r0)
        L_0x0157:
            int r0 = r18.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0160
            r10.setImportantForAccessibility(r15)
        L_0x0160:
            android.content.Context r0 = r18.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r10.P0 = r0
            fec r0 = new fec
            r0.<init>(r10)
            r10.setAccessibilityDelegateCompat(r0)
            int[] r0 = defpackage.u2c.RecyclerView
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r13, r14)
            int[] r3 = defpackage.u2c.RecyclerView
            r16 = 0
            r1 = r18
            r2 = r19
            r4 = r20
            r5 = r0
            r6 = r21
            r17 = r7
            r7 = r16
            defpackage.umf.d(r1, r2, r3, r4, r5, r6, r7)
            int r1 = defpackage.u2c.RecyclerView_layoutManager
            java.lang.String r16 = r0.getString(r1)
            int r1 = defpackage.u2c.RecyclerView_android_descendantFocusability
            int r1 = r0.getInt(r1, r8)
            if (r1 != r8) goto L_0x01a3
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r1)
        L_0x01a3:
            int r1 = defpackage.u2c.RecyclerView_android_clipToPadding
            boolean r1 = r0.getBoolean(r1, r15)
            r10.v0 = r1
            int r1 = defpackage.u2c.RecyclerView_fastScrollEnabled
            boolean r1 = r0.getBoolean(r1, r14)
            if (r1 == 0) goto L_0x020d
            int r1 = defpackage.u2c.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r3 = r1
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r1 = defpackage.u2c.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r1)
            int r1 = defpackage.u2c.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r5 = r1
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            int r1 = defpackage.u2c.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r1)
            if (r3 == 0) goto L_0x01fc
            if (r4 == 0) goto L_0x01fc
            if (r5 == 0) goto L_0x01fc
            if (r6 == 0) goto L_0x01fc
            android.content.Context r1 = r18.getContext()
            android.content.res.Resources r1 = r1.getResources()
            zb5 r2 = new zb5
            int r7 = defpackage.rtb.fastscroll_default_thickness
            int r7 = r1.getDimensionPixelSize(r7)
            int r8 = defpackage.rtb.fastscroll_minimum_range
            int r8 = r1.getDimensionPixelSize(r8)
            int r9 = defpackage.rtb.fastscroll_margin
            int r9 = r1.getDimensionPixelOffset(r9)
            r1 = r2
            r2 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x020d
        L_0x01fc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r1 = defpackage.ms2.e(r10, r1)
            r0.<init>(r1)
            throw r0
        L_0x020d:
            r0.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L_0x0372
            java.lang.String r0 = r16.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0372
            char r2 = r0.charAt(r14)
            r3 = 46
            if (r2 != r3) goto L_0x023b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r19.getPackageName()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0239:
            r2 = r0
            goto L_0x0261
        L_0x023b:
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0244
            goto L_0x0239
        L_0x0244:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r4 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0239
        L_0x0261:
            boolean r0 = r18.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            if (r0 == 0) goto L_0x027e
            java.lang.Class r0 = r18.getClass()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            goto L_0x0282
        L_0x0270:
            r0 = move-exception
            goto L_0x02e0
        L_0x0272:
            r0 = move-exception
            goto L_0x02fe
        L_0x0275:
            r0 = move-exception
            goto L_0x031c
        L_0x0278:
            r0 = move-exception
            goto L_0x0338
        L_0x027b:
            r0 = move-exception
            goto L_0x0354
        L_0x027e:
            java.lang.ClassLoader r0 = r19.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
        L_0x0282:
            java.lang.Class r0 = java.lang.Class.forName(r2, r14, r0)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.Class<androidx.recyclerview.widget.a> r3 = androidx.recyclerview.widget.a.class
            java.lang.Class r3 = r0.asSubclass(r3)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.Class[] r0 = S1     // Catch:{ NoSuchMethodException -> 0x02a7 }
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r4 = 4
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r9[r14] = r11     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r9[r15] = r12     // Catch:{ NoSuchMethodException -> 0x02a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r9[r17] = r4     // Catch:{ NoSuchMethodException -> 0x02a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ NoSuchMethodException -> 0x02a7 }
            r5 = 3
            r9[r5] = r4     // Catch:{ NoSuchMethodException -> 0x02a7 }
            goto L_0x02af
        L_0x02a7:
            r0 = move-exception
            r5 = r0
            r4 = 0
            java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x02bd }
            r9 = r4
        L_0x02af:
            r0.setAccessible(r15)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.Object r0 = r0.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            androidx.recyclerview.widget.a r0 = (androidx.recyclerview.widget.a) r0     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            goto L_0x0372
        L_0x02bd:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.String r5 = r20.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x027b, InvocationTargetException -> 0x0278, InstantiationException -> 0x0275, IllegalAccessException -> 0x0272, ClassCastException -> 0x0270 }
        L_0x02e0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x02fe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x031c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r20.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0338:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r20.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x0354:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0372:
            int[] r3 = N1
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r3, r13, r14)
            r7 = 0
            r1 = r18
            r2 = r19
            r4 = r20
            r5 = r0
            r6 = r21
            defpackage.umf.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.getBoolean(r14, r15)
            r0.recycle()
            r10.setNestedScrollingEnabled(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            int r1 = defpackage.r5b.b
            r10.setTag(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.B0;
        if (aVar != null) {
            return aVar.u(layoutParams);
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
