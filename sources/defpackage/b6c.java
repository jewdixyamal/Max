package defpackage;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* renamed from: b6c  reason: default package */
public final class b6c extends ViewGroup {
    public static final /* synthetic */ bc7[] B0;
    public final ye4 A0;
    public m56 a;
    public w5c b;
    public boolean c;
    public final yj o = new yj(this);
    public final bi9 s0 = new bi9();
    public k56 t0 = new lab(25);
    public final TransitionSet u0;
    public final ri9 v0;
    public final ri9 w0;
    public final ri9 x0;
    public final int y0;
    public final z5c[] z0;

    static {
        oi9 oi9 = new oi9(b6c.class, "isStackFromEnd", "isStackFromEnd()Z");
        nec.a.getClass();
        B0 = new bc7[]{oi9};
    }

    public b6c(Context context) {
        super(context);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new p6c(new a6c(this, 2)));
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(1);
        transitionSet.addListener(new a6(2, this));
        this.u0 = transitionSet;
        this.v0 = new ri9();
        this.w0 = new ri9();
        this.x0 = new ri9();
        int i = q6c.a;
        this.y0 = i;
        z5c[] z5cArr = new z5c[i];
        for (int i2 = 0; i2 < i; i2++) {
            z5cArr[i2] = null;
        }
        this.z0 = z5cArr;
        this.A0 = new ye4(14);
    }

    public final void a(ri9 ri9) {
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            View view = (View) objArr[(i << 3) + i3];
                            this.s0.a(view.getId());
                            this.u0.addTarget(view.getId());
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b(int i) {
        bc7 bc7 = B0[0];
        if (!((Boolean) this.o.b).booleanValue()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            z5c z5c = (z5c) ys.f0(i, this.z0);
            if (z5c == null) {
                break;
            }
            int measuredWidth = z5c.getMeasuredWidth() + (i2 == 0 ? 0 : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density)) + i2;
            if (measuredWidth > getMeasuredWidth()) {
                break;
            }
            i++;
            i2 = measuredWidth;
        }
        return getMeasuredWidth() - i2;
    }

    public final void c() {
        this.v0.b();
        this.w0.b();
        this.x0.b();
    }

    public final void d() {
        int i;
        int i2;
        w5c w5c = this.b;
        if (w5c != null) {
            ri9 ri9 = this.v0;
            long j = 255;
            char c2 = 7;
            long j2 = -9187201950435737472L;
            int i3 = 8;
            if (ri9.d != 0) {
                Object[] objArr = ri9.b;
                long[] jArr = ri9.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & j2) != j2) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j3 & j) < 128) {
                                    View view = (View) objArr[(i4 << 3) + i6];
                                    z5c z5c = view instanceof z5c ? (z5c) view : null;
                                    if (z5c != null) {
                                        y98 y98 = (y98) w5c;
                                        i = length;
                                        ((m29) y98.b).t0.invoke(Long.valueOf(((ht8) ((qy8) y98.c)).J0), z5c.getReaction(), z5c);
                                    } else {
                                        i = length;
                                    }
                                    i2 = 8;
                                } else {
                                    i = length;
                                    i2 = i3;
                                }
                                j3 >>= i2;
                                i6++;
                                i3 = i2;
                                length = i;
                                j = 255;
                            }
                            int i7 = length;
                            if (i5 != i3) {
                                break;
                            }
                            length = i7;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        j = 255;
                        j2 = -9187201950435737472L;
                        i3 = 8;
                    }
                }
            }
            ri9 ri92 = this.x0;
            if (ri92.d != 0) {
                Object[] objArr2 = ri92.b;
                long[] jArr2 = ri92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j4 = jArr2[i8];
                        if ((((~j4) << c2) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j4 & 255) < 128) {
                                    View view2 = (View) objArr2[(i8 << 3) + i10];
                                    z5c z5c2 = view2 instanceof z5c ? (z5c) view2 : null;
                                    if (z5c2 != null) {
                                        y98 y982 = (y98) w5c;
                                        ((m29) y982.b).t0.invoke(Long.valueOf(((ht8) ((qy8) y982.c)).J0), z5c2.getReaction(), z5c2);
                                    }
                                }
                                j4 >>= 8;
                            }
                            if (i9 != 8) {
                                return;
                            }
                        }
                        if (i8 != length2) {
                            i8++;
                            c2 = 7;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        TransitionSet transitionSet = this.u0;
        bi9 bi9 = this.s0;
        int[] iArr = bi9.b;
        long[] jArr = bi9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            transitionSet.removeTarget(iArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        bi9.d = 0;
        long[] jArr2 = bi9.a;
        if (jArr2 != usc.a) {
            ys.b0(jArr2);
            long[] jArr3 = bi9.a;
            int i4 = bi9.c;
            int i5 = i4 >> 3;
            long j2 = 255 << ((i4 & 7) << 3);
            jArr3[i5] = j2 | (jArr3[i5] & (~j2));
        }
        bi9.e = usc.a(bi9.c) - bi9.d;
    }

    public final void f(ix8 ix8, boolean z) {
        xs xsVar;
        List<hx8> list;
        ix8 ix82 = ix8;
        if (getChildCount() != 0 || (ix82 != null && !ix82.a.isEmpty())) {
            c();
            TransitionManager.endTransitions(this);
            ri9 ri9 = this.x0;
            ri9 ri92 = this.v0;
            if (!(ix82 == null || (list = ix82.a) == null)) {
                for (hx8 hx8 : list) {
                    z5c z5c = (z5c) findViewById(hx8.a.b.a.toString().hashCode());
                    v5c v5c = null;
                    c6c c6c = ix82.c;
                    int i = hx8.b;
                    c6c c6c2 = hx8.a;
                    if (z5c == null) {
                        z5c z5c2 = new z5c(getContext());
                        z5c2.setId(c6c2.b.a.toString().hashCode());
                        v5c v5c2 = c6c2.b;
                        z5c2.setReaction(v5c2);
                        z5c2.setCount(i);
                        if (c6c != null) {
                            v5c = c6c.b;
                        }
                        z5c2.setOwn(tpa.f(v5c2, v5c));
                        m56 m56 = this.a;
                        if (m56 != null) {
                            z5c2.setOnChipClickListener(m56);
                        }
                        addView(z5c2);
                        ri92.a(z5c2);
                    } else {
                        v5c v5c3 = c6c2.b;
                        if (c6c != null) {
                            v5c = c6c.b;
                        }
                        z5c.setOwn(tpa.f(v5c3, v5c));
                        z5c.setCount(i);
                        ri9.a(z5c);
                    }
                }
            }
            if (ix82 == null) {
                xsVar = new xs(0);
            } else {
                xs xsVar2 = new xs(0);
                for (hx8 hx82 : ix82.a) {
                    xsVar2.add(Integer.valueOf(hx82.a.b.a.toString().hashCode()));
                }
                xsVar = xsVar2;
            }
            int i2 = 0;
            while (true) {
                boolean z2 = i2 < getChildCount();
                ri9 ri93 = this.w0;
                if (z2) {
                    int i3 = i2 + 1;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        if (!xsVar.contains(Integer.valueOf(childAt.getId()))) {
                            ri93.a(childAt);
                        }
                        i2 = i3;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else if (!z) {
                    d();
                    Object[] objArr = ri93.b;
                    long[] jArr = ri93.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        removeView((View) objArr[(i4 << 3) + i6]);
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    setVisibility(getChildCount() > 0 ? 0 : 8);
                    c();
                    return;
                } else if (ri93.d == 0 || ri92.d == 0) {
                    setVisibility(0);
                    a(ri93);
                    a(ri92);
                    Object[] objArr2 = ri92.b;
                    long[] jArr2 = ri92.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        ((View) objArr2[(i7 << 3) + i9]).setVisibility(8);
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 != 8) {
                                    break;
                                }
                            }
                            if (i7 == length2) {
                                break;
                            }
                            i7++;
                        }
                    }
                    this.t0 = new a6c(this, 0);
                    a6c a6c = new a6c(this, 1);
                    if (isLaidOut()) {
                        a6c.invoke();
                        return;
                    } else {
                        mpf.b(this, new zja(a6c, 10, this));
                        return;
                    }
                } else {
                    a(ri9);
                    Object[] objArr3 = ri93.b;
                    long[] jArr3 = ri93.a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j3 = jArr3[i10];
                            if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length3)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j3 & 255) < 128) {
                                        removeView((View) objArr3[(i10 << 3) + i12]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length3) {
                                break;
                            }
                            i10++;
                        }
                    }
                    Object[] objArr4 = ri92.b;
                    long[] jArr4 = ri92.a;
                    int length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j4 = jArr4[i13];
                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length4)) >>> 31);
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if ((j4 & 255) < 128) {
                                        ((View) objArr4[(i13 << 3) + i15]).setVisibility(0);
                                    }
                                    j4 >>= 8;
                                }
                                if (i14 != 8) {
                                    break;
                                }
                            }
                            if (i13 == length4) {
                                break;
                            }
                            i13++;
                        }
                    }
                    this.t0 = new a6c(this, 3);
                    TransitionManager.beginDelayedTransition(this, this.u0);
                    requestLayout();
                    return;
                }
            }
        }
    }

    public final w5c getChipObserver() {
        return this.b;
    }

    public final m56 getOnChipClickListener() {
        return this.a;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            z5c z5c = (z5c) ys.f0(i8, this.z0);
            if (z5c != null) {
                int b2 = i6 == 0 ? b(i8) : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                if (getMeasuredWidth() - i6 >= z5c.getMeasuredWidth() + b2) {
                    i5 = i6 + b2;
                    ote.E(z5c, i5, i7, 0, 12);
                } else {
                    i5 = b(i8);
                    i7 += z5c.getMeasuredHeight() + tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                    ote.E(z5c, i5, i7, 0, 12);
                }
                i6 = i5 + z5c.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        View view;
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.y0;
            view = null;
            objArr = this.z0;
            if (i4 >= i5) {
                break;
            }
            if (i4 < getChildCount()) {
                objArr[i4] = getChildAt(i4);
            } else {
                objArr[i4] = null;
            }
            i4++;
        }
        Arrays.sort(objArr, this.A0);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            z5c z5c = (z5c) ys.f0(i9, objArr);
            if (z5c != null) {
                z5c.measure(i, i2);
                int measuredWidth = z5c.getMeasuredWidth() + i6 + (i6 == 0 ? 0 : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                if (measuredWidth > size) {
                    i7++;
                    i6 = z5c.getMeasuredWidth();
                } else {
                    i6 = measuredWidth;
                }
                i8 = Math.max(i8, i6);
            }
        }
        if (i6 == 0) {
            i7 = 0;
        }
        boolean z = true;
        if (getChildCount() <= 0) {
            z = false;
        }
        if (z && (view = getChildAt(0)) == null) {
            throw new IndexOutOfBoundsException();
        }
        if (view != null) {
            i3 = view.getMeasuredHeight();
        }
        setMeasuredDimension(i8, (tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) * i7) + ((i7 + 1) * i3));
    }

    public final void setChipObserver(w5c w5c) {
        this.b = w5c;
    }

    public final void setIncoming(boolean z) {
        this.c = z;
    }

    public final void setOnChipClickListener(m56 m56) {
        this.a = m56;
    }

    public final void setStackFromEnd(boolean z) {
        this.o.o1(this, B0[0], Boolean.valueOf(z));
    }
}
