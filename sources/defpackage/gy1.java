package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: gy1  reason: default package */
public final class gy1 extends kgb implements kre {
    public final OneMeButton F0;
    public final AppCompatTextView G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gy1(android.content.Context r11) {
        /*
            r10 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r11)
            r10.<init>(r0)
            one.me.sdk.uikit.common.button.OneMeButton r1 = new one.me.sdk.uikit.common.button.OneMeButton
            r2 = 0
            r1.<init>(r11, r2)
            c7a r3 = defpackage.c7a.c
            r1.setSize(r3)
            b7a r3 = defpackage.b7a.a
            r1.setMode(r3)
            z6a r3 = defpackage.z6a.c
            r1.setAppearance(r3)
            int r3 = defpackage.vea.i
            r1.setText((int) r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r6 = 8
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.tu0.G(r6)
            r3.bottomMargin = r6
            r6 = 12
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            r3.topMargin = r7
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            r3.leftMargin = r7
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            r3.rightMargin = r7
            r1.setLayoutParams(r3)
            r10.F0 = r1
            androidx.appcompat.widget.AppCompatTextView r3 = new androidx.appcompat.widget.AppCompatTextView
            r3.<init>(r11, r2)
            int r7 = defpackage.rea.a
            android.graphics.drawable.Drawable r11 = defpackage.kt3.b(r11, r7)
            java.util.ArrayList r7 = defpackage.qqe.a
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) r11, (android.graphics.drawable.Drawable) r2, (android.graphics.drawable.Drawable) r2, (android.graphics.drawable.Drawable) r2)
            pq9 r11 = defpackage.qp4.u0
            fka r7 = r11.j(r0)
            bs6 r7 = r7.getIcon()
            int r7 = r7.c
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r3.setCompoundDrawableTintList(r7)
            r7 = 20
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r7
            int r8 = defpackage.tu0.G(r8)
            r3.setCompoundDrawablePadding(r8)
            kqe r8 = defpackage.i4f.d
            r8.b(r3, defpackage.du4.b)
            fka r11 = r11.j(r0)
            xoe r11 = r11.getText()
            int r11 = r11.b
            r3.setTextColor(r11)
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r7
            int r11 = defpackage.tu0.G(r11)
            r8 = 10
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r6 = r6 * r9
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r7 = defpackage.tu0.G(r7)
            r3.setPaddingRelative(r11, r7, r6, r8)
            r10.G0 = r3
            r10 = 1
            r0.setOrientation(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r4, r5)
            r0.setLayoutParams(r10)
            r0.setBackground(r2)
            r0.addView(r3)
            r0.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy1.<init>(android.content.Context):void");
    }

    public final void A(ol7 ol7) {
        this.G0.setText(((fy1) ol7).a.b(this.a.getContext()));
    }

    public final void onThemeChanged(fka fka) {
        AppCompatTextView appCompatTextView = this.G0;
        pq9 pq9 = qp4.u0;
        View view = this.a;
        appCompatTextView.setTextColor(pq9.j(view).getText().b);
        bs6 icon = pq9.j(view).getIcon();
        ArrayList arrayList = qqe.a;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(icon.c));
    }
}
