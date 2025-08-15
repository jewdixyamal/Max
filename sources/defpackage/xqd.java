package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: xqd  reason: default package */
public final class xqd extends bd8 implements wqd, ot8, cmf {
    public boolean A0;
    public final je7 B0;
    public final zef w0;
    public final w38 x0;
    public final OneMeDraweeView y0;
    public final je7 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqd(Context context) {
        super(context);
        zef zef = new zef();
        this.w0 = zef;
        w38 w38 = new w38(context);
        this.x0 = w38;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.y0 = oneMeDraweeView;
        this.z0 = tu0.r(3, new xda(context, 28));
        this.B0 = tu0.r(3, new xda(context, 29));
        zef.b = this;
        addView(oneMeDraweeView, -1, -2);
        addView(w38, new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setupNewController(true);
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.z0.getValue();
    }

    private final pm8 getMediaType() {
        return (pm8) this.B0.getValue();
    }

    public final int b(int i, int i2) {
        w38 w38 = this.x0;
        boolean r = w38.r();
        OneMeDraweeView oneMeDraweeView = this.y0;
        int measuredHeight = r ? ((oneMeDraweeView.getMeasuredHeight() - w38.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.A0 || w38.r()) ? i : (getMeasuredWidth() - w38.getMeasuredWidth()) / 2;
        if (this.A0) {
            ote.E(oneMeDraweeView, i, i2, 0, 12);
        }
        ote.E(w38, measuredWidth, measuredHeight, 0, 12);
        zef zef = this.w0;
        if (br7.H((je7) zef.c)) {
            zef.T(measuredWidth, measuredHeight);
        }
        je7 je7 = this.B0;
        if (je7.a()) {
            float f = (float) 4;
            ote.E((pm8) je7.getValue(), rh4.c(f, fk4.d().getDisplayMetrics().density, w38.getLeft()), w38.getBottom() - (tu0.G(f * fk4.d().getDisplayMetrics().density) + getMediaType().getMeasuredHeight()), 0, 12);
        }
        return this.A0 ? oneMeDraweeView.getMeasuredHeight() : w38.getMeasuredHeight();
    }

    /* JADX INFO: finally extract failed */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.y0;
        if (view == oneMeDraweeView && !this.A0) {
            return false;
        }
        if (view != this.x0 && view != oneMeDraweeView && view != this.w0.R()) {
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
        return this.x0;
    }

    public final boolean h(MotionEvent motionEvent) {
        return true;
    }

    public final boolean j() {
        return this.x0.getImageAttach().e;
    }

    public final boolean m() {
        return br7.H((je7) this.w0.c);
    }

    public final void o(tlf tlf, o00 o00, long j, boolean z, boolean z2) {
        this.w0.o(tlf, o00, j, z, true);
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
        w38 w38 = this.x0;
        w38.measure(makeMeasureSpec, i4);
        je7 je7 = this.B0;
        if (je7.a()) {
            ((pm8) je7.getValue()).measure(i3, i4);
        }
        zef zef = this.w0;
        if (br7.H((je7) zef.c)) {
            zef.U(View.MeasureSpec.makeMeasureSpec(w38.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = w38.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.y0;
        boolean z = true;
        if (blurOffset == 0) {
            if (w38.getMeasuredWidth() >= i) {
                z = false;
            }
            this.A0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (w38.E0 > 0) {
                this.A0 = true;
                int blurOffset2 = (w38.getBlurOffset() * 2) + w38.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38.getMeasuredHeight(), 1073741824));
            } else if (w38.r()) {
                this.A0 = true;
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(w38.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((w38.getBlurOffset() * 2) + w38.getMeasuredHeight(), 1073741824));
            } else {
                this.A0 = false;
            }
        }
        return dy7.l(Math.max(this.A0 ? oneMeDraweeView.getMeasuredWidth() : w38.getMeasuredWidth(), getDate().getMeasuredWidth() + br7.B(je7)), Math.max(this.A0 ? oneMeDraweeView.getMeasuredHeight() : w38.getMeasuredHeight(), Math.max(getDate().getMeasuredHeight(), br7.A(je7))));
    }

    public final void u() {
        this.w0.u();
    }

    public final void v(x38 x38) {
        yt6 yt6 = ((vqd) x38).c;
        this.x0.setImageAttach(yt6);
        OneMeDraweeView oneMeDraweeView = this.y0;
        xv6 d = xv6.d(yt6.b);
        d.d = yt6.i;
        d.l = getBlurPostProcessor();
        oneMeDraweeView.o(d.a(), (wv6) null);
        ((la6) oneMeDraweeView.getHierarchy()).h(yt6.j);
        if (yt6.e) {
            ay7.a(this, getMediaType(), new ViewGroup.LayoutParams(-2, -2));
            getMediaType().setVisibility(0);
            return;
        }
        je7 je7 = this.B0;
        if (je7.a()) {
            ((pm8) je7.getValue()).setVisibility(8);
        }
    }
}
