package defpackage;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: obc  reason: default package */
public final class obc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public obc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((obc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        obc obc = new obc(continuation, this.Y);
        obc.X = obj;
        return obc;
    }

    public final Object o(Object obj) {
        AnimatorSet animatorSet;
        kpa kpa;
        od2.a0(obj);
        MotionEvent motionEvent = (MotionEvent) this.X;
        bc7[] bc7Arr = RecordControlsWidget.b1;
        RecordControlsWidget recordControlsWidget = this.Y;
        uac uac = (uac) recordControlsWidget.I0().w0.a.getValue();
        float f = 0.0f;
        if (recordControlsWidget.t0().getX() != 0.0f && !(uac instanceof tac) && (((animatorSet = recordControlsWidget.W0) == null || !animatorSet.isRunning()) && (kpa = recordControlsWidget.P0) != null)) {
            Float f2 = (Float) kpa.a;
            Float f3 = (Float) kpa.b;
            if (!(motionEvent.getAction() != 2 || f2 == null || f3 == null)) {
                float rawX = motionEvent.getRawX() - ((float) (recordControlsWidget.t0().getWidth() / 2));
                float y = motionEvent.getY() - ((float) (recordControlsWidget.t0().getWidth() / 2));
                double degrees = Math.toDegrees((double) ((float) Math.atan2((double) (-(y - f3.floatValue())), (double) (rawX - f2.floatValue()))));
                if (degrees < 0.0d) {
                    degrees += (double) 360;
                }
                int F = tu0.F(Math.ceil(degrees));
                j37 j37 = RecordControlsWidget.c1;
                if (j37.a <= F && F <= j37.b) {
                    recordControlsWidget.R0 = 0.0f;
                    if (ote.d((y - f3.floatValue()) / ((f3.floatValue() - ((float) tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density))) - f3.floatValue()), 0.0f, 1.0f) * 100.0f >= 100.0f) {
                        q0e q0e = recordControlsWidget.I0().v0;
                        uac uac2 = (uac) q0e.getValue();
                        if (uac2 instanceof sac) {
                            q0e.m((Object) null, new sac(((sac) uac2).a, true));
                        }
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            pag.F(view, mi6.CONFIRM);
                        }
                    } else {
                        if (f3.floatValue() - y > ((float) tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density))) {
                            AnimatorSet animatorSet2 = recordControlsWidget.Y0;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                            }
                        } else {
                            AnimatorSet animatorSet3 = recordControlsWidget.Y0;
                            if (animatorSet3 != null) {
                                animatorSet3.start();
                            }
                        }
                        kwd kwd = recordControlsWidget.T0;
                        if (kwd != null) {
                            kwd.b();
                        }
                        View z0 = recordControlsWidget.z0();
                        kpa kpa2 = recordControlsWidget.Q0;
                        if (kpa2 != null) {
                            f = ((Number) kpa2.b).floatValue();
                        }
                        z0.setTranslationY(recordControlsWidget.t0().getTranslationY() + f);
                        recordControlsWidget.t0().setY(y);
                    }
                } else {
                    j37 j372 = RecordControlsWidget.d1;
                    if (j372.a <= F && F <= j372.b) {
                        float f4 = (float) 40;
                        float d = ote.d((rawX - (f2.floatValue() - ((float) tu0.G(fk4.d().getDisplayMetrics().density * f4)))) / ((f2.floatValue() - ((float) tu0.G(((float) 90) * fk4.d().getDisplayMetrics().density))) - f2.floatValue()), 0.0f, 1.0f) * 100.0f;
                        recordControlsWidget.R0 = d;
                        if (d >= 100.0f) {
                            cbc I0 = recordControlsWidget.I0();
                            I0.C();
                            I0.v0.m((Object) null, new tac(1, false, true));
                        } else {
                            if (f2.floatValue() - rawX > ((float) tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density))) {
                                AnimatorSet animatorSet4 = recordControlsWidget.X0;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = recordControlsWidget.Y0;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                }
                            } else {
                                AnimatorSet animatorSet6 = recordControlsWidget.X0;
                                if (animatorSet6 != null) {
                                    animatorSet6.start();
                                }
                                AnimatorSet animatorSet7 = recordControlsWidget.Y0;
                                if (animatorSet7 != null) {
                                    animatorSet7.start();
                                }
                            }
                            float f5 = (float) 124;
                            float q = (((recordControlsWidget.R0 / 100.0f) * ((float) rh4.q(f5, fk4.d().getDisplayMetrics().density, tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density)))) + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f5))) / ((float) tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                            recordControlsWidget.t0().setScaleX(q);
                            recordControlsWidget.t0().setScaleY(q);
                            kwd kwd2 = recordControlsWidget.T0;
                            if (kwd2 != null) {
                                kwd2.a(motionEvent.getRawX() + ((float) (-recordControlsWidget.F0().getWidth())) + ((float) (tu0.G(fk4.d().getDisplayMetrics().density * f4) / 2)));
                            }
                            View z02 = recordControlsWidget.z0();
                            kpa kpa3 = recordControlsWidget.Q0;
                            z02.setTranslationY(kpa3 != null ? ((Number) kpa3.b).floatValue() : 0.0f);
                            float floatValue = f2.floatValue() - ((float) tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density));
                            float d2 = ote.d((rawX - floatValue) / ((f2.floatValue() - ((float) tu0.G(f4 * fk4.d().getDisplayMetrics().density))) - floatValue), 0.0f, 1.0f);
                            float G = ((float) tu0.G(((float) -20) * fk4.d().getDisplayMetrics().density)) * d2;
                            recordControlsWidget.v0().setAlpha(1.0f - d2);
                            recordControlsWidget.v0().setTranslationX(G);
                            recordControlsWidget.t0().setX(rawX);
                            recordControlsWidget.t0().setY(f3.floatValue());
                        }
                    }
                }
            }
        }
        return e5f.a;
    }
}
