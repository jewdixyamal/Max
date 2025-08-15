package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: esd  reason: default package */
public final class esd extends bd8 implements csd, bmf, cmf {
    public final je7 A0;
    public boolean B0;
    public final mdf C0;
    public final je7 D0;
    public o50 E0;
    public x77 F0;
    public final zef w0;
    public final y2b x0;
    public final w38 y0;
    public final OneMeDraweeView z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public esd(Context context) {
        super(context);
        zef zef = new zef();
        this.w0 = zef;
        y2b y2b = new y2b(context);
        this.x0 = y2b;
        w38 w38 = new w38(context);
        w38.setUseMaxDimensionsOnMeasure(true);
        w38.setIgnoreCropCriteria(true);
        w38.setOverlayDrawable(y2b);
        this.y0 = w38;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.z0 = oneMeDraweeView;
        this.A0 = tu0.r(3, new yqd(context, 2));
        mdf mdf = new mdf(context);
        mdf.setDrawableEnabled(false);
        mdf.setBackgroundEnabled(true);
        this.C0 = mdf;
        this.D0 = tu0.r(3, new yqd(context, 3));
        zef.b = this;
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-1, -2));
        addView(w38, new ViewGroup.LayoutParams(-1, -1));
        addView(mdf, new ViewGroup.LayoutParams(-2, -2));
        oneMeDraweeView.setupNewController(true);
    }

    public static final void e(esd esd, b00 b00) {
        bsd bsd = (bsd) esd.getModel();
        Long l = null;
        Long valueOf = bsd != null ? Long.valueOf(bsd.a) : null;
        if (b00 != null) {
            l = Long.valueOf(b00.a());
        }
        if (tpa.f(valueOf, l)) {
            if ((b00 instanceof xz) || (b00 instanceof a00)) {
                ay7.a(esd, esd.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                esd.getTransferStatusView().setVisibility(0);
                mdf transferStatusView = esd.getTransferStatusView();
                CharSequence b = b00.b().b(esd.getContext());
                if (b == null) {
                    b = "";
                }
                transferStatusView.setContent(b);
                return;
            }
            je7 je7 = esd.D0;
            if (je7.a()) {
                ((mdf) je7.getValue()).setVisibility(8);
            }
        }
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.A0.getValue();
    }

    private final mdf getTransferStatusView() {
        return (mdf) this.D0.getValue();
    }

    public final int b(int i, int i2) {
        w38 w38 = this.y0;
        boolean r = w38.r();
        OneMeDraweeView oneMeDraweeView = this.z0;
        int measuredHeight = r ? ((oneMeDraweeView.getMeasuredHeight() - w38.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.B0 || w38.r()) ? i : (getMeasuredWidth() - w38.getMeasuredWidth()) / 2;
        if (this.B0) {
            ote.E(oneMeDraweeView, i, i2, 0, 12);
        }
        ote.E(w38, measuredWidth, measuredHeight, 0, 12);
        zef zef = this.w0;
        if (br7.H((je7) zef.c)) {
            zef.T(measuredWidth, measuredHeight);
        }
        je7 je7 = this.D0;
        if (je7.a()) {
            float f = (float) 4;
            ote.E((mdf) je7.getValue(), rh4.c(f, fk4.d().getDisplayMetrics().density, measuredWidth), rh4.c(f, fk4.d().getDisplayMetrics().density, w38.getTop()), 0, 12);
        }
        float f2 = (float) 4;
        int c = rh4.c(f2, fk4.d().getDisplayMetrics().density, i);
        int measuredHeight2 = w38.getMeasuredHeight() + i2;
        mdf mdf = this.C0;
        ote.E(mdf, c, rh4.q(f2, fk4.d().getDisplayMetrics().density, measuredHeight2 - mdf.getMeasuredHeight()), 0, 12);
        return this.B0 ? oneMeDraweeView.getMeasuredHeight() : w38.getMeasuredHeight();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.z0;
        if (view == oneMeDraweeView && !this.B0) {
            return false;
        }
        if (view != this.y0 && view != oneMeDraweeView && view != this.w0.R()) {
            return super.drawChild(canvas, view, j);
        }
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        float f = (float) 2;
        Matrix a = k78.a();
        a.reset();
        a.setScale((measuredWidth - ((fk4.d().getDisplayMetrics().density * 1.0f) * f)) / measuredWidth, (measuredHeight - ((1.0f * fk4.d().getDisplayMetrics().density) * f)) / measuredHeight, measuredWidth / 2.0f, measuredHeight / 2.0f);
        Path b = k78.b();
        b.reset();
        b.set(((vs8) getBackground()).a());
        b.transform(k78.a());
        Path b2 = k78.b();
        int save = canvas.save();
        canvas.clipPath(b2);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public View getPreviewView() {
        return this.y0;
    }

    public final boolean j() {
        return this.w0.j();
    }

    public final boolean m() {
        return br7.H((je7) this.w0.c);
    }

    public final void o(tlf tlf, o00 o00, long j, boolean z, boolean z2) {
        this.w0.o(tlf, o00, j, z, true);
    }

    public final xlf r(boolean z) {
        return b46.v0;
    }

    public final boolean s() {
        return this.w0.s();
    }

    public void setVideoClickListener(a66 a66) {
        this.w0.o = a66;
    }

    public void setVideoLongClickListener(a66 a66) {
        this.w0.X = a66;
    }

    public final long t(int i, int i2, int i3, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        mdf mdf = this.C0;
        mdf.measure(makeMeasureSpec, i4);
        je7 je7 = this.D0;
        if (je7.a()) {
            ((mdf) je7.getValue()).measure(i3, i4);
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        w38 w38 = this.y0;
        w38.measure(makeMeasureSpec2, i4);
        zef zef = this.w0;
        if (br7.H((je7) zef.c)) {
            zef.U(View.MeasureSpec.makeMeasureSpec(w38.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = w38.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.z0;
        boolean z = true;
        if (blurOffset == 0) {
            if (w38.getMeasuredWidth() >= i) {
                z = false;
            }
            this.B0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (w38.E0 > 0) {
                this.B0 = true;
                int blurOffset2 = (w38.getBlurOffset() * 2) + w38.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
            } else if (w38.r()) {
                this.B0 = true;
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(w38.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((w38.getBlurOffset() * 2) + w38.getMeasuredHeight(), 1073741824));
            } else {
                this.B0 = false;
            }
        }
        return dy7.l(Math.max(this.B0 ? oneMeDraweeView.getMeasuredWidth() : w38.getMeasuredWidth(), Math.max(br7.B(je7), mdf.getMeasuredWidth() + getDate().getMeasuredWidth())), Math.max(this.B0 ? oneMeDraweeView.getMeasuredHeight() : w38.getMeasuredHeight(), Math.max(getDate().getMeasuredHeight(), br7.A(je7))));
    }

    public final void u() {
        this.w0.u();
    }

    public final void v(x38 x38) {
        bsd bsd = (bsd) x38;
        wcf wcf = bsd.c;
        yt6 yt6 = r3;
        yt6 yt62 = new yt6(0, wcf.b, wcf.c, wcf.d, false, wcf.e, false, wcf.h, wcf.i, (String) null, (Uri) null, 3584);
        this.y0.setImageAttach(yt6);
        OneMeDraweeView oneMeDraweeView = this.z0;
        xv6 d = xv6.d(wcf.b);
        d.d = wcf.i;
        d.l = getBlurPostProcessor();
        oneMeDraweeView.o(d.a(), (wv6) null);
        ((la6) oneMeDraweeView.getHierarchy()).h(ssc.l);
        long e = ft4.e(wcf.f);
        String[] strArr = are.b;
        this.C0.setContent(tfg.c(e));
        j0e j0e = bsd.d;
        if (!(j0e.getValue() instanceof xz) && !(j0e.getValue() instanceof a00)) {
            je7 je7 = this.D0;
            if (je7.a()) {
                ((mdf) je7.getValue()).setVisibility(8);
            }
        }
    }
}
