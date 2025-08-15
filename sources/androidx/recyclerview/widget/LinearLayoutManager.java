package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends a implements ydc {
    public final b85 A;
    public final th7 B;
    public int C;
    public final int[] D;
    public int p;
    public uh7 q;
    public ga7 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public vh7 z;

    public LinearLayoutManager() {
        this(1, false);
    }

    public final boolean G0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int w2 = w();
        for (int i = 0; i < w2; i++) {
            ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void I0(RecyclerView recyclerView, int i) {
        yh7 yh7 = new yh7(recyclerView.getContext());
        yh7.a = i;
        J0(yh7);
    }

    public boolean K0() {
        return this.z == null && this.s == this.v;
    }

    public void L0(zdc zdc, int[] iArr) {
        int i;
        int n = zdc.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = n;
            n = 0;
        }
        iArr[0] = n;
        iArr[1] = i;
    }

    public void M0(zdc zdc, uh7 uh7, b23 b23) {
        int i = uh7.d;
        if (i >= 0 && i < zdc.b()) {
            b23.b(i, Math.max(0, uh7.g));
        }
    }

    public final int N0(zdc zdc) {
        if (w() == 0) {
            return 0;
        }
        R0();
        ga7 ga7 = this.r;
        boolean z2 = !this.w;
        return s5c.p(zdc, ga7, V0(z2), U0(z2), this, this.w);
    }

    public final int O0(zdc zdc) {
        if (w() == 0) {
            return 0;
        }
        R0();
        ga7 ga7 = this.r;
        boolean z2 = !this.w;
        return s5c.q(zdc, ga7, V0(z2), U0(z2), this, this.w, this.u);
    }

    public final int P0(zdc zdc) {
        if (w() == 0) {
            return 0;
        }
        R0();
        ga7 ga7 = this.r;
        boolean z2 = !this.w;
        return s5c.r(zdc, ga7, V0(z2), U0(z2), this, this.w);
    }

    public final boolean Q() {
        return true;
    }

    public final int Q0(int i) {
        if (i == 1) {
            return (this.p != 1 && g1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && g1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.p == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [uh7, java.lang.Object] */
    public final void R0() {
        if (this.q == null) {
            ? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    public final int S0(vdc vdc, uh7 uh7, zdc zdc, boolean z2) {
        int i;
        int i2 = uh7.c;
        int i3 = uh7.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                uh7.g = i3 + i2;
            }
            j1(vdc, uh7);
        }
        int i4 = uh7.c + uh7.h;
        while (true) {
            if ((!uh7.l && i4 <= 0) || (i = uh7.d) < 0 || i >= zdc.b()) {
                break;
            }
            th7 th7 = this.B;
            th7.a = 0;
            th7.b = false;
            th7.c = false;
            th7.d = false;
            h1(vdc, zdc, uh7, th7);
            if (!th7.b) {
                int i5 = uh7.b;
                int i6 = th7.a;
                uh7.b = (uh7.f * i6) + i5;
                if (!th7.c || uh7.k != null || !zdc.h) {
                    uh7.c -= i6;
                    i4 -= i6;
                }
                int i7 = uh7.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    uh7.g = i8;
                    int i9 = uh7.c;
                    if (i9 < 0) {
                        uh7.g = i8 + i9;
                    }
                    j1(vdc, uh7);
                }
                if (z2 && th7.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - uh7.c;
    }

    public final int T0() {
        View a1 = a1(0, w(), true, false);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public final View U0(boolean z2) {
        return this.u ? a1(0, w(), z2, true) : a1(w() - 1, -1, z2, true);
    }

    public final View V0(boolean z2) {
        return this.u ? a1(w() - 1, -1, z2, true) : a1(0, w(), z2, true);
    }

    public final int W0() {
        View a1 = a1(0, w(), false, true);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public void X(RecyclerView recyclerView) {
    }

    public final int X0() {
        View a1 = a1(w() - 1, -1, true, false);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public View Y(View view, int i, vdc vdc, zdc zdc) {
        int Q0;
        l1();
        if (w() == 0 || (Q0 = Q0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        R0();
        q1(Q0, (int) (((float) this.r.n()) * 0.33333334f), false, zdc);
        uh7 uh7 = this.q;
        uh7.g = Integer.MIN_VALUE;
        uh7.a = false;
        S0(vdc, uh7, zdc, true);
        View Z0 = Q0 == -1 ? this.u ? Z0(w() - 1, -1) : Z0(0, w()) : this.u ? Z0(0, w()) : Z0(w() - 1, -1);
        View f1 = Q0 == -1 ? f1() : e1();
        if (!f1.hasFocusable()) {
            return Z0;
        }
        if (Z0 == null) {
            return null;
        }
        return f1;
    }

    public final int Y0() {
        View a1 = a1(w() - 1, -1, false, true);
        if (a1 == null) {
            return -1;
        }
        return a.M(a1);
    }

    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(W0());
            accessibilityEvent.setToIndex(Y0());
        }
    }

    public final View Z0(int i, int i2) {
        int i3;
        int i4;
        R0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.f(v(i)) < this.r.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return this.p == 0 ? this.c.h(i, i2, i4, i3) : this.d.h(i, i2, i4, i3);
    }

    public final PointF a(int i) {
        if (w() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < a.M(v(0))) {
            z2 = true;
        }
        if (z2 != this.u) {
            i2 = -1;
        }
        return this.p == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public final View a1(int i, int i2, boolean z2, boolean z3) {
        R0();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return this.p == 0 ? this.c.h(i, i2, i4, i3) : this.d.h(i, i2, i4, i3);
    }

    public View b1(vdc vdc, zdc zdc, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        R0();
        int w2 = w();
        if (z3) {
            i3 = w() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = w2;
            i3 = 0;
            i = 1;
        }
        int b = zdc.b();
        int m = this.r.m();
        int h = this.r.h();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View v2 = v(i3);
            int M = a.M(v2);
            int f = this.r.f(v2);
            int c = this.r.c(v2);
            if (M >= 0 && M < b) {
                if (!((pdc) v2.getLayoutParams()).a.p()) {
                    boolean z4 = c <= m && f < m;
                    boolean z5 = f >= h && c > h;
                    if (!z4 && !z5) {
                        return v2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = v2;
                        }
                    } else if (!z4) {
                        if (view != null) {
                        }
                        view = v2;
                    }
                    view2 = v2;
                } else if (view3 == null) {
                    view3 = v2;
                }
            }
            i3 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final int c1(int i, vdc vdc, zdc zdc, boolean z2) {
        int h;
        int h2 = this.r.h() - i;
        if (h2 <= 0) {
            return 0;
        }
        int i2 = -m1(-h2, vdc, zdc);
        int i3 = i + i2;
        if (!z2 || (h = this.r.h() - i3) <= 0) {
            return i2;
        }
        this.r.r(h);
        return h + i2;
    }

    public final int d1(int i, vdc vdc, zdc zdc, boolean z2) {
        int m;
        int m2 = i - this.r.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -m1(m2, vdc, zdc);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.r(-m);
        return i2 - m;
    }

    public boolean e() {
        return this.p == 0;
    }

    public final View e1() {
        return v(this.u ? 0 : w() - 1);
    }

    public boolean f() {
        return this.p == 1;
    }

    public final View f1() {
        return v(this.u ? w() - 1 : 0);
    }

    public final boolean g1() {
        return H() == 1;
    }

    public void h1(vdc vdc, zdc zdc, uh7 uh7, th7 th7) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View b = uh7.b(vdc);
        if (b == null) {
            th7.b = true;
            return;
        }
        pdc pdc = (pdc) b.getLayoutParams();
        if (uh7.k == null) {
            if (this.u == (uh7.f == -1)) {
                b(-1, b, false);
            } else {
                b(0, b, false);
            }
        } else {
            if (this.u == (uh7.f == -1)) {
                b(-1, b, true);
            } else {
                b(0, b, true);
            }
        }
        pdc pdc2 = (pdc) b.getLayoutParams();
        Rect W = this.b.W(b);
        int i7 = W.left + W.right;
        int i8 = W.top + W.bottom;
        int x2 = a.x(e(), this.n, this.l, K() + J() + pdc2.leftMargin + pdc2.rightMargin + i7, pdc2.width);
        int x3 = a.x(f(), this.o, this.m, I() + L() + pdc2.topMargin + pdc2.bottomMargin + i8, pdc2.height);
        if (F0(b, x2, x3, pdc2)) {
            b.measure(x2, x3);
        }
        th7.a = this.r.d(b);
        if (this.p == 1) {
            if (g1()) {
                i6 = this.n - K();
                i5 = i6 - this.r.e(b);
            } else {
                i5 = J();
                i6 = this.r.e(b) + i5;
            }
            if (uh7.f == -1) {
                int i9 = uh7.b;
                i = i9;
                i2 = i6;
                i3 = i9 - th7.a;
            } else {
                int i10 = uh7.b;
                i3 = i10;
                i2 = i6;
                i = th7.a + i10;
            }
            i4 = i5;
        } else {
            int L = L();
            int e = this.r.e(b) + L;
            if (uh7.f == -1) {
                int i11 = uh7.b;
                i4 = i11 - th7.a;
                i2 = i11;
                i3 = L;
                i = e;
            } else {
                int i12 = uh7.b;
                i3 = L;
                i = e;
                i2 = th7.a + i12;
                i4 = i12;
            }
        }
        S(b, i4, i3, i2, i);
        if (pdc.a.p() || pdc.a.s()) {
            th7.c = true;
        }
        th7.d = b.hasFocusable();
    }

    public final void i(int i, int i2, zdc zdc, b23 b23) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() != 0 && i != 0) {
            R0();
            q1(i > 0 ? 1 : -1, Math.abs(i), true, zdc);
            M0(zdc, this.q, b23);
        }
    }

    public void i1(vdc vdc, zdc zdc, b85 b85, int i) {
    }

    public final void j(int i, b23 b23) {
        int i2;
        boolean z2;
        vh7 vh7 = this.z;
        int i3 = -1;
        if (vh7 == null || (i2 = vh7.a) < 0) {
            l1();
            z2 = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = vh7.c;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            b23.b(i2, 0);
            i2 += i3;
        }
    }

    public void j0(vdc vdc, zdc zdc) {
        View view;
        int i;
        int i2;
        List list;
        int i3;
        int i4;
        int c1;
        int i5;
        View r2;
        int f;
        int i6;
        View view2;
        View b1;
        int i7;
        int i8;
        vdc vdc2 = vdc;
        zdc zdc2 = zdc;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && zdc.b() == 0) {
            r0(vdc);
            return;
        }
        vh7 vh7 = this.z;
        if (vh7 != null && (i8 = vh7.a) >= 0) {
            this.x = i8;
        }
        R0();
        this.q.a = false;
        l1();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.a.H(view)) {
            view = null;
        }
        b85 b85 = this.A;
        if (!b85.e || this.x != -1 || this.z != null) {
            b85.e();
            b85.d = this.u ^ this.v;
            if (!zdc2.h && (i7 = this.x) != -1) {
                if (i7 < 0 || i7 >= zdc.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    b85.b = i10;
                    vh7 vh72 = this.z;
                    if (vh72 == null || vh72.a < 0) {
                        if (this.y == Integer.MIN_VALUE) {
                            View r3 = r(i10);
                            if (r3 == null) {
                                if (w() > 0) {
                                    b85.d = (this.x < a.M(v(0))) == this.u;
                                }
                                b85.a();
                            } else if (this.r.d(r3) > this.r.n()) {
                                b85.a();
                            } else if (this.r.f(r3) - this.r.m() < 0) {
                                b85.c = this.r.m();
                                b85.d = false;
                            } else if (this.r.h() - this.r.c(r3) < 0) {
                                b85.c = this.r.h();
                                b85.d = true;
                            } else {
                                b85.c = b85.d ? this.r.o() + this.r.c(r3) : this.r.f(r3);
                            }
                        } else {
                            boolean z2 = this.u;
                            b85.d = z2;
                            if (z2) {
                                b85.c = this.r.h() - this.y;
                            } else {
                                b85.c = this.r.m() + this.y;
                            }
                        }
                        b85.e = true;
                    } else {
                        boolean z3 = vh72.c;
                        b85.d = z3;
                        if (z3) {
                            b85.c = this.r.h() - this.z.b;
                        } else {
                            b85.c = this.r.m() + this.z.b;
                        }
                        b85.e = true;
                    }
                }
            }
            if (w() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.a.H(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    pdc pdc = (pdc) view2.getLayoutParams();
                    if (!pdc.a.p() && pdc.a.i() >= 0 && pdc.a.i() < zdc.b()) {
                        b85.c(view2, a.M(view2));
                        b85.e = true;
                    }
                }
                boolean z4 = this.s;
                boolean z5 = this.v;
                if (z4 == z5 && (b1 = b1(vdc2, zdc2, b85.d, z5)) != null) {
                    b85.b(b1, a.M(b1));
                    if (!zdc2.h && K0()) {
                        int f2 = this.r.f(b1);
                        int c = this.r.c(b1);
                        int m = this.r.m();
                        int h = this.r.h();
                        boolean z6 = c <= m && f2 < m;
                        boolean z7 = f2 >= h && c > h;
                        if (z6 || z7) {
                            if (b85.d) {
                                m = h;
                            }
                            b85.c = m;
                        }
                    }
                    b85.e = true;
                }
            }
            b85.a();
            b85.b = this.v ? zdc.b() - 1 : 0;
            b85.e = true;
        } else if (view != null && (this.r.f(view) >= this.r.h() || this.r.c(view) <= this.r.m())) {
            b85.c(view, a.M(view));
        }
        uh7 uh7 = this.q;
        uh7.f = uh7.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        L0(zdc2, iArr);
        int m2 = this.r.m() + Math.max(0, iArr[0]);
        int i11 = this.r.i() + Math.max(0, iArr[1]);
        if (!(!zdc2.h || (i5 = this.x) == -1 || this.y == Integer.MIN_VALUE || (r2 = r(i5)) == null)) {
            if (this.u) {
                i6 = this.r.h() - this.r.c(r2);
                f = this.y;
            } else {
                f = this.r.f(r2) - this.r.m();
                i6 = this.y;
            }
            int i12 = i6 - f;
            if (i12 > 0) {
                m2 += i12;
            } else {
                i11 -= i12;
            }
        }
        if (!b85.d ? !this.u : this.u) {
            i9 = 1;
        }
        i1(vdc2, zdc2, b85, i9);
        q(vdc);
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (b85.d) {
            s1(b85.b, b85.c);
            uh7 uh72 = this.q;
            uh72.h = m2;
            S0(vdc2, uh72, zdc2, false);
            uh7 uh73 = this.q;
            i2 = uh73.b;
            int i13 = uh73.d;
            int i14 = uh73.c;
            if (i14 > 0) {
                i11 += i14;
            }
            r1(b85.b, b85.c);
            uh7 uh74 = this.q;
            uh74.h = i11;
            uh74.d += uh74.e;
            S0(vdc2, uh74, zdc2, false);
            uh7 uh75 = this.q;
            i = uh75.b;
            int i15 = uh75.c;
            if (i15 > 0) {
                s1(i13, i2);
                uh7 uh76 = this.q;
                uh76.h = i15;
                S0(vdc2, uh76, zdc2, false);
                i2 = this.q.b;
            }
        } else {
            r1(b85.b, b85.c);
            uh7 uh77 = this.q;
            uh77.h = i11;
            S0(vdc2, uh77, zdc2, false);
            uh7 uh78 = this.q;
            i = uh78.b;
            int i16 = uh78.d;
            int i17 = uh78.c;
            if (i17 > 0) {
                m2 += i17;
            }
            s1(b85.b, b85.c);
            uh7 uh79 = this.q;
            uh79.h = m2;
            uh79.d += uh79.e;
            S0(vdc2, uh79, zdc2, false);
            uh7 uh710 = this.q;
            int i18 = uh710.b;
            int i19 = uh710.c;
            if (i19 > 0) {
                r1(i16, i);
                uh7 uh711 = this.q;
                uh711.h = i19;
                S0(vdc2, uh711, zdc2, false);
                i = this.q.b;
            }
            i2 = i18;
        }
        if (w() > 0) {
            if (this.u ^ this.v) {
                int c12 = c1(i, vdc2, zdc2, true);
                i3 = i2 + c12;
                i4 = i + c12;
                c1 = d1(i3, vdc2, zdc2, false);
            } else {
                int d1 = d1(i2, vdc2, zdc2, true);
                i3 = i2 + d1;
                i4 = i + d1;
                c1 = c1(i4, vdc2, zdc2, false);
            }
            i2 = i3 + c1;
            i = i4 + c1;
        }
        if (zdc2.l && w() != 0 && !zdc2.h && K0()) {
            List list2 = vdc2.d;
            int size = list2.size();
            int M = a.M(v(0));
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < size; i22++) {
                dec dec = (dec) list2.get(i22);
                if (!dec.p()) {
                    boolean z8 = dec.i() < M;
                    boolean z9 = this.u;
                    View view3 = dec.a;
                    if (z8 != z9) {
                        i20 += this.r.d(view3);
                    } else {
                        i21 += this.r.d(view3);
                    }
                }
            }
            this.q.k = list2;
            if (i20 > 0) {
                s1(a.M(f1()), i2);
                uh7 uh712 = this.q;
                uh712.h = i20;
                uh712.c = 0;
                uh712.a((View) null);
                S0(vdc2, this.q, zdc2, false);
            }
            if (i21 > 0) {
                r1(a.M(e1()), i);
                uh7 uh713 = this.q;
                uh713.h = i21;
                uh713.c = 0;
                list = null;
                uh713.a((View) null);
                S0(vdc2, this.q, zdc2, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!zdc2.h) {
            ga7 ga7 = this.r;
            ga7.a = ga7.n();
        } else {
            b85.e();
        }
        this.s = this.v;
    }

    public final void j1(vdc vdc, uh7 uh7) {
        if (uh7.a && !uh7.l) {
            int i = uh7.g;
            int i2 = uh7.i;
            if (uh7.f == -1) {
                int w2 = w();
                if (i >= 0) {
                    int g = (this.r.g() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < w2; i3++) {
                            View v2 = v(i3);
                            if (this.r.f(v2) < g || this.r.q(v2) < g) {
                                k1(vdc, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = w2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View v3 = v(i5);
                        if (this.r.f(v3) < g || this.r.q(v3) < g) {
                            k1(vdc, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int w3 = w();
                if (this.u) {
                    int i7 = w3 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View v4 = v(i8);
                        if (this.r.c(v4) > i6 || this.r.p(v4) > i6) {
                            k1(vdc, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < w3; i9++) {
                    View v5 = v(i9);
                    if (this.r.c(v5) > i6 || this.r.p(v5) > i6) {
                        k1(vdc, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final int k(zdc zdc) {
        return N0(zdc);
    }

    public void k0(zdc zdc) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.e();
    }

    public final void k1(vdc vdc, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    u0(i3, vdc);
                }
                return;
            }
            while (i > i2) {
                u0(i, vdc);
                i--;
            }
        }
    }

    public int l(zdc zdc) {
        return O0(zdc);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof vh7) {
            vh7 vh7 = (vh7) parcelable;
            this.z = vh7;
            if (this.x != -1) {
                vh7.a = -1;
            }
            w0();
        }
    }

    public final void l1() {
        if (this.p == 1 || !g1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public int m(zdc zdc) {
        return P0(zdc);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, vh7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.os.Parcelable, vh7, java.lang.Object] */
    public final Parcelable m0() {
        vh7 vh7 = this.z;
        if (vh7 != null) {
            ? obj = new Object();
            obj.a = vh7.a;
            obj.b = vh7.b;
            obj.c = vh7.c;
            return obj;
        }
        ? obj2 = new Object();
        if (w() > 0) {
            R0();
            boolean z2 = this.s ^ this.u;
            obj2.c = z2;
            if (z2) {
                View e1 = e1();
                obj2.b = this.r.h() - this.r.c(e1);
                obj2.a = a.M(e1);
            } else {
                View f1 = f1();
                obj2.a = a.M(f1);
                obj2.b = this.r.f(f1) - this.r.m();
            }
        } else {
            obj2.a = -1;
        }
        return obj2;
    }

    public final int m1(int i, vdc vdc, zdc zdc) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        R0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        q1(i2, abs, true, zdc);
        uh7 uh7 = this.q;
        int S0 = S0(vdc, uh7, zdc, false) + uh7.g;
        if (S0 < 0) {
            return 0;
        }
        if (abs > S0) {
            i = i2 * S0;
        }
        this.r.r(-i);
        this.q.j = i;
        return i;
    }

    public final int n(zdc zdc) {
        return N0(zdc);
    }

    public final void n1(int i, int i2) {
        this.x = i;
        this.y = i2;
        vh7 vh7 = this.z;
        if (vh7 != null) {
            vh7.a = -1;
        }
        w0();
    }

    public int o(zdc zdc) {
        return O0(zdc);
    }

    public final void o1(int i) {
        if (i == 0 || i == 1) {
            c((String) null);
            if (i != this.p || this.r == null) {
                ga7 b = ga7.b(this, i);
                this.r = b;
                this.A.f = b;
                this.p = i;
                w0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(zr6.h(i, "invalid orientation:"));
    }

    public int p(zdc zdc) {
        return P0(zdc);
    }

    public void p1(boolean z2) {
        c((String) null);
        if (this.v != z2) {
            this.v = z2;
            w0();
        }
    }

    public final void q1(int i, int i2, boolean z2, zdc zdc) {
        int i3;
        boolean z3 = false;
        int i4 = 1;
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        L0(zdc, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        uh7 uh7 = this.q;
        int i5 = z3 ? max2 : max;
        uh7.h = i5;
        if (!z3) {
            max = max2;
        }
        uh7.i = max;
        if (z3) {
            uh7.h = this.r.i() + i5;
            View e1 = e1();
            uh7 uh72 = this.q;
            if (this.u) {
                i4 = -1;
            }
            uh72.e = i4;
            int M = a.M(e1);
            uh7 uh73 = this.q;
            uh72.d = M + uh73.e;
            uh73.b = this.r.c(e1);
            i3 = this.r.c(e1) - this.r.h();
        } else {
            View f1 = f1();
            uh7 uh74 = this.q;
            uh74.h = this.r.m() + uh74.h;
            uh7 uh75 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            uh75.e = i4;
            int M2 = a.M(f1);
            uh7 uh76 = this.q;
            uh75.d = M2 + uh76.e;
            uh76.b = this.r.f(f1);
            i3 = (-this.r.f(f1)) + this.r.m();
        }
        uh7 uh77 = this.q;
        uh77.c = i2;
        if (z2) {
            uh77.c = i2 - i3;
        }
        uh77.g = i3;
    }

    public final View r(int i) {
        int w2 = w();
        if (w2 == 0) {
            return null;
        }
        int M = i - a.M(v(0));
        if (M >= 0 && M < w2) {
            View v2 = v(M);
            if (a.M(v2) == i) {
                return v2;
            }
        }
        return super.r(i);
    }

    public final void r1(int i, int i2) {
        this.q.c = this.r.h() - i2;
        uh7 uh7 = this.q;
        uh7.e = this.u ? -1 : 1;
        uh7.d = i;
        uh7.f = 1;
        uh7.b = i2;
        uh7.g = Integer.MIN_VALUE;
    }

    public pdc s() {
        return new pdc(-2, -2);
    }

    public final void s1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        uh7 uh7 = this.q;
        uh7.d = i;
        uh7.e = this.u ? 1 : -1;
        uh7.f = -1;
        uh7.b = i2;
        uh7.g = Integer.MIN_VALUE;
    }

    public int x0(int i, vdc vdc, zdc zdc) {
        if (this.p == 1) {
            return 0;
        }
        return m1(i, vdc, zdc);
    }

    public void y0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        vh7 vh7 = this.z;
        if (vh7 != null) {
            vh7.a = -1;
        }
        w0();
    }

    public int z0(int i, vdc vdc, zdc zdc) {
        if (this.p == 0) {
            return 0;
        }
        return m1(i, vdc, zdc);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [th7, java.lang.Object] */
    public LinearLayoutManager(int i, boolean z2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new b85();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        o1(i);
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            w0();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [th7, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new b85();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        odc N = a.N(context, attributeSet, i, i2);
        o1(N.a);
        boolean z2 = N.c;
        c((String) null);
        if (z2 != this.t) {
            this.t = z2;
            w0();
        }
        p1(N.d);
    }
}
