package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: vy3  reason: default package */
public final class vy3 extends hqd {
    public static final int H0 = View.generateViewId();
    public static final int I0 = View.generateViewId();
    public final ImageView F0;
    public final TextView G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vy3(android.view.ViewGroup r10) {
        /*
            r9 = this;
            android.content.Context r10 = r10.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r1 = 0
            r0.setOrientation(r1)
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r3 = 56
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.tu0.G(r3)
            r4 = -1
            r2.<init>(r4, r3)
            r0.setLayoutParams(r2)
            r2 = 18
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = defpackage.tu0.G(r3)
            r4 = 12
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r4
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = defpackage.tu0.G(r4)
            r0.setPadding(r3, r5, r6, r4)
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r10)
            int r4 = H0
            r3.setId(r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 24
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = defpackage.tu0.G(r6)
            r5.<init>(r7, r6)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = defpackage.tu0.G(r2)
            r5.setMarginEnd(r2)
            r3.setLayoutParams(r5)
            r2 = 16
            r0.setGravity(r2)
            r0.addView(r3)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r10)
            int r10 = I0
            r2.setId(r10)
            kqe r5 = defpackage.i4f.j
            r5.b(r2, defpackage.du4.b)
            r5 = 1
            r2.setSingleLine(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r1, r6, r7)
            r1 = 19
            r5.gravity = r1
            r2.setLayoutParams(r5)
            r0.addView(r2)
            jf1 r1 = new jf1
            r5 = 0
            r6 = 2
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r2, (kotlin.coroutines.Continuation) r5, (int) r6)
            defpackage.v3c.y(r1, r0)
            r9.<init>(r0)
            android.view.View r1 = r0.findViewById(r4)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r9.F0 = r1
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.G0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy3.<init>(android.view.ViewGroup):void");
    }

    public final void D() {
        ((LinearLayout) this.a).setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: E */
    public final void A(uy3 uy3) {
        this.F0.setImageResource(uy3.b);
        TextView textView = this.G0;
        textView.setText(uy3.c.b(textView.getContext()));
        ((LinearLayout) this.a).setOnClickListener((View.OnClickListener) null);
    }
}
