package one.me.android.root;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/root/RootController;", "Lone/me/sdk/arch/Widget;", "Lfoc;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class RootController extends Widget implements foc {
    public static final /* synthetic */ bc7[] u0;
    public final hz1 X = new hz1(1);
    public final hz1 Y = new hz1(1);
    public final hz1 Z = new hz1(1);
    public final je7 a = zi1.a.c();
    public AnimatorSet b;
    public final qm0 c = binding(new omc(this, 0));
    public final qm0 o = binding(new omc(this, 1));
    public boolean s0;
    public final no2 t0 = new no2(this, 1);

    static {
        Class<RootController> cls = RootController.class;
        u0 = new bc7[]{new hob(cls, "fullScreenContainer", "getFullScreenContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), z7b.g(nec.a, cls, "topIndicatorView", "getTopIndicatorView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new oi9(cls, "fullScreenRouter", "getFullScreenRouter()Lcom/bluelinelabs/conductor/Router;"), new oi9(cls, "dialogsRouter", "getDialogsRouter()Lcom/bluelinelabs/conductor/Router;"), new oi9(cls, "topIndicatorRouter", "getTopIndicatorRouter()Lcom/bluelinelabs/conductor/Router;")};
    }

    public RootController() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public static final boolean m0(RootController rootController, w12 w12) {
        rootController.getClass();
        Object tag = w12.getTag(y7a.n);
        boolean f = tpa.f(tag, "SHOW_ANIMATION_TAG");
        boolean f2 = tpa.f(tag, "HIDE_ANIMATION_TAG");
        if (tag == null) {
            if (w12.getVisibility() != 0) {
                return false;
            }
        } else if (!f && (f2 || w12.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static final void n0(RootController rootController, boolean z) {
        if (z) {
            if (rootController.u0().getTranslationY() == fk4.d().getDisplayMetrics().density * 0.0f) {
                return;
            }
        } else if (rootController.u0().getTranslationY() == (-(fk4.d().getDisplayMetrics().density * 100.0f))) {
            return;
        }
        hm9.m("RootController", "validateStateIsNeeded for isVisible=" + z + ".", new Object[0]);
        rootController.r0(z);
    }

    public final boolean B(boolean z) {
        if (!t0().n()) {
            hm9.m("RootController", "hideTopController call indicator wasn't init", new Object[0]);
            return false;
        } else if (!m0(this, u0())) {
            n0(this, false);
            hm9.m("RootController", "hideTopController call indicator already hidden force=" + z, new Object[0]);
            return false;
        } else {
            hm9.m("RootController", "hideTopController hide call indicator force=" + z, new Object[0]);
            p0(false, z, (uu3) null);
            return true;
        }
    }

    public final znc C() {
        return (znc) this.X.T0(this, u0[2]);
    }

    public final boolean F() {
        if (!t0().n()) {
            hm9.m("RootController", "hideWithScalingTopController call indicator wasn't init", new Object[0]);
            return false;
        } else if (!m0(this, u0())) {
            n0(this, false);
            hm9.m("RootController", "hideWithScalingTopController call indicator already hidden force=false", new Object[0]);
            return false;
        } else {
            hm9.m("RootController", "hideWithScalingTopController hide call indicator force=false", new Object[0]);
            q0(false, (uu3) null);
            return true;
        }
    }

    public final znc T() {
        return (znc) this.Y.T0(this, u0[3]);
    }

    public final boolean b(CallIndicatorWidget callIndicatorWidget, boolean z) {
        if (!t0().n() || !m0(this, u0())) {
            hm9.m("RootController", "showTopController show call indicator force=" + z + ".", new Object[0]);
            p0(true, z, callIndicatorWidget);
            return true;
        }
        n0(this, true);
        hm9.m("RootController", "showTopController call indicator already shown.", new Object[0]);
        return false;
    }

    public final boolean l(CallIndicatorWidget callIndicatorWidget) {
        if (!t0().n() || !m0(this, u0())) {
            hm9.m("RootController", "showWithScalingTopController show call indicator force=false.", new Object[0]);
            q0(true, callIndicatorWidget);
            return true;
        }
        n0(this, true);
        hm9.m("RootController", "showWithScalingTopController call indicator already shown.", new Object[0]);
        return false;
    }

    public final void o0(boolean z, uu3 uu3) {
        String str = z ? "SHOW_ANIMATION_TAG" : "HIDE_ANIMATION_TAG";
        if (z && !t0().n() && uu3 != null) {
            t0().R(i24.e(uu3, (zu3) null, (zu3) null));
        }
        u0().setTag(y7a.n, str);
        u0().setVisibility(0);
    }

    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        boolean z = this.s0;
        hm9.m("RootController", "RootController::onActivityResumed was called, dialog router initialized: " + z, new Object[0]);
        haa o2 = y8a.a.o();
        rmc rmc = new rmc(this, 0);
        o2.getClass();
        bc7 bc7 = haa.f[0];
        gaa gaa = o2.d;
        gaa.getClass();
        hm9.m(gaa.class.getName(), "set new router", new Object[0]);
        gaa.a = rmc;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, smc, android.view.View, android.view.ViewGroup] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ? coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(kvb.root_view_group);
        coordinatorLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        coordinatorLayout.addView(s0());
        coordinatorLayout.addView(u0());
        w12 b2 = s36.b(coordinatorLayout.getContext());
        b2.setId(kvb.root_dialogs_container);
        coordinatorLayout.addView(b2, new rw3(-1, -1));
        coordinatorLayout.onThemeChanged(qp4.u0.b(coordinatorLayout.getContext()).i());
        return coordinatorLayout;
    }

    public final void onRestoreViewState(View view, Bundle bundle) {
        super.onRestoreViewState(view, bundle);
        boolean z = this.s0;
        hm9.m("RootController", "RootController::onRestoreViewState was called, routers initialized: " + z, new Object[0]);
        v0(view);
    }

    public final void onViewCreated(View view) {
        v0(view);
        hm9.m("RootController", "RootController::onViewCreated was called: routers initialized", new Object[0]);
    }

    public final void p0(boolean z, boolean z2, uu3 uu3) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.b) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        o0(z, uu3);
        animatorSet3.setDuration(z2 ? 0 : 250);
        int i = ((ivc) ((ba1) ((aa1) this.a.getValue())).c.getValue()).c;
        kl7 l = j1e.l();
        if (z) {
            l.add(ObjectAnimator.ofFloat(u0(), View.Y, new float[]{u0().getY(), fk4.d().getDisplayMetrics().density * 0.0f}));
            w12 s02 = s0();
            float y = s0().getY();
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("topMarginProp", new float[]{y, (s0().getY() + ((float) tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density))) - ((float) i)})});
            ofPropertyValuesHolder.addUpdateListener(new pmc(y, s02));
            l.add(ofPropertyValuesHolder);
        } else {
            float f = (float) 100;
            l.add(ObjectAnimator.ofFloat(u0(), View.Y, new float[]{u0().getY(), -((float) tu0.G(fk4.d().getDisplayMetrics().density * f))}));
            w12 s03 = s0();
            float y2 = s0().getY();
            ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("topMarginProp", new float[]{y2, (s0().getY() - ((float) tu0.G(f * fk4.d().getDisplayMetrics().density))) + ((float) i)})});
            ofPropertyValuesHolder2.addUpdateListener(new pmc(y2, s03));
            l.add(ofPropertyValuesHolder2);
        }
        animatorSet3.playTogether(j1e.d(l));
        animatorSet3.addListener(new tv3(this, z, 2));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void q0(boolean z, uu3 uu3) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.b) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        o0(z, uu3);
        View findViewById = u0().findViewById(y7a.O);
        bk1 bk1 = findViewById instanceof bk1 ? (bk1) findViewById : null;
        animatorSet3.setDuration(250);
        kl7 l = j1e.l();
        if (bk1 != null) {
            bk1.h(l, z, animatorSet3.getDuration());
        }
        animatorSet3.playTogether(j1e.d(l));
        animatorSet3.addListener(new qmc(bk1, z, this));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void r0(boolean z) {
        View findViewById = u0().findViewById(y7a.O);
        bk1 bk1 = findViewById instanceof bk1 ? (bk1) findViewById : null;
        if (bk1 != null) {
            bk1.a(z);
        }
        u0().setTag(y7a.n, (Object) null);
        u0().setVisibility(z ? 0 : 8);
        u0().setTranslationY(z ? fk4.d().getDisplayMetrics().density * 0.0f : -(fk4.d().getDisplayMetrics().density * 100.0f));
        w0(z);
        if (!z && t0().n()) {
            t0().C();
            hm9.m("RootController", "call indicator was destroyed", new Object[0]);
        }
    }

    public final int s() {
        ViewGroup.LayoutParams layoutParams = s0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final w12 s0() {
        bc7 bc7 = u0[0];
        return (w12) this.c.getValue();
    }

    public final znc t0() {
        return (znc) this.Z.T0(this, u0[4]);
    }

    public final w12 u0() {
        bc7 bc7 = u0[1];
        return (w12) this.o.getValue();
    }

    public final void v0(View view) {
        if (!this.s0) {
            hm9.m("RootController", "Initializing routers", new Object[0]);
            znc childRouter = getChildRouter((ViewGroup) view.findViewById(kvb.root_dialogs_container), "root:dialog");
            childRouter.e = 3;
            childRouter.Q(true);
            bc7[] bc7Arr = u0;
            bc7 bc7 = bc7Arr[3];
            this.Y.b = childRouter;
            znc childRouter2 = getChildRouter((ViewGroup) view.findViewById(kvb.root_top_indicator), "root:topindicator");
            childRouter2.e = 1;
            childRouter2.Q(false);
            bc7 bc72 = bc7Arr[4];
            this.Z.b = childRouter2;
            znc childRouter3 = getChildRouter((ViewGroup) view.findViewById(kvb.root_screen), "root:screen");
            childRouter3.e = 1;
            childRouter3.Q(true);
            bc7 bc73 = bc7Arr[2];
            this.X.b = childRouter3;
            C().a(this.t0);
            haa o2 = y8a.a.o();
            rmc rmc = new rmc(this, 1);
            o2.getClass();
            bc7 bc74 = haa.f[0];
            gaa gaa = o2.d;
            gaa.getClass();
            hm9.m(gaa.class.getName(), "set new router", new Object[0]);
            gaa.a = rmc;
            this.s0 = true;
        }
    }

    public final void w0(boolean z) {
        int i = 0;
        int G = z ? tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density) - ((ivc) ((ba1) ((aa1) this.a.getValue())).c.getValue()).c : tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = s0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        }
        if (i != G) {
            w12 s02 = s0();
            ViewGroup.LayoutParams layoutParams2 = s02.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = G;
                s02.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
