package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: ag  reason: default package */
public final class ag implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public ag(View view, boolean z) {
        this.b = z;
        this.c = view;
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

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        uu3 m0;
        int i = 8;
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                if (this.b) {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            case 1:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.c;
                recordControlsWidget.w0().setAlpha(1.0f);
                float f = 0.0f;
                recordControlsWidget.w0().setTranslationX(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.x0().setTranslationX(0.0f);
                recordControlsWidget.v0().setAlpha(1.0f);
                recordControlsWidget.v0().setTranslationX(0.0f);
                recordControlsWidget.z0().setAlpha(1.0f);
                Drawable B0 = recordControlsWidget.B0();
                qp4.u0.j(recordControlsWidget.q0()).a().s().a.b.getClass();
                ngg.G(B0, -1);
                recordControlsWidget.s0().setScaleX(1.0f);
                recordControlsWidget.s0().setScaleY(1.0f);
                recordControlsWidget.s0().setAlpha(1.0f);
                if (this.b) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    recordControlsWidget.Z0 = animatorSet;
                    animatorSet.playTogether(new Animator[]{ngg.d(recordControlsWidget.w0(), View.ALPHA, 1.0f, 0.0f, 1000, 1000, 2, -1)});
                    AnimatorSet animatorSet2 = recordControlsWidget.Z0;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new kbc(recordControlsWidget, 12));
                    }
                    AnimatorSet animatorSet3 = recordControlsWidget.Z0;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    recordControlsWidget.X0 = animatorSet4;
                    animatorSet4.play(ngg.d(recordControlsWidget.v0(), View.TRANSLATION_X, 0.0f, fk4.d().getDisplayMetrics().density * -4.0f, 1000, 1000, 2, -1));
                    AnimatorSet animatorSet5 = recordControlsWidget.X0;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                    }
                    recordControlsWidget.Y0 = new AnimatorSet();
                    kpa kpa = recordControlsWidget.Q0;
                    if (kpa != null) {
                        f = ((Number) kpa.b).floatValue();
                    }
                    AnimatorSet animatorSet6 = recordControlsWidget.Y0;
                    if (animatorSet6 != null) {
                        animatorSet6.play(ngg.d(recordControlsWidget.z0(), View.TRANSLATION_Y, f, f + ((float) tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density)), 1000, 1000, 2, -1));
                    }
                    AnimatorSet animatorSet7 = recordControlsWidget.Y0;
                    if (animatorSet7 != null) {
                        animatorSet7.addListener(new x5c(recordControlsWidget, f, 1));
                    }
                    AnimatorSet animatorSet8 = recordControlsWidget.Y0;
                    if (animatorSet8 != null) {
                        animatorSet8.start();
                        return;
                    }
                    return;
                }
                return;
            default:
                rge rge = (rge) this.c;
                if (rge.b()) {
                    rge.a();
                } else {
                    kq0.x(rge.c, rge.a(), (View) null, (View) null, 1.0f);
                }
                rge rge2 = (rge) this.c;
                rge2.m = null;
                ViewGroup viewGroup = rge2.c;
                viewGroup.removeView(viewGroup.findViewById(wwb.swipe_fade));
                if (this.b) {
                    rge rge3 = (rge) this.c;
                    rge3.f = false;
                    rge3.g = -1.0f;
                    rge3.h = -1.0f;
                }
                nge nge = ((rge) this.c).q;
                if (nge != null) {
                    SwipeWidget swipeWidget = (SwipeWidget) nge;
                    swipeWidget.b = false;
                    coc coc = (coc) x53.q0(swipeWidget.getRouter().e());
                    if (!(coc == null || (m0 = swipeWidget.m0()) == null)) {
                        SwipeWidget.s0(m0);
                        View view2 = m0.getView();
                        if (view2 != null) {
                            zu3 b2 = coc.b();
                            if (b2 == null || b2.d()) {
                                if (view2.getParent() != null) {
                                    String str = swipeWidget.a;
                                    ir6 ir6 = hm9.m;
                                    if (ir6 != null && ir6.c()) {
                                        ir6.d(us7.X, str, "clearUnderlyingViewsOnCancel: detaching underlying view", (Throwable) null);
                                    }
                                    ((ViewGroup) view2.getParent()).removeView(view2);
                                }
                                if (m0.getRetainViewMode() != tu3.b) {
                                    String str2 = swipeWidget.a;
                                    ir6 ir62 = hm9.m;
                                    if (ir62 != null && ir62.c()) {
                                        ir62.d(us7.X, str2, "clearUnderlyingViewsOnCancel: destroying underlying view", (Throwable) null);
                                    }
                                    Context context = swipeWidget.getContext();
                                    Method method = (Method) cv3.c.T0((Object) null, cv3.a[1]);
                                    if (method != null) {
                                        method.invoke(m0, new Object[]{context});
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str3 = swipeWidget.a;
                                ir6 ir63 = hm9.m;
                                if (ir63 != null && ir63.c()) {
                                    ir63.d(us7.X, str3, "clearUnderlyingViewsOnCancel: current controller was pushed with 'removesFromViewOnPush'=false, skip clearing", (Throwable) null);
                                }
                            }
                        }
                    }
                    swipeWidget.o0();
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ag(rge rge, boolean z, float f) {
        this.c = rge;
        this.b = z;
    }

    public ag(RecordControlsWidget recordControlsWidget, boolean z) {
        this.c = recordControlsWidget;
        this.b = z;
    }
}
