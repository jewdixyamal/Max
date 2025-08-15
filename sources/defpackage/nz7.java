package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nz7  reason: default package */
public final class nz7 extends ndc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ nz7(yh9 yh9, yh9 yh92, yh9 yh93, int i) {
        this.a = i;
        this.b = yh9;
        this.c = yh92;
        this.o = yh93;
    }

    public static Integer i(RecyclerView recyclerView, int i) {
        hdc adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return Integer.valueOf(adapter.l(i));
        }
        return null;
    }

    public void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                dec T = recyclerView.T(view);
                if (T != null && (i = T.Y) != 0) {
                    int i3 = 536870911 & i;
                    yh9 yh9 = (yh9) this.b;
                    rect.left = yh9.c(i3);
                    rect.right = yh9.c(i3);
                    if (!dy7.C(i)) {
                        if (T.h() != 0 && !dy7.B(i)) {
                            rect.top = ((yh9) this.c).c(i3);
                        }
                        if (T.h() != zdc.b() - 1 && !dy7.A(i)) {
                            rect.bottom = ((yh9) this.o).c(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                dec T2 = recyclerView.T(view);
                if (T2 != null && (i2 = T2.Y) != 0) {
                    int i4 = 536870911 & i2;
                    yh9 yh92 = (yh9) this.b;
                    rect.left = yh92.c(i4);
                    rect.right = yh92.c(i4);
                    if ((1073741824 & i2) == 0) {
                        if (T2.h() != 0 && (Integer.MIN_VALUE & i2) == 0) {
                            rect.top = ((yh9) this.c).c(i4);
                        }
                        if (T2.h() != zdc.b() - 1 && (536870912 & i2) == 0) {
                            rect.bottom = ((yh9) this.o).c(i4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.f(rect, view, recyclerView, zdc);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.view.ViewOutlineProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.graphics.Canvas r12, androidx.recyclerview.widget.RecyclerView r13, defpackage.zdc r14) {
        /*
            r11 = this;
            int r12 = r11.a
            switch(r12) {
                case 2: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r12 = 48
            float r12 = (float) r12
            android.content.res.Resources r14 = defpackage.fk4.d()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r12 = r12 * r14
            int r12 = defpackage.tu0.G(r12)
            r14 = 4
            float r14 = (float) r14
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r14 = r14 * r0
            int r14 = defpackage.tu0.G(r14)
            r0 = 0
            r1 = r0
        L_0x002b:
            int r2 = r13.getChildCount()
            r3 = 1
            if (r1 >= r2) goto L_0x0034
            r2 = r3
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 == 0) goto L_0x01e0
            int r2 = r1 + 1
            android.view.View r1 = r13.getChildAt(r1)
            if (r1 == 0) goto L_0x01da
            boolean r4 = r1 instanceof defpackage.x9f
            r5 = 0
            if (r4 == 0) goto L_0x0047
            x9f r1 = (defpackage.x9f) r1
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 != 0) goto L_0x004c
            goto L_0x01d7
        L_0x004c:
            r13.getClass()
            int r4 = androidx.recyclerview.widget.RecyclerView.R(r1)
            hdc r6 = r13.getAdapter()
            if (r6 == 0) goto L_0x0062
            int r6 = r6.j()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0063
        L_0x0062:
            r6 = r5
        L_0x0063:
            r7 = -1
            if (r4 == r7) goto L_0x01e0
            if (r6 != 0) goto L_0x006a
            goto L_0x01e0
        L_0x006a:
            java.lang.Object r7 = r11.b
            xq0 r7 = (defpackage.xq0) r7
            if (r4 != 0) goto L_0x008c
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x0089
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r14, r5, r0)
        L_0x0089:
            r5 = r7
            goto L_0x01cb
        L_0x008c:
            java.lang.Integer r8 = i(r13, r4)
            int r9 = defpackage.oba.i
            java.lang.Object r10 = r11.o
            xq0 r10 = (defpackage.xq0) r10
            if (r8 != 0) goto L_0x0099
            goto L_0x00bb
        L_0x0099:
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x00bb
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r5, r14)
        L_0x00b8:
            r5 = r10
            goto L_0x01cb
        L_0x00bb:
            int r8 = r6.intValue()
            int r8 = r8 - r3
            if (r4 != r8) goto L_0x0101
            java.lang.Integer r8 = i(r13, r4)
            int r9 = defpackage.oba.l
            if (r8 != 0) goto L_0x00cb
            goto L_0x0101
        L_0x00cb:
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x0101
            int r8 = r4 + -1
            java.lang.Integer r8 = i(r13, r8)
            if (r8 != 0) goto L_0x00da
            goto L_0x00e0
        L_0x00da:
            int r8 = r8.intValue()
            if (r8 == r9) goto L_0x0101
        L_0x00e0:
            int r4 = r1.getHeight()
            int r5 = r14 * 2
            int r5 = r5 + r12
            if (r4 == r5) goto L_0x00fa
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r14, r5, r14)
        L_0x00fa:
            java.lang.Object r4 = r11.c
            r5 = r4
            ix3 r5 = (defpackage.ix3) r5
            goto L_0x01cb
        L_0x0101:
            int r8 = r6.intValue()
            int r8 = r8 - r3
            if (r4 != r8) goto L_0x0141
            java.lang.Integer r8 = i(r13, r4)
            int r9 = defpackage.oba.l
            if (r8 != 0) goto L_0x0111
            goto L_0x0141
        L_0x0111:
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x0141
            int r8 = r4 + -1
            java.lang.Integer r8 = i(r13, r8)
            if (r8 != 0) goto L_0x0120
            goto L_0x0126
        L_0x0120:
            int r8 = r8.intValue()
            if (r8 == r9) goto L_0x0141
        L_0x0126:
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r5, r14)
            goto L_0x00b8
        L_0x0141:
            int r6 = r6.intValue()
            int r6 = r6 - r3
            if (r4 != r6) goto L_0x0181
            java.lang.Integer r6 = i(r13, r4)
            int r8 = defpackage.oba.l
            if (r6 != 0) goto L_0x0151
            goto L_0x0181
        L_0x0151:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x0181
            int r6 = r4 + -1
            java.lang.Integer r6 = i(r13, r6)
            if (r6 != 0) goto L_0x0160
            goto L_0x0181
        L_0x0160:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x0181
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r5, r14)
            goto L_0x00b8
        L_0x0181:
            java.lang.Integer r6 = i(r13, r4)
            int r8 = defpackage.oba.l
            if (r6 != 0) goto L_0x018a
            goto L_0x01ba
        L_0x018a:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x01ba
            int r4 = r4 + -1
            java.lang.Integer r4 = i(r13, r4)
            if (r4 != 0) goto L_0x0199
            goto L_0x019f
        L_0x0199:
            int r4 = r4.intValue()
            if (r4 == r8) goto L_0x01ba
        L_0x019f:
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x0089
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r14, r5, r0)
            goto L_0x0089
        L_0x01ba:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r12
            int r4 = r1.getPaddingLeft()
            int r6 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r6, r0)
        L_0x01cb:
            r1.setOutlineProvider(r5)
            android.view.ViewOutlineProvider r4 = r1.getOutlineProvider()
            if (r4 == 0) goto L_0x01d7
            r1.setClipToOutline(r3)
        L_0x01d7:
            r1 = r2
            goto L_0x002b
        L_0x01da:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException
            r11.<init>()
            throw r11
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz7.g(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, zdc):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nz7(int r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r0.a = r1
            switch(r1) {
                case 2: goto L_0x02aa;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r3 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r4 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r5 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r6 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r7 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r8 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r9 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r10 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r11 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r13 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r15 = defpackage.tu0.G(r2)
            r2 = 24
            float r2 = (float) r2
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r2 = r2 * r12
            int r16 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r17 = defpackage.tu0.G(r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r18 = defpackage.tu0.G(r1)
            r12 = 1024(0x400, float:1.435E-42)
            r14 = 512(0x200, float:7.175E-43)
            yh9 r1 = defpackage.ay7.x(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 8
            float r3 = (float) r2
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r5 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r6 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r7 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r8 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r9 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r10 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r11 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r12 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r13 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r15 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r17 = defpackage.tu0.G(r4)
            r4 = 6
            float r4 = (float) r4
            android.content.res.Resources r14 = defpackage.fk4.d()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r4 = r4 * r14
            int r18 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r19 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r20 = defpackage.tu0.G(r3)
            r14 = 1024(0x400, float:1.435E-42)
            r16 = 512(0x200, float:7.175E-43)
            yh9 r3 = defpackage.ay7.x(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r2 = (float) r2
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r5 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r6 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r7 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r8 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r9 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r10 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r11 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r12 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r13 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r15 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r17 = defpackage.tu0.G(r4)
            r4 = 3
            float r4 = (float) r4
            android.content.res.Resources r14 = defpackage.fk4.d()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r4 = r4 * r14
            int r18 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r19 = defpackage.tu0.G(r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r20 = defpackage.tu0.G(r2)
            r14 = 512(0x200, float:7.175E-43)
            r16 = 1024(0x400, float:1.435E-42)
            yh9 r2 = defpackage.ay7.x(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = 0
            r0.<init>(r1, r3, r2, r4)
            return
        L_0x02aa:
            r21.<init>()
            xq0 r1 = new xq0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            r4 = 1
            r1.<init>(r4, r2)
            r0.b = r1
            ix3 r1 = new ix3
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.c = r1
            xq0 r1 = new xq0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r3
            r3 = 0
            r1.<init>(r3, r2)
            r0.o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz7.<init>(int):void");
    }
}
