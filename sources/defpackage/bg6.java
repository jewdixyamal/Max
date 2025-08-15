package defpackage;

import android.util.Pair;
import android.util.Printer;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* renamed from: bg6  reason: default package */
public final class bg6 {
    public final boolean a;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public nw4 d;
    public boolean e = false;
    public nw4 f;
    public boolean g = false;
    public nw4 h;
    public boolean i = false;
    public int[] j;
    public boolean k = false;
    public int[] l;
    public boolean m = false;
    public zf6[] n;
    public boolean o = false;
    public int[] p;
    public boolean q = false;
    public boolean r;
    public boolean s = false;
    public int[] t;
    public boolean u = true;
    public final fg6 v = new fg6(0);
    public final fg6 w = new fg6(-100000);
    public final /* synthetic */ hg6 x;

    public bg6(ContextMenuGridLayout contextMenuGridLayout, boolean z) {
        this.x = contextMenuGridLayout;
        this.a = z;
    }

    public static void k(ArrayList arrayList, dg6 dg6, fg6 fg6, boolean z) {
        if (dg6.a() != 0) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((zf6) it.next()).a.equals(dg6)) {
                        return;
                    }
                }
            }
            arrayList.add(new zf6(dg6, fg6));
        }
    }

    public static boolean n(int[] iArr, zf6 zf6) {
        if (!zf6.c) {
            return false;
        }
        dg6 dg6 = zf6.a;
        int i2 = dg6.a;
        int i3 = iArr[i2] + zf6.b.a;
        int i4 = dg6.b;
        if (i3 <= iArr[i4]) {
            return false;
        }
        iArr[i4] = i3;
        return true;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb;
        String str = this.a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            zf6 zf6 = (zf6) it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            dg6 dg6 = zf6.a;
            int i2 = dg6.a;
            int i3 = zf6.b.a;
            int i4 = dg6.b;
            if (i2 < i4) {
                sb.append(str);
                sb.append(i4);
                sb.append("-");
                sb.append(str);
                sb.append(i2);
                sb.append(">=");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i2);
                sb.append("-");
                sb.append(str);
                sb.append(i4);
                sb.append("<=");
                i3 = -i3;
            }
            sb.append(i3);
            sb2.append(sb.toString());
        }
        return sb2.toString();
    }

    public final void b(nw4 nw4, boolean z) {
        fg6[] fg6Arr = (fg6[]) ((Object[]) nw4.o);
        for (fg6 fg6 : fg6Arr) {
            fg6.a = Integer.MIN_VALUE;
        }
        cg6[] cg6Arr = (cg6[]) ((Object[]) g().o);
        for (int i2 = 0; i2 < cg6Arr.length; i2++) {
            int d2 = cg6Arr[i2].d(z);
            fg6 fg62 = (fg6) ((Object[]) nw4.o)[((int[]) nw4.b)[i2]];
            int i3 = fg62.a;
            if (!z) {
                d2 = -d2;
            }
            fg62.a = Math.max(i3, d2);
        }
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        hg6 hg6 = this.x;
        int childCount = hg6.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = hg6.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                eg6 eg6 = (eg6) childAt.getLayoutParams();
                boolean z2 = this.a;
                dg6 dg6 = (z2 ? eg6.b : eg6.a).b;
                int i3 = z ? dg6.a : dg6.b;
                iArr[i3] = Math.max(iArr[i3], hg6.f(childAt, z2, z));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [fg6, java.lang.Object] */
    public final nw4 d(boolean z) {
        dg6 dg6;
        ag6 ag6 = new ag6(dg6.class, fg6.class);
        gg6[] gg6Arr = (gg6[]) ((Object[]) g().c);
        int length = gg6Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z) {
                dg6 = gg6Arr[i2].b;
            } else {
                dg6 dg62 = gg6Arr[i2].b;
                dg6 = new dg6(dg62.b, dg62.a);
            }
            ? obj = new Object();
            obj.a = Integer.MIN_VALUE;
            ag6.add(Pair.create(dg6, obj));
        }
        return ag6.a();
    }

    public final zf6[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            nw4 nw4 = this.f;
            int i2 = 0;
            while (true) {
                dg6[] dg6Arr = (dg6[]) ((Object[]) nw4.c);
                if (i2 >= dg6Arr.length) {
                    break;
                }
                k(arrayList, dg6Arr[i2], ((fg6[]) ((Object[]) nw4.o))[i2], false);
                i2++;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            nw4 nw42 = this.h;
            int i3 = 0;
            while (true) {
                dg6[] dg6Arr2 = (dg6[]) ((Object[]) nw42.c);
                if (i3 >= dg6Arr2.length) {
                    break;
                }
                k(arrayList2, dg6Arr2[i3], ((fg6[]) ((Object[]) nw42.o))[i3], false);
                i3++;
            }
            if (this.u) {
                int i4 = 0;
                while (i4 < f()) {
                    int i5 = i4 + 1;
                    k(arrayList, new dg6(i4, i5), new fg6(0), true);
                    i4 = i5;
                }
            }
            int f2 = f();
            k(arrayList, new dg6(0, f2), this.v, false);
            k(arrayList2, new dg6(f2, 0), this.w, false);
            zf6[] r2 = r(arrayList);
            zf6[] r3 = r(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(r2.getClass().getComponentType(), r2.length + r3.length);
            System.arraycopy(r2, 0, objArr, 0, r2.length);
            System.arraycopy(r3, 0, objArr, r2.length, r3.length);
            this.n = (zf6[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final nw4 g() {
        int i2;
        int i3;
        nw4 nw4 = this.d;
        boolean z = this.a;
        hg6 hg6 = this.x;
        if (nw4 == null) {
            ag6 ag6 = new ag6(gg6.class, cg6.class);
            int childCount = hg6.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                eg6 eg6 = (eg6) hg6.getChildAt(i4).getLayoutParams();
                gg6 gg6 = z ? eg6.b : eg6.a;
                ag6.add(Pair.create(gg6, gg6.a(z).o()));
            }
            this.d = ag6.a();
        }
        if (!this.e) {
            cg6[] cg6Arr = (cg6[]) ((Object[]) this.d.o);
            for (cg6 c2 : cg6Arr) {
                c2.c();
            }
            int childCount2 = hg6.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = hg6.getChildAt(i5);
                eg6 eg62 = (eg6) childAt.getLayoutParams();
                gg6 gg62 = z ? eg62.b : eg62.a;
                if (childAt.getVisibility() == 8) {
                    i2 = 0;
                } else {
                    i2 = hg6.e(childAt, z, false) + hg6.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (gg62.d == 0.0f) {
                    i3 = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[hg6.getChildCount()];
                    }
                    i3 = this.t[i5];
                }
                int i6 = i2 + i3;
                nw4 nw42 = this.d;
                cg6 cg6 = (cg6) ((Object[]) nw42.o)[((int[]) nw42.b)[i5]];
                cg6.c = ((gg62.c == hg6.F0 && gg62.d == 0.0f) ? 0 : 2) & cg6.c;
                int l2 = gg62.a(z).l(childAt, i6, hg6.getLayoutMode());
                cg6.b(l2, i6 - l2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] h() {
        boolean z;
        if (this.p == null) {
            this.p = new int[(f() + 1)];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z2 = this.s;
            hg6 hg6 = this.x;
            float f2 = 0.0f;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = hg6.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = hg6.getChildAt(i2);
                    if (childAt.getVisibility() != 8) {
                        eg6 eg6 = (eg6) childAt.getLayoutParams();
                        if ((z3 ? eg6.b : eg6.a).d != 0.0f) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                this.r = z;
                this.s = true;
            }
            if (!this.r) {
                q(e(), iArr, true);
            } else {
                if (this.t == null) {
                    this.t = new int[hg6.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                q(e(), iArr, true);
                int childCount2 = (hg6.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = hg6.getChildCount();
                    for (int i3 = 0; i3 < childCount3; i3++) {
                        View childAt2 = hg6.getChildAt(i3);
                        if (childAt2.getVisibility() != 8) {
                            eg6 eg62 = (eg6) childAt2.getLayoutParams();
                            f2 += (z3 ? eg62.b : eg62.a).d;
                        }
                    }
                    int i4 = -1;
                    boolean z4 = true;
                    int i5 = 0;
                    while (i5 < childCount2) {
                        int i6 = (int) ((((long) i5) + ((long) childCount2)) / 2);
                        m();
                        p(i6, f2);
                        boolean q2 = q(e(), iArr, false);
                        if (q2) {
                            i5 = i6 + 1;
                            i4 = i6;
                        } else {
                            childCount2 = i6;
                        }
                        z4 = q2;
                    }
                    if (i4 > 0 && !z4) {
                        m();
                        p(i4, f2);
                        q(e(), iArr, true);
                    }
                }
            }
            if (!this.u) {
                int i7 = iArr[0];
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    iArr[i8] = iArr[i8] - i7;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int i() {
        int i2 = Integer.MIN_VALUE;
        if (this.c == Integer.MIN_VALUE) {
            hg6 hg6 = this.x;
            int childCount = hg6.getChildCount();
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                eg6 eg6 = (eg6) hg6.getChildAt(i4).getLayoutParams();
                dg6 dg6 = (this.a ? eg6.b : eg6.a).b;
                i3 = Math.max(Math.max(Math.max(i3, dg6.a), dg6.b), dg6.a());
            }
            if (i3 != -1) {
                i2 = i3;
            }
            this.c = Math.max(0, i2);
        }
        return this.c;
    }

    public final int j(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            this.v.a = 0;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        } else if (mode == 0) {
            this.v.a = 0;
            this.w.a = -100000;
            this.q = false;
            return h()[f()];
        } else if (mode != 1073741824) {
            return 0;
        } else {
            this.v.a = size;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        }
    }

    public final void l() {
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void o(int i2) {
        if (i2 == Integer.MIN_VALUE || i2 >= i()) {
            this.b = i2;
        } else {
            hg6.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(int i2, float f2) {
        Arrays.fill(this.t, 0);
        hg6 hg6 = this.x;
        int childCount = hg6.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = hg6.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                eg6 eg6 = (eg6) childAt.getLayoutParams();
                float f3 = (this.a ? eg6.b : eg6.a).d;
                if (f3 != 0.0f) {
                    int round = Math.round((((float) i2) * f3) / f2);
                    this.t[i3] = round;
                    i2 -= round;
                    f2 -= f3;
                }
            }
        }
    }

    public final boolean q(zf6[] zf6Arr, int[] iArr, boolean z) {
        String str = this.a ? "horizontal" : "vertical";
        int f2 = f() + 1;
        boolean[] zArr = null;
        for (int i2 = 0; i2 < zf6Arr.length; i2++) {
            Arrays.fill(iArr, 0);
            for (int i3 = 0; i3 < f2; i3++) {
                boolean z2 = false;
                for (zf6 n2 : zf6Arr) {
                    z2 |= n(iArr, n2);
                }
                if (!z2) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < zf6Arr.length; i4++) {
                            zf6 zf6 = zf6Arr[i4];
                            if (zArr[i4]) {
                                arrayList.add(zf6);
                            }
                            if (!zf6.c) {
                                arrayList2.add(zf6);
                            }
                        }
                        Printer printer = this.x.v0;
                        StringBuilder o2 = rh4.o(str, " constraints: ");
                        o2.append(a(arrayList));
                        o2.append(" are inconsistent; permanently removing: ");
                        o2.append(a(arrayList2));
                        o2.append(". ");
                        printer.println(o2.toString());
                    }
                    return true;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[zf6Arr.length];
            for (int i5 = 0; i5 < f2; i5++) {
                int length = zf6Arr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    zArr2[i6] = zArr2[i6] | n(iArr, zf6Arr[i6]);
                }
            }
            if (i2 == 0) {
                zArr = zArr2;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= zf6Arr.length) {
                    break;
                }
                if (zArr2[i7]) {
                    zf6 zf62 = zf6Arr[i7];
                    dg6 dg6 = zf62.a;
                    if (dg6.a >= dg6.b) {
                        zf62.c = false;
                        break;
                    }
                }
                i7++;
            }
        }
        return true;
    }

    public final zf6[] r(ArrayList arrayList) {
        l0f l0f = new l0f(this, (zf6[]) arrayList.toArray(new zf6[arrayList.size()]));
        int length = ((zf6[][]) l0f.X).length;
        for (int i2 = 0; i2 < length; i2++) {
            l0f.Z(i2);
        }
        return (zf6[]) l0f.o;
    }
}
