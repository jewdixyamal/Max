package defpackage;

import android.view.View;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.arch.Widget;

/* renamed from: ek3  reason: default package */
public final /* synthetic */ class ek3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk3 b;

    public /* synthetic */ ek3(fk3 fk3, int i) {
        this.a = i;
        this.b = fk3;
    }

    public final void onClick(View view) {
        fk3 fk3 = this.b;
        switch (this.a) {
            case 0:
                o9g o9g = fk3.P0;
                if (o9g != null) {
                    long j = fk3.R0;
                    buc buc = CallHistoryPageScreen.u0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) o9g.b;
                    if (((s81) callHistoryPageScreen.o0().s0.getValue()).a) {
                        al6 q = callHistoryPageScreen.p0().q(j);
                        if (q != null) {
                            callHistoryPageScreen.o0().q(j, q);
                            return;
                        }
                        return;
                    }
                    al6 q2 = callHistoryPageScreen.p0().q(j);
                    if (q2 != null) {
                        if (q2 instanceof yk6) {
                            yk6 yk6 = (yk6) q2;
                            z71.c.a2(yk6.b, ((Number) x53.g0(yk6.c)).longValue());
                            return;
                        } else if (!((Boolean) callHistoryPageScreen.o0().Y.getValue()).booleanValue()) {
                            eqe eqe = new eqe(t7a.r);
                            wha wha = new wha((Widget) callHistoryPageScreen);
                            wha.g(eqe);
                            wha.i();
                            return;
                        } else if (q2 instanceof wk6) {
                            wk6 wk6 = (wk6) q2;
                            z71.c.a2(wk6.b, ((Number) x53.g0(wk6.d)).longValue());
                            return;
                        } else if (q2 instanceof xk6) {
                            xk6 xk6 = (xk6) q2;
                            z71.c.Z1(Long.valueOf(xk6.b), xk6.a, xk6.c);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                o9g o9g2 = fk3.P0;
                if (o9g2 != null) {
                    o9g2.B(fk3.R0, true);
                    return;
                }
                return;
            default:
                o9g o9g3 = fk3.P0;
                if (o9g3 != null) {
                    o9g3.B(fk3.R0, false);
                    return;
                }
                return;
        }
    }
}
