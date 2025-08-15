package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: lsf  reason: default package */
public final class lsf extends LinearLayout {
    public static final /* synthetic */ bc7[] y0;
    public final je7 a = tu0.r(3, new gsf(this, 0));
    public final je7 b = tu0.r(3, new gsf(this, 1));
    public AnimatorSet c;
    public isf o;
    public final w4d s0 = mqd.D();
    public final je7 t0 = f9g.a.getAccessor().d(kke.class);
    public final View u0;
    public final r70 v0;
    public final ImageView w0;
    public final TextView x0;

    static {
        oi9 oi9 = new oi9(lsf.class, "prepareDataAndOnPauseWaveJob", "getPrepareDataAndOnPauseWaveJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        y0 = new bc7[]{oi9};
    }

    public lsf(Context context) {
        super(context);
        View view = new View(context);
        view.setId(lga.j);
        float f = (float) 8;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        v3c.y(new xr3(3, (Continuation) null, 2), view);
        this.u0 = view;
        r70 r70 = new r70(context);
        r70.setId(lga.t);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
        layoutParams2.setMarginStart(tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams2.setMarginEnd(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        r70.setLayoutParams(layoutParams2);
        r70.setListener(new wva(r70, 16, this));
        this.v0 = r70;
        ImageView imageView = new ImageView(context);
        imageView.setId(lga.n);
        float f2 = (float) 28;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        imageView.setImageDrawable(getPlayIcon());
        imageView.setVisibility(8);
        v3c.y(new r1b((Object) this, (Continuation) null, 21), imageView);
        tu0.K(imageView, 300, new elb(16, (Object) this));
        this.w0 = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        frameLayout.addView(view);
        frameLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(lga.k);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        float f3 = (float) 4;
        layoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        textView.setLayoutParams(layoutParams3);
        i4f.l.b(textView, du4.b);
        v3c.y(new hsf(this, (Continuation) null), textView);
        this.x0 = textView;
        setId(lga.s);
        float f4 = (float) 36;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        layoutParams4.setMargins(G, G, G, G);
        layoutParams4.gravity = 49;
        setLayoutParams(layoutParams4);
        setMinimumHeight(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        int G2 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        setPadding(G2, G2, G2, G2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 16.0f);
        setBackground(gradientDrawable);
        v3c.y(new hsf(3, (Continuation) null), this);
        addView(frameLayout);
        addView(textView);
        addView(r70);
    }

    /* access modifiers changed from: private */
    public final kke getDispatchers() {
        return (kke) this.t0.getValue();
    }

    /* access modifiers changed from: private */
    public final Drawable getPauseSmallIcon() {
        return (Drawable) this.b.getValue();
    }

    /* access modifiers changed from: private */
    public final Drawable getPlayIcon() {
        return (Drawable) this.a.getValue();
    }

    private final x77 getPrepareDataAndOnPauseWaveJob() {
        return (x77) this.s0.T0(this, y0[0]);
    }

    private final GradientDrawable getWaveContainerBackground() {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final void setPrepareDataAndOnPauseWaveJob(x77 x77) {
        this.s0.o1(this, y0[0], x77);
    }

    public final void d(Long l, zl7 zl7) {
        String str;
        ImageView imageView = this.w0;
        if (zl7.b) {
            imageView.setImageDrawable(getPauseSmallIcon());
        } else {
            imageView.setImageDrawable(getPlayIcon());
        }
        r70 r70 = this.v0;
        Float f = zl7.a;
        if (f != null) {
            float floatValue = f.floatValue();
            if (!r70.D0) {
                r70.t0 = (long) (floatValue * ((float) r70.C0));
                r70.v0 = true;
                r70.postInvalidate();
            }
        } else if (!r70.D0) {
            r70.t0 = (long) (0.0f * ((float) r70.C0));
            r70.v0 = false;
            r70.postInvalidate();
        }
        if (!r70.D0) {
            if (f == null || l == null) {
                str = null;
            } else {
                str = tfg.d((long) (f.floatValue() * ((float) l.longValue())));
            }
            if (f == null && l != null) {
                str = tfg.d(l.longValue());
            }
            this.x0.setText(str);
        }
    }

    public final void e() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(new Animator[]{ngg.d(this.u0, View.ALPHA, 1.0f, 0.0f, 1000, 1000, 2, -1)});
        AnimatorSet animatorSet2 = this.c;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new mf(11, (Object) this));
        }
        AnimatorSet animatorSet3 = this.c;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void f() {
        byte[] bArr;
        isf isf = this.o;
        if (isf != null) {
            bc7[] bc7Arr = RecordControlsWidget.b1;
            w7c w7c = ((RecordControlsWidget) ((y8) isf).a).I0().y0;
            if (w7c != null) {
                bArr = (byte[]) w7c.a.getValue();
                setPrepareDataAndOnPauseWaveJob(j47.S(lnf.b(this), ((w9a) getDispatchers()).a(), vx3.b, new ksf(this, (Continuation) null, bArr)));
            }
        }
        bArr = null;
        setPrepareDataAndOnPauseWaveJob(j47.S(lnf.b(this), ((w9a) getDispatchers()).a(), vx3.b, new ksf(this, (Continuation) null, bArr)));
    }

    public final View getHandFreeDotView() {
        return this.u0;
    }

    public final List<ValueAnimator> getPauseAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.u0;
        arrayList.addAll(ngg.F(view, 1.0f, 0.5f, 150, 0));
        Property property = View.ALPHA;
        arrayList.add(ngg.e(view, property, 1.0f, 0.0f, 150, 0, 112));
        ImageView imageView = this.w0;
        arrayList.addAll(ngg.F(imageView, 0.5f, 1.0f, 150, 50));
        arrayList.add(ngg.e(imageView, property, 0.5f, 1.0f, 150, 50, 96));
        pq9 pq9 = qp4.u0;
        xoe text = pq9.j(this).getText();
        pq9.j(this).getText();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{text.e, -1});
        ofArgb.setDuration(150);
        ofArgb.setStartDelay(50);
        ofArgb.addUpdateListener(new esf(this, 2));
        arrayList.add(ofArgb);
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{f8.G(pq9.j(this).b().a.m, 0.08f), pq9.j(this).getIcon().k});
        ofArgb2.setDuration(150);
        ofArgb2.setStartDelay(50);
        ofArgb2.addUpdateListener(new fsf(getWaveContainerBackground(), 1));
        arrayList.add(ofArgb2);
        Object obj = new Object();
        int G = f8.G(pq9.j(this).getIcon().k, 0.5f);
        pq9.j(this).getIcon();
        ValueAnimator ofArgb3 = ValueAnimator.ofArgb(new int[]{G, f8.G(-1, 0.5f)});
        ofArgb3.setDuration(150);
        ofArgb3.setStartDelay(50);
        ofArgb3.addUpdateListener(new yl(obj, 5, this));
        arrayList.add(ofArgb3);
        return arrayList;
    }

