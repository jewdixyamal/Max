package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: sm2  reason: default package */
public final class sm2 extends LinearLayout implements kre {
    public final ppe a;
    public final ppe b;
    public final ppe c;
    public final Paint o;

    public sm2(Context context) {
        super(context, (AttributeSet) null);
        ppe ppe = new ppe(context);
        this.a = ppe;
        ppe ppe2 = new ppe(context);
        this.b = ppe2;
        ppe ppe3 = new ppe(context);
        this.c = ppe3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        pq9 pq9 = qp4.u0;
        paint.setColor(pq9.j(this).i().b.b);
        this.o = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 16.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        l73 l73 = pq9.j(this).a().s().b.a;
        gradientDrawable.setColors(new int[]{l73.g, l73.h});
        setOrientation(1);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        float f = (float) 16;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        addView(ppe, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams2.gravity = 8388613;
        addView(ppe2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388611;
        layoutParams3.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams3.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        addView(ppe3, layoutParams3);
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        setBackground(gradientDrawable);
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.qm2 r14) {
        /*
            r13 = this;
            k29 r0 = r14.f
            e52 r1 = r14.a
            es8 r2 = r14.d
            r3 = 1
            by8 r4 = defpackage.k29.c(r0, r1, r2, r3)
            es8 r5 = r14.b
            by8 r6 = defpackage.k29.c(r0, r1, r5, r3)
            es8 r7 = r14.c
            by8 r0 = defpackage.k29.c(r0, r1, r7, r3)
            ppe r1 = r13.a
            if (r6 == 0) goto L_0x001e
            r1.setTextMessageLayout(r6)
        L_0x001e:
            qx7 r6 = defpackage.vs8.y
            pq9 r8 = defpackage.qp4.u0
            fka r9 = r8.j(r1)
            r6.getClass()
            vs8 r6 = defpackage.qx7.e(r9)
            r1.setBackground(r6)
            u6b r5 = r5.X
            r5.f()
            java.lang.String r5 = r5.k
            r6 = 0
            r1.g(r5, r6)
            ppe r5 = r13.b
            if (r4 == 0) goto L_0x0056
            r5.setTextMessageLayout(r4)
            cu8 r4 = r2.a
            ix8 r4 = r4.S0
            if (r4 == 0) goto L_0x004b
            r5.f(r4, r6)
        L_0x004b:
            fka r4 = r8.j(r5)
            vs8 r4 = defpackage.qx7.e(r4)
            r5.setBackground(r4)
        L_0x0056:
            zof r4 = r14.e
            r5.setDateViewStatus(r4)
            u6b r2 = r2.X
            r2.f()
            java.lang.String r2 = r2.k
            r5.g(r2, r6)
            ppe r13 = r13.c
            if (r0 == 0) goto L_0x006c
            r13.setTextMessageLayout(r0)
        L_0x006c:
            fka r0 = r8.j(r13)
            vs8 r0 = defpackage.qx7.e(r0)
            r13.setBackground(r0)
            u6b r0 = r7.X
            r0.f()
            java.lang.String r0 = r0.k
            r13.g(r0, r6)
            nr2 r14 = r14.g
            is0 r0 = r14.k()
            ls0 r0 = r0.d
            int r0 = r0.m
            r5.setDateTextColor(r0)
            is0 r0 = r14.k()
            r5.setTextMessageColors(r0)
            is0 r0 = r14.k()
            r5.k(r0, r3)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r2 = r0 instanceof defpackage.vs8
            r4 = 0
            if (r2 == 0) goto L_0x00a8
            vs8 r0 = (defpackage.vs8) r0
            goto L_0x00a9
        L_0x00a8:
            r0 = r4
        L_0x00a9:
            r2 = 1
            if (r0 == 0) goto L_0x00c3
            is0 r6 = r14.k()
            ks0 r6 = r6.c
            int r11 = r6.a
            r10 = 1
            r12 = 0
            r7 = 0
            r9 = 1
            r6 = r0
            r8 = r2
            boolean r6 = defpackage.vs8.b(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x00c3
            r0.invalidateSelf()
        L_0x00c3:
            r5.requestLayout()
            is0 r0 = r14.g()
            r13.setTextMessageColors(r0)
            is0 r0 = r14.g()
            ls0 r0 = r0.d
            int r0 = r0.m
            r13.setDateTextColor(r0)
            android.graphics.drawable.Drawable r0 = r13.getBackground()
            boolean r5 = r0 instanceof defpackage.vs8
            if (r5 == 0) goto L_0x00e3
            vs8 r0 = (defpackage.vs8) r0
            goto L_0x00e4
        L_0x00e3:
            r0 = r4
        L_0x00e4:
            if (r0 == 0) goto L_0x00fd
            is0 r5 = r14.d(r3)
            ks0 r5 = r5.c
            int r11 = r5.a
            r10 = 1
            r12 = 0
            r7 = 1
            r9 = 1
            r6 = r0
            r8 = r2
            boolean r5 = defpackage.vs8.b(r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00fd
            r0.invalidateSelf()
        L_0x00fd:
            r13.requestLayout()
            is0 r13 = r14.g()
            ls0 r13 = r13.d
            int r13 = r13.m
            r1.setDateTextColor(r13)
            is0 r13 = r14.g()
            r1.setTextMessageColors(r13)
            android.graphics.drawable.Drawable r13 = r1.getBackground()
            boolean r0 = r13 instanceof defpackage.vs8
            if (r0 == 0) goto L_0x011d
            r4 = r13
            vs8 r4 = (defpackage.vs8) r4
        L_0x011d:
            if (r4 == 0) goto L_0x0136
            is0 r13 = r14.d(r3)
            ks0 r13 = r13.c
            int r11 = r13.a
            r10 = 1
            r12 = 0
            r7 = 1
            r9 = 1
            r6 = r4
            r8 = r2
            boolean r13 = defpackage.vs8.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0136
            r4.invalidateSelf()
        L_0x0136:
            r1.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm2.a(qm2):void");
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (fk4.d().getDisplayMetrics().density * 1.0f) / ((float) 2);
        canvas.drawRoundRect(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f, (fk4.d().getDisplayMetrics().density * 16.0f) - f, (fk4.d().getDisplayMetrics().density * 16.0f) - f, this.o);
    }

    public final void onThemeChanged(fka fka) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            l73 l73 = fka.a().s().b.a;
            gradientDrawable.setColors(new int[]{l73.g, l73.h});
        }
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
        requestLayout();
    }
}
