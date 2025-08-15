package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: o7a  reason: default package */
public final class o7a extends ViewGroup {
    public static final /* synthetic */ bc7[] z0;
    public m7a a;
    public final n7a b = new n7a(this, 0);
    public final n7a c = new n7a(this, 1);
    public final n7a o = new n7a(this, 2);
    public final li9 s0 = new li9(4);
    public final li9 t0 = new li9(4);
    public final li9 u0 = new li9();
    public final Rect v0 = new Rect();
    public int w0 = -1;
    public int x0 = -1;
    public int y0 = -1;

    static {
        Class<o7a> cls = o7a.class;
        z0 = new bc7[]{new oi9(cls, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), rh4.g(nec.a, cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;"), new oi9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    }

    public o7a(Context context) {
        super(context);
    }

    public static k7a a(o7a o7a, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = o7a.getChildCount();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        k7a k7a = (k7a) o7a.getChildAt(i);
        if (k7a == null) {
            k7a = new k7a(o7a.getContext());
            if (z) {
                o7a.addViewInLayout(k7a, o7a.getChildCount(), new ViewGroup.LayoutParams(-2, -2));
            } else {
                o7a.addView(k7a);
            }
        }
        k7a.setId(vxb.oneme_buttonstack_more_btn);
        k7a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        k7a.setMode(o7a.getMode());
        k7a.setAppearance(o7a.getAppearance());
        k7a.setCustomTheme(o7a.getCustomTheme());
        k7a.setText(a2c.oneme_button_stack_more);
        k7a.setIcon(woc.q1);
        tu0.K(k7a, 300, new xx5(20, o7a));
        return k7a;
    }

    public static final wpd c(l7a l7a) {
        int i = l7a.a;
        Integer num = l7a.b;
        return new wpd(i, num != null ? new eqe(num.intValue()) : jqe.a, l7a.c, l7a.d, l7a.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List r9, java.util.List r10, boolean r11) {
        /*
            r8 = this;
            li9 r0 = r8.s0
            java.lang.Object[] r1 = r0.a
            int r2 = r0.b
            r3 = 0
            r4 = 0
            java.util.Arrays.fill(r1, r3, r2, r4)
            r0.b = r3
            li9 r1 = r8.u0
            java.lang.Object[] r2 = r1.a
            int r5 = r1.b
            java.util.Arrays.fill(r2, r3, r5, r4)
            r1.b = r3
            r2 = r3
        L_0x0019:
            r4 = 4
            if (r2 >= r4) goto L_0x0089
            java.lang.Object r5 = defpackage.x53.j0(r2, r9)
            l7a r5 = (defpackage.l7a) r5
            if (r5 == 0) goto L_0x0089
            android.view.View r4 = r8.getChildAt(r2)
            k7a r4 = (defpackage.k7a) r4
            if (r4 != 0) goto L_0x0038
            k7a r4 = new k7a
            android.content.Context r6 = r8.getContext()
            r4.<init>(r6)
            r8.addView(r4)
        L_0x0038:
            int r6 = r5.a
            r4.setId(r6)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r4.setLayoutParams(r6)
            r4.setVisibility(r3)
            boolean r6 = r5.f
            r4.setEnabled(r6)
            h7a r6 = r8.getMode()
            r4.setMode(r6)
            g7a r6 = r8.getAppearance()
            r4.setAppearance(r6)
            fka r6 = r8.getCustomTheme()
            r4.setCustomTheme(r6)
            java.lang.Integer r6 = r5.b
            if (r6 == 0) goto L_0x006e
            int r6 = r6.intValue()
            r4.setText((int) r6)
        L_0x006e:
            java.lang.Integer r6 = r5.d
            if (r6 == 0) goto L_0x0079
            int r6 = r6.intValue()
            r4.setIcon((int) r6)
        L_0x0079:
            vu5 r6 = new vu5
            r7 = 21
            r6.<init>(r8, r7, r5)
            defpackage.tu0.K(r4, 300, r6)
            r0.b(r5)
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0089:
            r0 = 1
            if (r2 != r4) goto L_0x0094
            int r5 = r9.size()
            if (r5 <= r4) goto L_0x0094
            r4 = r0
            goto L_0x0095
        L_0x0094:
            r4 = r3
        L_0x0095:
            boolean r5 = r10.isEmpty()
            r0 = r0 ^ r5
            if (r4 != 0) goto L_0x00a3
            if (r0 == 0) goto L_0x009f
            goto L_0x00a3
        L_0x009f:
            r9 = -1
            r8.w0 = r9
            goto L_0x00d4
        L_0x00a3:
            int r0 = r9.size()
            r4 = r2
        L_0x00a8:
            if (r4 >= r0) goto L_0x00b4
            java.lang.Object r5 = r9.get(r4)
            r1.b(r5)
            int r4 = r4 + 1
            goto L_0x00a8
        L_0x00b4:
            int r9 = r10.size()
            r0 = r3
        L_0x00b9:
            if (r0 >= r9) goto L_0x00c5
            java.lang.Object r4 = r10.get(r0)
            r1.b(r4)
            int r0 = r0 + 1
            goto L_0x00b9
        L_0x00c5:
            r9 = 2
            k7a r9 = a(r8, r2, r3, r9)
            r9.setVisibility(r3)
            r9.setEnabled(r11)
            r8.w0 = r2
        L_0x00d2:
            int r2 = r2 + 1
        L_0x00d4:
            int r9 = r8.getChildCount()
            if (r2 >= r9) goto L_0x00e6
            android.view.View r9 = r8.getChildAt(r2)
            if (r9 == 0) goto L_0x00d2
            r10 = 8
            r9.setVisibility(r10)
            goto L_0x00d2
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7a.b(java.util.List, java.util.List, boolean):void");
    }

    public final g7a getAppearance() {
        bc7 bc7 = z0[1];
        return (g7a) this.c.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7 = z0[2];
        return (fka) this.o.b;
    }

    public final m7a getListener() {
        return this.a;
    }

    public final h7a getMode() {
        bc7 bc7 = z0[0];
        return (h7a) this.b.b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int i7 = this.x0;
            if (i6 > this.y0 || i7 > i6) {
                ote.E(childAt, i5, 0, 0, 12);
                i5 = wg0.d((float) 8, fk4.d().getDisplayMetrics().density, childAt.getMeasuredWidth(), i5);
            } else {
                ote.D(childAt, 0, 0, 0, 0);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i3 = 0;
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            int childCount = getChildCount() - 1;
            while (true) {
                if (-1 >= childCount) {
                    childCount = -1;
                    break;
                }
                View childAt = getChildAt(childCount);
                if (childAt != null && childAt.getVisibility() == 0) {
                    break;
                }
                childCount--;
            }
            if (childCount == -1) {
                setMeasuredDimension(0, 0);
                return;
            }
            this.x0 = -1;
            this.y0 = -1;
            li9 li9 = this.t0;
            Arrays.fill(li9.a, 0, li9.b, (Object) null);
            li9.b = 0;
            int i4 = childCount + 1;
            float f = (float) 8;
            int G = (size - (tu0.G(fk4.d().getDisplayMetrics().density * f) * childCount)) / i4;
            while (G < tu0.G(((float) 67) * fk4.d().getDisplayMetrics().density)) {
                int i5 = this.w0;
                boolean z = i5 == -1;
                if (i5 == -1) {
                    this.w0 = getChildCount();
                    a(this, 0, true, 1);
                }
                int i6 = this.y0;
                int i7 = 2;
                if (i6 == -1) {
                    int i8 = this.w0;
                    this.x0 = i8 - (z ? 2 : 1);
                    if (!z) {
                        i7 = 1;
                    }
                    this.y0 = i8 - i7;
                } else {
                    if (!z) {
                        i7 = 1;
                    }
                    this.x0 = i6 - i7;
                }
                li9.a(0, this.s0.c(this.x0));
                int i9 = i4 - 1;
                int G2 = (size - (tu0.G(fk4.d().getDisplayMetrics().density * f) * (i4 - 2))) / i9;
                i4 = i9;
                G = G2;
            }
            int childCount2 = getChildCount();
            int i10 = 0;
            while (i3 < childCount2) {
                int i11 = this.x0;
                if (i3 > this.y0 || i11 > i3) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(G, 1073741824);
                    View childAt2 = getChildAt(i3);
                    childAt2.measure(makeMeasureSpec, i2);
                    i10 = Math.max(i10, childAt2.getMeasuredHeight());
                }
                i3++;
            }
            setMeasuredDimension(size, Math.max(mode, i10));
            return;
        }
        int childCount3 = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (i3 < childCount3) {
            View childAt3 = getChildAt(i3);
            childAt3.measure(i, i2);
            i12 += childAt3.getMeasuredWidth();
            i13 = Math.max(i13, childAt3.getMeasuredHeight());
            i3++;
        }
        setMeasuredDimension((tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) * (getChildCount() - 1)) + i12, i13);
    }

    public final void setAppearance(g7a g7a) {
        this.c.o1(this, z0[1], g7a);
    }

    public final void setCustomTheme(fka fka) {
        this.o.o1(this, z0[2], fka);
    }

    public final void setListener(m7a m7a) {
        this.a = m7a;
    }

    public final void setMode(h7a h7a) {
        this.b.o1(this, z0[0], h7a);
    }
}