    public final List<ValueAnimator> getResumeAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.u0;
        arrayList.addAll(ngg.F(view, 0.5f, 1.0f, 150, 50));
        Property property = View.ALPHA;
        arrayList.add(ngg.e(view, property, 0.5f, 1.0f, 150, 50, 96));
        ImageView imageView = this.w0;
        arrayList.addAll(ngg.F(imageView, 1.0f, 0.5f, 150, 0));
        arrayList.add(ngg.e(imageView, property, 1.0f, 0.0f, 150, 0, 112));
        pq9 pq9 = qp4.u0;
        pq9.j(this).getText();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{-1, pq9.j(this).getText().e});
        ofArgb.setDuration(150);
        ofArgb.setStartDelay(50);
        ofArgb.addUpdateListener(new esf(this, 0));
        arrayList.add(ofArgb);
        bs6 icon = pq9.j(this).getIcon();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{icon.k, f8.G(pq9.j(this).b().a.m, 0.08f)});
        ofArgb2.setDuration(150);
        ofArgb2.setStartDelay(50);
        ofArgb2.addUpdateListener(new fsf(getWaveContainerBackground(), 0));
        arrayList.add(ofArgb2);
        pq9.j(this).getIcon();
        ValueAnimator ofArgb3 = ValueAnimator.ofArgb(new int[]{f8.G(-1, 0.5f), f8.G(pq9.j(this).getIcon().k, 0.5f)});
        ofArgb3.setDuration(150);
        ofArgb3.setStartDelay(50);
        ofArgb3.addUpdateListener(new esf(this, 1));
        arrayList.add(ofArgb3);
        return arrayList;
    }

    public final r70 getWaveView() {
        return this.v0;
    }

    public final void setBackgroundColor(boolean z) {
        pq9 pq9 = qp4.u0;
        int G = z ? pq9.j(this).getIcon().k : f8.G(pq9.j(this).b().a.m, 0.08f);
        GradientDrawable waveContainerBackground = getWaveContainerBackground();
        if (waveContainerBackground != null) {
            waveContainerBackground.setColor(G);
        }
    }

    public final void setCallback(isf isf) {
        this.o = isf;
    }

    public final void setDotDrawable(Drawable drawable) {
        this.u0.setBackground(drawable);
    }

    public final void setDurationColor(boolean z) {
        pq9 pq9 = qp4.u0;
        TextView textView = this.x0;
        if (z) {
            pq9.j(this).getText();
            textView.setTextColor(-1);
            return;
        }
        textView.setTextColor(pq9.j(this).getText().e);
    }

    public final void setDurationText(String str) {
        this.x0.setText(str);
    }

    public final void setVisiblePlayPauseButton(boolean z) {
        this.w0.setVisibility(z ? 0 : 8);
    }
}
