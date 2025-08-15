package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: cc1  reason: default package */
public final class cc1 implements k56 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cc1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        AnimatorSet animatorSet = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                je1 je1 = je1.c;
                ea1 ea1 = (ea1) ((wm9) obj2);
                String str = ea1.b;
                f64 P1 = je1.P1();
                P1.b(":call-join-link?link=" + str + "&video_enabled=" + ea1.c + "&microphone_enabled=" + ea1.d + "&front_camera_enabled=" + ea1.e + "&is_new=false", (Bundle) null);
                bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
                ((CallJoinLinkPreviewWidget) obj).r0();
                return e5f;
            case 1:
                v4 v4Var = (v4) obj;
                return new wt2((String) obj2, (ta2) v4Var.c(ta2.class), (kke) v4Var.c(kke.class));
            case 2:
                v4 v4Var2 = (v4) obj2;
                return new vu2(new qt2(0, (khe) ((je7) obj)), v4Var2.d(q33.class), v4Var2.d(y7d.class), v4Var2.d(qe5.class), v4Var2.d(w7b.class), v4Var2.d(lr2.class), v4Var2.d(kr2.class));
            case 3:
                kp6 kp6 = (kp6) obj;
                np6 np6 = (np6) obj2;
                try {
                    np6.d(this);
                    do {
                    } while (np6.a(false, this));
                    kp6.a(1, 9, (IOException) null);
                } catch (IOException e) {
                    kp6.a(2, 2, e);
                } catch (Throwable th) {
                    kp6.a(3, 3, (IOException) null);
                    naf.c(np6);
                    throw th;
                }
                naf.c(np6);
                return e5f;
            default:
                uac uac = (uac) obj2;
                boolean z = uac instanceof sac;
                mi6 mi6 = mi6.CONFIRM;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj;
                if (z) {
                    sac sac = (sac) uac;
                    if (!sac.b) {
                        if (recordControlsWidget.O0 == null) {
                            recordControlsWidget.O0 = Float.valueOf(recordControlsWidget.t0().getX());
                        }
                        recordControlsWidget.t0().setX(recordControlsWidget.a1 - ((float) ((recordControlsWidget.t0().getMeasuredWidth() / 2) - (recordControlsWidget.q0().getMeasuredWidth() / 2))));
                        recordControlsWidget.z0().setTranslationX(recordControlsWidget.t0().getTranslationX() - (fk4.d().getDisplayMetrics().density * 4.0f));
                        recordControlsWidget.P0 = new kpa(Float.valueOf(recordControlsWidget.t0().getX()), Float.valueOf(recordControlsWidget.t0().getY()));
                        recordControlsWidget.Q0 = new kpa(Float.valueOf(recordControlsWidget.z0().getTranslationX()), Float.valueOf(recordControlsWidget.z0().getTranslationY()));
                        recordControlsWidget.L0(true);
                        recordControlsWidget.U0 = j47.T(recordControlsWidget.getViewLifecycleScope(), (lx3) null, (vx3) null, new tbc((Continuation) null, recordControlsWidget), 3);
                        recordControlsWidget.requireActivity().getWindow().addFlags(128);
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            pag.F(view, mi6);
                        }
                    } else {
                        bc7[] bc7Arr2 = RecordControlsWidget.b1;
                        recordControlsWidget.r0().setVisibility(0);
                        recordControlsWidget.M0();
                        if (!sac.a) {
                            recordControlsWidget.J0();
                        } else {
                            AnimatorSet animatorSet2 = recordControlsWidget.W0;
                            if (animatorSet2 != null && animatorSet2.isRunning()) {
                                AnimatorSet animatorSet3 = recordControlsWidget.W0;
                                if (animatorSet3 != null) {
                                    animatorSet3.end();
                                }
                                AnimatorSet animatorSet4 = recordControlsWidget.W0;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                            }
                            recordControlsWidget.W0 = new AnimatorSet();
                            kl7 l = j1e.l();
                            l.addAll(ngg.F(recordControlsWidget.D0(), 1.0f, 0.5f, 150, 0));
                            ImageView D0 = recordControlsWidget.D0();
                            Property property = View.ALPHA;
                            l.add(ngg.e(D0, property, 1.0f, 0.0f, 150, 0, 112));
                            l.addAll(ngg.F(recordControlsWidget.C0(), 0.5f, 1.0f, 150, 50));
                            l.add(ngg.e(recordControlsWidget.C0(), property, 0.0f, 1.0f, 150, 50, 96));
                            lsf lsf = recordControlsWidget.E0;
                            if (lsf != null) {
                                l.addAll(lsf.getResumeAnimations());
                            }
                            kl7 d = j1e.d(l);
                            AnimatorSet animatorSet5 = recordControlsWidget.W0;
                            if (animatorSet5 != null) {
                                animatorSet5.addListener(new kbc(recordControlsWidget, 10));
                            }
                            AnimatorSet animatorSet6 = recordControlsWidget.W0;
                            if (animatorSet6 != null) {
                                animatorSet6.addListener(new kbc(recordControlsWidget, 9));
                            }
                            AnimatorSet animatorSet7 = recordControlsWidget.W0;
                            if (animatorSet7 != null) {
                                animatorSet7.setInterpolator(recordControlsWidget.y0());
                            }
                            AnimatorSet animatorSet8 = recordControlsWidget.W0;
                            if (animatorSet8 != null) {
                                animatorSet8.playTogether(d);
                            }
                            AnimatorSet animatorSet9 = recordControlsWidget.W0;
                            if (animatorSet9 != null) {
                                animatorSet9.start();
                            }
                        }
                    }
                } else if (uac instanceof tac) {
                    tac tac = (tac) uac;
                    boolean z2 = tac.a;
                    lsf lsf2 = recordControlsWidget.E0;
                    if (lsf2 != null) {
                        r70 waveView = lsf2.getWaveView();
                        waveView.z0.reset();
                        waveView.s0 = null;
                        waveView.B0 = null;
                        waveView.A0 = null;
                        waveView.v0 = false;
                        waveView.C0 = 0;
                        waveView.t0 = 0;
                        waveView.invalidate();
                    }
                    recordControlsWidget.R0 = 0.0f;
                    recordControlsWidget.M0();
                    recordControlsWidget.requireActivity().getWindow().clearFlags(128);
                    if (z2) {
                        AnimatorSet animatorSet10 = recordControlsWidget.W0;
                        if (animatorSet10 != null && animatorSet10.isRunning()) {
                            AnimatorSet animatorSet11 = recordControlsWidget.W0;
                            if (animatorSet11 != null) {
                                animatorSet11.end();
                            }
                            AnimatorSet animatorSet12 = recordControlsWidget.W0;
                            if (animatorSet12 != null) {
                                animatorSet12.cancel();
                            }
                        }
                        recordControlsWidget.W0 = new AnimatorSet();
                        kl7 l2 = j1e.l();
                        lsf lsf3 = recordControlsWidget.E0;
                        if (lsf3 != null) {
                            l2.add(ngg.e(lsf3, View.ALPHA, 1.0f, 0.0f, 150, 0, 112));
                        }
                        if (recordControlsWidget.C0().getVisibility() == 0) {
                            l2.addAll(ngg.F(recordControlsWidget.C0(), 1.0f, 0.0f, 250, 0));
                            l2.add(ngg.e(recordControlsWidget.C0(), View.ALPHA, 1.0f, 0.0f, 150, 0, 112));
                        } else {
                            l2.addAll(ngg.F(recordControlsWidget.D0(), 1.0f, 0.0f, 250, 0));
                            l2.add(ngg.e(recordControlsWidget.D0(), View.ALPHA, 1.0f, 0.0f, 250, 0, 112));
                        }
                        l2.addAll(ngg.F(recordControlsWidget.E0(), 1.0f, 0.0f, 250, 0));
                        ImageView E0 = recordControlsWidget.E0();
                        Property property2 = View.ALPHA;
                        l2.add(ngg.e(E0, property2, 1.0f, 0.0f, 150, 0, 112));
                        l2.add(ngg.e(recordControlsWidget.u0(), property2, 1.0f, 0.0f, 250, 0, 112));
                        if (recordControlsWidget.H0() == bac.b) {
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{tu0.G(((float) 96) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density)});
                            ofInt.setDuration(300);
                            ofInt.addUpdateListener(new dbc(recordControlsWidget, 3));
                            l2.add(ofInt);
                        }
                        l2.addAll(ngg.F(recordControlsWidget.t0(), 1.0f, 0.0f, 250, 0));
                        l2.add(ngg.e(recordControlsWidget.t0(), property2, 1.0f, 0.0f, 150, 0, 112));
                        kl7 d2 = j1e.d(l2);
                        AnimatorSet animatorSet13 = recordControlsWidget.W0;
                        if (animatorSet13 != null) {
                            animatorSet13.addListener(new kbc(recordControlsWidget, 4));
                        }
                        AnimatorSet animatorSet14 = recordControlsWidget.W0;
                        if (animatorSet14 != null) {
                            animatorSet14.playTogether(d2);
                        }
                        ev8 A0 = recordControlsWidget.A0();
                        if (A0 != null) {
                            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) A0;
                            if (messageWriteWidget.getView() != null) {
                                sv8 q0 = messageWriteWidget.q0();
                                q0.getClass();
                                animatorSet = new AnimatorSet();
                                kl7 l3 = j1e.l();
                                l3.add(ngg.e(q0.c, property2, 0.0f, 1.0f, 200, 0, 112));
                                ImageView imageView = q0.b;
                                l3.addAll(ngg.F(imageView, 0.0f, 1.0f, 250, 0));
                                l3.add(ngg.e(imageView, property2, 0.0f, 1.0f, 200, 0, 112));
                                je7 je7 = q0.s0;
                                if (je7.a()) {
                                    l3.addAll(ngg.F((View) je7.getValue(), 0.0f, 1.0f, 250, 0));
                                    l3.add(ngg.e((View) je7.getValue(), property2, 0.0f, 1.0f, 200, 50, 96));
                                }
                                je7 je72 = q0.w0;
                                if (je72.a()) {
                                    l3.addAll(ngg.F((View) je72.getValue(), 0.0f, 1.0f, 250, 0));
                                    l3.add(ngg.e((View) je72.getValue(), property2, 0.0f, 1.0f, 200, 50, 96));
                                }
                                ImageView imageView2 = q0.v0;
                                l3.addAll(ngg.F(imageView2, 0.0f, 1.0f, 250, 0));
                                l3.add(ngg.e(imageView2, property2, 0.0f, 1.0f, 250, 0, 112));
                                kl7 d3 = j1e.d(l3);
                                animatorSet.addListener(new rv8(q0, 5));
                                animatorSet.addListener(new rv8(q0, 4));
                                animatorSet.playTogether(d3);
                            }
                        }
                        AnimatorSet animatorSet15 = recordControlsWidget.W0;
                        if (animatorSet15 != null) {
                            animatorSet15.playTogether(new Animator[]{animatorSet});
                        }
                        AnimatorSet animatorSet16 = recordControlsWidget.W0;
                        if (animatorSet16 != null) {
                            animatorSet16.setInterpolator(recordControlsWidget.y0());
                        }
                        AnimatorSet animatorSet17 = recordControlsWidget.W0;
                        if (animatorSet17 != null) {
                            animatorSet17.start();
                        }
                    } else if (tac.b) {
                        View view2 = recordControlsWidget.getView();
                        if (view2 != null) {
                            pag.F(view2, mi6);
                        }
                        AnimatorSet animatorSet18 = recordControlsWidget.W0;
                        if (animatorSet18 != null && animatorSet18.isRunning()) {
                            AnimatorSet animatorSet19 = recordControlsWidget.W0;
                            if (animatorSet19 != null) {
                                animatorSet19.end();
                            }
                            AnimatorSet animatorSet20 = recordControlsWidget.W0;
                            if (animatorSet20 != null) {
                                animatorSet20.cancel();
                            }
                        }
                        AnimatorSet animatorSet21 = recordControlsWidget.Z0;
                        if (animatorSet21 != null) {
                            animatorSet21.cancel();
                        }
                        recordControlsWidget.W0 = new AnimatorSet();
                        kl7 l4 = j1e.l();
                        View w0 = recordControlsWidget.w0();
                        Property property3 = View.ALPHA;
                        ObjectAnimator e2 = ngg.e(w0, property3, recordControlsWidget.w0().getAlpha(), 0.0f, 150, 100, 96);
                        e2.addListener(new kbc(recordControlsWidget, 3));
                        l4.add(e2);
                        l4.addAll(ngg.F(recordControlsWidget.G0(), 0.0f, 1.4f, 200, 250));
                        l4.addAll(ngg.F(recordControlsWidget.G0(), 1.4f, 0.7f, 100, 450));
                        l4.addAll(ngg.F(recordControlsWidget.G0(), 0.7f, 1.0f, 100, 550));
                        l4.addAll(ngg.F(recordControlsWidget.G0(), 1.0f, 0.0f, 300, 700));
                        Property property4 = property3;
                        l4.add(ngg.e(recordControlsWidget.G0(), property4, 1.0f, 0.0f, 150, 700, 96));
                        l4.add(ngg.e(recordControlsWidget.v0(), property4, recordControlsWidget.v0().getAlpha(), 0.0f, 200, 0, 112));
                        if (recordControlsWidget.v0().getTranslationX() == 0.0f) {
                            l4.add(ngg.e(recordControlsWidget.v0(), View.TRANSLATION_X, 0.0f, fk4.d().getDisplayMetrics().density * -20.0f, 200, 0, 112));
                        }
                        l4.add(ngg.e(recordControlsWidget.x0(), property3, 1.0f, 0.0f, 200, 100, 96));
                        l4.addAll(ngg.F(recordControlsWidget.t0(), recordControlsWidget.t0().getScaleX(), 0.4f, 150, 0));
                        l4.add(ngg.e(recordControlsWidget.t0(), property3, 1.0f, 0.0f, 150, 0, 112));
                        l4.addAll(ngg.F(recordControlsWidget.z0(), 1.0f, 0.0f, 200, 100));
                        l4.add(ngg.e(recordControlsWidget.z0(), property3, 1.0f, 0.0f, 200, 100, 96));
                        kl7 d4 = j1e.d(l4);
                        AnimatorSet animatorSet22 = recordControlsWidget.W0;
                        if (animatorSet22 != null) {
                            animatorSet22.addListener(new kbc(recordControlsWidget, 2));
                        }
                        AnimatorSet animatorSet23 = recordControlsWidget.W0;
                        if (animatorSet23 != null) {
                            animatorSet23.addListener(new kbc(recordControlsWidget, 1));
                        }
                        AnimatorSet animatorSet24 = recordControlsWidget.W0;
                        if (animatorSet24 != null) {
                            animatorSet24.playTogether(d4);
                        }
                        ev8 A02 = recordControlsWidget.A0();
                        if (A02 != null) {
                            MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) A02;
                            if (messageWriteWidget2.getView() != null) {
                                sv8 q02 = messageWriteWidget2.q0();
                                q02.getClass();
                                animatorSet = new AnimatorSet();
                                kl7 l5 = j1e.l();
                                l5.add(ngg.e(q02.c, View.TRANSLATION_X, fk4.d().getDisplayMetrics().density * 44.0f, 0.0f, 300, 250, 96));
                                Property property5 = property3;
                                l5.add(ngg.e(q02.c, property5, 0.0f, 1.0f, 300, 250, 96));
                                ImageView imageView3 = q02.b;
                                l5.add(ngg.e(imageView3, property5, 0.0f, 1.0f, 150, 850, 96));
                                l5.addAll(ngg.F(imageView3, 0.0f, 1.0f, 300, 700));
                                ImageView imageView4 = q02.v0;
                                l5.add(ngg.e(imageView4, property3, 0.0f, 1.0f, 200, 350, 96));
                                l5.addAll(ngg.F(imageView4, 0.0f, 1.0f, 300, 250));
                                je7 je73 = q02.s0;
                                if (je73.a()) {
                                    l5.add(ngg.e((View) je73.getValue(), property3, 0.0f, 1.0f, 200, 350, 96));
                                    l5.addAll(ngg.F((View) je73.getValue(), 0.0f, 1.0f, 300, 250));
                                }
                                je7 je74 = q02.w0;
                                if (je74.a()) {
                                    l5.add(ngg.e((View) je74.getValue(), property3, 0.0f, 1.0f, 200, 350, 96));
                                    l5.addAll(ngg.F((View) je74.getValue(), 0.0f, 1.0f, 300, 250));
                                }
                                kl7 d5 = j1e.d(l5);
                                animatorSet.addListener(new rv8(q02, 3));
                                animatorSet.addListener(new rv8(q02, 2));
                                animatorSet.playTogether(d5);
                            }
                        }
                        AnimatorSet animatorSet25 = recordControlsWidget.W0;
                        if (animatorSet25 != null) {
                            animatorSet25.playTogether(new Animator[]{animatorSet});
                        }
                        AnimatorSet animatorSet26 = recordControlsWidget.W0;
                        if (animatorSet26 != null) {
                            animatorSet26.setInterpolator(recordControlsWidget.y0());
                        }
                        AnimatorSet animatorSet27 = recordControlsWidget.W0;
                        if (animatorSet27 != null) {
                            animatorSet27.start();
                        }
                    } else {
                        AnimatorSet animatorSet28 = recordControlsWidget.W0;
                        if (animatorSet28 != null && animatorSet28.isRunning()) {
                            AnimatorSet animatorSet29 = recordControlsWidget.W0;
                            if (animatorSet29 != null) {
                                animatorSet29.end();
                            }
                            AnimatorSet animatorSet30 = recordControlsWidget.W0;
                            if (animatorSet30 != null) {
                                animatorSet30.cancel();
                            }
                        }
                        AnimatorSet animatorSet31 = recordControlsWidget.Z0;
                        if (animatorSet31 != null) {
                            animatorSet31.cancel();
                        }
                        recordControlsWidget.W0 = new AnimatorSet();
                        kl7 l6 = j1e.l();
                        View w02 = recordControlsWidget.w0();
                        Property property6 = View.ALPHA;
                        l6.add(ngg.e(w02, property6, recordControlsWidget.w0().getAlpha(), 0.0f, 300, 100, 96));
                        View w03 = recordControlsWidget.w0();
                        Property property7 = View.TRANSLATION_X;
                        l6.add(ngg.e(w03, property7, 0.0f, fk4.d().getDisplayMetrics().density * 72.0f, 300, 100, 96));
                        l6.add(ngg.e(recordControlsWidget.x0(), property6, 1.0f, 0.0f, 300, 100, 96));
                        l6.add(ngg.e(recordControlsWidget.x0(), property7, 0.0f, fk4.d().getDisplayMetrics().density * 72.0f, 300, 100, 96));
                        l6.add(ngg.e(recordControlsWidget.v0(), property6, recordControlsWidget.v0().getAlpha(), 0.0f, 250, 0, 112));
                        if (recordControlsWidget.v0().getTranslationX() == 0.0f) {
                            l6.add(ngg.e(recordControlsWidget.v0(), property7, 0.0f, fk4.d().getDisplayMetrics().density * 70.0f, 300, 50, 96));
                        }
                        l6.addAll(ngg.F(recordControlsWidget.s0(), recordControlsWidget.s0().getScaleX(), 0.0f, 300, 150));
                        l6.add(ngg.e(recordControlsWidget.t0(), property6, 1.0f, 0.0f, 300, 150, 96));
                        pq9 pq9 = qp4.u0;
                        pq9.j(recordControlsWidget.q0()).a().s().a.b.getClass();
                        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{-1, pq9.j(recordControlsWidget.q0()).a().s().a.b.b});
                        ofArgb.setStartDelay(100);
                        ofArgb.setDuration(300);
                        ofArgb.addUpdateListener(new dbc(recordControlsWidget, 0));
                        l6.add(ofArgb);
                        l6.add(ngg.e(recordControlsWidget.z0(), View.TRANSLATION_Y, recordControlsWidget.z0().getTranslationY(), ((float) -48) - (fk4.d().getDisplayMetrics().density * 2.0f), 200, 50, 96));
                        l6.add(ngg.e(recordControlsWidget.z0(), property6, 1.0f, 0.0f, 200, 0, 112));
                        kl7 d6 = j1e.d(l6);
                        AnimatorSet animatorSet32 = recordControlsWidget.W0;
                        if (animatorSet32 != null) {
                            animatorSet32.addListener(new kbc(recordControlsWidget, 0));
                        }
                        AnimatorSet animatorSet33 = recordControlsWidget.W0;
                        if (animatorSet33 != null) {
                            animatorSet33.playTogether(d6);
                        }
                        ev8 A03 = recordControlsWidget.A0();
                        if (A03 != null) {
                            MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) A03;
                            if (messageWriteWidget3.getView() != null) {
                                sv8 q03 = messageWriteWidget3.q0();
                                q03.getClass();
                                animatorSet = new AnimatorSet();
                                kl7 l7 = j1e.l();
                                l7.add(ngg.e(q03.c, property7, fk4.d().getDisplayMetrics().density * -74.0f, 0.0f, 300, 250, 96));
                                l7.add(ngg.e(q03.c, property6, 0.0f, 1.0f, 300, 250, 96));
                                ImageView imageView5 = q03.b;
                                l7.add(ngg.e(imageView5, property7, fk4.d().getDisplayMetrics().density * -74.0f, 0.0f, 300, 250, 96));
                                Property property8 = property6;
                                l7.add(ngg.e(imageView5, property8, 0.0f, 1.0f, 300, 250, 96));
                                ImageView imageView6 = q03.v0;
                                l7.add(ngg.e(imageView6, property8, 0.0f, 1.0f, 200, 250, 96));
                                l7.addAll(ngg.F(imageView6, 0.0f, 1.0f, 300, 250));
                                je7 je75 = q03.s0;
                                if (je75.a()) {
                                    l7.add(ngg.e((View) je75.getValue(), property6, 0.0f, 1.0f, 200, 250, 96));
                                    l7.addAll(ngg.F((View) je75.getValue(), 0.0f, 1.0f, 300, 250));
                                }
                                je7 je76 = q03.w0;
                                if (je76.a()) {
                                    l7.add(ngg.e((View) je76.getValue(), property6, 0.0f, 1.0f, 200, 250, 96));
                                    l7.addAll(ngg.F((View) je76.getValue(), 0.0f, 1.0f, 300, 250));
                                }
                                kl7 d7 = j1e.d(l7);
                                animatorSet.addListener(new rv8(q03, 1));
                                animatorSet.addListener(new rv8(q03, 0));
                                animatorSet.playTogether(d7);
                            }
                        }
                        AnimatorSet animatorSet34 = recordControlsWidget.W0;
                        if (animatorSet34 != null) {
                            animatorSet34.playTogether(new Animator[]{animatorSet});
                        }
                        AnimatorSet animatorSet35 = recordControlsWidget.W0;
                        if (animatorSet35 != null) {
                            animatorSet35.setInterpolator(recordControlsWidget.y0());
                        }
                        AnimatorSet animatorSet36 = recordControlsWidget.W0;
                        if (animatorSet36 != null) {
                            animatorSet36.start();
                        }
                    }
                } else if (uac instanceof rac) {
                    boolean z3 = ((rac) uac).a;
                    bc7[] bc7Arr3 = RecordControlsWidget.b1;
                    if (!z3) {
                        recordControlsWidget.K0();
                    } else {
                        recordControlsWidget.L0(false);
                        AnimatorSet animatorSet37 = recordControlsWidget.W0;
                        if (animatorSet37 != null) {
                            animatorSet37.end();
                        }
                        recordControlsWidget.J0();
                        AnimatorSet animatorSet38 = recordControlsWidget.W0;
                        if (animatorSet38 != null) {
                            animatorSet38.end();
                        }
                        recordControlsWidget.K0();
                        AnimatorSet animatorSet39 = recordControlsWidget.W0;
                        if (animatorSet39 != null) {
                            animatorSet39.end();
                        }
                        recordControlsWidget.M0();
                        lsf lsf4 = recordControlsWidget.E0;
                        if (lsf4 != null) {
                            r70 r70 = lsf4.v0;
                            if (!r70.isLaidOut() || r70.isLayoutRequested()) {
                                r70.addOnLayoutChangeListener(new qq0(14, lsf4));
                            } else {
                                lsf4.f();
                            }
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return e5f;
        }
    }

    public cc1(kp6 kp6, np6 np6) {
        this.a = 3;
        this.c = kp6;
        this.b = np6;
    }
}
