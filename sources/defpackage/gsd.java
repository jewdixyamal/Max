package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: gsd  reason: default package */
public final class gsd extends bl8 implements csd, cmf, bmf {
    public final zef C0;
    public final y2b D0;
    public final w38 E0;
    public boolean F0;
    public final OneMeDraweeView G0;
    public final je7 H0;
    public final mdf I0;
    public final je7 J0;
    public final int K0;
    public final int L0;
    public o50 M0;
    public x77 N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gsd(Context context) {
        super(context);
        zef zef = new zef();
        this.C0 = zef;
        y2b y2b = new y2b(context);
        this.D0 = y2b;
        w38 w38 = new w38(context);
        w38.setUseMaxDimensionsOnMeasure(true);
        w38.setOverlayDrawable(y2b);
        this.E0 = w38;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.G0 = oneMeDraweeView;
        this.H0 = tu0.r(3, new yqd(context, 4));
        mdf mdf = new mdf(context);
        mdf.setDrawableEnabled(false);
        mdf.setBackgroundEnabled(true);
        this.I0 = mdf;
        this.J0 = tu0.r(3, new yqd(context, 5));
        float f = (float) 4;
        this.K0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.L0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        zef.b = this;
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-1, -2));
        addView(w38, new ViewGroup.LayoutParams(-1, -1));
        addView(mdf, new ViewGroup.LayoutParams(-2, -2));
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.H0.getValue();
    }

    private final mdf getTransferStatusView() {
        return (mdf) this.J0.getValue();
    }

    public static final void y(gsd gsd, b00 b00) {
        bsd bsd = (bsd) gsd.getModel();
        Long l = null;
        Long valueOf = bsd != null ? Long.valueOf(bsd.a) : null;
        if (b00 != null) {
            l = Long.valueOf(b00.a());
        }
        if (tpa.f(valueOf, l)) {
            if ((b00 instanceof xz) || (b00 instanceof a00)) {
                ay7.a(gsd, gsd.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
                gsd.getTransferStatusView().setVisibility(0);
                mdf transferStatusView = gsd.getTransferStatusView();
                CharSequence b = b00.b().b(gsd.getContext());
                if (b == null) {
                    b = "";
                }
                transferStatusView.setContent(b);
                return;
            }
            je7 je7 = gsd.J0;
            if (je7.a()) {
                ((mdf) je7.getValue()).setVisibility(8);
            }
        }
    }

    public final int b(int i, int i2) {
        w38 w38 = this.E0;
        boolean r = w38.r();
        OneMeDraweeView oneMeDraweeView = this.G0;
        int measuredHeight = r ? ((oneMeDraweeView.getMeasuredHeight() - w38.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.F0 || w38.r()) ? i : (getMeasuredWidth() - w38.getMeasuredWidth()) / 2;
        if (this.F0) {
            ote.E(oneMeDraweeView, i, i2, 0, 12);
        }
        ote.E(w38, measuredWidth, measuredHeight, 0, 12);
        zef zef = this.C0;
        if (br7.H((je7) zef.c)) {
            zef.T(measuredWidth, measuredHeight);
        }
        je7 je7 = this.J0;
        boolean a = je7.a();
        int i3 = this.K0;
        int i4 = this.L0;
        if (a) {
            ote.E((mdf) je7.getValue(), measuredWidth + i4, w38.getTop() + i3, 0, 12);
        }
        int measuredHeight2 = w38.getMeasuredHeight() + i2;
        mdf mdf = this.I0;
        ote.E(mdf, i + i4, (measuredHeight2 - mdf.getMeasuredHeight()) - i3, 0, 12);
        return this.F0 ? oneMeDraweeView.getMeasuredHeight() : w38.getMeasuredHeight();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (view == oneMeDraweeView && !this.F0) {
            return false;
        }
        if (view != this.E0 && view != oneMeDraweeView && view != this.C0.R()) {
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
        return this.E0;
    }

    public final boolean h(MotionEvent motionEvent) {
        return mpf.c(this.E0, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final boolean j() {
        return this.C0.j();
    }

    public final boolean m() {
        return br7.H((je7) this.C0.c);
    }

    public final void o(tlf tlf, o00 o00, long j, boolean z, boolean z2) {
        this.C0.o(tlf, o00, j, z, true);
    }

    public final xlf r(boolean z) {
        return b46.v0;
    }

    public final boolean s() {
        return this.C0.s();
    }

    public void setVideoClickListener(a66 a66) {
        this.C0.o = a66;
    }

    public void setVideoLongClickListener(a66 a66) {
        this.C0.X = a66;
    }

    public final long t(int i, int i2, int i3, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        mdf mdf = this.I0;
        mdf.measure(makeMeasureSpec, i4);
        je7 je7 = this.J0;
        if (je7.a()) {
            ((mdf) je7.getValue()).measure(i3, i4);
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        w38 w38 = this.E0;
        w38.measure(makeMeasureSpec2, i4);
        zef zef = this.C0;
        if (br7.H((je7) zef.c)) {
            zef.U(View.MeasureSpec.makeMeasureSpec(w38.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = w38.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.G0;
        boolean z = true;
        if (blurOffset == 0) {
            if (w38.getMeasuredWidth() >= i) {
                z = false;
            }
            this.F0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (w38.E0 > 0) {
                this.F0 = true;
                int blurOffset2 = (w38.getBlurOffset() * 2) + w38.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
            } else if (w38.r()) {
                this.F0 = true;
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(w38.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((w38.getBlurOffset() * 2) + w38.getMeasuredHeight(), 1073741824));
            } else {
                this.F0 = false;
            }
        }
        return dy7.l(Math.max(this.F0 ? oneMeDraweeView.getMeasuredWidth() : w38.getMeasuredWidth(), Math.max(br7.B(je7), mdf.getMeasuredWidth() + getDate$message_list_release().getMeasuredWidth())), Math.max(this.F0 ? oneMeDraweeView.getMeasuredHeight() : w38.getMeasuredHeight(), Math.max(getDate$message_list_release().getMeasuredHeight(), br7.A(je7))));
    }

    public final void u() {
        this.C0.u();
    }

    public final void v(x38 x38) {
        bsd bsd = (bsd) x38;
        wcf wcf = bsd.c;
        yt6 yt6 = r3;
        yt6 yt62 = new yt6(0, wcf.b, wcf.c, wcf.d, false, wcf.e, false, wcf.h, wcf.i, (String) null, (Uri) null, 3584);
        this.E0.setImageAttach(yt6);
        OneMeDraweeView oneMeDraweeView = this.G0;
        xv6 d = xv6.d(wcf.b);
        d.d = wcf.i;
        d.l = getBlurPostProcessor();
        oneMeDraweeView.o(d.a(), (wv6) null);
        ((la6) oneMeDraweeView.getHierarchy()).h(ssc.l);
        long e = ft4.e(wcf.f);
        String[] strArr = are.b;
        this.I0.setContent(tfg.c(e));
        j0e j0e = bsd.d;
        if (!(j0e.getValue() instanceof xz) && !(j0e.getValue() instanceof a00)) {
            je7 je7 = this.J0;
            if (je7.a()) {
                ((mdf) je7.getValue()).setVisibility(8);
            }
        }
    }
}
