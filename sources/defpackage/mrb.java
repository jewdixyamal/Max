package defpackage;

import android.os.SystemClock;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: mrb  reason: default package */
public final /* synthetic */ class mrb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rrb b;

    public /* synthetic */ mrb(rrb rrb, int i) {
        this.a = i;
        this.b = rrb;
    }

    public final void onClick(View view) {
        Object value;
        gv1 gv1;
        Object value2;
        Object obj;
        grb grb = grb.a;
        urb urb = null;
        rrb rrb = this.b;
        switch (this.a) {
            case 0:
                w4d w4d = rrb.t0;
                if (w4d != null) {
                    int i = ew1.A0;
                    ew1 ew1 = (ew1) w4d.b;
                    ew1.a(false, true);
                    dw1 listener = ew1.getListener();
                    if (listener != null) {
                        an9.g(((MediaBarWidget) listener).o, wuc.CHAT_ATTACH_PICKER);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                urb urb2 = rrb.o;
                if (urb2 != null) {
                    urb = urb2;
                }
                q0e q0e = urb.u0;
                do {
                    value = q0e.getValue();
                    int ordinal = ((gv1) value).ordinal();
                    if (ordinal == 0) {
                        gv1 = gv1.b;
                    } else if (ordinal != 1) {
                        gv1 = gv1.a;
                        if (!(ordinal == 2 || ordinal == 3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        gv1 = gv1.c;
                    }
                } while (!q0e.c(value, gv1));
                return;
            case 2:
                urb urb3 = rrb.o;
                if (urb3 == null) {
                    urb3 = null;
                }
                urb3.getClass();
                hm9.m("QuickCameraViewModel", "onClickTake()", new Object[0]);
                q0e q0e2 = urb3.t0;
                hrb hrb = (hrb) q0e2.getValue();
                boolean z = hrb instanceof drb;
                s35 s35 = urb3.v0;
                if (z) {
                    q0e2.m((Object) null, erb.a);
                    pnf.o(s35, arb.a);
                    return;
                } else if (hrb instanceof erb) {
                    return;
                } else {
                    if (hrb instanceof grb) {
                        if (urb3.x0.j()) {
                            q0e2.m((Object) null, new frb(SystemClock.elapsedRealtime()));
                            pnf.o(s35, new yqb(((kk5) urb3.X).n(urb3.Y.a())));
                            return;
                        }
                        pnf.o(urb3.w0, jrb.a);
                        return;
                    } else if (hrb instanceof frb) {
                        q0e2.m((Object) null, grb);
                        pnf.o(s35, zqb.a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            case 3:
                rrb.getCameraApi().f(!rrb.getCameraApi().j());
                return;
            default:
                urb urb4 = rrb.o;
                if (urb4 != null) {
                    urb = urb4;
                }
                q0e q0e3 = urb.t0;
                do {
                    value2 = q0e3.getValue();
                    obj = (hrb) value2;
                    if (obj instanceof drb) {
                        obj = grb;
                    } else if (obj instanceof grb) {
                        obj = drb.a;
                    } else if (!(obj instanceof frb) && !(obj instanceof erb)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!q0e3.c(value2, obj));
                return;
        }
    }
}
