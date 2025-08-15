package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: br0  reason: default package */
public final class br0 extends nd7 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ br0(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    public void I(int i) {
        switch (this.k) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.L(1);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.y(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void J(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.k) {
            case 0:
                ((BottomSheetBehavior) this.l).A(i2);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.a.b0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.i(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                uge uge = (uge) this.l;
                if (i <= (-uge.getWidth()) || i >= uge.getWidth()) {
                    uge.b = true;
                    tge callback = uge.getCallback();
                    if (callback != null) {
                        callback.m();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r4.a.N(r5) == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (java.lang.Math.abs(r6 - r4.a.A()) < java.lang.Math.abs(r6 - r4.a.C())) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (r6 > r4.E) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        if (java.lang.Math.abs(r5.getTop() - r4.E()) < java.lang.Math.abs(r5.getTop() - r4.E)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        if (java.lang.Math.abs(r6 - r4.E) < java.lang.Math.abs(r6 - r4.G)) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014f, code lost:
        if (java.lang.Math.abs(r6 - r4.D) < java.lang.Math.abs(r6 - r4.G)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015f, code lost:
        if (r6 < java.lang.Math.abs(r6 - r4.G)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0170, code lost:
        if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r4.G)) goto L_0x0172;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            int r0 = r4.k
            switch(r0) {
                case 0: goto L_0x009c;
                case 1: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r6 = r5.getWidth()
            int r6 = r6 / 2
            int r7 = r6 / 2
            int r0 = r6 - r7
            int r6 = r6 + r7
            int r7 = r5.getLeft()
            java.lang.Object r4 = r4.l
            uge r4 = (defpackage.uge) r4
            if (r7 <= r0) goto L_0x001f
            int r6 = r4.getWidth()
            goto L_0x002f
        L_0x001f:
            int r7 = r5.getRight()
            if (r7 >= r6) goto L_0x002b
            int r6 = r4.getWidth()
            int r6 = -r6
            goto L_0x002f
        L_0x002b:
            int r6 = r4.getPaddingStart()
        L_0x002f:
            dnf r7 = r4.a
            int r0 = r5.getTop()
            boolean r5 = r7.p(r5, r6, r0)
            if (r5 == 0) goto L_0x003e
            r4.postInvalidateOnAnimation()
        L_0x003e:
            return
        L_0x003f:
            java.lang.Object r4 = r4.l
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            z04 r0 = r4.a
            boolean r0 = r0.M(r6)
            r1 = 3
            if (r0 == 0) goto L_0x004d
            goto L_0x0097
        L_0x004d:
            z04 r0 = r4.a
            boolean r0 = r0.X(r5, r6)
            r2 = 5
            if (r0 == 0) goto L_0x0068
            z04 r0 = r4.a
            boolean r6 = r0.Q(r6, r7)
            if (r6 != 0) goto L_0x0066
            z04 r6 = r4.a
            boolean r6 = r6.N(r5)
            if (r6 == 0) goto L_0x0097
        L_0x0066:
            r1 = r2
            goto L_0x0097
        L_0x0068:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x007a
            goto L_0x0066
        L_0x007a:
            int r6 = r5.getLeft()
            z04 r7 = r4.a
            int r7 = r7.A()
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            z04 r0 = r4.a
            int r0 = r0.C()
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x0066
        L_0x0097:
            r6 = 1
            r4.A(r1, r5, r6)
            return
        L_0x009c:
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            java.lang.Object r4 = r4.l
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            if (r1 >= 0) goto L_0x00bb
            boolean r6 = r4.b
            if (r6 == 0) goto L_0x00ae
        L_0x00ab:
            r2 = r3
            goto L_0x0172
        L_0x00ae:
            int r6 = r5.getTop()
            java.lang.System.currentTimeMillis()
            int r7 = r4.E
            if (r6 <= r7) goto L_0x00ab
            goto L_0x0172
        L_0x00bb:
            boolean r1 = r4.I
            if (r1 == 0) goto L_0x010a
            boolean r1 = r4.M(r5, r7)
            if (r1 == 0) goto L_0x010a
            float r6 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r7)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00d8
            int r6 = r4.d
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x00e7
        L_0x00d8:
            int r6 = r5.getTop()
            int r7 = r4.T
            int r0 = r4.E()
            int r0 = r0 + r7
            int r0 = r0 / 2
            if (r6 <= r0) goto L_0x00ea
        L_0x00e7:
            r2 = 5
            goto L_0x0172
        L_0x00ea:
            boolean r6 = r4.b
            if (r6 == 0) goto L_0x00ef
            goto L_0x00ab
        L_0x00ef:
            int r6 = r5.getTop()
            int r7 = r4.E()
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.getTop()
            int r0 = r4.E
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto L_0x0172
            goto L_0x00ab
        L_0x010a:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L_0x0138
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x011c
            goto L_0x0138
        L_0x011c:
            boolean r6 = r4.b
            if (r6 == 0) goto L_0x0122
        L_0x0120:
            r2 = r1
            goto L_0x0172
        L_0x0122:
            int r6 = r5.getTop()
            int r7 = r4.E
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r4.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x0120
            goto L_0x0172
        L_0x0138:
            int r6 = r5.getTop()
            boolean r7 = r4.b
            if (r7 == 0) goto L_0x0153
            int r7 = r4.D
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r4.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x0120
            goto L_0x00ab
        L_0x0153:
            int r7 = r4.E
            if (r6 >= r7) goto L_0x0163
            int r7 = r4.G
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto L_0x0172
            goto L_0x00ab
        L_0x0163:
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r4.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x0120
        L_0x0172:
            r4.getClass()
            r6 = 1
            r4.N(r2, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br0.K(android.view.View, float, float):void");
    }

    public final boolean W(View view, int i) {
        WeakReference weakReference;
        switch (this.k) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                int i2 = bottomSheetBehavior.L;
                if (i2 == 1 || bottomSheetBehavior.b0) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.Z == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.U;
                return weakReference3 != null && weakReference3.get() == view;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
            default:
                uge uge = (uge) this.l;
                tge callback = uge.getCallback();
                return view == (callback != null ? callback.q() : null) && !uge.b;
        }
    }

    public final int f(View view, int i) {
        switch (this.k) {
            case 0:
                return view.getLeft();
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return z04.p(i, sideSheetBehavior.a.E(), sideSheetBehavior.a.D());
            default:
                return ote.e(i, -2147483647, Integer.MAX_VALUE);
        }
    }

    public int g(View view, int i) {
        switch (this.k) {
            case 0:
                return z04.p(i, ((BottomSheetBehavior) this.l).E(), y(view));
            case 1:
                return view.getTop();
            default:
                return super.g(view, i);
        }
    }

    public int x(View view) {
        switch (this.k) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            case 2:
                return view.getWidth();
            default:
                return super.x(view);
        }
    }

    public int y(View view) {
        switch (this.k) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.y(view);
        }
    }
}
