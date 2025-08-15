package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: iwc  reason: default package */
public final class iwc extends FrameLayout implements kre {
    public final AppCompatImageView a;
    public final caa b;

    public iwc(Context context) {
        super(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 44;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        appCompatImageView.setLayoutParams(layoutParams);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        appCompatImageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 48.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        appCompatImageView.setBackground(gradientDrawable);
        this.a = appCompatImageView;
        caa caa = new caa(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 53;
        caa.setVisibility(8);
        caa.setLayoutParams(layoutParams2);
        this.b = caa;
        float f2 = (float) 46;
        setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(caa);
        onThemeChanged(qp4.u0.j(this));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onThemeChanged(defpackage.fka r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r5.a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            r3 = 0
            if (r2 == 0) goto L_0x000e
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            if (r1 == 0) goto L_0x001d
            gae r2 = r6.i()
            lae r2 = r2.b
            int r2 = r2.c
            r4 = 2
            r1.setStroke(r4, r2)
        L_0x001d:
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r2 == 0) goto L_0x0028
            r3 = r1
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
        L_0x0028:
            if (r3 == 0) goto L_0x003f
            pq9 r1 = defpackage.qp4.u0
            fka r1 = r1.j(r5)
            nr2 r1 = r1.a()
            v83 r1 = r1.s()
            m73 r1 = r1.b
            int r1 = r1.i
            r3.setColor(r1)
        L_0x003f:
            bs6 r1 = r6.getIcon()
            int r1 = r1.f
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            caa r5 = r5.b
            r5.f(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwc.onThemeChanged(fka):void");
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        caa caa = this.b;
        caa.setVisibility(i2);
        caa.g(i, true);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
