package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* renamed from: mf  reason: default package */
public final class mf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((g60) this.b).z0 = false;
                return;
            case 2:
                return;
            case 3:
                p85 p85 = (p85) this.b;
                p85.A0 = null;
                p85.requestLayout();
                return;
            case 4:
                return;
            case 5:
                ht8 ht8 = (ht8) this.b;
                ht8.Q0 = null;
                ht8.I0.setForeground((Drawable) null);
                ht8.J().setAlpha(150);
                return;
            case 6:
                u1b u1b = (u1b) this.b;
                u1b.b.T(u1b.a.getX(), u1b.a.getY());
                u1b.b();
                return;
            case 7:
                z5c z5c = (z5c) this.b;
                z5c.a = false;
                z5c.b = null;
                return;
            case 8:
            case 9:
                return;
            case 10:
                ((ejf) this.b).J0 = null;
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return;
            case 1:
                g60 g60 = (g60) obj;
                g60.z0 = false;
                g60.y0 = null;
                return;
            case 2:
                bc7[] bc7Arr = CallWaitingRoomEventsWidget.v0;
                ((CallWaitingRoomEventsWidget) obj).q0();
                return;
            case 3:
                p85 p85 = (p85) obj;
                p85.A0 = null;
                p85.requestLayout();
                return;
            case 4:
                int i = FloatingVideoView.E0;
                FloatingVideoView floatingVideoView = (FloatingVideoView) obj;
                floatingVideoView.getClass();
                t33 t33 = vl.o.a().a;
                WindowManager.LayoutParams layoutParams = floatingVideoView.B0;
                int i2 = layoutParams.x;
                int i3 = layoutParams.y;
                t33.k(i2, "app.video.pip.pos.x");
                t33.k(i3, "app.video.pip.pos.y");
                return;
            case 5:
                ht8 ht8 = (ht8) obj;
                ht8.Q0 = null;
                ht8.I0.setForeground((Drawable) null);
                ht8.J().setAlpha(150);
                return;
            case 6:
                u1b u1b = (u1b) obj;
                u1b.b.T(u1b.a.getX(), u1b.a.getY());
                u1b.b();
                return;
            case 7:
                z5c z5c = (z5c) obj;
                z5c.a = false;
                z5c.b = null;
                return;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                rge rge = (rge) obj;
                nge nge = rge.q;
                if (nge != null) {
                    ((SwipeWidget) nge).p0();
                }
                View view = rge.b;
                wge wge = view instanceof wge ? (wge) view : null;
                if (wge != null) {
                    wge.setOnTouch((m56) null);
                    wge.setOnRequestInterceptTouchEvent((k56) null);
                }
                ViewGroup viewGroup = rge.c;
                viewGroup.removeView(view);
                viewGroup.removeView(viewGroup.findViewById(wwb.swipe_fade));
                nge nge2 = rge.q;
                if (nge2 != null) {
                    SwipeWidget swipeWidget = (SwipeWidget) nge2;
                    swipeWidget.b = false;
                    swipeWidget.getRouter().C();
                }
                rge.q = null;
                return;
            case 10:
                ((ejf) obj).J0 = null;
                return;
            default:
                ((lsf) obj).getHandFreeDotView().setAlpha(1.0f);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((OneMeButton) this.b).setClickable(false);
                return;
            case 1:
                ((g60) this.b).setVisibility(0);
                return;
            default:
                return;
        }
    }

    public mf(rge rge, float f) {
        this.a = 9;
        this.b = rge;
    }
}
