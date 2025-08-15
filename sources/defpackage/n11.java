package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: n11  reason: default package */
public final /* synthetic */ class n11 implements hnc {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ n11(p11 p11, int i) {
        this.a = i;
        this.b = p11;
    }

    public final void b() {
        o11 o11;
        o11 o112;
        o11 o113;
        m38 m38 = m38.a;
        m38 m382 = m38.c;
        m38 m383 = m38.o;
        m38 m384 = m38.X;
        boolean z = true;
        m38 m385 = m38.b;
        p11 p11 = this.b;
        switch (this.a) {
            case 0:
                p11.w(p11);
                return;
            case 1:
                m38 m386 = p11.Q0;
                if (m386 != null && (o11 = p11.P0) != null) {
                    int ordinal = m386.ordinal();
                    if (ordinal == 0) {
                        m38 = m385;
                    } else if (ordinal != 1) {
                        if (ordinal == 2) {
                            m38 = m382;
                        } else if (ordinal == 3) {
                            m38 = m383;
                        } else if (ordinal == 4) {
                            m38 = m384;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    bc7[] bc7Arr = CallBottomPanelWidget.s0;
                    ((CallBottomPanelWidget) ((sy4) o11).b).n0().s(m38);
                    return;
                }
                return;
            case 2:
                m38 m387 = p11.T0;
                if (m387 != null && (o112 = p11.P0) != null) {
                    int ordinal2 = m387.ordinal();
                    if (ordinal2 == 0) {
                        m38 = m385;
                    } else if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            m38 = m382;
                        } else if (ordinal2 == 3) {
                            m38 = m383;
                        } else if (ordinal2 == 4) {
                            m38 = m384;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    bc7[] bc7Arr2 = CallBottomPanelWidget.s0;
                    ((CallBottomPanelWidget) ((sy4) o112).b).n0().u(m38);
                    return;
                }
                return;
            case 3:
                o11 o114 = p11.P0;
                if (o114 != null) {
                    bc7[] bc7Arr3 = CallBottomPanelWidget.s0;
                    pnf.o(((CallBottomPanelWidget) ((sy4) o114).b).n0().c.M0, hj1.D);
                    return;
                }
                return;
            case 4:
                m38 m388 = p11.R0;
                if (m388 != null && (o113 = p11.P0) != null) {
                    int ordinal3 = m388.ordinal();
                    if (ordinal3 == 0) {
                        m38 = m385;
                    } else if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            m38 = m382;
                        } else if (ordinal3 == 3) {
                            m38 = m383;
                        } else if (ordinal3 == 4) {
                            m38 = m384;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    bc7[] bc7Arr4 = CallBottomPanelWidget.s0;
                    h21 n0 = ((CallBottomPanelWidget) ((sy4) o113).b).n0();
                    n0.getClass();
                    if (m38 != m385) {
                        z = false;
                    }
                    bt1 bt1 = (bt1) n0.Y.getValue();
                    bt1.getClass();
                    bt1.c(bt1, "HAND_RAISED", (String) null, (String) null, Long.valueOf(z ? 1 : 0), (String) null, (String) null, false, 118);
                    yz0 yz0 = (yz0) n0.r().l;
                    ParticipantStatesManager f = yz0.f();
                    if (f != null) {
                        f.setOwnHandRaised(z);
                    }
                    yz0.x0.set(z);
                    return;
                }
                return;
            default:
                o11 o115 = p11.P0;
                if (o115 != null) {
                    ((sy4) o115).F();
                    return;
                }
                return;
        }
    }
}
