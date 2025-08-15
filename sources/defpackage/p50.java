package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.work.WorkRequest;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: p50  reason: default package */
public final class p50 extends ViewGroup implements x5d, k34, l7c, jw8, u5d {
    public static final int V0 = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
    public static final int W0 = tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density);
    public static final int X0 = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
    public final je7 A0;
    public final j34 B0;
    public final int C0;
    public final u70 D0;
    public final AppCompatTextView E0;
    public boolean F0;
    public is0 G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public Long O0;
    public Long P0;
    public v50 Q0;
    public String R0;
    public x77 S0;
    public x77 T0;
    public o50 U0;
    public final m56 a;
    public final k56 b;
    public final r6c c;
    public final dw8 o;
    public final s5d s0;
    public final y5d t0 = new y5d(this);
    public final int u0;
    public final AppCompatImageView v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p50(Context context, om8 om8, p59 p59) {
        super(context);
        Context context2 = context;
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        s5d s5d = new s5d();
        this.a = om8;
        this.b = p59;
        this.c = r6c;
        this.o = dw8;
        this.s0 = s5d;
        int i = V0;
        this.u0 = i;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.v0 = appCompatImageView;
        this.w0 = tu0.r(3, new a5(context2, 1));
        this.x0 = tu0.r(3, new m(15));
        this.y0 = tu0.r(3, new x5(15, this));
        this.z0 = tu0.r(3, new a5(context2, 2));
        this.A0 = tu0.r(3, new a5(context2, 3));
        j34 j34 = new j34(context2);
        j34.setBackgroundEnabled$message_list_release(false);
        this.B0 = j34;
        int G = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        this.C0 = G;
        u70 u70 = new u70(context2);
        this.D0 = u70;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        kqe kqe = i4f.a;
        os2.d.b(appCompatTextView, du4.b);
        this.E0 = appCompatTextView;
        pq9 pq9 = qp4.u0;
        this.G0 = pq9.j(this).a().d(this.F0);
        this.H0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        float f = (float) 4;
        this.I0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = (float) 8;
        this.J0 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        this.K0 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        this.L0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.M0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.N0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.R0 = "";
        r6c.b = this;
        dw8.b = this;
        s5d.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(i, i));
        addView(u70, new ViewGroup.LayoutParams(-1, G));
        qx7 qx7 = vs8.y;
        fka j = pq9.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        u70.setListener(new rxd(3, this));
    }

    public static LayerDrawable a(p50 p50) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{p50.getProgressDrawable(), p50.getDrawableInsideProgress()});
        int i = W0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = X0;
        int i3 = (i - i2) / 2;
        layerDrawable.setLayerSize(1, i2, i2);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    private final Drawable getDrawableInsideProgress() {
        return (Drawable) this.w0.getValue();
    }

    private final InsetDrawable getPauseDrawable() {
        return (InsetDrawable) this.A0.getValue();
    }

    private final InsetDrawable getPlayDrawable() {
        return (InsetDrawable) this.z0.getValue();
    }

    private final sz6 getProgressDrawable() {
        return (sz6) this.x0.getValue();
    }

    private final LayerDrawable getProgressDrawableWithIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    public final void b() {
        is0 d = qp4.u0.j(this).a().d(this.F0);
        this.G0 = d;
        AppCompatImageView appCompatImageView = this.v0;
        appCompatImageView.setBackground(hm9.S(Integer.valueOf(d.a.e), (Integer) null, (Integer) null));
        appCompatImageView.setColorFilter(this.G0.b.a);
        Drawable drawableInsideProgress = getDrawableInsideProgress();
        if (drawableInsideProgress != null) {
            drawableInsideProgress.setTint(this.G0.b.a);
        }
        getProgressDrawable().b = new int[]{this.G0.b.a, 0};
        this.D0.setIncomingMessage(this.F0);
        this.E0.setTextColor(this.G0.d.c);
        this.B0.setTextColor$message_list_release(this.G0.d.m);
    }

    public final void c(is0 is0) {
        this.o.c(is0);
    }

    public final void d(l30 l30) {
        boolean equals = l30.equals(dp3.a);
        AppCompatImageView appCompatImageView = this.v0;
        if (equals) {
            appCompatImageView.setImageDrawable(getProgressDrawableWithIcon());
        } else if (l30.equals(sp3.a)) {
            appCompatImageView.setImageDrawable(getPauseDrawable());
        } else if (l30.equals(o84.c) || l30.equals(vu4.a)) {
            appCompatImageView.setImageDrawable(getPlayDrawable());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void f(ix8 ix8, boolean z) {
        this.c.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7Arr = j34.D0;
        this.B0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.s0.h0();
    }

    public final void k(is0 is0, boolean z) {
        this.c.k(is0, z);
    }

    public final void l() {
        this.o.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y5d y5d = this.t0;
        boolean H = br7.H(y5d.b);
        int i5 = this.J0;
        int i6 = this.H0;
        int i7 = H ? i5 : i6;
        je7 je7 = y5d.b;
        if (br7.H(je7)) {
            int a2 = y5d.a() + i7;
            y5d.c(i6, i7);
            i7 = this.N0 + a2;
        }
        s5d s5d = this.s0;
        if (br7.H((je7) s5d.c) && br7.H(je7)) {
            s5d.T((getMeasuredWidth() - i6) - s5d.L(), ((y5d.a() / 2) - (s5d.K() / 2)) + i5);
        }
        dw8 dw8 = this.o;
        if (br7.H((je7) dw8.c)) {
            dw8.T(i6, i7);
            i7 += dw8.K() + this.M0;
        }
        AppCompatImageView appCompatImageView = this.v0;
        int measuredWidth = appCompatImageView.getMeasuredWidth() + i6;
        int measuredHeight = appCompatImageView.getMeasuredHeight() + i7;
        View view = (View) appCompatImageView.getParent();
        if (c54.K(appCompatImageView)) {
            appCompatImageView.layout(view.getMeasuredWidth() - measuredWidth, i7, view.getMeasuredWidth() - i6, measuredHeight);
        } else {
            appCompatImageView.layout(i6, i7, measuredWidth, measuredHeight);
        }
        int measuredWidth2 = appCompatImageView.getMeasuredWidth() + this.K0 + i6;
        int q = rh4.q((float) 6, fk4.d().getDisplayMetrics().density, measuredWidth2);
        u70 u70 = this.D0;
        int measuredWidth3 = u70.getMeasuredWidth() + measuredWidth2;
        int measuredHeight2 = u70.getMeasuredHeight() + i7;
        View view2 = (View) u70.getParent();
        if (c54.K(u70)) {
            u70.layout(view2.getMeasuredWidth() - measuredWidth3, i7, view2.getMeasuredWidth() - q, measuredHeight2);
        } else {
            u70.layout(q, i7, measuredWidth3, measuredHeight2);
        }
        int measuredHeight3 = u70.getMeasuredHeight() + this.L0 + i7;
        AppCompatTextView appCompatTextView = this.E0;
        int measuredWidth4 = appCompatTextView.getMeasuredWidth() + measuredWidth2;
        int measuredHeight4 = appCompatTextView.getMeasuredHeight() + measuredHeight3;
        View view3 = (View) appCompatTextView.getParent();
        if (c54.K(appCompatTextView)) {
            appCompatTextView.layout(view3.getMeasuredWidth() - measuredWidth4, measuredHeight3, view3.getMeasuredWidth() - measuredWidth2, measuredHeight4);
        } else {
            appCompatTextView.layout(measuredWidth2, measuredHeight3, measuredWidth4, measuredHeight4);
        }
        int bottom = appCompatImageView.getBottom();
        r6c r6c = this.c;
        if (br7.H((je7) r6c.c)) {
            float f = (float) 10;
            r6c.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.c(f, fk4.d().getDisplayMetrics().density, bottom));
        }
        int measuredWidth5 = getMeasuredWidth();
        j34 j34 = this.B0;
        int measuredWidth6 = (measuredWidth5 - j34.getMeasuredWidth()) - i6;
        int measuredHeight5 = (getMeasuredHeight() - j34.getMeasuredHeight()) - this.I0;
        int measuredWidth7 = j34.getMeasuredWidth() + measuredWidth6;
        int measuredHeight6 = j34.getMeasuredHeight() + measuredHeight5;
        View view4 = (View) j34.getParent();
        if (c54.K(j34)) {
            j34.layout(view4.getMeasuredWidth() - measuredWidth7, measuredHeight5, view4.getMeasuredWidth() - measuredWidth6, measuredHeight6);
        } else {
            j34.layout(measuredWidth6, measuredHeight5, measuredWidth7, measuredHeight6);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        Long l = this.P0;
        if (l != null) {
            float f = (float) 192;
            i3 = (int) ((((float) rh4.q(f, fk4.d().getDisplayMetrics().density, View.MeasureSpec.getSize(i))) * (((float) (ote.f(l.longValue(), 1000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000)) / ((float) 29000))) + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f)));
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        y5d y5d = this.t0;
        boolean H = br7.H(y5d.b);
        int i4 = this.H0;
        int i5 = H ? this.J0 : i4;
        s5d s5d = this.s0;
        if (br7.H((je7) s5d.c) && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(i3 - i4, Integer.MIN_VALUE), i2);
            i5 += y5d.a() + this.N0;
        }
        dw8 dw8 = this.o;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            i5 += dw8.K() + this.M0;
        }
        this.B0.measure(i, i2);
        AppCompatTextView appCompatTextView = this.E0;
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        AppCompatImageView appCompatImageView = this.v0;
        int i6 = this.u0;
        appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        float f2 = (float) 10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density) * 2) + ((i3 - appCompatImageView.getMeasuredWidth()) - this.K0)) - (tu0.G(fk4.d().getDisplayMetrics().density * f2) * 2), 1073741824);
        int i7 = this.C0;
        this.D0.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
        int max = Math.max(appCompatImageView.getMeasuredHeight() + i4, appCompatTextView.getMeasuredHeight() + i7 + this.L0 + this.I0) + i5;
        r6c r6c = this.c;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            max = wg0.d(f2, fk4.d().getDisplayMetrics().density, r6c.K(), max);
        }
        setMeasuredDimension(i3, max);
    }

    public final void q(boolean z) {
        this.c.q(z);
    }

    public void setAlias(Layout layout) {
        this.s0.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.s0.setAliasColor(i);
    }

    public final void setAudio(k50 k50) {
        o50 o50;
        this.O0 = Long.valueOf(k50.b);
        long j = k50.j;
        this.P0 = Long.valueOf(j);
        boolean z = k50.c;
        this.F0 = z;
        this.R0 = k50.d;
        u70 u70 = this.D0;
        u70.setIncomingMessage(z);
        u70.b(j, k50.h);
        this.E0.setText(k50.i);
        tu0.K(this.v0, 300, new l50(this, k50, 1));
        this.U0 = new o50(this, 0, k50);
        if (isAttachedToWindow() && (o50 = this.U0) != null) {
            o50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.U0);
        requestLayout();
    }

    public void setChipObserver(w5c w5c) {
        this.c.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
        this.B0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.B0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.B0.setStatus$message_list_release(zof);
    }

    public void setForwardClickListener(m56 m56) {
        this.o.X = m56;
    }

    public void setIsIncoming(boolean z) {
        this.c.o = z;
    }

    public void setLink(cw8 cw8) {
        this.o.setLink(cw8);
    }

    public void setOnClickListener(m56 m56) {
        this.c.X = m56;
    }

    public void setReplyClickListener(a66 a66) {
        this.o.o = a66;
    }

    public void setSenderName(Layout layout) {
        this.t0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.t0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.c.Z = z;
    }
}
