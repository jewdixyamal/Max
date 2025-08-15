package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: gn1  reason: default package */
public final /* synthetic */ class gn1 implements hnc {
    public final /* synthetic */ int a;
    public final /* synthetic */ in1 b;

    public /* synthetic */ gn1(in1 in1, int i) {
        this.a = i;
        this.b = in1;
    }

    public final void b() {
        in1 in1 = this.b;
        switch (this.a) {
            case 0:
                ln1 ln1 = in1.L0;
                if (ln1 != null) {
                    bc7[] bc7Arr = CallTopPanelWidget.o;
                    pnf.o(((CallTopPanelWidget) ((o9g) ln1).b).n0().b.M0, cj1.D);
                    return;
                }
                return;
            case 1:
                in1.w(in1);
                return;
            default:
                ln1 ln12 = in1.L0;
                if (ln12 != null) {
                    bc7[] bc7Arr2 = CallTopPanelWidget.o;
                    pnf.o(((CallTopPanelWidget) ((o9g) ln12).b).n0().b.M0, sj1.D);
                    return;
                }
                return;
        }
    }
}
