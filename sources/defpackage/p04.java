package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: p04  reason: default package */
public abstract class p04 extends hdc implements v0e {
    public final uu3 X;
    public ArrayList Y;
    public int Z;
    public final /* synthetic */ int o;
    public final SparseArray s0;
    public int t0;
    public Cloneable u0;
    public mof v0;

    public p04(uu3 uu3, int i) {
        this.o = i;
        switch (i) {
            case 1:
                this.X = uu3;
                this.u0 = new LongSparseArray();
                this.Y = new ArrayList();
                this.Z = Integer.MAX_VALUE;
                this.s0 = new SparseArray();
                A(true);
                return;
            default:
                this.X = uu3;
                this.u0 = new wv7((Object) null);
                this.Y = new ArrayList();
                this.Z = Integer.MAX_VALUE;
                this.s0 = new SparseArray();
                A(true);
                return;
        }
    }

    public static ViewPager2 H(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public static ViewPager2 I(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        ViewParent parent2 = recyclerView.getParent();
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + parent2).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(defpackage.doc r8, int r9) {
        /*
            r7 = this;
            long r0 = r7.k(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            uu3 r3 = r7.X
            w12 r4 = r8.F0
            r5 = 1
            r6 = 0
            znc r2 = r3.getChildRouter(r4, r2, r5, r6)
            r2.e = r5
            znc r4 = r8.G0
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0023
            znc r4 = r8.G0
            if (r4 == 0) goto L_0x0023
            r3.removeChildRouter(r4)
        L_0x0023:
            r8.G0 = r2
            r8.H0 = r0
            boolean r3 = r2.n()
            if (r3 != 0) goto L_0x004d
            java.lang.Cloneable r3 = r7.u0
            wv7 r3 = (defpackage.wv7) r3
            java.lang.Object r3 = r3.c(r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto L_0x004d
            r2.N(r3)
            java.lang.Cloneable r3 = r7.u0
            wv7 r3 = (defpackage.wv7) r3
            r3.g(r0)
            java.util.ArrayList r3 = r7.Y
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.remove(r0)
            r6 = r5
        L_0x004d:
            java.util.ArrayList r0 = r2.e()
            java.lang.Object r0 = defpackage.x53.q0(r0)
            coc r0 = (defpackage.coc) r0
            if (r0 == 0) goto L_0x0062
            uu3 r0 = r0.a
            if (r0 == 0) goto L_0x0062
            uu3 r0 = r0.getTargetController()
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x007e
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Router adapter. Attach router, target exist | router restored:"
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
        L_0x007e:
            r2.I()
            r7.E(r2, r9)
            int r0 = r7.t0
            if (r9 == r0) goto L_0x00a2
            java.util.ArrayList r0 = r2.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r0.next()
            coc r1 = (defpackage.coc) r1
            uu3 r1 = r1.a
            r1.setOptionsMenuHidden(r5)
            goto L_0x0090
        L_0x00a2:
            android.util.SparseArray r7 = r7.s0
            r7.put(r9, r2)
            r8.I0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p04.C(doc, int):void");
    }

    public void D(eoc eoc, int i) {
        Bundle bundle;
        znc znc;
        long k = k(i);
        String valueOf = String.valueOf(k);
        uu3 uu3 = this.X;
        znc childRouter = uu3.getChildRouter(eoc.F0, valueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(eoc.G0) && (znc = eoc.G0) != null) {
            uu3.removeChildRouter(znc);
        }
        eoc.G0 = childRouter;
        eoc.I0 = k;
        if (!childRouter.n() && (bundle = (Bundle) ((LongSparseArray) this.u0).get(k)) != null) {
            childRouter.N(bundle);
            ((LongSparseArray) this.u0).remove(k);
            this.Y.remove(Long.valueOf(k));
        }
        childRouter.I();
        E(childRouter, i);
        if (i != this.t0) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((coc) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.s0.put(i, childRouter);
        eoc.J0 = true;
    }

    public abstract void E(znc znc, int i);

    public void F(doc doc) {
        if (doc.I0) {
            znc znc = doc.G0;
            if (znc != null) {
                znc.F();
                L(doc.H0, znc);
                SparseArray sparseArray = this.s0;
                if (tpa.f(sparseArray.get(doc.g()), znc)) {
                    sparseArray.remove(doc.g());
                }
            }
            doc.I0 = false;
        }
    }

    public void G(eoc eoc) {
        if (eoc.J0) {
            znc znc = eoc.G0;
            if (znc != null) {
                znc.F();
                K(eoc.I0, znc);
                SparseArray sparseArray = this.s0;
                if (tpa.f(sparseArray.get(eoc.H0), znc)) {
                    sparseArray.remove(eoc.H0);
                }
            }
            eoc.J0 = false;
        }
    }

    public void J(eoc eoc) {
        G(eoc);
        znc znc = eoc.G0;
        if (znc != null) {
            this.X.removeChildRouter(znc);
            eoc.G0 = null;
        }
    }

    public void K(long j, znc znc) {
        Bundle bundle = new Bundle();
        znc.O(bundle);
        ((LongSparseArray) this.u0).put(j, bundle);
        this.Y.remove(Long.valueOf(j));
        this.Y.add(Long.valueOf(j));
        while (((LongSparseArray) this.u0).size() > this.Z) {
            ((LongSparseArray) this.u0).remove(((Number) this.Y.remove(0)).longValue());
        }
    }

    public void L(long j, znc znc) {
        Bundle bundle = new Bundle();
        znc.O(bundle);
        ((wv7) this.u0).f(j, bundle);
        this.Y.remove(Long.valueOf(j));
        this.Y.add(Long.valueOf(j));
        while (((wv7) this.u0).h() > this.Z) {
            ((wv7) this.u0).g(((Number) this.Y.remove(0)).longValue());
        }
    }

    public final Parcelable a() {
        switch (this.o) {
            case 0:
                SparseArray sparseArray = this.s0;
                j37 Y2 = ote.Y(0, sparseArray.size());
                ArrayList arrayList = new ArrayList(z53.S(Y2, 10));
                Iterator it = Y2.iterator();
                while (((i37) it).c) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(((i37) it).a())));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                while (!arrayList2.isEmpty()) {
                    int intValue = ((Number) arrayList2.remove(y53.L(arrayList2))).intValue();
                    L(k(intValue), (znc) sparseArray.get(intValue));
                    if (!arrayList2.isEmpty()) {
                        int intValue2 = ((Number) arrayList2.remove(0)).intValue();
                        L(k(intValue2), (znc) sparseArray.get(intValue2));
                    }
                }
                j37 Y3 = ote.Y(0, ((wv7) this.u0).h());
                ArrayList arrayList3 = new ArrayList(z53.S(Y3, 10));
                Iterator it2 = Y3.iterator();
                while (((i37) it2).c) {
                    arrayList3.add(Long.valueOf(((wv7) this.u0).e(((i37) it2).a())));
                }
                j37 Y4 = ote.Y(0, ((wv7) this.u0).h());
                ArrayList arrayList4 = new ArrayList(z53.S(Y4, 10));
                Iterator it3 = Y4.iterator();
                while (((i37) it3).c) {
                    arrayList4.add((Bundle) ((wv7) this.u0).i(((i37) it3).a()));
                }
                return new o04(arrayList3, arrayList4, this.Y, this.Z);
            default:
                SparseArray sparseArray2 = this.s0;
                j37 Y5 = ote.Y(0, sparseArray2.size());
                ArrayList arrayList5 = new ArrayList(z53.S(Y5, 10));
                Iterator it4 = Y5.iterator();
                while (((i37) it4).c) {
                    arrayList5.add(Integer.valueOf(sparseArray2.keyAt(((i37) it4).a())));
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                while (!arrayList6.isEmpty()) {
                    int intValue3 = ((Number) arrayList6.remove(y53.L(arrayList6))).intValue();
                    K(k(intValue3), (znc) sparseArray2.get(intValue3));
                    if (!arrayList6.isEmpty()) {
                        int intValue4 = ((Number) arrayList6.remove(0)).intValue();
                        K(k(intValue4), (znc) sparseArray2.get(intValue4));
                    }
                }
                j37 Y6 = ote.Y(0, ((LongSparseArray) this.u0).size());
                ArrayList arrayList7 = new ArrayList(z53.S(Y6, 10));
                Iterator it5 = Y6.iterator();
                while (((i37) it5).c) {
                    arrayList7.add(Long.valueOf(((LongSparseArray) this.u0).keyAt(((i37) it5).a())));
                }
                j37 Y7 = ote.Y(0, ((LongSparseArray) this.u0).size());
                ArrayList arrayList8 = new ArrayList(z53.S(Y7, 10));
                Iterator it6 = Y7.iterator();
                while (((i37) it6).c) {
                    arrayList8.add((Bundle) ((LongSparseArray) this.u0).valueAt(((i37) it6).a()));
                }
                return new boc(arrayList7, arrayList8, this.Y, this.Z);
        }
    }

    public final void c(Parcelable parcelable) {
        switch (this.o) {
            case 0:
                if (parcelable instanceof o04) {
                    this.u0 = new wv7((Object) null);
                    o04 o04 = (o04) parcelable;
                    List list = o04.a;
                    Iterator it = new h37(0, list.size() - 1, 1).iterator();
                    while (((i37) it).c) {
                        int a = ((i37) it).a();
                        ((wv7) this.u0).f(((Number) list.get(a)).longValue(), o04.b.get(a));
                    }
                    this.Y = new ArrayList(o04.c);
                    this.Z = o04.o;
                    return;
                }
                return;
            default:
                if (parcelable instanceof boc) {
                    this.u0 = new LongSparseArray();
                    boc boc = (boc) parcelable;
                    List list2 = boc.a;
                    Iterator it2 = new h37(0, list2.size() - 1, 1).iterator();
                    while (((i37) it2).c) {
                        int a2 = ((i37) it2).a();
                        ((LongSparseArray) this.u0).put(((Number) list2.get(a2)).longValue(), boc.b.get(a2));
                    }
                    this.Y = new ArrayList(boc.c);
                    this.Z = boc.o;
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        return (long) i;
    }

    public final void q(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 I = I(recyclerView);
                lh0 lh0 = new lh0(6, this);
                I.b(lh0);
                this.v0 = lh0;
                return;
            default:
                ViewPager2 H = H(recyclerView);
                lh0 lh02 = new lh0(10, this);
                H.b(lh02);
                this.v0 = lh02;
                return;
        }
    }

    public final void r(dec dec, int i) {
        switch (this.o) {
            case 0:
                C((doc) dec, i);
                return;
            default:
                eoc eoc = (eoc) dec;
                eoc.H0 = i;
                D(eoc, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.FrameLayout, android.view.View, w12] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.widget.FrameLayout, android.view.View, w12] */
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                int i2 = doc.J0;
                ? frameLayout = new FrameLayout(viewGroup.getContext());
                WeakHashMap weakHashMap = zmf.a;
                frameLayout.setId(View.generateViewId());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setSaveEnabled(false);
                return new doc(frameLayout);
            default:
                int i3 = eoc.K0;
                ? frameLayout2 = new FrameLayout(viewGroup.getContext());
                WeakHashMap weakHashMap2 = zmf.a;
                frameLayout2.setId(View.generateViewId());
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout2.setSaveEnabled(false);
                return new eoc(frameLayout2);
        }
    }

