package one.me.sdk.messagewrite.recordcontrols;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/recordcontrols/RecordControlsWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lbac;", "type", "(Ljava/lang/String;Lbac;Lz84;)V", "ibc", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class RecordControlsWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] b1;
    public static final j37 c1 = new h37(0, 135, 1);
    public static final j37 d1 = new h37(135, 275, 1);
    public final q7c A0;
    public final q7c B0;
    public final q7c C0;
    public final q7c D0;
    public lsf E0;
    public final ibc F0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public Float O0;
    public kpa P0;
    public kpa Q0;
    public float R0;
    public float S0;
    public kwd T0;
    public vxd U0;
    public AnimatorSet V0;
    public AnimatorSet W0;
    public final q7c X;
    public AnimatorSet X0;
    public final q7c Y;
    public AnimatorSet Y0;
    public final q7c Z;
    public AnimatorSet Z0;
    public final fs a;
    public float a1;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final q7c z0;

    /* JADX WARNING: type inference failed for: r0v6, types: [h37, j37] */
    /* JADX WARNING: type inference failed for: r0v7, types: [h37, j37] */
    static {
        Class<RecordControlsWidget> cls = RecordControlsWidget.class;
        b1 = new bc7[]{new oi9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, cls, "type", "getType()Lone/me/sdk/messagewrite/recordcontrols/RecordControlType;", 0), new hob(cls, "rootView", "getRootView()Landroid/view/View;", 0), new hob(cls, "recordingPanel", "getRecordingPanel()Landroid/view/View;", 0), new hob(cls, "dotView", "getDotView()Landroid/view/View;", 0), new hob(cls, "durationView", "getDurationView()Landroid/widget/TextView;", 0), new hob(cls, "trashView", "getTrashView()Landroid/widget/ImageView;", 0), new hob(cls, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), new hob(cls, "audioHandFreeRecordView", "getAudioHandFreeRecordView()Landroid/view/View;", 0), new hob(cls, "removeButton", "getRemoveButton()Landroid/widget/ImageView;", 0), new hob(cls, "pauseRecordingButton", "getPauseRecordingButton()Landroid/widget/ImageView;", 0), new hob(cls, "playRecordingButton", "getPlayRecordingButton()Landroid/widget/ImageView;", 0), new hob(cls, "actionViewContainer", "getActionViewContainer()Landroid/view/View;", 0), new hob(cls, "actionViewBgContainer", "getActionViewBgContainer()Landroid/view/View;", 0), new hob(cls, "actionViewBackground", "getActionViewBackground()Landroid/view/View;", 0), new hob(cls, "actionView", "getActionView()Landroid/widget/ImageView;", 0), new hob(cls, "lockView", "getLockView()Landroid/view/View;", 0)};
    }

    public RecordControlsWidget(String str, bac bac, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("arg_key_type", bac)));
    }

    public static final u33 m0(RecordControlsWidget recordControlsWidget) {
        uu3 parentController = recordControlsWidget.getParentController();
        if (parentController instanceof u33) {
            return (u33) parentController;
        }
        return null;
    }

    public static final View n0(RecordControlsWidget recordControlsWidget) {
        recordControlsWidget.getClass();
        return (View) recordControlsWidget.Y.T0(recordControlsWidget, b1[3]);
    }

    public static final void o0(RecordControlsWidget recordControlsWidget) {
        kpa kpa = recordControlsWidget.Q0;
        if (kpa != null) {
            recordControlsWidget.z0().setTranslationX(((Number) kpa.a).floatValue());
            recordControlsWidget.z0().setTranslationY(((Number) kpa.b).floatValue());
        }
        kpa kpa2 = recordControlsWidget.P0;
        if (kpa2 != null) {
            recordControlsWidget.t0().setX(((Number) kpa2.a).floatValue());
            recordControlsWidget.t0().setY(((Number) kpa2.b).floatValue());
        }
        recordControlsWidget.P0 = null;
        recordControlsWidget.Q0 = null;
    }

    public final ev8 A0() {
        uu3 parentController = getParentController();
        if (parentController instanceof ev8) {
            return (ev8) parentController;
        }
        return null;
    }

    public final Drawable B0() {
        return (Drawable) this.G0.getValue();
    }

    public final ImageView C0() {
        return (ImageView) this.x0.T0(this, b1[10]);
    }

    public final ImageView D0() {
        return (ImageView) this.y0.T0(this, b1[11]);
    }

    public final ImageView E0() {
        return (ImageView) this.w0.T0(this, b1[9]);
    }

    public final View F0() {
        return (View) this.X.T0(this, b1[2]);
    }

    public final void G() {
        I0().A();
    }

    public final ImageView G0() {
        return (ImageView) this.t0.T0(this, b1[6]);
    }

    public final bac H0() {
        bc7 bc7 = b1[1];
        return (bac) this.a.a(this);
    }

    public final cbc I0() {
        return (cbc) this.c.getValue();
    }

    public final void J0() {
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.W0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.W0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        AnimatorSet animatorSet4 = this.Z0;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        this.W0 = new AnimatorSet();
        kl7 l = j1e.l();
        if (H0() == bac.b) {
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 96) * fk4.d().getDisplayMetrics().density)}).setDuration(300);
            duration.addUpdateListener(new dbc(this, 1));
            l.add(duration);
        }
        View u02 = u0();
        Property property = View.ALPHA;
        l.add(ngg.e(u02, property, 0.0f, 1.0f, 300, 0, 112));
        ImageView E02 = E0();
        Property property2 = View.TRANSLATION_Y;
        l.add(ngg.e(E02, property2, fk4.d().getDisplayMetrics().density * 48.0f, 0.0f, 300, 0, 112));
        l.add(ngg.e(E0(), property, 0.0f, 1.0f, 150, 150, 96));
        l.add(ngg.e(C0(), property2, fk4.d().getDisplayMetrics().density * 48.0f, 0.0f, 300, 0, 112));
        Property property3 = property;
        l.add(ngg.e(C0(), property3, 0.0f, 1.0f, 150, 150, 96));
        l.add(ngg.e(w0(), property3, w0().getAlpha(), 0.0f, 150, 0, 112));
        l.add(ngg.e(w0(), property2, 0.0f, fk4.d().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        l.add(ngg.e(x0(), property, 1.0f, 0.0f, 150, 0, 112));
        l.add(ngg.e(x0(), property2, 0.0f, fk4.d().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        l.add(ngg.e(v0(), property, v0().getAlpha(), 0.0f, 150, 0, 112));
        l.add(ngg.e(v0(), property2, v0().getTranslationY(), fk4.d().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        kpa kpa = this.Q0;
        l.add(ngg.e(z0(), property2, z0().getTranslationY(), kpa != null ? ((Number) kpa.b).floatValue() : 0.0f, 300, 0, 112));
        l.add(ngg.e(z0(), property, 1.0f, 0.0f, 300, 0, 112));
        l.add(ngg.e(t0(), property2, t0().getTranslationY(), 0.0f, 150, 0, 112));
        l.addAll(ngg.F(s0(), 1.0f, ((float) tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density)) / (fk4.d().getDisplayMetrics().density * 124.0f), 300, 0));
        kl7 d = j1e.d(l);
        AnimatorSet animatorSet5 = this.W0;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new kbc(this, 6));
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new kbc(this, 5));
        }
        AnimatorSet animatorSet7 = this.W0;
        if (animatorSet7 != null) {
            animatorSet7.setInterpolator(y0());
        }
        AnimatorSet animatorSet8 = this.W0;
        if (animatorSet8 != null) {
            animatorSet8.playTogether(d);
        }
        AnimatorSet animatorSet9 = this.W0;
        if (animatorSet9 != null) {
            animatorSet9.start();
        }
    }

    public final void K0() {
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.W0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.W0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.W0 = new AnimatorSet();
        kl7 l = j1e.l();
        l.addAll(ngg.F(C0(), 1.0f, 0.5f, 150, 0));
        ImageView C02 = C0();
        Property property = View.ALPHA;
        l.add(ngg.e(C02, property, 1.0f, 0.0f, 150, 0, 112));
        l.addAll(ngg.F(D0(), 0.5f, 1.0f, 150, 50));
        l.add(ngg.e(D0(), property, 0.0f, 1.0f, 150, 50, 96));
        lsf lsf = this.E0;
        if (lsf != null) {
            l.addAll(lsf.getPauseAnimations());
        }
        kl7 d = j1e.d(l);
        AnimatorSet animatorSet4 = this.W0;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new kbc(this, 8));
        }
        AnimatorSet animatorSet5 = this.W0;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new kbc(this, 7));
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(y0());
        }
        AnimatorSet animatorSet7 = this.W0;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(d);
        }
        AnimatorSet animatorSet8 = this.W0;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void L0(boolean z) {
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.W0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.W0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.W0 = new AnimatorSet();
        kl7 l = j1e.l();
        View w02 = w0();
        Property property = View.ALPHA;
        l.add(ngg.e(w02, property, 0.0f, 1.0f, 300, 150, 96));
        View w03 = w0();
        Property property2 = View.TRANSLATION_X;
        l.add(ngg.e(w03, property2, fk4.d().getDisplayMetrics().density * 72.0f, 0.0f, 300, 150, 96));
        l.add(ngg.e(x0(), property, 0.0f, 1.0f, 300, 150, 96));
        Property property3 = property2;
        l.add(ngg.e(x0(), property3, fk4.d().getDisplayMetrics().density * 72.0f, 0.0f, 300, 150, 96));
        l.add(ngg.e(v0(), property, 0.0f, 1.0f, 250, 250, 96));
        l.add(ngg.e(v0(), property3, fk4.d().getDisplayMetrics().density * 70.0f, 0.0f, 300, 200, 96));
        l.add(ngg.e(z0(), property, 0.0f, 1.0f, 150, 250, 96));
        kpa kpa = this.Q0;
        l.add(ngg.e(z0(), View.TRANSLATION_Y, ((float) -48) - (fk4.d().getDisplayMetrics().density * 2.0f), kpa != null ? ((Number) kpa.b).floatValue() : 0.0f, 200, 200, 96));
        pq9 pq9 = qp4.u0;
        int i = pq9.j(q0()).a().s().a.b.b;
        pq9.j(q0()).a().s().a.b.getClass();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{i, -1});
        ofArgb.setStartDelay(150);
        ofArgb.setDuration(300);
        ofArgb.addUpdateListener(new dbc(this, 2));
        l.add(ofArgb);
        l.addAll(ngg.F(s0(), 0.0f, 1.0f, 300, 100));
        l.add(ngg.e(s0(), property, 0.0f, 1.0f, 300, 100, 96));
        kl7 d = j1e.d(l);
        AnimatorSet animatorSet4 = this.W0;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(y0());
        }
        AnimatorSet animatorSet5 = this.W0;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(d);
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new kbc(this, 11));
        }
        AnimatorSet animatorSet7 = this.W0;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new ag(this, z));
        }
        ev8 A02 = A0();
        AnimatorSet animatorSet8 = null;
        if (A02 != null) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) A02;
            if (messageWriteWidget.getView() != null) {
                sv8 q0 = messageWriteWidget.q0();
                q0.getClass();
                AnimatorSet animatorSet9 = new AnimatorSet();
                kl7 l2 = j1e.l();
                l2.add(ngg.e(q0.c, property2, 0.0f, fk4.d().getDisplayMetrics().density * -74.0f, 300, 0, 112));
                kl7 kl7 = l2;
                kl7.add(ngg.e(q0.c, property, 1.0f, 0.0f, 300, 0, 112));
                ImageView imageView = q0.b;
                kl7.add(ngg.e(imageView, property2, 0.0f, fk4.d().getDisplayMetrics().density * -74.0f, 300, 0, 112));
                AnimatorSet animatorSet10 = animatorSet9;
                kl7.add(ngg.e(imageView, property, 1.0f, 0.0f, 300, 0, 112));
                je7 je7 = q0.s0;
                if (je7.a()) {
                    kl7.add(ngg.e((View) je7.getValue(), property, 1.0f, 0.0f, 200, 0, 112));
                    kl7.addAll(ngg.F((View) je7.getValue(), 1.0f, 0.0f, 300, 0));
                }
                je7 je72 = q0.w0;
                if (je72.a()) {
                    kl7.add(ngg.e((View) je72.getValue(), property, 1.0f, 0.0f, 200, 0, 112));
                    kl7.addAll(ngg.F((View) je72.getValue(), 1.0f, 0.0f, 300, 0));
                }
                kl7 d2 = j1e.d(kl7);
                animatorSet10.addListener(new rv8(q0, 6));
                animatorSet10.playTogether(d2);
                animatorSet8 = animatorSet10;
            }
        }
        AnimatorSet animatorSet11 = this.W0;
        if (animatorSet11 != null) {
            animatorSet11.playTogether(new Animator[]{animatorSet8});
        }
        AnimatorSet animatorSet12 = this.W0;
        if (animatorSet12 != null) {
            animatorSet12.start();
        }
    }

    public final void M0() {
        vxd vxd = this.U0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.U0 = null;
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        r0().setScaleX(1.0f);
        r0().setScaleY(1.0f);
    }

    public final void h(int i, Bundle bundle) {
        if (i == 1) {
            pnf.o(((jac) this.b.getValue()).b, fac.a);
        } else if (i == 2) {
            I0().A();
        }
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        I0().t();
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            android.content.Context r11 = r9.getContext()
            r10.<init>(r11)
            int r11 = defpackage.lga.f
            r10.setId(r11)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = 48
            float r0 = (float) r12
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r1 = defpackage.tu0.G(r1)
            r2 = -1
            r11.<init>(r2, r1)
            r10.setLayoutParams(r11)
            r11 = 0
            r10.setClipChildren(r11)
            r1 = 4
            r10.setVisibility(r1)
            ebc r3 = new ebc
            r4 = 0
            r3.<init>(r9, r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r10.getContext()
            r4.<init>(r5)
            int r5 = defpackage.lga.p
            r4.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r0
            int r6 = defpackage.tu0.G(r6)
            r5.<init>(r2, r6)
            r6 = 80
            r5.gravity = r6
            r4.setLayoutParams(r5)
            r4.setVisibility(r1)
            r5 = 1
            r4.setClickable(r5)
            r4.setFocusable(r5)
            r4.setMinimumHeight(r12)
            r4.setOrientation(r11)
            r4.setBackgroundColor(r11)
            r3.invoke(r4)
            r10.addView(r4)
            ebc r12 = new ebc
            r3 = 1
            r12.<init>(r9, r3)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4)
            int r4 = defpackage.lga.e
            r3.setId(r4)
            bac r4 = r9.H0()
            bac r7 = defpackage.bac.b
            if (r4 != r7) goto L_0x00a8
            r4 = 96
            float r4 = (float) r4
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
        L_0x00a3:
            int r4 = defpackage.tu0.G(r4)
            goto L_0x00b4
        L_0x00a8:
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r0
            goto L_0x00a3
        L_0x00b4:
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r2, r4)
            r7.gravity = r6
            r3.setLayoutParams(r7)
            r3.setVisibility(r1)
            r3.setClickable(r5)
            r3.setFocusable(r5)
            lc8 r2 = new lc8
            r4 = 3
            r5 = 0
            r6 = 2
            r2.<init>(r4, r5, r6)
            defpackage.v3c.y(r2, r3)
            r12.invoke(r3)
            r10.addView(r3)
            ebc r12 = new ebc
            r2 = 2
            r12.<init>(r9, r2)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            android.content.Context r2 = r10.getContext()
            r9.<init>(r2)
            int r2 = defpackage.lga.d
            r9.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 124(0x7c, float:1.74E-43)
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = defpackage.tu0.G(r6)
            float r6 = (float) r6
            r7 = 1069128090(0x3fb9999a, float:1.45)
            float r6 = r6 * r7
            int r6 = (int) r6
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r3 = r3 * r8
            int r3 = defpackage.tu0.G(r3)
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            r2.<init>(r6, r3)
            r3 = 85
            r2.gravity = r3
            r3 = -66
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            int r3 = defpackage.tu0.G(r3)
            r2.setMargins(r11, r11, r6, r3)
            r9.setLayoutParams(r2)
            r9.setVisibility(r1)
            r12.invoke(r9)
            r10.addView(r9)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r12 = r10.getContext()
            r9.<init>(r12)
            int r12 = defpackage.lga.l
            r9.setId(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r1 = 40
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            r2 = 52
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            r12.<init>(r1, r2)
            r1 = 8388693(0x800055, float:1.1755063E-38)
            r12.gravity = r1
            r9.setLayoutParams(r12)
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r0 = r0 * r12
            int r12 = defpackage.tu0.G(r0)
            int r12 = -r12
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1116995584(0x42940000, float:74.0)
            float r0 = r0 * r1
            float r12 = r12 - r0
            r9.setTranslationY(r12)
            r12 = 6
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r12
            int r0 = defpackage.tu0.G(r0)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = defpackage.tu0.G(r12)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            r9.setPadding(r0, r2, r12, r1)
            int r12 = defpackage.woc.Q0
            r9.setImageResource(r12)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            r12.setCornerRadius(r0)
            r9.setBackground(r12)
            r12 = 8
            r9.setVisibility(r12)
            ze2 r12 = new ze2
            r0 = 5
            r12.<init>(r4, r5, r0)
            defpackage.v3c.y(r12, r9)
            r10.addView(r9)
            android.view.ViewParent r9 = r10.getParent()
            boolean r12 = r9 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x022d
            r5 = r9
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x022d:
            if (r5 == 0) goto L_0x0232
            r5.setClipChildren(r11)
        L_0x0232:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        this.T0 = null;
        lsf lsf = this.E0;
        if (lsf != null) {
            lsf.setCallback((isf) null);
        }
        this.E0 = null;
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null) {
            animatorSet.end();
        }
        p0();
        I0().t();
    }

    public final void onViewCreated(View view) {
        t03 t03 = new t03(I0().w0, 11);
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(t03, getViewLifecycleOwner().Q(), fg7), new lbc((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new m58(new t03(I0().x0, 11), 27), getViewLifecycleOwner().Q(), fg7), new mbc((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(I0().A0, getViewLifecycleOwner().Q(), fg7), new nbc((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(I0().B0, getViewLifecycleOwner().Q(), fg7), new obc((Continuation) null, this), 5), getViewLifecycleScope());
        lsf lsf = this.E0;
        if (lsf != null) {
            od2.L(new zn5(tu0.g(I0().z0, getViewLifecycleOwner().Q(), fg7), new rbc((Continuation) null, lsf, this), 5), getViewLifecycleScope());
            w7c w7c = I0().y0;
            if (w7c != null) {
                od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new sbc((Continuation) null, lsf, this), 5), getViewLifecycleScope());
            }
        }
        od2.L(new zn5(tu0.g(((jac) this.b.getValue()).c, getViewLifecycleOwner().Q(), fg7), new pbc((Continuation) null, this), 5), getViewLifecycleScope());
        kwd kwd = new kwd(z0(), kwd.p);
        lwd lwd = new lwd();
        kwd.m = lwd;
        lwd.b(200.0f);
        kwd.m.a(0.75f);
        this.T0 = kwd;
    }

    public final void p0() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.X0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.Y0;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.Z0;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        lsf lsf = this.E0;
        if (!(lsf == null || (animatorSet = lsf.c) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet5 = this.V0;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        M0();
    }

    public final ImageView q0() {
        return (ImageView) this.C0.T0(this, b1[15]);
    }

    public final View r0() {
        return (View) this.B0.T0(this, b1[14]);
    }

    public final View s0() {
        return (View) this.A0.T0(this, b1[13]);
    }

    public final View t0() {
        return (View) this.z0.T0(this, b1[12]);
    }

    public final View u0() {
        return (View) this.v0.T0(this, b1[8]);
    }

    public final TextView v0() {
        return (TextView) this.u0.T0(this, b1[7]);
    }

    public final View w0() {
        return (View) this.Z.T0(this, b1[4]);
    }

    public final TextView x0() {
        return (TextView) this.s0.T0(this, b1[5]);
    }

    public final PathInterpolator y0() {
        return (PathInterpolator) this.N0.getValue();
    }

    public final View z0() {
        return (View) this.D0.T0(this, b1[16]);
    }

    public RecordControlsWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        ibc ibc;
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        this.a = new fs(bac.class, "arg_key_type");
        bc7 bc7 = b1[0];
        this.b = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, jac.class, (k56) null);
        this.c = createViewModelLazy(cbc.class, new jp8(23, new gbc(this, 2)));
        this.o = fua.a.b();
        this.X = viewBinding(lga.f);
        this.Y = viewBinding(lga.p);
        this.Z = viewBinding(lga.h);
        this.s0 = viewBinding(lga.i);
        this.t0 = viewBinding(lga.r);
        this.u0 = viewBinding(lga.g);
        this.v0 = viewBinding(lga.e);
        this.w0 = viewBinding(lga.q);
        this.x0 = viewBinding(lga.m);
        this.y0 = viewBinding(lga.o);
        this.z0 = viewBinding(lga.d);
        this.A0 = viewBinding(lga.c);
        this.B0 = viewBinding(lga.b);
        this.C0 = viewBinding(lga.a);
        this.D0 = viewBinding(lga.l);
        int ordinal = H0().ordinal();
        if (ordinal == 0) {
            int i = woc.b1;
            ibc = new ibc(i, woc.j2, i, mga.n);
        } else if (ordinal == 1) {
            int i2 = woc.Y0;
            ibc = new ibc(i2, woc.I0, i2, mga.h);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.F0 = ibc;
        this.G0 = tu0.r(3, new gbc(this, 3));
        this.H0 = tu0.r(3, new gbc(this, 4));
        this.I0 = tu0.r(3, new gbc(this, 5));
        this.J0 = tu0.r(3, new lab(29));
        this.K0 = tu0.r(3, new hbc(0));
        this.L0 = tu0.r(3, new hbc(1));
        this.M0 = tu0.r(3, new hbc(2));
        this.N0 = tu0.r(3, new lab(28));
        this.S0 = 1.0f;
    }
}
