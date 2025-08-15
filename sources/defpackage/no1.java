package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* renamed from: no1  reason: default package */
public final class no1 extends ConstraintLayout implements bk1, zj1, pv3 {
    public static final /* synthetic */ bc7[] s1;
    public final s5a G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final ViewStub Q0;
    public final ViewStub R0;
    public final ViewStub S0;
    public final ViewStub T0;
    public final ViewStub U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final GestureDetector Y0;
    public Boolean Z0;
    public Boolean a1;
    public Boolean b1;
    public CharSequence c1;
    public CharSequence d1;
    public CharSequence e1;
    public lo1 f1;
    public k56 g1;
    public qv3 h1;
    public gg1 i1 = gg1.c;
    public AnimatorSet j1;
    public final je7 k1;
    public final je7 l1;
    public final je7 m1;
    public final je7 n1;
    public final je7 o1;
    public final je7 p1;
    public final mo1 q1;
    public final mo1 r1;

    static {
        Class<no1> cls = no1.class;
        s1 = new bc7[]{new oi9(cls, "mode", "getMode()Lone/me/calls/ui/view/CallUserLargeView$Companion$ActionsMode;"), rh4.g(nec.a, cls, "backgroundState", "getBackgroundState()Lone/me/calls/ui/view/CallUserLargeView$Companion$BackgroundState;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.H0 = tu0.r(3, new a5(context2, 18));
        this.I0 = tu0.r(3, new a5(context2, 19));
        this.J0 = tu0.r(3, new go1(context2, this, 3));
        this.K0 = tu0.r(3, new a5(context2, 20));
        this.L0 = tu0.r(3, new a5(context2, 14));
        this.M0 = tu0.r(3, new a5(context2, 15));
        this.N0 = tu0.r(3, new go1(context2, this, 0));
        this.O0 = tu0.r(3, new go1(context2, this, 1));
        this.P0 = tu0.r(3, new a5(context2, 16));
        this.k1 = tu0.r(3, new a5(context2, 17));
        this.l1 = tu0.r(3, new io1(this, 1));
        this.m1 = tu0.r(3, new io1(this, 2));
        this.n1 = tu0.r(3, new dk1(13));
        this.o1 = tu0.r(3, new io1(this, 3));
        this.p1 = tu0.r(3, new go1(context2, this, 2));
        this.q1 = new mo1(this, 0);
        this.r1 = new mo1(this, 1);
        setLayoutParams(new ti3(-1, -1));
        s5a s5a = new s5a(context2);
        s5a.setId(y7a.E1);
        s5a.setAvatarShape(j5a.a);
        this.G0 = s5a;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(y7a.F1);
        this.S0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(y7a.G1);
        this.R0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(y7a.M1);
        this.T0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context2);
        viewStub4.setId(y7a.I1);
        this.U0 = viewStub4;
        ViewStub viewStub5 = new ViewStub(context2);
        viewStub5.setId(y7a.J1);
        this.V0 = viewStub5;
        ViewStub viewStub6 = new ViewStub(context2);
        viewStub6.setId(y7a.L1);
        this.W0 = viewStub6;
        ViewStub viewStub7 = new ViewStub(context2);
        viewStub7.setId(y7a.K1);
        this.X0 = viewStub7;
        ViewStub viewStub8 = new ViewStub(context2);
        viewStub8.setId(y7a.t0);
        this.Q0 = viewStub8;
        this.Y0 = new GestureDetector(context2, new q00(3, this));
        float f = (float) 200;
        addView(s5a, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(viewStub3, -1, -1);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(viewStub5);
        addView(viewStub6);
        addView(viewStub7);
        addView(viewStub8);
        dj3 q = fp3.q(this);
        int id = viewStub.getId();
        q.d(id, 3, 0, 3);
        au1.p((float) 82, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
        q.d(id, 6, 0, 6);
        float f2 = (float) 24;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id, 4));
        q.d(id, 7, 0, 7);
        new l2a(q, 7, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id, 4, viewStub2.getId(), 3);
        q.g(id).d.W = 2;
        int id2 = viewStub2.getId();
        q.d(id2, 3, viewStub.getId(), 4);
        float f3 = (float) 12;
        new l2a(q, 3, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        q.d(id2, 6, viewStub.getId(), 6);
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id2, 7, viewStub.getId(), 7);
        new l2a(q, 7, id2, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.d(id2, 4, s5a.getId(), 3);
        new l2a(q, 4, id2, 4).e(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
        int id3 = s5a.getId();
        q.d(id3, 3, 0, 3);
        q.d(id3, 4, 0, 4);
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        q.g(id3).d.x = 0.45f;
        int id4 = viewStub6.getId();
        q.d(id4, 3, s5a.getId(), 4);
        au1.p((float) 32, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 6, 0, 6);
        q.d(id4, 7, 0, 7);
        int id5 = viewStub3.getId();
        q.d(id5, 4, 0, 4);
        q.d(id5, 3, 0, 3);
        q.d(id5, 6, 0, 6);
        q.d(id5, 7, 0, 7);
        int id6 = viewStub4.getId();
        q.d(id6, 6, 0, 6);
        q.d(id6, 7, viewStub5.getId(), 6);
        q.d(id6, 4, 0, 4);
        new l2a(q, 4, id6, 4).e(tu0.G(((float) 86) * fk4.d().getDisplayMetrics().density));
        q.g(id6).d.V = 2;
        int id7 = viewStub5.getId();
        q.d(id7, 7, 0, 7);
        q.d(id7, 6, viewStub4.getId(), 7);
        new l2a(q, 6, id7, 4).e(tu0.G(((float) 92) * fk4.d().getDisplayMetrics().density));
        q.d(id7, 4, viewStub4.getId(), 4);
        int id8 = viewStub7.getId();
        q.d(id8, 3, 0, 3);
        q.d(id8, 4, 0, 4);
        q.d(id8, 7, s5a.getId(), 7);
        q.g(id8).d.x = 0.56f;
        int id9 = viewStub8.getId();
        q.d(id9, 3, 0, 3);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id9, 4));
        q.d(id9, 6, 0, 6);
        new l2a(q, 6, id9, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public static ImageView C(Context context, no1 no1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.t0);
        float f = (float) 40;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(no1.getRaiseHandIcon());
        tu0.K(imageView, 300, new c5(12, (Object) no1));
        return imageView;
    }

    public static ImageView E(Context context, no1 no1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.K1);
        int G = tu0.G(((float) 18) * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(G, G, G, G);
        float f = (float) 72;
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setVisibility(8);
        imageView.setBackground(no1.getLockedDrawable());
        imageView.setImageResource(x7a.U);
        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.p(imageView).c.getIcon().f));
        return imageView;
    }