    public final void u(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 I = I(recyclerView);
                lh0 lh0 = (lh0) this.v0;
                if (lh0 != null) {
                    I.g(lh0);
                }
                this.v0 = null;
                return;
            default:
                ViewPager2 H = H(recyclerView);
                lh0 lh02 = (lh0) this.v0;
                if (lh02 != null) {
                    H.g(lh02);
                }
                this.v0 = null;
                return;
        }
    }

    public final /* bridge */ /* synthetic */ boolean v(dec dec) {
        switch (this.o) {
            case 0:
                doc doc = (doc) dec;
                return true;
            default:
                eoc eoc = (eoc) dec;
                return true;
        }
    }

    public final void w(dec dec) {
        switch (this.o) {
            case 0:
                doc doc = (doc) dec;
                if (!doc.I0) {
                    C(doc, doc.g());
                    return;
                }
                return;
            default:
                eoc eoc = (eoc) dec;
                if (!eoc.J0) {
                    D(eoc, eoc.H0);
                    return;
                }
                return;
        }
    }

    public final void x(dec dec) {
        switch (this.o) {
            case 0:
                doc doc = (doc) dec;
                F(doc);
                doc.F0.removeAllViews();
                return;
            default:
                eoc eoc = (eoc) dec;
                G(eoc);
                eoc.F0.removeAllViews();
                return;
        }
    }

    public void y(dec dec) {
        switch (this.o) {
            case 0:
                doc doc = (doc) dec;
                F(doc);
                znc znc = doc.G0;
                if (znc != null) {
                    this.X.removeChildRouter(znc);
                    doc.G0 = null;
                    return;
                }
                return;
            default:
                J((eoc) dec);
                return;
        }
    }
}
