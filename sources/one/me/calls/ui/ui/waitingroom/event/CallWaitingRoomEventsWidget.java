package one.me.calls.ui.ui.waitingroom.event;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.work.WorkRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/event/CallWaitingRoomEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lpv3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "f9", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallWaitingRoomEventsWidget extends Widget implements pv3 {
    public static final /* synthetic */ bc7[] v0;
    public final b X;
    public final je7 Y;
    public f9 Z;
    public qv3 a;
    public final je7 b;
    public ObjectAnimator c;
    public final Handler o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;

    static {
        Class<CallWaitingRoomEventsWidget> cls = CallWaitingRoomEventsWidget.class;
        hob hob = new hob(cls, "contactCellView", "getContactCellView()Lone/me/common/contact/ContactCellView;", 0);
        oec oec = nec.a;
        v0 = new bc7[]{hob, zr6.e(oec, cls, "multiContactCellView", "getMultiContactCellView()Lone/me/calls/ui/view/event/MultiContactCellView;", 0), zr6.f(cls, "eventContainerView", "getEventContainerView()Landroid/widget/FrameLayout;", 0, oec)};
    }

    public CallWaitingRoomEventsWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public static void p0(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.o0(((up1) ((wp1) callWaitingRoomEventsWidget.b.getValue()).o.a.getValue()).a());
    }

    public final List H(nv3 nv3, nv3 nv32) {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        kl7 l = j1e.l();
        View view = getView();
        View view2 = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof View) {
            view2 = (View) parent;
        }
        if (view2 != null) {
            l.add(z7.C(view2, (Math.abs(nv3.d) - ((float) nv3.f)) * ((float) nv3.c)));
        }
        return j1e.d(l);
    }

    public final void L() {
        q0();
    }

    public final FrameLayout m0() {
        return (FrameLayout) this.u0.T0(this, v0[2]);
    }

    public final sf9 n0() {
        return (sf9) this.t0.T0(this, v0[1]);
    }

    public final void o0(long j) {
        getRouter().B(this);
        f9 f9Var = this.Z;
        if (f9Var != null) {
            yxc yxc = CallScreen.R0;
            CallScreen callScreen = (CallScreen) f9Var.b;
            callScreen.D0().c.h(j);
            callScreen.z0().a.remove((CallWaitingRoomEventsWidget) f9Var.c);
            callScreen.x0().a();
        }
        this.Z = null;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        q0();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uge uge = new uge(layoutInflater.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        uge.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(uge.getContext());
        frameLayout.setId(y7a.Q1);
        dy7.H(frameLayout, fk4.d().getDisplayMetrics().density * 40.0f);
        frameLayout.setBackgroundColor(qp4.u0.p(frameLayout).c.b().g);
        uge.setClipToPadding(false);
        uge.setClipChildren(false);
        uge.setClipToOutline(false);
        uge.addView(frameLayout);
        uge.setCallback(new imc(this, frameLayout, false, 8));
        pla.a(uge, new xp1(uge, uge, 0));
        return uge;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.c = null;
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        this.o.removeCallbacks(this.X);
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((wp1) this.b.getValue()).o, getViewLifecycleOwner().Q(), fg7.o), new yp1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void q0() {
        float f;
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator == null) {
            View view = getView();
            ViewParent parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                qv3 qv3 = this.a;
                if (qv3 != null) {
                    ov3 ov3 = ((uv3) qv3).j;
                    f = (float) (ov3.c ? 0 : -(ov3.b() + ov3.b));
                } else {
                    f = 0.0f;
                }
                view2.setTranslationY(f);
                float f2 = fk4.d().getDisplayMetrics().density * 4.0f;
                float f3 = -f2;
                objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{0.0f, f3, f2, f3, f2, f3, f2, 0.0f});
                objectAnimator.setStartDelay(WorkRequest.MIN_BACKOFF_MILLIS);
                objectAnimator.setRepeatMode(1);
                objectAnimator.setDuration(500);
                objectAnimator.addListener(new mf(2, (Object) this));
                this.c = objectAnimator;
            } else {
                objectAnimator = null;
            }
        }
        if (objectAnimator == null) {
            return;
        }
        if (objectAnimator.isPaused()) {
            objectAnimator.resume();
        } else if (!objectAnimator.isRunning() && !objectAnimator.isStarted()) {
            this.o.post(this.X);
        }
    }

    public CallWaitingRoomEventsWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.b = createViewModelLazy(wp1.class, new s(22, new dk1(16)));
        this.o = new Handler(Looper.getMainLooper());
        this.X = new b(25, (Object) this);
        this.Y = tu0.r(3, new md1(6, this));
        this.s0 = viewBinding(y7a.X1);
        this.t0 = viewBinding(y7a.R1);
        this.u0 = viewBinding(y7a.Q1);
    }
}
