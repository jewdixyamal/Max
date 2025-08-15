package ru.ok.messages.media.attaches;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.messages.views.widgets.audiowave.AudioWaveView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004:\u0002\u0012\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ok/messages/media/attaches/AudioAttachView;", "Landroid/widget/RelativeLayout;", "Ls70;", "Lnse;", "", "", "Landroid/view/View;", "getClickableChildren", "()Ljava/util/List;", "Lx20;", "listener", "Le5f;", "setListener", "(Lx20;)V", "", "currentPosition", "setCurrentPosition", "(J)V", "Lb30;", "isActionModeDelegate", "setDelegate", "(Lb30;)V", "La30;", "audioTranscriptionStateChangeListener", "setAudioTranscriptionStateChangeListener", "(La30;)V", "Lf40;", "u0", "Lje7;", "getAudioController", "()Lf40;", "audioController", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class AudioAttachView extends RelativeLayout implements s70, nse {
    public static final /* synthetic */ int w0 = 0;
    public final AppCompatImageView a;
    public final AudioWaveView b;
    public final AppCompatTextView c;
    public final g60 o;
    public final AppCompatTextView s0;
    public Long t0;
    public final khe u0;
    public final HashMap v0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioAttachView(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            r0.<init>(r1, r2, r3)
            boolean r4 = r17.isInEditMode()
            if (r4 == 0) goto L_0x0013
            ee4 r4 = defpackage.ee4.e0
            goto L_0x001d
        L_0x0013:
            android.content.Context r4 = r17.getContext()
            khe r5 = defpackage.sme.a0
            sme r4 = defpackage.fm9.R(r4)
        L_0x001d:
            is0 r4 = r4.g
            m r4 = new m
            r5 = 13
            r4.<init>(r5)
            khe r5 = new khe
            r5.<init>(r4)
            r0.u0 = r5
            r4 = 32
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = defpackage.tu0.G(r4)
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r6 = 0
            r5.<init>(r1, r6)
            int r7 = defpackage.gpc.V
            r5.setImageResource(r7)
            int r7 = defpackage.xxb.view_audio_attach__btn_play
            r5.setId(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER
            r5.setScaleType(r7)
            r0.a = r5
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r4, r4)
            r4 = 20
            r7.addRule(r4)
            r4 = 10
            r7.addRule(r4)
            r0.addView(r5, r7)
            y20 r7 = new y20
            r7.<init>(r3)
            defpackage.tu0.K(r5, 300, r7)
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r7 = new ru.ok.messages.views.widgets.audiowave.AudioWaveView
            r8 = 6
            r7.<init>(r1, r6, r8)
            int r8 = defpackage.xxb.view_audio_attach__wave
            r7.setId(r8)
            r7.setListener(r0)
            y20 r8 = new y20
            r8.<init>(r3)
            defpackage.tu0.K(r7, 300, r8)
            z20 r8 = new z20
            r8.<init>(r3)
            r7.setOnLongClickListener(r8)
            r0.b = r7
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r9 = 16
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = defpackage.tu0.G(r9)
            r10 = -1
            r8.<init>(r10, r9)
            r8.addRule(r4)
            int r4 = r5.getId()
            r5 = 17
            r8.addRule(r5, r4)
            r4 = 21
            r8.addRule(r4, r10)
            r4 = 8
            float r9 = (float) r4
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r9
            int r10 = defpackage.tu0.G(r10)
            r8.setMarginStart(r10)
            r0.addView(r7, r8)
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r8 = r17.getContext()
            r7.<init>(r8, r6)
            kqe r8 = defpackage.i4f.a
            kqe r8 = defpackage.os2.d
            r8.b(r7, defpackage.du4.b)
            int r8 = defpackage.xxb.view_audio_attach__duration
            r7.setId(r8)
            r0.c = r7
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r10 = -2
            r8.<init>(r10, r10)
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r9
            int r11 = defpackage.tu0.G(r11)
            r8.setMarginStart(r11)
            r11 = 4
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = defpackage.tu0.G(r11)
            r8.topMargin = r11
            int r11 = defpackage.xxb.view_audio_attach__btn_play
            r8.addRule(r5, r11)
            int r11 = defpackage.xxb.view_audio_attach__wave
            r12 = 3
            r8.addRule(r12, r11)
            r0.addView(r7, r8)
            g60 r7 = new g60
            r7.<init>(r1, r2, r3)
            int r2 = defpackage.xxb.view_audio_attach__seek
            r7.setId(r2)
            r7.setVisibility(r4)
            r0.o = r7
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r10, r10)
            int r3 = defpackage.xxb.view_audio_attach__btn_play
            r8 = 2
            r2.addRule(r8, r3)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            double r13 = (double) r3
            r15 = 4617540697942969549(0x4014cccccccccccd, double:5.2)
            double r13 = r13 * r15
            int r3 = defpackage.tu0.F(r13)
            r2.bottomMargin = r3
            r0.addView(r7, r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r1, r6)
            int r3 = defpackage.xxb.view_audio_attach__transcription_status
            r2.setId(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)
            r2.setVisibility(r4)
            r2.setGravity(r5)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = 18
            float r4 = (float) r4
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = defpackage.tu0.G(r4)
            r3.<init>(r10, r4)
            int r4 = defpackage.xxb.view_audio_attach__duration
            r3.addRule(r5, r4)
            int r4 = defpackage.xxb.view_audio_attach__wave
            r3.addRule(r12, r4)
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r9 = r9 * r4
            int r4 = defpackage.tu0.G(r9)
            r3.setMarginStart(r4)
            r2.setLayoutParams(r3)
            int r3 = defpackage.jpc.R
            java.lang.String r1 = r1.getString(r3)
            r2.setText(r1)
            r1 = 1
            r2.setSingleLine(r1)
            r2.setMaxLines(r1)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r1)
            r0.s0 = r2
            r0.addView(r2)
            r17.c()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.v0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final f40 getAudioController() {
        return (f40) this.u0.getValue();
    }

    public final void a(float f) {
        this.o.setLayoutPosition(this.b.getX() + f);
    }

    public final void b() {
        f();
        this.t0 = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void c() {
        Object obj;
        sme sme;
        if (isInEditMode()) {
            obj = ee4.e0;
        } else {
            Context context = getContext();
            khe khe = sme.a0;
            obj = fm9.R(context);
        }
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context2 = getContext();
            khe khe2 = sme.a0;
            sme = fm9.R(context2);
        }
        is0 is0 = sme.g;
        int i = is0.b.a;
        AppCompatImageView appCompatImageView = this.a;
        appCompatImageView.setColorFilter(i);
        bs0 bs0 = is0.a;
        GradientDrawable S = hm9.S(Integer.valueOf(bs0.e), (Integer) null, (Integer) null);
        obj.getClass();
        appCompatImageView.setBackground(hm9.g0(S, hm9.S(Integer.valueOf(ote.b0(bs0.e, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
        AppCompatTextView appCompatTextView = this.c;
        ls0 ls0 = is0.d;
        appCompatTextView.setTextColor(ls0.c);
        this.s0.setTextColor(ls0.c);
    }

    public final void d(float f) {
        if (getAudioController().c.p(0)) {
            this.o.setCurrentAudioPosition(0);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0029 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    public final void e(float r5) {
        /*
            r4 = this;
            r5 = 0
            r4.setClipChildren(r5)
            r4.setClipToPadding(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r1 = r4.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L_0x0018
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 == 0) goto L_0x0029
            r0.add(r1)
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0018
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0019
        L_0x0029:
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r0.next()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r1.getClipToPadding()
            boolean r3 = r1.getClipChildren()
            if (r3 == 0) goto L_0x0045
            r2 = r2 | 2
        L_0x0045:
            r1.setClipChildren(r5)
            r1.setClipToPadding(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r3 = r4.v0
            r3.put(r1, r2)
            boolean r1 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L_0x002d
        L_0x0058:
            g60 r4 = r4.o
            r0 = 0
            r4.setCurrentAudioPosition(r0)
            tg r0 = defpackage.mr0.w(r4)
            boolean r0 = r0.p()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            r4.setVisibility(r5)
            goto L_0x00b6
        L_0x006f:
            boolean r5 = r4.z0
            if (r5 == 0) goto L_0x007e
            android.animation.Animator r5 = r4.y0
            if (r5 == 0) goto L_0x007e
            boolean r5 = r5.isRunning()
            if (r5 != r1) goto L_0x007e
            goto L_0x00b6
        L_0x007e:
            r4.z0 = r1
            android.animation.Animator r5 = r4.y0
            if (r5 == 0) goto L_0x0087
            defpackage.ju0.i(r5)
        L_0x0087:
            r5 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r5 = r4.j(r5, r0)
            tg r0 = defpackage.mr0.w(r4)
            lg r0 = r0.a
            long r0 = r0.h()
            r5.setDuration(r0)
            tg r0 = defpackage.mr0.w(r4)
            lg r0 = r0.a
            android.view.animation.Interpolator r0 = r0.d()
            r5.setInterpolator(r0)
            mf r0 = new mf
            r1 = 1
            r0.<init>((int) r1, (java.lang.Object) r4)
            r5.addListener(r0)
            r4.y0 = r5
            r5.start()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.e(float):void");
    }

    public final void f() {
        Animator animator;
        x5 x5Var = new x5(14, this);
        g60 g60 = this.o;
        if (g60.getVisibility() != 8) {
            if (!mr0.w(g60).p()) {
                g60.setVisibility(8);
                x5Var.invoke();
            } else if (!g60.A0 || (animator = g60.y0) == null || !animator.isRunning()) {
                g60.A0 = true;
                Animator animator2 = g60.y0;
                if (animator2 != null) {
                    ju0.i(animator2);
                }
                ObjectAnimator j = g60.j(1.0f, 0.0f);
                j.setDuration(mr0.w(g60).a.h());
                j.setInterpolator(mr0.w(g60).a.l());
                j.addListener(new f60(g60, x5Var, x5Var, 0));
                g60.y0 = j;
                j.start();
            }
        }
    }

    public List<View> getClickableChildren() {
        return l6d.i0(l6d.Z(lz7.m(this), new k8(14)));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        f();
        super.onDetachedFromWindow();
    }

    public final void setAudioTranscriptionStateChangeListener(a30 a30) {
    }

    public void setCurrentPosition(long j) {
        if (!this.b.C0) {
            Long l = this.t0;
            if (l == null || SystemClock.elapsedRealtime() - l.longValue() >= 34) {
                this.t0 = null;
                getAudioController().c.p(0);
                this.o.setCurrentAudioPosition(j);
            }
        }
    }

    public final void setDelegate(b30 b30) {
    }

    public final void setListener(x20 x20) {
    }
}
