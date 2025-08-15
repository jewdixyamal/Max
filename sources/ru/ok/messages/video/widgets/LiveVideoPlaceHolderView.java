package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class LiveVideoPlaceHolderView extends ConstraintLayout implements nse {
    public ida G0;
    public t33 H0;
    public AppCompatTextView I0;
    public AppCompatTextView J0;
    public GradientDrawable K0;
    public k20 L0;

    public LiveVideoPlaceHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w();
    }

    public final void c() {
        this.K0.setColor(getContext().getResources().getColor(epc.c));
        this.I0.setTextColor(-1);
        this.J0.setTextColor(-1);
    }

    public void setCorners(float[] fArr) {
        this.K0.setCornerRadii(fArr);
    }

    public final void w() {
        this.G0 = (ida) ((y8a) vl.b()).getAccessor().c(ida.class);
        this.H0 = ((y8a) vl.b()).n().a;
        getContext();
        bk4 b = bk4.b();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.K0 = gradientDrawable;
        setBackground(gradientDrawable);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.I0 = appCompatTextView;
        appCompatTextView.setId(xxb.view_not_started_live_video__title);
        this.I0.setGravity(17);
        this.I0.setTextSize(0, b.J);
        this.I0.setText(getResources().getText(jpc.d3));
        ti3 ti3 = new ti3(0, -2);
        ti3.i = 0;
        ti3.t = 0;
        ti3.v = 0;
        ti3.k = xxb.view_not_started_live_video__subtitle;
        ti3.K = 2;
        int i = b.e;
        ti3.leftMargin = i;
        ti3.rightMargin = i;
        addView(this.I0, ti3);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.J0 = appCompatTextView2;
        appCompatTextView2.setId(xxb.view_not_started_live_video__subtitle);
        this.J0.setGravity(17);
        this.J0.setTextSize(0, b.J);
        this.J0.setTypeface((Typeface) null, 1);
        ti3 ti32 = new ti3(0, -2);
        ti32.j = xxb.view_not_started_live_video__title;
        ti32.t = 0;
        ti32.v = 0;
        ti32.l = 0;
        int i2 = b.e;
        ti32.leftMargin = i2;
        ti32.rightMargin = i2;
        addView(this.J0, ti32);
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r12 = this;
            k20 r0 = r12.L0
            if (r0 == 0) goto L_0x0093
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x0093
            t33 r1 = r12.H0
            long r1 = r1.n()
            long r3 = r0.k
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0016
            goto L_0x0093
        L_0x0016:
            ida r0 = r12.G0
            k20 r1 = r12.L0
            long r1 = r1.k
            t33 r3 = r0.c
            long r4 = r3.n()
            java.util.Locale r3 = r3.v()
            java.lang.String[] r6 = defpackage.are.b
            long r1 = r1 - r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0032
            java.lang.String r0 = "0:00:00"
            goto L_0x0082
        L_0x0032:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r4.toHours(r1)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 * r4
            long r6 = r1 - r6
            r8 = 60000(0xea60, double:2.9644E-319)
            long r10 = r6 / r8
            long r8 = r8 * r10
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0066
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "%d:%02d:%02d"
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)
            goto L_0x0082
        L_0x0066:
            r1 = 24
            long r6 = r4 / r1
            long r1 = r1 * r6
            long r4 = r4 - r1
            int r1 = (int) r6
            int r2 = defpackage.fzb.tt_dates_days
            android.content.Context r0 = r0.a
            java.lang.String r1 = defpackage.ay7.m(r2, r1, r0)
            int r2 = (int) r4
            int r3 = defpackage.fzb.tt_dates_hours
            java.lang.String r0 = defpackage.ay7.m(r3, r2, r0)
            java.lang.String r2 = " "
            java.lang.String r0 = defpackage.rh4.j(r1, r2, r0)
        L_0x0082:
            androidx.appcompat.widget.AppCompatTextView r1 = r12.J0
            r1.setText(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.I0
            r1 = 0
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.J0
            r0.setVisibility(r1)
            goto L_0x009f
        L_0x0093:
            androidx.appcompat.widget.AppCompatTextView r0 = r12.I0
            r1 = 8
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.J0
            r0.setVisibility(r1)
        L_0x009f:
            k20 r0 = r12.L0
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = r0.d
            boolean r0 = defpackage.oag.t(r0)
            if (r0 == 0) goto L_0x00b3
            android.graphics.drawable.GradientDrawable r12 = r12.K0
            r0 = 255(0xff, float:3.57E-43)
            r12.setAlpha(r0)
            goto L_0x00ba
        L_0x00b3:
            android.graphics.drawable.GradientDrawable r12 = r12.K0
            r0 = 127(0x7f, float:1.78E-43)
            r12.setAlpha(r0)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.LiveVideoPlaceHolderView.x():void");
    }
}
