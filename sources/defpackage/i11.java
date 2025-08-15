package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: i11  reason: default package */
public final /* synthetic */ class i11 implements hnc {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;

    public /* synthetic */ i11(j11 j11, int i) {
        this.a = i;
        this.b = j11;
    }

    public final void b() {
        o11 o11;
        o11 o112;
        m38 m38 = m38.b;
        m38 m382 = m38.a;
        m38 m383 = m38.c;
        m38 m384 = m38.o;
        m38 m385 = m38.X;
        j11 j11 = this.b;
        switch (this.a) {
            case 0:
                m38 m386 = j11.N0;
                if (m386 != null && (o11 = j11.M0) != null) {
                    int ordinal = m386.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            m38 = m382;
                        } else if (ordinal == 2) {
                            m38 = m383;
                        } else if (ordinal == 3) {
                            m38 = m384;
                        } else if (ordinal == 4) {
                            m38 = m385;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    bc7[] bc7Arr = CallBottomPanelWidget.s0;
                    ((CallBottomPanelWidget) ((sy4) o11).b).n0().s(m38);
                    return;
                }
                return;
            case 1:
                m38 m387 = j11.O0;
                if (m387 != null && (o112 = j11.M0) != null) {
                    int ordinal2 = m387.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            m38 = m382;
                        } else if (ordinal2 == 2) {
                            m38 = m383;
                        } else if (ordinal2 == 3) {
                            m38 = m384;
                        } else if (ordinal2 == 4) {
                            m38 = m385;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    bc7[] bc7Arr2 = CallBottomPanelWidget.s0;
                    ((CallBottomPanelWidget) ((sy4) o112).b).n0().u(m38);
                    return;
                }
                return;
            case 2:
                j11.w(j11);
                return;
            default:
                o11 o113 = j11.M0;
                if (o113 != null) {
                    ((sy4) o113).F();
                    return;
                }
                return;
        }
    }
}