    public static void F(no1 no1, CharSequence charSequence) {
        no1.getSpeakerLabelView().setLabel(charSequence);
    }

    public static void G(no1 no1, CharSequence charSequence) {
        no1.getStatusTextView().setText(charSequence);
    }

    public static void I(no1 no1, boolean z) {
        dy7.M(no1.getRenderVideoView(), z);
        boolean z2 = !z;
        if (ft.l(no1.G0) != z2) {
            ft.g(no1.G0, z2, 0, new xa1((Object) no1, z2, 1), 2);
        }
        no1.S(z2 ? 255 : 0, false);
    }

    /* access modifiers changed from: private */
    public final lmd getAnimatedBackground() {
        return (lmd) this.p1.getValue();
    }

    private final int getBackgroundCenterY() {
        s5a s5a = this.G0;
        return (s5a.getMeasuredHeight() / 2) + s5a.getTop();
    }

    private final ImageView getBlockedLabelView() {
        return (ImageView) this.N0.getValue();
    }

    private final ShapeDrawable getDisableDrawable() {
        return (ShapeDrawable) this.m1.getValue();
    }

    private final GradientDrawable getForegroundDrawable() {
        return (GradientDrawable) this.o1.getValue();
    }

    private final ShapeDrawable getLockedDrawable() {
        return (ShapeDrawable) this.l1.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.uv3) r1).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ov3 getMarginTop() {
        /*
            r1 = this;
            ov3 r0 = defpackage.ov3.d
            qv3 r1 = r1.h1
            if (r1 == 0) goto L_0x000e
            uv3 r1 = (defpackage.uv3) r1
            ov3 r1 = r1.j
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no1.getMarginTop():ov3");
    }

    private final TextView getNameTextView() {
        return (TextView) this.H0.getValue();
    }

    /* access modifiers changed from: private */
    public final knc getNegativeButtonView() {
        return (knc) this.M0.getValue();
    }

    /* access modifiers changed from: private */
    public final knc getPositiveButtonView() {
        return (knc) this.L0.getValue();
    }

    private final k4c getRaiseHandIcon() {
        return (k4c) this.k1.getValue();
    }

    private final int getRaiseHandTopPadding() {
        return tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.O0.getValue();
    }

    private final ip1 getRenderVideoView() {
        return (ip1) this.J0.getValue();
    }

    private final ivc getScreenInfo() {
        return (ivc) this.P0.getValue();
    }

    private final dm1 getSpeakerLabelView() {
        return (dm1) this.K0.getValue();
    }

    private final TextView getStatusTextView() {
        return (TextView) this.I0.getValue();
    }

    private final InsetDrawable getTalkingDrawable() {
        return (InsetDrawable) this.n1.getValue();
    }

    /* access modifiers changed from: private */
    public static final void setNegativeAction$lambda$68$lambda$67(k56 k56) {
        k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final void setPositiveAction$lambda$70$lambda$69(k56 k56) {
        k56.invoke();
    }

    public static ip1 w(Context context, no1 no1) {
        ip1 ip1 = new ip1(context);
        ip1.setId(y7a.M1);
        ip1.setForeground(no1.getForegroundDrawable());
        ip1.setLayoutParams(new ti3(-1, -1));
        ip1.setFullScreen(true);
        dy7.M(ip1, false);
        ip1.setListener(new ync(18, no1));
        ip1.setVideoLayoutUpdatesControllerProvider(new io1(no1, 0));
        return ip1;
    }

    public static void x(bg bgVar, no1 no1) {
        float f = bgVar.a;
        int max = Math.max((int) (((float) no1.getHeight()) * f), tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density));
        int i = br7.G(no1.T0) ? no1.getRenderVideoView().y0 : false ? 0 : (int) (((float) 255) * f);
        int backgroundCenterY = (int) (((float) no1.getBackgroundCenterY()) * f);
        lmd background = no1.getBackground();
        if (background != null) {
            background.a(backgroundCenterY);
            background.setBounds(0, 0, no1.getWidth(), max);
            no1.S(i, true);
        }
    }

    public static void y(no1 no1, CharSequence charSequence) {
        no1.getNameTextView().setText(charSequence);
    }

    public final void D(ov3 ov3) {
        if (br7.G(this.Q0)) {
            dy7.L(getRaiseHandView(), ov3.b() + getRaiseHandTopPadding());
        }
    }

    public final List H(nv3 nv3, nv3 nv32) {
        kl7 l = j1e.l();
        if (br7.G(this.Q0)) {
            l.add(z7.C(getRaiseHandView(), (Math.abs(nv3.d) - ((float) nv3.f)) * ((float) nv3.c)));
        }
        return j1e.d(l);
    }

    public final void N(boolean z) {
        if (!tpa.f(this.a1, Boolean.valueOf(z))) {
            ShapeDrawable shapeDrawable = null;
            br7.F(this.X0, getBlockedLabelView(), (k56) null);
            this.a1 = Boolean.valueOf(z);
            getBlockedLabelView().setVisibility(z ? 0 : 8);
            ShapeDrawable disableDrawable = getDisableDrawable();
            if (z) {
                shapeDrawable = disableDrawable;
            }
            this.G0.setForeground(shapeDrawable);
        }
    }

    public final void O(boolean z) {
        if (!tpa.f(this.Z0, Boolean.valueOf(z))) {
            this.Z0 = Boolean.valueOf(z);
            InsetDrawable talkingDrawable = getTalkingDrawable();
            if (!z) {
                talkingDrawable = null;
            }
            this.G0.setForeground(talkingDrawable);
        }
    }

    public final void P(String str, CharSequence charSequence) {
        ViewStub viewStub = this.W0;
        if (((charSequence != null && !w9e.C0(charSequence)) || br7.G(viewStub)) && !tpa.f(this.e1, charSequence)) {
            br7.F(viewStub, getSpeakerLabelView(), (k56) null);
            this.e1 = charSequence;
            if (charSequence != null && !w9e.C0(charSequence)) {
                getSpeakerLabelView().setLabel(charSequence);
            }
            ft.g(getSpeakerLabelView(), !(charSequence == null || w9e.C0(charSequence)), 0, new fo1(this, charSequence, 2), 2);
            getSpeakerLabelView().setContentDescription(str);
        }
    }

    public final void Q(int i, int i2, k56 k56) {
        ViewStub viewStub = this.U0;
        br7.G(viewStub);
        br7.F(viewStub, getNegativeButtonView(), (k56) null);
        knc negativeButtonView = getNegativeButtonView();
        negativeButtonView.setVisibility(0);
        if (negativeButtonView.getVisibility() == 0) {
            knc.B(negativeButtonView, i);
            negativeButtonView.setAccessibility(Integer.valueOf(i2));
            negativeButtonView.setListener(new ho1(1, k56));
        }
    }

    public final void R(boolean z, int i, int i2, k56 k56) {
        ViewStub viewStub = this.V0;
        if (br7.G(viewStub) || z) {
            br7.F(viewStub, getPositiveButtonView(), (k56) null);
            knc positiveButtonView = getPositiveButtonView();
            positiveButtonView.setVisibility(z ? 0 : 8);
            if (positiveButtonView.getVisibility() == 0) {
                knc.B(positiveButtonView, i);
                positiveButtonView.setAccessibility(Integer.valueOf(i2));
                positiveButtonView.setListener(new ho1(0, k56));
            }
        }
    }

    public final void S(int i, boolean z) {
        Drawable background;
        int i2 = y7a.l;
        Object tag = getTag(i2);
        if ((tag == null && ((background = getBackground()) == null || background.getAlpha() != i)) || !tpa.f(tag, Integer.valueOf(i))) {
            AnimatorSet animatorSet = this.j1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            long j = z ? 0 : 200;
            Drawable background2 = getBackground();
            int alpha = background2 != null ? background2.getAlpha() : 0;
            hg hgVar = new hg("alpha", alpha);
            setTag(i2, Integer.valueOf(i));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(j);
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{alpha, i});
            ofInt.addUpdateListener(new pg(this, hgVar, 0));
            animatorSet2.addListener(new qg(i, 0, this));
            animatorSet2.play(ofInt);
            animatorSet2.start();
            this.j1 = animatorSet2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if ((r3 != null ? r3.a : false) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(defpackage.haf r8) {
        /*
            r7 = this;
            android.view.ViewStub r0 = r7.T0
            r1 = 0
            if (r8 == 0) goto L_0x0022
            boolean r2 = r8.b
            r3 = 0
            boolean r4 = r8.g
            if (r2 == 0) goto L_0x000f
            if (r4 == 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            if (r4 == 0) goto L_0x0014
            llf r3 = r8.h
            goto L_0x001a
        L_0x0014:
            boolean r2 = r8.c
            if (r2 == 0) goto L_0x001a
            llf r3 = r8.d
        L_0x001a:
            if (r3 == 0) goto L_0x001f
            boolean r2 = r3.a
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            if (r2 != 0) goto L_0x0029
        L_0x0022:
            boolean r2 = defpackage.br7.G(r0)
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            ip1 r2 = r7.getRenderVideoView()
            boolean r3 = defpackage.br7.G(r0)
            if (r3 != 0) goto L_0x0065
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.indexOfChild(r0)
            r3.removeViewInLayout(r0)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.height
            r5.height = r6
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.width
            r5.width = r6
            int r0 = r0.getId()
            r2.setId(r0)
            r3.addView(r2, r4, r5)
            ip1 r0 = r7.getRenderVideoView()
            defpackage.dy7.M(r0, r1)
        L_0x0065:
            ip1 r0 = r7.getRenderVideoView()
            int r2 = defpackage.ip1.z0
            r0.t0 = r8
            r0.u0 = r1
            ip1 r7 = r7.getRenderVideoView()
            r7.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no1.T(haf):void");
    }

    public final void a(boolean z) {
        if (z) {
            if (br7.G(this.R0)) {
                TextView statusTextView = getStatusTextView();
                statusTextView.setTranslationY(0.0f);
                statusTextView.setAlpha(1.0f);
            }
            if (br7.G(this.S0)) {
                TextView nameTextView = getNameTextView();
                nameTextView.setTranslationY(0.0f);
                nameTextView.setAlpha(1.0f);
            }
            s5a s5a = this.G0;
            s5a.setTranslationY(0.0f);
            s5a.setAlpha(1.0f);
            int i = br7.G(this.T0) ? getRenderVideoView().y0 : false ? 0 : 255;
            int measuredHeight = getMeasuredHeight();
            int backgroundCenterY = getBackgroundCenterY();
            lmd background = getBackground();
            if (background != null) {
                background.a(backgroundCenterY);
                background.setBounds(0, 0, getWidth(), measuredHeight);
                S(i, true);
            }
        }
    }

    public final void f(kl7 kl7, boolean z, long j) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        if (br7.G(this.W0)) {
            dm1 speakerLabelView = getSpeakerLabelView();
            if (ft.q(speakerLabelView, z)) {
                kl7.add(ft.c(speakerLabelView, z, f2, f, j));
            }
        }
        if (br7.G(this.S0)) {
            TextView nameTextView = getNameTextView();
            if (ft.q(nameTextView, z)) {
                kl7.add(ft.c(nameTextView, z, f2, f, j));
            }
        }
        if (br7.G(this.R0)) {
            TextView statusTextView = getStatusTextView();
            if (ft.q(statusTextView, z)) {
                kl7.add(ft.c(statusTextView, z, f2, f, j));
            }
        }
    }

    public final ko1 getBackgroundState() {
        bc7 bc7 = s1[1];
        return (ko1) this.r1.b;
    }

    public final jo1 getMode() {
        bc7 bc7 = s1[0];
        return (jo1) this.q1.b;
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final void h(kl7 kl7, boolean z, long j) {
        if (br7.G(this.R0)) {
            ft.a(kl7, getStatusTextView(), z);
        }
        if (br7.G(this.S0)) {
            ft.a(kl7, getNameTextView(), z);
        }
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        bg bgVar = new bg("background", f2);
        if (!(br7.G(this.T0) ? getRenderVideoView().y0 : false)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{f2, f});
            ofFloat.addUpdateListener(new yl(bgVar, 1, this));
            kl7.add(ofFloat);
            ft.a(kl7, this.G0, z);
        }
    }

    public final void o(boolean z) {
        if (z) {
            if (br7.G(this.W0)) {
                getSpeakerLabelView().setAlpha(1.0f);
            }
            if (br7.G(this.S0)) {
                getNameTextView().setAlpha(1.0f);
            }
            if (br7.G(this.R0)) {
                getStatusTextView().setAlpha(1.0f);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lmd background = getBackground();
        if (background != null) {
            background.onThemeChanged(qp4.u0.p(this).c);
        }
        lmd background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        if (br7.G(this.Q0) && tpa.f(this.b1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lmd background = getBackground();
        if (background != null) {
            background.stop();
        }
        if (br7.G(this.Q0)) {
            getRaiseHandIcon().stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lmd background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a(getBackgroundCenterY());
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getScreenInfo().g) {
            getAnimatedBackground().o = Math.min(i, i2) / 4;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.Y0.onTouchEvent(motionEvent);
    }

    public final void setBackgroundState(ko1 ko1) {
        this.r1.o1(this, s1[1], ko1);
    }

    public final void setControlsMediator(qv3 qv3) {
        this.h1 = qv3;
    }

    public final void setListener(lo1 lo1) {
        this.f1 = lo1;
    }

    public final void setMode(jo1 jo1) {
        this.q1.o1(this, s1[0], jo1);
    }

    public final void setName(CharSequence charSequence) {
        ViewStub viewStub = this.S0;
        if ((br7.G(viewStub) || charSequence != null) && !tpa.f(this.c1, charSequence)) {
            br7.F(viewStub, getNameTextView(), (k56) null);
            this.c1 = charSequence;
            if (charSequence != null && !w9e.C0(charSequence)) {
                getNameTextView().setText(charSequence);
            }
            ft.g(getNameTextView(), !(charSequence == null || w9e.C0(charSequence)), 0, new fo1(this, charSequence, 1), 2);
        }
    }

    public final void setParticipantId(gg1 gg1) {
        this.i1 = gg1;
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.Q0;
        if (br7.G(viewStub) || z) {
            this.b1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, indexOfChild, layoutParams);
                dy7.L(getRaiseHandView(), getMarginTop().b() + getRaiseHandTopPadding());
            }
            ft.g(getRaiseHandView(), z, 50, (m56) null, 4);
            k4c raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setStatus(CharSequence charSequence) {
        ViewStub viewStub = this.R0;
        if ((br7.G(viewStub) || charSequence != null) && !tpa.f(this.d1, charSequence)) {
            br7.F(viewStub, getStatusTextView(), (k56) null);
            this.d1 = charSequence;
            if (charSequence != null && !w9e.C0(charSequence)) {
                getStatusTextView().setText(charSequence);
            }
            ft.g(getStatusTextView(), !(charSequence == null || w9e.C0(charSequence)), 0, new fo1(this, charSequence, 0), 2);
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56) {
        this.g1 = k56;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        lmd background = getBackground();
        return background != null && background.b(drawable);
    }

    public lmd getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof lmd) {
            return (lmd) background;
        }
        return null;
    }
}
