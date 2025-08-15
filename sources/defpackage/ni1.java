package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* renamed from: ni1  reason: default package */
public final class ni1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ni1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ni1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ni1 ni1 = new ni1(continuation, this.Y);
        ni1.X = obj;
        return ni1;
    }

    public final Object o(Object obj) {
        gg1 gg1;
        iaf iaf;
        m31 m31;
        m31 m312;
        boolean z = false;
        od2.a0(obj);
        j41 j41 = (j41) this.X;
        boolean f = tpa.f(j41, i41.a);
        CallScreen callScreen = this.Y;
        if (f) {
            yxc yxc = CallScreen.R0;
            callScreen.s0(false);
        } else if (j41 instanceof h41) {
            jp1 jp1 = ((h41) j41).a;
            yxc yxc2 = CallScreen.R0;
            callScreen.getClass();
            w4f w4f = jp1.c;
            boolean z2 = w4f != null;
            br7.F(callScreen.A0(), callScreen.t0(), (k56) null);
            q21 t0 = callScreen.t0();
            int i = 8;
            t0.setVisibility(z2 ? 0 : 8);
            md0 md0 = (w4f == null || (m312 = w4f.c) == null) ? null : m312.c;
            od0 od0 = (w4f == null || (m31 = w4f.c) == null) ? null : m31.d;
            no1 no1 = t0.G0;
            no1.getClass();
            String str = md0 != null ? md0.b : null;
            uc0 uc0 = md0 != null ? md0.a : null;
            s5a s5a = no1.G0;
            s5a.h(s5a, str, uc0);
            s5a.setCustomOverlay(od0);
            if (t0.getVisibility() == 0) {
                t0.setName(w4f != null ? w4f.a : null);
                t0.setStatus(w4f != null ? w4f.b : null);
                no1.R(w4f != null ? w4f.d : false, w4f != null ? w4f.e : false ? x7a.b : x7a.a, f0c.call_cancel, new o21(t0, 1));
                no1.Q(x7a.c, f0c.call_recall, new o21(t0, 0));
                no1.N(w4f != null ? w4f.f : false);
            }
            qd7 qd7 = jp1.d;
            boolean z3 = qd7 != null;
            if (br7.G(callScreen.C0()) || z3) {
                br7.F(callScreen.C0(), callScreen.v0(), (k56) null);
                callScreen.v0().setActive(z3);
                dm1 v0 = callScreen.v0();
                if (z3) {
                    if (qd7 == null || (gg1 = qd7.a) == null) {
                        gg1 = gg1.c;
                    }
                    v0.setParticipantId(gg1);
                    if (qd7 == null || (iaf = qd7.e) == null) {
                        iaf = iaf.o;
                    }
                    if (v0.S0 != iaf) {
                        v0.S0 = iaf;
                        AppCompatImageView appCompatImageView = v0.K0;
                        int ordinal = iaf.ordinal();
                        if (ordinal == 0) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(x7a.b0);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(f0c.call_user_item_more));
                            tu0.K(appCompatImageView, 300, new tb((Object) appCompatImageView, 6, (Object) v0));
                        } else if (ordinal == 1) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setImageResource(x7a.l0);
                            appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(b8a.c2));
                            tu0.K(appCompatImageView, 300, new bm1(v0, 0));
                        } else if (ordinal == 2 || ordinal == 3) {
                            appCompatImageView.setVisibility(8);
                            appCompatImageView.setContentDescription((CharSequence) null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    boolean z4 = qd7 != null ? qd7.c : false;
                    if (!tpa.f(v0.N0, Boolean.valueOf(z4))) {
                        v0.N0 = Boolean.valueOf(z4);
                        AppCompatImageView appCompatImageView2 = v0.L0;
                        if (z4) {
                            i = 0;
                        }
                        appCompatImageView2.setVisibility(i);
                    }
                    v0.setLabel(qd7 != null ? qd7.b : null);
                    if (qd7 != null) {
                        z = qd7.d;
                    }
                    if (!tpa.f(v0.O0, Boolean.valueOf(z))) {
                        v0.O0 = Boolean.valueOf(z);
                        v0.x();
                    }
                }
            }
            md0 md02 = jp1.f;
            if (md02 != null && jp1.c == null) {
                br7.F(callScreen.A0(), callScreen.t0(), (k56) null);
                no1 no12 = callScreen.t0().G0;
                no12.getClass();
                s5a s5a2 = no12.G0;
                s5a.h(s5a2, md02.b, md02.a);
                s5a2.setCustomOverlay((od0) null);
            }
            if (jp1.g) {
                uu3 b = callScreen.u0().b();
                CallEventsWidget callEventsWidget = b instanceof CallEventsWidget ? (CallEventsWidget) b : null;
                if (callEventsWidget != null) {
                    callEventsWidget.getRouter().B(callEventsWidget);
                    f9 f9Var = callEventsWidget.a;
                    if (f9Var != null) {
                        CallScreen callScreen2 = (CallScreen) f9Var.b;
                        callScreen2.z0().a.remove((CallEventsWidget) f9Var.c);
                        callScreen2.u0().a();
                    }
                    callEventsWidget.a = null;
                }
            } else if (callScreen.u0().b() == null) {
                callScreen.u0().d("call_events_widget_tag", new ci1(callScreen, 11));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
