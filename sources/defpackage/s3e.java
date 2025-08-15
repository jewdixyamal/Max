package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: s3e  reason: default package */
public final class s3e extends hqd implements a1d, zp4 {
    public static final ShapeDrawable K0;
    public final SimpleDraweeView F0;
    public final TextView G0;
    public final TextView H0;
    public final View I0;
    public y0d J0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = fk4.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        K0 = shapeDrawable;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s3e(android.content.Context r11) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r11)
            r3.setLayoutParams(r0)
            r11 = 14
            float r11 = (float) r11
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r11 = r11 * r0
            int r11 = defpackage.tu0.G(r11)
            r0 = 12
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r0 = r0 * r4
            int r0 = defpackage.tu0.G(r0)
            r3.setPadding(r0, r11, r0, r11)
            com.facebook.drawee.view.SimpleDraweeView r11 = new com.facebook.drawee.view.SimpleDraweeView
            android.content.Context r0 = r3.getContext()
            r11.<init>(r0)
            r0 = 40
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r0
            int r4 = defpackage.tu0.G(r4)
            int r5 = defpackage.gja.o
            r11.setId(r5)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.<init>(r4, r4, r7)
            r11.setLayoutParams(r6)
            rq4 r4 = r11.getHierarchy()
            la6 r4 = (defpackage.la6) r4
            ssc r6 = defpackage.ssc.m
            r4.h(r6)
            r3.addView(r11)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r4 = 16
            r11.<init>(r1, r2, r4)
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
            r1 = 10
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r0 = defpackage.rh4.c(r1, r2, r0)
            r11.leftMargin = r0
            r0 = 24
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r0
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.rh4.c(r1, r4, r2)
            r11.rightMargin = r1
            android.content.Context r1 = r3.getContext()
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r2.setLayoutParams(r11)
            r11 = 1
            r2.setOrientation(r11)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r1 = r2.getContext()
            r11.<init>(r1)
            int r1 = defpackage.gja.q
            r11.setId(r1)
            kqe r4 = defpackage.i4f.k
            r4.b(r11, defpackage.du4.b)
            r2.addView(r11)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r6 = r2.getContext()
            r4.<init>(r6)
            int r6 = defpackage.gja.p
            r4.setId(r6)
            kqe r7 = defpackage.i4f.p
            r7.b(r4, defpackage.du4.b)
            r2.addView(r4)
            yx5 r7 = new yx5
            r8 = 0
            r9 = 2
            r7.<init>(r11, r4, r8, r9)
            defpackage.v3c.y(r7, r2)
            r3.addView(r2)
            androidx.appcompat.widget.AppCompatImageView r11 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r2 = r3.getContext()
            r11.<init>(r2, r8)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            int r2 = defpackage.gja.n
            r11.setId(r2)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388629(0x800015, float:1.1754973E-38)
            r4.<init>(r0, r0, r7)
            r11.setLayoutParams(r4)
            int r0 = defpackage.fja.a
            r11.setImageResource(r0)
            r1b r0 = new r1b
            r4 = 3
            r7 = 15
            r0.<init>((int) r4, (kotlin.coroutines.Continuation) r8, (int) r7)
            defpackage.v3c.y(r0, r11)
            r3.addView(r11)
            ro2 r11 = new ro2
            r0 = 6
            r11.<init>(r4, r8, r0)
            defpackage.v3c.y(r11, r3)
            r10.<init>(r3)
            android.view.View r11 = r3.findViewById(r5)
            com.facebook.drawee.view.SimpleDraweeView r11 = (com.facebook.drawee.view.SimpleDraweeView) r11
            r10.F0 = r11
            android.view.View r11 = r3.findViewById(r1)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.G0 = r11
            android.view.View r11 = r3.findViewById(r6)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.H0 = r11
            android.view.View r11 = r3.findViewById(r2)
            r10.I0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3e.<init>(android.content.Context):void");
    }

    public final void A(ol7 ol7) {
        if (ol7 instanceof w0d) {
            this.J0 = (y0d) ol7;
            w0d w0d = (w0d) ol7;
            this.F0.setImageURI(w0d.b);
            this.G0.setText(w0d.c);
            this.H0.setText(w0d.o);
        }
    }

    public final void b(m6e m6e) {
        View view = this.a;
        if (m6e != null) {
            tu0.K(view, 300, new v7d(this, 9, m6e));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
