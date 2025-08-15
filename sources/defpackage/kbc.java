package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: kbc  reason: default package */
public final class kbc implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ kbc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
    }

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
    }

    private final void K(Animator animator) {
    }

    private final void L(Animator animator) {
    }

    private final void M(Animator animator) {
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
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                recordControlsWidget.F0().setVisibility(8);
                RecordControlsWidget.n0(recordControlsWidget).setVisibility(8);
                lsf lsf = recordControlsWidget.E0;
                if (lsf != null) {
                    lsf.setDurationText((String) null);
                }
                recordControlsWidget.z0().setAlpha(1.0f);
                recordControlsWidget.s0().setScaleX(1.0f);
                recordControlsWidget.t0().setAlpha(1.0f);
                u33 m0 = RecordControlsWidget.m0(recordControlsWidget);
                if (m0 != null) {
                    ((MessageWriteWidget) m0).p0(true);
                }
                RecordControlsWidget.o0(recordControlsWidget);
                recordControlsWidget.p0();
                recordControlsWidget.I0().v0.setValue((Object) null);
                return;
            case 1:
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                recordControlsWidget.F0().setVisibility(8);
                RecordControlsWidget.n0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.t0().setVisibility(8);
                recordControlsWidget.w0().setScaleX(1.0f);
                recordControlsWidget.w0().setScaleY(1.0f);
                recordControlsWidget.w0().setAlpha(1.0f);
                recordControlsWidget.w0().setVisibility(0);
                recordControlsWidget.G0().setVisibility(8);
                recordControlsWidget.G0().setScaleX(0.0f);
                recordControlsWidget.G0().setScaleY(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                recordControlsWidget.t0().setAlpha(1.0f);
                recordControlsWidget.z0().setScaleX(1.0f);
                recordControlsWidget.z0().setScaleY(1.0f);
                recordControlsWidget.z0().setAlpha(1.0f);
                u33 m02 = RecordControlsWidget.m0(recordControlsWidget);
                if (m02 != null) {
                    ((MessageWriteWidget) m02).p0(true);
                }
                RecordControlsWidget.o0(recordControlsWidget);
                recordControlsWidget.p0();
                recordControlsWidget.I0().v0.setValue((Object) null);
                return;
            case 2:
                return;
            case 3:
                bc7[] bc7Arr3 = RecordControlsWidget.b1;
                recordControlsWidget.w0().setVisibility(8);
                recordControlsWidget.G0().setVisibility(0);
                recordControlsWidget.G0().setAlpha(1.0f);
                return;
            case 4:
                bc7[] bc7Arr4 = RecordControlsWidget.b1;
                recordControlsWidget.F0().setVisibility(8);
                recordControlsWidget.u0().setAlpha(1.0f);
                recordControlsWidget.E0().setScaleX(1.0f);
                recordControlsWidget.E0().setScaleY(1.0f);
                recordControlsWidget.D0().setScaleX(1.0f);
                recordControlsWidget.D0().setScaleY(1.0f);
                recordControlsWidget.C0().setScaleX(1.0f);
                recordControlsWidget.C0().setScaleY(1.0f);
                lsf lsf2 = recordControlsWidget.E0;
                if (lsf2 != null) {
                    lsf2.setAlpha(1.0f);
                    lsf2.setBackgroundColor(false);
                    lsf2.setDurationColor(false);
                    lsf2.setVisiblePlayPauseButton(false);
                }
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                recordControlsWidget.t0().setAlpha(1.0f);
                recordControlsWidget.u0().setVisibility(8);
                u33 m03 = RecordControlsWidget.m0(recordControlsWidget);
                if (m03 != null) {
                    ((MessageWriteWidget) m03).p0(true);
                }
                RecordControlsWidget.o0(recordControlsWidget);
                recordControlsWidget.p0();
                recordControlsWidget.I0().v0.setValue((Object) null);
                return;
            case 5:
                RecordControlsWidget.n0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.w0().setTranslationY(0.0f);
                recordControlsWidget.w0().setAlpha(1.0f);
                recordControlsWidget.x0().setTranslationY(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.v0().setTranslationY(0.0f);
                recordControlsWidget.v0().setAlpha(1.0f);
                recordControlsWidget.u0().setAlpha(1.0f);
                recordControlsWidget.E0().setTranslationY(0.0f);
                recordControlsWidget.E0().setAlpha(1.0f);
                recordControlsWidget.C0().setTranslationY(0.0f);
                recordControlsWidget.C0().setAlpha(1.0f);
                lsf lsf3 = recordControlsWidget.E0;
                if (lsf3 != null) {
                    lsf3.e();
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                bc7[] bc7Arr5 = RecordControlsWidget.b1;
                recordControlsWidget.C0().setVisibility(8);
                return;
            case 8:
                return;
            case 9:
                bc7[] bc7Arr6 = RecordControlsWidget.b1;
                recordControlsWidget.D0().setVisibility(8);
                lsf lsf4 = recordControlsWidget.E0;
                if (lsf4 != null) {
                    lsf4.e();
                    return;
                }
                return;
            case 10:
            case 11:
                return;
            default:
                bc7[] bc7Arr7 = RecordControlsWidget.b1;
                recordControlsWidget.w0().setAlpha(1.0f);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                kwd kwd = recordControlsWidget.T0;
                if (kwd != null) {
                    kwd.b();
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                recordControlsWidget.E0().setTranslationY(fk4.d().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.E0().setAlpha(0.0f);
                recordControlsWidget.C0().setTranslationY(fk4.d().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.C0().setAlpha(0.0f);
                recordControlsWidget.C0().setVisibility(0);
                recordControlsWidget.D0().setVisibility(8);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                Float f = recordControlsWidget.O0;
                if (f != null) {
                    recordControlsWidget.t0().setX(f.floatValue());
                }
                recordControlsWidget.q0().setImageDrawable((Drawable) recordControlsWidget.H0.getValue());
                lsf lsf = recordControlsWidget.E0;
                if (lsf != null) {
                    lsf.getHandFreeDotView().setVisibility(0);
                    lsf.getHandFreeDotView().setAlpha(1.0f);
                    lsf.getHandFreeDotView().setScaleX(1.0f);
                    lsf.getHandFreeDotView().setScaleY(1.0f);
                }
                recordControlsWidget.u0().setAlpha(0.0f);
                recordControlsWidget.u0().setVisibility(0);
                return;
            case 7:
                return;
            case 8:
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                recordControlsWidget.D0().setVisibility(0);
                recordControlsWidget.C0().setVisibility(0);
                lsf lsf2 = recordControlsWidget.E0;
                if (lsf2 != null) {
                    lsf2.setVisiblePlayPauseButton(true);
                    lsf2.getHandFreeDotView().setVisibility(8);
                    AnimatorSet animatorSet = lsf2.c;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                bc7[] bc7Arr3 = RecordControlsWidget.b1;
                recordControlsWidget.q0().setImageDrawable((Drawable) recordControlsWidget.H0.getValue());
                lsf lsf3 = recordControlsWidget.E0;
                if (lsf3 != null) {
                    lsf3.getHandFreeDotView().setVisibility(0);
                }
                recordControlsWidget.D0().setVisibility(0);
                recordControlsWidget.C0().setVisibility(0);
                return;
            case 11:
                bc7[] bc7Arr4 = RecordControlsWidget.b1;
                recordControlsWidget.w0().setTranslationX(fk4.d().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.w0().setAlpha(0.0f);
                recordControlsWidget.x0().setTranslationX(fk4.d().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.x0().setAlpha(0.0f);
                recordControlsWidget.v0().setTranslationX(fk4.d().getDisplayMetrics().density * 70.0f);
                recordControlsWidget.v0().setAlpha(0.0f);
                recordControlsWidget.s0().setAlpha(0.0f);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                recordControlsWidget.q0().setImageDrawable(recordControlsWidget.B0());
                recordControlsWidget.z0().setAlpha(0.0f);
                recordControlsWidget.z0().setVisibility(0);
                RecordControlsWidget.n0(recordControlsWidget).setVisibility(0);
                recordControlsWidget.t0().setVisibility(0);
                recordControlsWidget.F0().setVisibility(0);
                u33 m0 = RecordControlsWidget.m0(recordControlsWidget);
                if (m0 != null) {
                    ((MessageWriteWidget) m0).p0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
