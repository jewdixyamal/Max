package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: og3  reason: default package */
public final class og3 extends LinearLayout implements kre {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final LinkedHashMap o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: one.me.sdk.uikit.common.button.OneMeButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: android.widget.TextView} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public og3(one.me.sdk.bottomsheet.ConfirmationBottomSheet r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.util.ArrayList r20, android.content.Context r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 1
            r4 = 0
            r5 = r21
            r0.<init>(r5)
            bc7[] r5 = one.me.sdk.bottomsheet.ConfirmationBottomSheet.G0
            r17.getClass()
            bc7[] r5 = one.me.sdk.bottomsheet.ConfirmationBottomSheet.G0
            r6 = r5[r4]
            fs r6 = r1.y0
            java.lang.Object r6 = r6.a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = 0
            r8 = 16
            if (r6 == 0) goto L_0x00a6
            int r6 = r6.intValue()
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r10 = r16.getContext()
            r9.<init>(r10)
            android.graphics.drawable.ShapeDrawable r10 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r11 = new android.graphics.drawable.shapes.OvalShape
            r11.<init>()
            r10.<init>(r11)
            r9.setBackground(r10)
            r10 = 24
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 * r11
            int r10 = defpackage.tu0.G(r10)
            r9.setPadding(r10, r10, r10, r10)
            r9.setImageResource(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = 80
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = defpackage.tu0.G(r11)
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r10 = r10 * r12
            int r10 = defpackage.tu0.G(r10)
            r6.<init>(r11, r10)
            r6.gravity = r3
            float r10 = (float) r8
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 * r11
            int r10 = defpackage.tu0.G(r10)
            r6.topMargin = r10
            r10 = 5
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 * r11
            int r10 = defpackage.tu0.G(r10)
            r6.bottomMargin = r10
            r0.addView(r9, r6)
            goto L_0x00a7
        L_0x00a6:
            r9 = r7
        L_0x00a7:
            r0.a = r9
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r9 = r16.getContext()
            r6.<init>(r9)
            kqe r9 = defpackage.i4f.c
            r9.b(r6, defpackage.du4.b)
            r9 = r18
            r6.setText(r9)
            r9 = 17
            r6.setGravity(r9)
            r10 = 12
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = defpackage.tu0.G(r11)
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r10
            int r12 = defpackage.tu0.G(r12)
            int r13 = r6.getPaddingTop()
            int r14 = r6.getPaddingBottom()
            r6.setPaddingRelative(r11, r13, r12, r14)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r13 = -2
            r11.<init>(r12, r13)
            r11.gravity = r9
            float r14 = (float) r8
            android.content.res.Resources r15 = defpackage.fk4.d()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r15 = r15 * r14
            int r15 = defpackage.tu0.G(r15)
            r11.topMargin = r15
            r15 = 2
            r5 = r5[r15]
            fs r5 = r1.A0
            java.lang.Object r5 = r5.a(r1)
            jqe r5 = (defpackage.jqe) r5
            if (r5 != 0) goto L_0x0125
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r14
        L_0x0120:
            int r5 = defpackage.tu0.G(r5)
            goto L_0x0131
        L_0x0125:
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r10
            goto L_0x0120
        L_0x0131:
            r11.bottomMargin = r5
            r0.addView(r6, r11)
            r0.b = r6
            if (r2 == 0) goto L_0x0193
            android.widget.TextView r5 = new android.widget.TextView
            android.content.Context r6 = r16.getContext()
            r5.<init>(r6)
            kqe r6 = defpackage.i4f.n
            r6.b(r5, defpackage.du4.b)
            r5.setText(r2)
            r5.setGravity(r9)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r10
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r6 = defpackage.tu0.G(r10)
            int r10 = r5.getPaddingTop()
            int r11 = r5.getPaddingBottom()
            r5.setPaddingRelative(r2, r10, r6, r11)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r12, r13)
            r2.gravity = r9
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r14 = r14 * r6
            int r6 = defpackage.tu0.G(r14)
            r2.bottomMargin = r6
            r0.addView(r5, r2)
            goto L_0x0194
        L_0x0193:
            r5 = r7
        L_0x0194:
            r0.c = r5
            r2 = 10
            r5 = r20
            int r2 = defpackage.z53.S(r5, r2)
            int r2 = defpackage.mz7.Z(r2)
            if (r2 >= r8) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r8 = r2
        L_0x01a6:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r8)
            java.util.Iterator r5 = r20.iterator()
        L_0x01af:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02bd
            java.lang.Object r6 = r5.next()
            r8 = r6
            mg3 r8 = (defpackage.mg3) r8
            int r10 = r8.a
            boolean r11 = r8.o
            r14 = 15
            jqe r4 = r8.b
            if (r11 == 0) goto L_0x025a
            android.content.Context r11 = r16.getContext()
            java.lang.CharSequence r4 = r4.b(r11)
            one.me.sdk.uikit.common.button.OneMeButton r11 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r9 = r16.getContext()
            r11.<init>(r9, r7)
            r11.setText((java.lang.CharSequence) r4)
            r4 = 3
            int r8 = r8.c
            if (r8 != r4) goto L_0x01e2
            b7a r9 = defpackage.b7a.a
            goto L_0x01e4
        L_0x01e2:
            b7a r9 = defpackage.b7a.b
        L_0x01e4:
            r11.setMode(r9)
            int r8 = defpackage.au1.s(r8)
            if (r8 == 0) goto L_0x01ff
            if (r8 == r3) goto L_0x01fc
            if (r8 == r15) goto L_0x01fc
            if (r8 != r4) goto L_0x01f6
            z6a r4 = defpackage.z6a.o
            goto L_0x0201
        L_0x01f6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01fc:
            z6a r4 = defpackage.z6a.c
            goto L_0x0201
        L_0x01ff:
            z6a r4 = defpackage.z6a.b
        L_0x0201:
            r11.setAppearance(r4)
            kg3 r4 = new kg3
            r4.<init>(r10, r3, r1)
            defpackage.tu0.K(r11, 300, r4)
            float r4 = (float) r14
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r4
            int r8 = defpackage.tu0.G(r8)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r4 = r4 * r9
            int r4 = defpackage.tu0.G(r4)
            int r9 = r11.getPaddingLeft()
            int r10 = r11.getPaddingRight()
            r11.setPadding(r9, r8, r10, r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r12, r13)
            r8 = 17
            r4.gravity = r8
            r8 = 8
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            r4.bottomMargin = r8
            r0.addView(r11, r4)
            r8 = 0
            r9 = 17
            goto L_0x02b7
        L_0x025a:
            android.content.Context r8 = r16.getContext()
            java.lang.CharSequence r4 = r4.b(r8)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r8 = r16.getContext()
            r11.<init>(r8)
            kqe r8 = defpackage.i4f.C
            r8.b(r11, defpackage.du4.b)
            r11.setText(r4)
            r4 = 17
            r11.setGravity(r4)
            kg3 r4 = new kg3
            r8 = 0
            r4.<init>(r10, r8, r1)
            defpackage.tu0.K(r11, 300, r4)
            float r4 = (float) r14
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r4
            int r9 = defpackage.tu0.G(r9)
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r4 = r4 * r10
            int r4 = defpackage.tu0.G(r4)
            int r10 = r11.getPaddingLeft()
            int r14 = r11.getPaddingRight()
            r11.setPadding(r10, r9, r14, r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r12, r13)
            r9 = 17
            r4.gravity = r9
            r0.addView(r11, r4)
        L_0x02b7:
            r2.put(r11, r6)
            r4 = r8
            goto L_0x01af
        L_0x02bd:
            r0.o = r2
            r0.setOrientation(r3)
            r0.setGravity(r9)
            pq9 r1 = defpackage.qp4.u0
            fka r1 = r1.j(r0)
            r0.onThemeChanged(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og3.<init>(one.me.sdk.bottomsheet.ConfirmationBottomSheet, java.lang.CharSequence, java.lang.CharSequence, java.util.ArrayList, android.content.Context):void");
    }

    public final Map<View, mg3> getButtonViews() {
        return this.o;
    }

    public final TextView getDescriptionView() {
        return this.c;
    }

    public final ImageView getIconView() {
        return this.a;
    }

    public final TextView getTitleView() {
        return this.b;
    }

    public final void onThemeChanged(fka fka) {
        int i;
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(fka.getIcon().i));
            Drawable background = imageView.getBackground();
            if (background != null) {
                background.setTint(fka.b().a.g);
            }
        }
        this.b.setTextColor(fka.getText().e);
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(fka.getText().g);
        }
        for (Map.Entry entry : this.o.entrySet()) {
            View view = (View) entry.getKey();
            mg3 mg3 = (mg3) entry.getValue();
            if (view instanceof OneMeButton) {
                ((OneMeButton) view).onThemeChanged(fka);
            } else if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                int s = au1.s(mg3.c);
                if (s == 0) {
                    i = fka.getText().b;
                } else if (s == 1) {
                    i = fka.getText().h;
                } else if (s == 2) {
                    i = fka.getText().e;
                } else if (s == 3) {
                    i = fka.getText().j;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView2.setTextColor(i);
            } else {
                continue;
            }
        }
    }
}
