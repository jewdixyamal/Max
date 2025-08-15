package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: k6c  reason: default package */
public final class k6c extends hqd implements kre {
    public final l6c F0;
    public final GradientDrawable G0;
    public final RippleDrawable H0;
    public final RippleDrawable I0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k6c(android.content.Context r7, defpackage.l6c r8) {
        /*
            r6 = this;
            int r0 = r8.a()
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r7)
            pdc r7 = new pdc
            r7.<init>((int) r0, (int) r0)
            r1.setLayoutParams(r7)
            r7 = 0
            r1.setClipToOutline(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r7)
            ck r7 = new ck
            r0 = 7
            r7.<init>(r0, r1)
            r1.addOnAttachStateChangeListener(r7)
            r6.<init>(r1)
            r6.F0 = r8
            pq9 r7 = defpackage.qp4.u0
            fka r8 = r7.j(r1)
            ne0 r8 = r8.b()
            me0 r8 = r8.a
            int r8 = r8.h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 0
            android.graphics.drawable.GradientDrawable r8 = defpackage.hm9.S(r8, r0, r0)
            r6.G0 = r8
            fka r2 = r7.j(r1)
            xoe r2 = r2.getText()
            int r2 = r2.e
            r3 = 1050253722(0x3e99999a, float:0.3)
            int r2 = defpackage.ote.b0(r2, r3)
            r4 = -65536(0xffffffffffff0000, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.drawable.GradientDrawable r4 = defpackage.hm9.S(r4, r0, r0)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r5.<init>(r2, r8, r4)
            r6.H0 = r5
            fka r7 = r7.j(r1)
            xoe r7 = r7.getText()
            int r7 = r7.e
            int r7 = defpackage.ote.b0(r7, r3)
            android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r8.<init>(r7, r0, r0)
            r6.I0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6c.<init>(android.content.Context, l6c):void");
    }

    /* renamed from: E */
    public final void A(j6c j6c) {
        int i;
        boolean z = j6c.o;
        if (z) {
            l6c l6c = this.F0;
            i = tu0.G(((float) ((l6c.a() - (ay7.B(l6c.a) >= 360 ? 22 : 20)) / 2)) * fk4.d().getDisplayMetrics().density);
        } else {
            i = 0;
        }
        View view = this.a;
        view.setPadding(i, i, i, i);
        view.setBackground(z ? this.H0 : this.I0);
        ((ImageView) view).setImageDrawable(j6c.c);
    }

    public final void onThemeChanged(fka fka) {
        this.H0.setColor(ColorStateList.valueOf(ote.b0(fka.getText().e, 0.3f)));
        this.G0.setColor(fka.b().a.h);
        this.I0.setColor(ColorStateList.valueOf(ote.b0(fka.getText().e, 0.3f)));
    }
}
