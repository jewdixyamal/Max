package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends a implements xm5, ydc {
    public static final Rect N = new Rect();
    public final an5 A;
    public ga7 B;
    public ga7 C;
    public cn5 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final SparseArray I;
    public final Context J;
    public View K;
    public int L;
    public final wd6 M;
    public int p;
    public final int q;
    public final int r;
    public final int s = -1;
    public boolean t;
    public boolean u;
    public List v = new ArrayList();
    public final l84 w;
    public vdc x;
    public zdc y;
    public xk0 z;

    /* JADX WARNING: type inference failed for: r1v1, types: [l84, java.lang.Object] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        ? obj = new Object();
        obj.a = this;
        this.w = obj;
        this.A = new an5(this);
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = new SparseArray();
        this.L = -1;
        this.M = new wd6(15, false);
        odc N2 = a.N(context, attributeSet, i, i2);
        int i3 = N2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (N2.c) {
                    f1(3);
                } else {
                    f1(2);
                }
            }
        } else if (N2.c) {
            f1(1);
        } else {
            f1(0);
        }
        int i4 = this.q;
        if (i4 != 1) {
            if (i4 == 0) {
                q0();
                this.v.clear();
                an5 an5 = this.A;
                an5.b(an5);
                an5.d = 0;
            }
            this.q = 1;
            this.B = null;
            this.C = null;
            w0();
        }
        if (this.r != 4) {
            q0();
            this.v.clear();
            an5 an52 = this.A;
            an5.b(an52);
            an52.d = 0;
            this.r = 4;
            w0();
        }
        this.J = context;
    }

    public static boolean R(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public final void I0(RecyclerView recyclerView, int i) {
        yh7 yh7 = new yh7(recyclerView.getContext());
        yh7.a = i;
        J0(yh7);
    }

    public final int L0(zdc zdc) {
        if (w() == 0) {
            return 0;
        }
        int b = zdc.b();
        O0();
        View Q0 = Q0(b);
        View S0 = S0(b);
        if (zdc.b() == 0 || Q0 == null || S0 == null) {
            return 0;
        }
        return Math.min(this.B.n(), this.B.c(S0) - this.B.f(Q0));
    }

    public final int M0(zdc zdc) {
        if (w() == 0) {
            return 0;
        }
        int b = zdc.b();
        View Q0 = Q0(b);
        View S0 = S0(b);
        if (!(zdc.b() == 0 || Q0 == null || S0 == null)) {
            int M2 = a.M(Q0);
            int M3 = a.M(S0);
            int abs = Math.abs(this.B.c(S0) - this.B.f(Q0));
            int[] iArr = (int[]) this.w.c;
            int i = iArr[M2];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[M3] - i) + 1)))) + ((float) (this.B.m() - this.B.f(Q0))));
            }
        }
        return 0;
    }

    public final int N0(zdc zdc) {
        if (w() == 0) {
            return 0;
        }
        int b = zdc.b();
        View Q0 = Q0(b);
        View S0 = S0(b);
        if (zdc.b() == 0 || Q0 == null || S0 == null) {
            return 0;
        }
        View U0 = U0(0, w());
        int i = -1;
        int M2 = U0 == null ? -1 : a.M(U0);
        View U02 = U0(w() - 1, -1);
        if (U02 != null) {
            i = a.M(U02);
        }
        return (int) ((((float) Math.abs(this.B.c(S0) - this.B.f(Q0))) / ((float) ((i - M2) + 1))) * ((float) zdc.b()));
    }

    public final void O0() {
        if (this.B == null) {
            if (d1()) {
                if (this.q == 0) {
                    this.B = new bna(this, 0);
                    this.C = new bna(this, 1);
                    return;
                }
                this.B = new bna(this, 1);
                this.C = new bna(this, 0);
            } else if (this.q == 0) {
                this.B = new bna(this, 1);
                this.C = new bna(this, 0);
            } else {
                this.B = new bna(this, 0);
                this.C = new bna(this, 1);
            }
        }
    }

    public final int P0(vdc vdc, zdc zdc, xk0 xk0) {
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        l84 l84;
        int i9;
        boolean z3;
        View view;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        int i15;
        int i16;
        l84 l842;
        Rect rect;
        vdc vdc2 = vdc;
        xk0 xk02 = xk0;
        int i17 = xk02.g;
        if (i17 != Integer.MIN_VALUE) {
            int i18 = xk02.b;
            if (i18 < 0) {
                xk02.g = i17 + i18;
            }
            e1(vdc2, xk02);
        }
        int i19 = xk02.b;
        boolean d1 = d1();
        int i20 = i19;
        int i21 = 0;
        while (true) {
            if (i20 <= 0 && !this.z.c) {
                break;
            }
            List list = this.v;
            int i22 = xk02.e;
            if (i22 < 0 || i22 >= zdc.b() || (i = xk02.d) < 0 || i >= list.size()) {
                break;
            }
            zm5 zm5 = (zm5) this.v.get(xk02.d);
            xk02.e = zm5.k;
            boolean d12 = d1();
            an5 an5 = this.A;
            l84 l843 = this.w;
            Rect rect2 = N;
            if (d12) {
                int J2 = J();
                int K2 = K();
                int i23 = this.n;
                int i24 = xk02.f;
                if (xk02.j == -1) {
                    i24 -= zm5.c;
                }
                int i25 = i24;
                int i26 = xk02.e;
                float f = (float) an5.d;
                float f2 = ((float) J2) - f;
                float f3 = ((float) (i23 - K2)) - f;
                float max = Math.max(0.0f, 0.0f);
                int i27 = zm5.d;
                i4 = i19;
                int i28 = i26;
                int i29 = 0;
                while (i28 < i26 + i27) {
                    View Z0 = Z0(i28);
                    if (Z0 == null) {
                        i12 = i29;
                        i11 = i25;
                        z4 = d1;
                        i14 = i20;
                        i13 = i21;
                        i16 = i27;
                        rect = rect2;
                        l842 = l843;
                        i15 = i26;
                        i10 = i28;
                    } else {
                        i16 = i27;
                        i15 = i26;
                        if (xk02.j == 1) {
                            d(rect2, Z0);
                            i14 = i20;
                            b(-1, Z0, false);
                        } else {
                            i14 = i20;
                            d(rect2, Z0);
                            b(i29, Z0, false);
                            i29++;
                        }
                        i13 = i21;
                        long j = ((long[]) l843.d)[i28];
                        int i30 = (int) j;
                        int i31 = (int) (j >> 32);
                        bn5 bn5 = (bn5) Z0.getLayoutParams();
                        if (g1(Z0, i30, i31, bn5)) {
                            Z0.measure(i30, i31);
                        }
                        float f4 = ((float) (bn5.leftMargin + ((pdc) Z0.getLayoutParams()).b.left)) + f2;
                        float f5 = f3 - ((float) (bn5.rightMargin + ((pdc) Z0.getLayoutParams()).b.right));
                        int i32 = i25 + ((pdc) Z0.getLayoutParams()).b.top;
                        if (this.t) {
                            i12 = i29;
                            rect = rect2;
                            i11 = i25;
                            l842 = l843;
                            int round = Math.round(f5) - Z0.getMeasuredWidth();
                            z4 = d1;
                            i10 = i28;
                            this.w.E(Z0, zm5, round, i32, Math.round(f5), Z0.getMeasuredHeight() + i32);
                        } else {
                            i12 = i29;
                            i11 = i25;
                            z4 = d1;
                            rect = rect2;
                            l842 = l843;
                            i10 = i28;
                            this.w.E(Z0, zm5, Math.round(f4), i32, Z0.getMeasuredWidth() + Math.round(f4), Z0.getMeasuredHeight() + i32);
                        }
                        f2 = ((float) (Z0.getMeasuredWidth() + bn5.rightMargin + ((pdc) Z0.getLayoutParams()).b.right)) + max + f4;
                        f3 = f5 - (((float) ((Z0.getMeasuredWidth() + bn5.leftMargin) + ((pdc) Z0.getLayoutParams()).b.left)) + max);
                    }
                    i28 = i10 + 1;
                    rect2 = rect;
                    l843 = l842;
                    i27 = i16;
                    i26 = i15;
                    i20 = i14;
                    i21 = i13;
                    d1 = z4;
                    i29 = i12;
                    i25 = i11;
                }
                z2 = d1;
                i3 = i20;
                i2 = i21;
                xk02.d += this.z.j;
                i5 = zm5.c;
            } else {
                i4 = i19;
                z2 = d1;
                i3 = i20;
                i2 = i21;
                Rect rect3 = rect2;
                l84 l844 = l843;
                int L2 = L();
                int I2 = I();
                int i33 = this.o;
                int i34 = xk02.f;
                if (xk02.j == -1) {
                    int i35 = zm5.c;
                    i6 = i34 + i35;
                    i34 -= i35;
                } else {
                    i6 = i34;
                }
                int i36 = xk02.e;
                float f6 = (float) (i33 - I2);
                float f7 = (float) an5.d;
                float f8 = ((float) L2) - f7;
                float f9 = f6 - f7;
                float max2 = Math.max(0.0f, 0.0f);
                int i37 = zm5.d;
                int i38 = i36;
                int i39 = 0;
                while (i38 < i36 + i37) {
                    View Z02 = Z0(i38);
                    if (Z02 == null) {
                        l84 = l844;
                        i8 = i38;
                        i7 = i37;
                        i9 = i36;
                    } else {
                        float f10 = f9;
                        long j2 = ((long[]) l844.d)[i38];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        bn5 bn52 = (bn5) Z02.getLayoutParams();
                        if (g1(Z02, i40, i41, bn52)) {
                            Z02.measure(i40, i41);
                        }
                        float f11 = f8 + ((float) (bn52.topMargin + ((pdc) Z02.getLayoutParams()).b.top));
                        float f12 = f10 - ((float) (bn52.rightMargin + ((pdc) Z02.getLayoutParams()).b.bottom));
                        l84 = l844;
                        if (xk02.j == 1) {
                            d(rect3, Z02);
                            z3 = false;
                            b(-1, Z02, false);
                        } else {
                            z3 = false;
                            d(rect3, Z02);
                            b(i39, Z02, false);
                            i39++;
                        }
                        int i42 = i39;
                        int i43 = i34 + ((pdc) Z02.getLayoutParams()).b.left;
                        int i44 = i6 - ((pdc) Z02.getLayoutParams()).b.right;
                        boolean z5 = this.t;
                        if (!z5) {
                            boolean z6 = z3;
                            boolean z7 = z5;
                            view = Z02;
                            i8 = i38;
                            i7 = i37;
                            i9 = i36;
                            if (this.u) {
                                this.w.F(view, zm5, z7, i43, Math.round(f12) - view.getMeasuredHeight(), view.getMeasuredWidth() + i43, Math.round(f12));
                            } else {
                                this.w.F(view, zm5, z7, i43, Math.round(f11), view.getMeasuredWidth() + i43, view.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (this.u) {
                            view = Z02;
                            i8 = i38;
                            i7 = i37;
                            i9 = i36;
                            this.w.F(Z02, zm5, z5, i44 - Z02.getMeasuredWidth(), Math.round(f12) - Z02.getMeasuredHeight(), i44, Math.round(f12));
                        } else {
                            boolean z8 = z3;
                            view = Z02;
                            i8 = i38;
                            i7 = i37;
                            i9 = i36;
                            this.w.F(view, zm5, z5, i44 - view.getMeasuredWidth(), Math.round(f11), i44, view.getMeasuredHeight() + Math.round(f11));
                        }
                        float measuredHeight = ((float) (view.getMeasuredHeight() + bn52.topMargin + ((pdc) view.getLayoutParams()).b.bottom)) + max2 + f11;
                        f9 = f12 - (((float) ((view.getMeasuredHeight() + bn52.bottomMargin) + ((pdc) view.getLayoutParams()).b.top)) + max2);
                        f8 = measuredHeight;
                        i39 = i42;
                    }
                    i38 = i8 + 1;
                    i36 = i9;
                    l844 = l84;
                    i37 = i7;
                }
                xk02.d += this.z.j;
                i5 = zm5.c;
            }
            i21 = i2 + i5;
            if (z2 || !this.t) {
                xk02.f += zm5.c * xk02.j;
            } else {
                xk02.f -= zm5.c * xk02.j;
            }
            i20 = i3 - zm5.c;
            vdc vdc3 = vdc;
            i19 = i4;
            d1 = z2;
        }
        int i45 = i19;
        int i46 = i21;
        int i47 = xk02.b - i46;
        xk02.b = i47;
        int i48 = xk02.g;
        if (i48 != Integer.MIN_VALUE) {
            int i49 = i48 + i46;
            xk02.g = i49;
            if (i47 < 0) {
                xk02.g = i49 + i47;
            }
            e1(vdc, xk02);
        }
        return i45 - xk02.b;
    }

    public final boolean Q() {
        return true;
    }

    public final View Q0(int i) {
        int i2;
        View V0 = V0(0, w(), i);
        if (V0 == null || (i2 = ((int[]) this.w.c)[a.M(V0)]) == -1) {
            return null;
        }
        return R0(V0, (zm5) this.v.get(i2));
    }

    public final View R0(View view, zm5 zm5) {
        boolean d1 = d1();
        int i = zm5.d;
        for (int i2 = 1; i2 < i; i2++) {
            View v2 = v(i2);
            if (!(v2 == null || v2.getVisibility() == 8)) {
                if (!this.t || d1) {
                    if (this.B.f(view) <= this.B.f(v2)) {
                    }
                } else if (this.B.c(view) >= this.B.c(v2)) {
                }
                view = v2;
            }
        }
        return view;
    }

    public final View S0(int i) {
        View V0 = V0(w() - 1, -1, i);
        if (V0 == null) {
            return null;
        }
        return T0(V0, (zm5) this.v.get(((int[]) this.w.c)[a.M(V0)]));
    }

    public final View T0(View view, zm5 zm5) {
        boolean d1 = d1();
        int w2 = (w() - zm5.d) - 1;
        for (int w3 = w() - 2; w3 > w2; w3--) {
            View v2 = v(w3);
            if (!(v2 == null || v2.getVisibility() == 8)) {
                if (!this.t || d1) {
                    if (this.B.c(view) >= this.B.c(v2)) {
                    }
                } else if (this.B.f(view) <= this.B.f(v2)) {
                }
                view = v2;
            }
        }
        return view;
    }

    public final View U0(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View v2 = v(i);
            int J2 = J();
            int L2 = L();
            int K2 = this.n - K();
            int I2 = this.o - I();
            int B2 = a.B(v2) - ((pdc) v2.getLayoutParams()).leftMargin;
            int F2 = a.F(v2) - ((pdc) v2.getLayoutParams()).topMargin;
            int E2 = a.E(v2) + ((pdc) v2.getLayoutParams()).rightMargin;
            int z2 = a.z(v2) + ((pdc) v2.getLayoutParams()).bottomMargin;
            boolean z3 = false;
            boolean z4 = B2 >= K2 || E2 >= J2;
            if (F2 >= I2 || z2 >= L2) {
                z3 = true;
            }
            if (z4 && z3) {
                return v2;
            }
            i += i3;
        }
        return null;
    }

    public final void V() {
        q0();
    }

    public final View V0(int i, int i2, int i3) {
        int M2;
        O0();
        int i4 = 1;
        if (this.z == null) {
            xk0 xk0 = new xk0(1);
            xk0.i = 1;
            xk0.j = 1;
            this.z = xk0;
        }
        int m = this.B.m();
        int h = this.B.h();
        if (i2 <= i) {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View v2 = v(i);
            if (v2 != null && (M2 = a.M(v2)) >= 0 && M2 < i3) {
                if (((pdc) v2.getLayoutParams()).a.p()) {
                    if (view2 == null) {
                        view2 = v2;
                    }
                } else if (this.B.f(v2) >= m && this.B.c(v2) <= h) {
                    return v2;
                } else {
                    if (view == null) {
                        view = v2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final void W(RecyclerView recyclerView) {
        this.K = (View) recyclerView.getParent();
    }

    public final int W0(int i, vdc vdc, zdc zdc, boolean z2) {
        int i2;
        int h;
        if (d1() || !this.t) {
            int h2 = this.B.h() - i;
            if (h2 <= 0) {
                return 0;
            }
            i2 = -b1(-h2, vdc, zdc);
        } else {
            int m = i - this.B.m();
            if (m <= 0) {
                return 0;
            }
            i2 = b1(m, vdc, zdc);
        }
        int i3 = i + i2;
        if (!z2 || (h = this.B.h() - i3) <= 0) {
            return i2;
        }
        this.B.r(h);
        return h + i2;
    }

    public final void X(RecyclerView recyclerView) {
    }

    public final int X0(int i, vdc vdc, zdc zdc, boolean z2) {
        int i2;
        int m;
        if (d1() || !this.t) {
            int m2 = i - this.B.m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -b1(m2, vdc, zdc);
        } else {
            int h = this.B.h() - i;
            if (h <= 0) {
                return 0;
            }
            i2 = b1(-h, vdc, zdc);
        }
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.B.m()) <= 0) {
            return i2;
        }
        this.B.r(-m);
        return i2 - m;
    }

    public final int Y0(View view) {
        return d1() ? ((pdc) view.getLayoutParams()).b.top + ((pdc) view.getLayoutParams()).b.bottom : ((pdc) view.getLayoutParams()).b.left + ((pdc) view.getLayoutParams()).b.right;
    }

    public final View Z0(int i) {
        View view = (View) this.I.get(i);
        return view != null ? view : this.x.j(i, Long.MAX_VALUE).a;
    }

    public final PointF a(int i) {
        View v2;
        if (w() == 0 || (v2 = v(0)) == null) {
            return null;
        }
        int i2 = i < a.M(v2) ? -1 : 1;
        return d1() ? new PointF(0.0f, (float) i2) : new PointF((float) i2, 0.0f);
    }

    public final int a1() {
        if (this.v.size() == 0) {
            return 0;
        }
        int size = this.v.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((zm5) this.v.get(i2)).a);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b1(int r19, defpackage.vdc r20, defpackage.zdc r21) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.w()
            r2 = 0
            if (r1 == 0) goto L_0x01fe
            if (r19 != 0) goto L_0x000d
            goto L_0x01fe
        L_0x000d:
            r18.O0()
            xk0 r1 = r0.z
            r3 = 1
            r1.k = r3
            boolean r1 = r18.d1()
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.t
            if (r1 == 0) goto L_0x0021
            r1 = r3
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r4 = -1
            if (r1 == 0) goto L_0x002b
            if (r19 >= 0) goto L_0x0029
        L_0x0027:
            r5 = r3
            goto L_0x002e
        L_0x0029:
            r5 = r4
            goto L_0x002e
        L_0x002b:
            if (r19 <= 0) goto L_0x0029
            goto L_0x0027
        L_0x002e:
            int r6 = java.lang.Math.abs(r19)
            xk0 r7 = r0.z
            r7.j = r5
            boolean r7 = r18.d1()
            int r8 = r0.n
            int r9 = r0.l
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = r0.o
            int r10 = r0.m
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            if (r7 != 0) goto L_0x0052
            boolean r10 = r0.t
            if (r10 == 0) goto L_0x0052
            r10 = r3
            goto L_0x0053
        L_0x0052:
            r10 = r2
        L_0x0053:
            l84 r15 = r0.w
            if (r5 != r3) goto L_0x0136
            int r11 = r18.w()
            int r11 = r11 - r3
            android.view.View r11 = r0.v(r11)
            if (r11 != 0) goto L_0x0064
            goto L_0x01d5
        L_0x0064:
            xk0 r12 = r0.z
            ga7 r13 = r0.B
            int r13 = r13.c(r11)
            r12.f = r13
            int r12 = androidx.recyclerview.widget.a.M(r11)
            java.lang.Object r13 = r15.c
            int[] r13 = (int[]) r13
            r13 = r13[r12]
            java.util.List r14 = r0.v
            java.lang.Object r13 = r14.get(r13)
            zm5 r13 = (defpackage.zm5) r13
            android.view.View r11 = r0.T0(r11, r13)
            xk0 r13 = r0.z
            r13.i = r3
            int r12 = r12 + r3
            r13.e = r12
            java.lang.Object r14 = r15.c
            int[] r14 = (int[]) r14
            int r3 = r14.length
            if (r3 > r12) goto L_0x0095
            r13.d = r4
            goto L_0x0099
        L_0x0095:
            r3 = r14[r12]
            r13.d = r3
        L_0x0099:
            if (r10 == 0) goto L_0x00c0
            ga7 r3 = r0.B
            int r3 = r3.f(r11)
            r13.f = r3
            xk0 r3 = r0.z
            ga7 r10 = r0.B
            int r10 = r10.f(r11)
            int r10 = -r10
            ga7 r11 = r0.B
            int r11 = r11.m()
            int r11 = r11 + r10
            r3.g = r11
            xk0 r3 = r0.z
            int r10 = r3.g
            int r10 = java.lang.Math.max(r10, r2)
            r3.g = r10
            goto L_0x00d9
        L_0x00c0:
            ga7 r3 = r0.B
            int r3 = r3.c(r11)
            r13.f = r3
            xk0 r3 = r0.z
            ga7 r10 = r0.B
            int r10 = r10.c(r11)
            ga7 r11 = r0.B
            int r11 = r11.h()
            int r10 = r10 - r11
            r3.g = r10
        L_0x00d9:
            xk0 r3 = r0.z
            int r3 = r3.d
            if (r3 == r4) goto L_0x00e9
            java.util.List r4 = r0.v
            int r4 = r4.size()
            r10 = 1
            int r4 = r4 - r10
            if (r3 <= r4) goto L_0x01cd
        L_0x00e9:
            xk0 r3 = r0.z
            int r3 = r3.e
            zdc r4 = r0.y
            int r4 = r4.b()
            if (r3 > r4) goto L_0x01cd
            xk0 r3 = r0.z
            int r4 = r3.g
            int r14 = r6 - r4
            wd6 r11 = r0.M
            r4 = 0
            r11.b = r4
            if (r14 <= 0) goto L_0x01cd
            if (r7 == 0) goto L_0x0116
            int r3 = r3.e
            java.util.List r4 = r0.v
            r16 = -1
            l84 r10 = r0.w
            r12 = r8
            r13 = r9
            r7 = r15
            r15 = r3
            r17 = r4
            r10.s(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0126
        L_0x0116:
            r7 = r15
            int r15 = r3.e
            java.util.List r3 = r0.v
            r16 = -1
            l84 r10 = r0.w
            r12 = r9
            r13 = r8
            r17 = r3
            r10.s(r11, r12, r13, r14, r15, r16, r17)
        L_0x0126:
            xk0 r3 = r0.z
            int r3 = r3.e
            r7.v(r8, r9, r3)
            xk0 r3 = r0.z
            int r3 = r3.e
            r7.P(r3)
            goto L_0x01cd
        L_0x0136:
            r7 = r15
            android.view.View r3 = r0.v(r2)
            if (r3 != 0) goto L_0x013f
            goto L_0x01d5
        L_0x013f:
            xk0 r8 = r0.z
            ga7 r9 = r0.B
            int r9 = r9.f(r3)
            r8.f = r9
            int r8 = androidx.recyclerview.widget.a.M(r3)
            java.lang.Object r9 = r7.c
            int[] r9 = (int[]) r9
            r9 = r9[r8]
            java.util.List r11 = r0.v
            java.lang.Object r9 = r11.get(r9)
            zm5 r9 = (defpackage.zm5) r9
            android.view.View r3 = r0.R0(r3, r9)
            xk0 r9 = r0.z
            r11 = 1
            r9.i = r11
            java.lang.Object r7 = r7.c
            int[] r7 = (int[]) r7
            r7 = r7[r8]
            if (r7 != r4) goto L_0x016d
            r7 = r2
        L_0x016d:
            if (r7 <= 0) goto L_0x0181
            java.util.List r4 = r0.v
            int r9 = r7 + -1
            java.lang.Object r4 = r4.get(r9)
            zm5 r4 = (defpackage.zm5) r4
            xk0 r9 = r0.z
            int r4 = r4.d
            int r8 = r8 - r4
            r9.e = r8
            goto L_0x0183
        L_0x0181:
            r9.e = r4
        L_0x0183:
            xk0 r4 = r0.z
            if (r7 <= 0) goto L_0x018a
            r8 = 1
            int r7 = r7 - r8
            goto L_0x018b
        L_0x018a:
            r7 = r2
        L_0x018b:
            r4.d = r7
            if (r10 == 0) goto L_0x01b3
            ga7 r7 = r0.B
            int r7 = r7.c(r3)
            r4.f = r7
            xk0 r4 = r0.z
            ga7 r7 = r0.B
            int r3 = r7.c(r3)
            ga7 r7 = r0.B
            int r7 = r7.h()
            int r3 = r3 - r7
            r4.g = r3
            xk0 r3 = r0.z
            int r4 = r3.g
            int r4 = java.lang.Math.max(r4, r2)
            r3.g = r4
            goto L_0x01cd
        L_0x01b3:
            ga7 r7 = r0.B
            int r7 = r7.f(r3)
            r4.f = r7
            xk0 r4 = r0.z
            ga7 r7 = r0.B
            int r3 = r7.f(r3)
            int r3 = -r3
            ga7 r7 = r0.B
            int r7 = r7.m()
            int r7 = r7 + r3
            r4.g = r7
        L_0x01cd:
            xk0 r3 = r0.z
            int r4 = r3.g
            int r4 = r6 - r4
            r3.b = r4
        L_0x01d5:
            xk0 r3 = r0.z
            int r4 = r3.g
            r7 = r20
            r8 = r21
            int r3 = r0.P0(r7, r8, r3)
            int r3 = r3 + r4
            if (r3 >= 0) goto L_0x01e5
            return r2
        L_0x01e5:
            if (r1 == 0) goto L_0x01ef
            if (r6 <= r3) goto L_0x01ec
            int r1 = -r5
            int r1 = r1 * r3
            goto L_0x01f3
        L_0x01ec:
            r1 = r19
            goto L_0x01f3
        L_0x01ef:
            if (r6 <= r3) goto L_0x01ec
            int r1 = r5 * r3
        L_0x01f3:
            ga7 r2 = r0.B
            int r3 = -r1
            r2.r(r3)
            xk0 r0 = r0.z
            r0.h = r1
            return r1
        L_0x01fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b1(int, vdc, zdc):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if ((r4 + r5) > 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if ((r4 + r5) >= 0) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c1(int r5) {
        /*
            r4 = this;
            int r0 = r4.w()
            if (r0 == 0) goto L_0x0059
            if (r5 != 0) goto L_0x0009
            goto L_0x0059
        L_0x0009:
            r4.O0()
            boolean r0 = r4.d1()
            android.view.View r1 = r4.K
            if (r0 == 0) goto L_0x0019
            int r1 = r1.getWidth()
            goto L_0x001d
        L_0x0019:
            int r1 = r1.getHeight()
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            int r0 = r4.n
            goto L_0x0024
        L_0x0022:
            int r0 = r4.o
        L_0x0024:
            int r2 = r4.H()
            r3 = 1
            an5 r4 = r4.A
            if (r2 != r3) goto L_0x0044
            int r2 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L_0x003d
            int r4 = r4.d
            int r0 = r0 + r4
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r2)
            int r4 = -r4
            goto L_0x0058
        L_0x003d:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 <= 0) goto L_0x0057
            goto L_0x0056
        L_0x0044:
            if (r5 <= 0) goto L_0x004f
            int r4 = r4.d
            int r0 = r0 - r4
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r5)
            goto L_0x0058
        L_0x004f:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 < 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            int r5 = -r4
        L_0x0057:
            r4 = r5
        L_0x0058:
            return r4
        L_0x0059:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c1(int):int");
    }

    public final void d0(int i, int i2) {
        h1(i);
    }

    public final boolean d1() {
        int i = this.p;
        return i == 0 || i == 1;
    }

    public final boolean e() {
        if (this.q == 0) {
            return d1();
        }
        if (d1()) {
            int i = this.n;
            View view = this.K;
            return i > (view != null ? view.getWidth() : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e1(defpackage.vdc r10, defpackage.xk0 r11) {
        /*
            r9 = this;
            boolean r0 = r11.k
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r11.j
            r1 = -1
            l84 r2 = r9.w
            if (r0 != r1) goto L_0x008c
            int r0 = r11.g
            if (r0 >= 0) goto L_0x0012
            goto L_0x0111
        L_0x0012:
            int r0 = r9.w()
            if (r0 != 0) goto L_0x001a
            goto L_0x0111
        L_0x001a:
            int r3 = r0 + -1
            android.view.View r4 = r9.v(r3)
            if (r4 != 0) goto L_0x0024
            goto L_0x0111
        L_0x0024:
            java.lang.Object r2 = r2.c
            int[] r2 = (int[]) r2
            int r4 = androidx.recyclerview.widget.a.M(r4)
            r2 = r2[r4]
            if (r2 != r1) goto L_0x0032
            goto L_0x0111
        L_0x0032:
            java.util.List r1 = r9.v
            java.lang.Object r1 = r1.get(r2)
            zm5 r1 = (defpackage.zm5) r1
            r4 = r3
        L_0x003b:
            if (r4 < 0) goto L_0x0084
            android.view.View r5 = r9.v(r4)
            if (r5 != 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            int r6 = r11.g
            boolean r7 = r9.d1()
            if (r7 != 0) goto L_0x0059
            boolean r7 = r9.t
            if (r7 == 0) goto L_0x0059
            ga7 r7 = r9.B
            int r7 = r7.c(r5)
            if (r7 > r6) goto L_0x0084
            goto L_0x0068
        L_0x0059:
            ga7 r7 = r9.B
            int r7 = r7.f(r5)
            ga7 r8 = r9.B
            int r8 = r8.g()
            int r8 = r8 - r6
            if (r7 < r8) goto L_0x0084
        L_0x0068:
            int r6 = r1.k
            int r5 = androidx.recyclerview.widget.a.M(r5)
            if (r6 != r5) goto L_0x0081
            if (r2 > 0) goto L_0x0074
            r0 = r4
            goto L_0x0084
        L_0x0074:
            int r0 = r11.j
            int r2 = r2 + r0
            java.util.List r0 = r9.v
            java.lang.Object r0 = r0.get(r2)
            zm5 r0 = (defpackage.zm5) r0
            r1 = r0
            r0 = r4
        L_0x0081:
            int r4 = r4 + -1
            goto L_0x003b
        L_0x0084:
            if (r3 < r0) goto L_0x0111
            r9.u0(r3, r10)
            int r3 = r3 + -1
            goto L_0x0084
        L_0x008c:
            int r0 = r11.g
            if (r0 >= 0) goto L_0x0092
            goto L_0x0111
        L_0x0092:
            int r0 = r9.w()
            if (r0 != 0) goto L_0x009a
            goto L_0x0111
        L_0x009a:
            r3 = 0
            android.view.View r4 = r9.v(r3)
            if (r4 != 0) goto L_0x00a3
            goto L_0x0111
        L_0x00a3:
            java.lang.Object r2 = r2.c
            int[] r2 = (int[]) r2
            int r4 = androidx.recyclerview.widget.a.M(r4)
            r2 = r2[r4]
            if (r2 != r1) goto L_0x00b0
            goto L_0x0111
        L_0x00b0:
            java.util.List r4 = r9.v
            java.lang.Object r4 = r4.get(r2)
            zm5 r4 = (defpackage.zm5) r4
        L_0x00b8:
            if (r3 >= r0) goto L_0x0109
            android.view.View r5 = r9.v(r3)
            if (r5 != 0) goto L_0x00c1
            goto L_0x0106
        L_0x00c1:
            int r6 = r11.g
            boolean r7 = r9.d1()
            if (r7 != 0) goto L_0x00dd
            boolean r7 = r9.t
            if (r7 == 0) goto L_0x00dd
            ga7 r7 = r9.B
            int r7 = r7.g()
            ga7 r8 = r9.B
            int r8 = r8.f(r5)
            int r7 = r7 - r8
            if (r7 > r6) goto L_0x0109
            goto L_0x00e5
        L_0x00dd:
            ga7 r7 = r9.B
            int r7 = r7.c(r5)
            if (r7 > r6) goto L_0x0109
        L_0x00e5:
            int r6 = r4.l
            int r5 = androidx.recyclerview.widget.a.M(r5)
            if (r6 != r5) goto L_0x0106
            java.util.List r1 = r9.v
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r2 < r1) goto L_0x00f9
            r1 = r3
            goto L_0x0109
        L_0x00f9:
            int r1 = r11.j
            int r2 = r2 + r1
            java.util.List r1 = r9.v
            java.lang.Object r1 = r1.get(r2)
            zm5 r1 = (defpackage.zm5) r1
            r4 = r1
            r1 = r3
        L_0x0106:
            int r3 = r3 + 1
            goto L_0x00b8
        L_0x0109:
            if (r1 < 0) goto L_0x0111
            r9.u0(r1, r10)
            int r1 = r1 + -1
            goto L_0x0109
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.e1(vdc, xk0):void");
    }

    public final boolean f() {
        if (this.q == 0) {
            return !d1();
        }
        if (d1()) {
            return true;
        }
        int i = this.o;
        View view = this.K;
        return i > (view != null ? view.getHeight() : 0);
    }

    public final void f0(int i, int i2) {
        h1(Math.min(i, i2));
    }

    public final void f1(int i) {
        if (this.p != i) {
            q0();
            this.p = i;
            this.B = null;
            this.C = null;
            this.v.clear();
            an5 an5 = this.A;
            an5.b(an5);
            an5.d = 0;
            w0();
        }
    }

    public final boolean g(pdc pdc) {
        return pdc instanceof bn5;
    }

    public final void g0(int i, int i2) {
        h1(i);
    }

    public final boolean g1(View view, int i, int i2, bn5 bn5) {
        return view.isLayoutRequested() || !this.h || !R(view.getWidth(), i, bn5.width) || !R(view.getHeight(), i2, bn5.height);
    }

    public final void h0(int i) {
        h1(i);
    }

    public final void h1(int i) {
        int i2 = -1;
        View U0 = U0(w() - 1, -1);
        if (U0 != null) {
            i2 = a.M(U0);
        }
        if (i < i2) {
            int w2 = w();
            l84 l84 = this.w;
            l84.x(w2);
            l84.y(w2);
            l84.w(w2);
            if (i < ((int[]) l84.c).length) {
                this.L = i;
                View v2 = v(0);
                if (v2 != null) {
                    this.E = a.M(v2);
                    if (d1() || !this.t) {
                        this.F = this.B.f(v2) - this.B.m();
                        return;
                    }
                    this.F = this.B.i() + this.B.c(v2);
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h1(i);
        h1(i);
    }

    public final void i1(an5 an5, boolean z2, boolean z3) {
        int i;
        boolean z4 = false;
        if (z3) {
            int i2 = d1() ? this.m : this.l;
            xk0 xk0 = this.z;
            if (i2 == 0 || i2 == Integer.MIN_VALUE) {
                z4 = true;
            }
            xk0.c = z4;
        } else {
            this.z.c = false;
        }
        if (d1() || !this.t) {
            this.z.b = this.B.h() - an5.c;
        } else {
            this.z.b = an5.c - K();
        }
        xk0 xk02 = this.z;
        xk02.e = an5.a;
        xk02.i = 1;
        xk02.j = 1;
        xk02.f = an5.c;
        xk02.g = Integer.MIN_VALUE;
        xk02.d = an5.b;
        if (z2 && this.v.size() > 1 && (i = an5.b) >= 0 && i < this.v.size() - 1) {
            xk0 xk03 = this.z;
            xk03.d++;
            xk03.e += ((zm5) this.v.get(an5.b)).d;
        }
    }

    public final void j0(vdc vdc, zdc zdc) {
        boolean z2;
        int i;
        int i2;
        int i3;
        wd6 wd6;
        int i4;
        View v2;
        int i5;
        vdc vdc2 = vdc;
        zdc zdc2 = zdc;
        this.x = vdc2;
        this.y = zdc2;
        int b = zdc.b();
        if (b != 0 || !zdc2.h) {
            int H2 = H();
            int i6 = this.p;
            if (i6 == 0) {
                this.t = H2 == 1;
                this.u = this.q == 2;
            } else if (i6 == 1) {
                this.t = H2 != 1;
                this.u = this.q == 2;
            } else if (i6 == 2) {
                boolean z3 = H2 == 1;
                this.t = z3;
                if (this.q == 2) {
                    this.t = !z3;
                }
                this.u = false;
            } else if (i6 != 3) {
                this.t = false;
                this.u = false;
            } else {
                boolean z4 = H2 == 1;
                this.t = z4;
                if (this.q == 2) {
                    this.t = !z4;
                }
                this.u = true;
            }
            O0();
            if (this.z == null) {
                xk0 xk0 = new xk0(1);
                xk0.i = 1;
                xk0.j = 1;
                this.z = xk0;
            }
            l84 l84 = this.w;
            l84.x(b);
            l84.y(b);
            l84.w(b);
            this.z.k = false;
            cn5 cn5 = this.D;
            if (cn5 != null && (i5 = cn5.a) >= 0 && i5 < b) {
                this.E = i5;
            }
            an5 an5 = this.A;
            if (!(an5.f && this.E == -1 && cn5 == null)) {
                an5.b(an5);
                cn5 cn52 = this.D;
                if (!zdc2.h && (i4 = this.E) != -1) {
                    if (i4 < 0 || i4 >= zdc.b()) {
                        this.E = -1;
                        this.F = Integer.MIN_VALUE;
                    } else {
                        int i7 = this.E;
                        an5.a = i7;
                        an5.b = ((int[]) l84.c)[i7];
                        cn5 cn53 = this.D;
                        if (cn53 != null) {
                            int b2 = zdc.b();
                            int i8 = cn53.a;
                            if (i8 >= 0 && i8 < b2) {
                                an5.c = this.B.m() + cn52.b;
                                an5.g = true;
                                an5.b = -1;
                                an5.f = true;
                            }
                        }
                        if (this.F == Integer.MIN_VALUE) {
                            View r2 = r(this.E);
                            if (r2 == null) {
                                if (w() > 0 && (v2 = v(0)) != null) {
                                    an5.e = this.E < a.M(v2);
                                }
                                an5.a(an5);
                            } else if (this.B.d(r2) > this.B.n()) {
                                an5.a(an5);
                            } else if (this.B.f(r2) - this.B.m() < 0) {
                                an5.c = this.B.m();
                                an5.e = false;
                            } else if (this.B.h() - this.B.c(r2) < 0) {
                                an5.c = this.B.h();
                                an5.e = true;
                            } else {
                                an5.c = an5.e ? this.B.o() + this.B.c(r2) : this.B.f(r2);
                            }
                        } else if (d1() || !this.t) {
                            an5.c = this.B.m() + this.F;
                        } else {
                            an5.c = this.F - this.B.i();
                        }
                        an5.f = true;
                    }
                }
                if (w() != 0) {
                    View S0 = an5.e ? S0(zdc.b()) : Q0(zdc.b());
                    if (S0 != null) {
                        FlexboxLayoutManager flexboxLayoutManager = an5.h;
                        ga7 ga7 = flexboxLayoutManager.q == 0 ? flexboxLayoutManager.C : flexboxLayoutManager.B;
                        if (flexboxLayoutManager.d1() || !flexboxLayoutManager.t) {
                            if (an5.e) {
                                an5.c = ga7.o() + ga7.c(S0);
                            } else {
                                an5.c = ga7.f(S0);
                            }
                        } else if (an5.e) {
                            an5.c = ga7.o() + ga7.f(S0);
                        } else {
                            an5.c = ga7.c(S0);
                        }
                        int M2 = a.M(S0);
                        an5.a = M2;
                        an5.g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.w.c;
                        if (M2 == -1) {
                            M2 = 0;
                        }
                        int i9 = iArr[M2];
                        if (i9 == -1) {
                            i9 = 0;
                        }
                        an5.b = i9;
                        int size = flexboxLayoutManager.v.size();
                        int i10 = an5.b;
                        if (size > i10) {
                            an5.a = ((zm5) flexboxLayoutManager.v.get(i10)).k;
                        }
                        an5.f = true;
                    }
                }
                an5.a(an5);
                an5.a = 0;
                an5.b = 0;
                an5.f = true;
            }
            q(vdc);
            if (an5.e) {
                j1(an5, false, true);
            } else {
                i1(an5, false, true);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n, this.l);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.o, this.m);
            int i11 = this.n;
            int i12 = this.o;
            boolean d1 = d1();
            Context context = this.J;
            if (d1) {
                int i13 = this.G;
                z2 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
                xk0 xk02 = this.z;
                i = xk02.c ? context.getResources().getDisplayMetrics().heightPixels : xk02.b;
            } else {
                int i14 = this.H;
                z2 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
                xk0 xk03 = this.z;
                i = xk03.c ? context.getResources().getDisplayMetrics().widthPixels : xk03.b;
            }
            int i15 = i;
            this.G = i11;
            this.H = i12;
            int i16 = this.L;
            wd6 wd62 = this.M;
            if (i16 != -1 || (this.E == -1 && !z2)) {
                wd6 wd63 = wd62;
                int min = i16 != -1 ? Math.min(i16, an5.a) : an5.a;
                wd63.b = null;
                if (d1()) {
                    if (this.v.size() > 0) {
                        l84.u(min, this.v);
                        this.w.s(this.M, makeMeasureSpec, makeMeasureSpec2, i15, min, an5.a, this.v);
                    } else {
                        l84.w(b);
                        this.w.s(this.M, makeMeasureSpec, makeMeasureSpec2, i15, 0, -1, this.v);
                    }
                } else if (this.v.size() > 0) {
                    l84.u(min, this.v);
                    this.w.s(this.M, makeMeasureSpec2, makeMeasureSpec, i15, min, an5.a, this.v);
                } else {
                    l84.w(b);
                    this.w.s(this.M, makeMeasureSpec2, makeMeasureSpec, i15, 0, -1, this.v);
                }
                this.v = (List) wd63.b;
                l84.v(makeMeasureSpec, makeMeasureSpec2, min);
                l84.P(min);
            } else if (!an5.e) {
                this.v.clear();
                wd62.b = null;
                if (d1()) {
                    wd6 = wd62;
                    this.w.s(this.M, makeMeasureSpec, makeMeasureSpec2, i15, 0, an5.a, this.v);
                } else {
                    wd6 = wd62;
                    this.w.s(this.M, makeMeasureSpec2, makeMeasureSpec, i15, 0, an5.a, this.v);
                }
                this.v = (List) wd6.b;
                l84.v(makeMeasureSpec, makeMeasureSpec2, 0);
                l84.P(0);
                int i17 = ((int[]) l84.c)[an5.a];
                an5.b = i17;
                this.z.d = i17;
            }
            P0(vdc2, zdc2, this.z);
            if (an5.e) {
                i3 = this.z.f;
                i1(an5, true, false);
                P0(vdc2, zdc2, this.z);
                i2 = this.z.f;
            } else {
                i2 = this.z.f;
                j1(an5, true, false);
                P0(vdc2, zdc2, this.z);
                i3 = this.z.f;
            }
            if (w() <= 0) {
                return;
            }
            if (an5.e) {
                X0(W0(i2, vdc2, zdc2, true) + i3, vdc2, zdc2, false);
            } else {
                W0(X0(i3, vdc2, zdc2, true) + i2, vdc2, zdc2, false);
            }
        }
    }

    public final void j1(an5 an5, boolean z2, boolean z3) {
        int i;
        boolean z4 = false;
        if (z3) {
            int i2 = d1() ? this.m : this.l;
            xk0 xk0 = this.z;
            if (i2 == 0 || i2 == Integer.MIN_VALUE) {
                z4 = true;
            }
            xk0.c = z4;
        } else {
            this.z.c = false;
        }
        if (d1() || !this.t) {
            this.z.b = an5.c - this.B.m();
        } else {
            this.z.b = (this.K.getWidth() - an5.c) - this.B.m();
        }
        xk0 xk02 = this.z;
        xk02.e = an5.a;
        xk02.i = 1;
        xk02.j = -1;
        xk02.f = an5.c;
        xk02.g = Integer.MIN_VALUE;
        int i3 = an5.b;
        xk02.d = i3;
        if (z2 && i3 > 0 && this.v.size() > (i = an5.b)) {
            xk0 xk03 = this.z;
            xk03.d--;
            xk03.e -= ((zm5) this.v.get(i)).d;
        }
    }

    public final int k(zdc zdc) {
        return L0(zdc);
    }

    public final void k0(zdc zdc) {
        this.D = null;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.L = -1;
        an5.b(this.A);
        this.I.clear();
    }

    public final void k1(View view, int i) {
        this.I.put(i, view);
    }

    public final int l(zdc zdc) {
        return M0(zdc);
    }

    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof cn5) {
            this.D = (cn5) parcelable;
            w0();
        }
    }

    public final int m(zdc zdc) {
        return N0(zdc);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, cn5] */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.os.Parcelable, java.lang.Object, cn5] */
    public final Parcelable m0() {
        cn5 cn5 = this.D;
        if (cn5 != null) {
            ? obj = new Object();
            obj.a = cn5.a;
            obj.b = cn5.b;
            return obj;
        }
        ? obj2 = new Object();
        if (w() > 0) {
            View v2 = v(0);
            obj2.a = a.M(v2);
            obj2.b = this.B.f(v2) - this.B.m();
        } else {
            obj2.a = -1;
        }
        return obj2;
    }

    public final int n(zdc zdc) {
        return L0(zdc);
    }

    public final int o(zdc zdc) {
        return M0(zdc);
    }

    public final int p(zdc zdc) {
        return N0(zdc);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [bn5, pdc] */
    public final pdc s() {
        ? pdc = new pdc(-2, -2);
        pdc.X = 0.0f;
        pdc.Y = 1.0f;
        pdc.Z = -1;
        pdc.s0 = -1.0f;
        pdc.v0 = 16777215;
        pdc.w0 = 16777215;
        return pdc;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [bn5, pdc] */
    public final pdc t(Context context, AttributeSet attributeSet) {
        ? pdc = new pdc(context, attributeSet);
        pdc.X = 0.0f;
        pdc.Y = 1.0f;
        pdc.Z = -1;
        pdc.s0 = -1.0f;
        pdc.v0 = 16777215;
        pdc.w0 = 16777215;
        return pdc;
    }

    public final int x0(int i, vdc vdc, zdc zdc) {
        if (!d1() || this.q == 0) {
            int b1 = b1(i, vdc, zdc);
            this.I.clear();
            return b1;
        }
        int c1 = c1(i);
        this.A.d += c1;
        this.C.r(-c1);
        return c1;
    }

    public final void y0(int i) {
        this.E = i;
        this.F = Integer.MIN_VALUE;
        cn5 cn5 = this.D;
        if (cn5 != null) {
            cn5.a = -1;
        }
        w0();
    }

    public final int z0(int i, vdc vdc, zdc zdc) {
        if (d1() || (this.q == 0 && !d1())) {
            int b1 = b1(i, vdc, zdc);
            this.I.clear();
            return b1;
        }
        int c1 = c1(i);
        this.A.d += c1;
        this.C.r(-c1);
        return c1;
    }
}
