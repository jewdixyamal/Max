package defpackage;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: g09  reason: default package */
public final class g09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g09 g09 = new g09(continuation, this.Y);
        g09.X = obj;
        return g09;
    }

    public final Object o(Object obj) {
        View view;
        od2.a0(obj);
        ez8 ez8 = (ez8) this.X;
        bc7[] bc7Arr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.getClass();
        bac bac = ez8.a;
        MotionEvent motionEvent = ez8.b;
        if (motionEvent.getAction() == 0) {
            int ordinal = ez8.a.ordinal();
            if (ordinal == 0) {
                eua r0 = messageWriteWidget.r0();
                String[] strArr = eua.p;
                if (!r0.b(strArr)) {
                    eua r02 = messageWriteWidget.r0();
                    l5g l5g = new l5g(messageWriteWidget, 1);
                    int x0 = messageWriteWidget.x0();
                    int i = j1c.permissions_video_message_request;
                    r02.getClass();
                    int i2 = oga.g;
                    if (eua.i(l5g, strArr)) {
                        l5g.c(strArr, 181, x0, i, i2);
                    } else {
                        r02.f(l5g, strArr, 181);
                    }
                    return e5f.a;
                }
            } else if (ordinal == 1) {
                eua r03 = messageWriteWidget.r0();
                String[] strArr2 = eua.h;
                if (!r03.b(strArr2)) {
                    eua r04 = messageWriteWidget.r0();
                    l5g l5g2 = new l5g(messageWriteWidget, 1);
                    int i3 = oga.c;
                    r04.getClass();
                    int i4 = j1c.permissions_audio_title;
                    int i5 = oga.g;
                    if (eua.i(l5g2, strArr2)) {
                        l5g2.c(strArr2, 160, i4, i3, i5);
                    } else {
                        r04.f(l5g2, strArr2, 160);
                    }
                    return e5f.a;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        String c = messageWriteWidget.t0().c();
        String i6 = wg0.i("record_controls_controller_", bac.name());
        if (messageWriteWidget.t0().b() == null || !tpa.f(c, i6)) {
            Class<suc> cls = suc.class;
            Object v = ay7.v(messageWriteWidget.getArgs(), "arg_scope_id", cls);
            if (v != null) {
                j03 t0 = messageWriteWidget.t0();
                boolean f = tpa.f(t0.c(), i6);
                String str = ((suc) ((Parcelable) v)).a;
                if (!f) {
                    coc coc = new coc(new RecordControlsWidget(str, bac, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                    coc.d(i6);
                    t0.a.R(coc);
                }
                znc childRouter = messageWriteWidget.getChildRouter((ViewGroup) messageWriteWidget.y0.T0(messageWriteWidget, MessageWriteWidget.F0[4]));
                childRouter.e = 1;
                childRouter.Q(false);
                if (!childRouter.n()) {
                    childRouter.R(i24.e(new RecordControlsWidget(str, bac, (z84) null), (zu3) null, (zu3) null));
                }
            } else {
                throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
            }
        }
        int ordinal2 = bac.ordinal();
        if (ordinal2 == 0) {
            view = messageWriteWidget.q0().getVideoMessageRecordAnchor();
        } else if (ordinal2 == 1) {
            view = messageWriteWidget.q0().getAudioRecordAnchor();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (view != null) {
            uu3 b = messageWriteWidget.t0().b();
            RecordControlsWidget recordControlsWidget = b instanceof RecordControlsWidget ? (RecordControlsWidget) b : null;
            if (recordControlsWidget != null) {
                recordControlsWidget.a1 = view.getX();
                cbc I0 = recordControlsWidget.I0();
                if (I0.v0.getValue() == null) {
                    int action = motionEvent.getAction();
                    w4d w4d = I0.E0;
                    if (action == 0) {
                        if (!I0.w().i()) {
                            pnf.o(I0.A0, oac.a);
                        } else {
                            w4d.o1(I0, cbc.G0[0], j47.T(I0.a, (lx3) null, vx3.b, new xac(I0, (Continuation) null), 1));
                        }
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        bc7[] bc7Arr2 = cbc.G0;
                        x77 x77 = (x77) w4d.T0(I0, bc7Arr2[0]);
                        if (x77 != null && x77.isActive() && I0.w().i()) {
                            eqe eqe = new eqe(mga.g);
                            jac jac = I0.c;
                            jac.getClass();
                            pnf.o(jac.b, new hac(I0.b, eqe));
                        }
                        x77 x772 = (x77) w4d.T0(I0, bc7Arr2[0]);
                        if (x772 != null) {
                            x772.cancel((CancellationException) null);
                        }
                        x77 x773 = (x77) I0.F0.T0(I0, bc7Arr2[1]);
                        if (x773 != null) {
                            x773.cancel((CancellationException) null);
                        }
                    }
                } else if (motionEvent.getAction() == 3) {
                    I0.t();
                } else if (motionEvent.getAction() == 1 && !I0.x()) {
                    I0.B(true);
                } else if ((I0.w0.a.getValue() instanceof sac) && !I0.x()) {
                    pnf.o(I0.B0, motionEvent);
                }
            }
        }
        return e5f.a;
    }
}
