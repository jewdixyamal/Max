package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: kn1  reason: default package */
public final /* synthetic */ class kn1 implements hnc {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn1 b;

    public /* synthetic */ kn1(mn1 mn1, int i) {
        this.a = i;
        this.b = mn1;
    }

    public final void b() {
        mn1 mn1 = this.b;
        switch (this.a) {
            case 0:
                ln1 ln1 = mn1.G0;
                if (ln1 != null) {
                    bc7[] bc7Arr = CallTopPanelWidget.o;
                    pnf.o(((CallTopPanelWidget) ((o9g) ln1).b).n0().b.M0, cj1.D);
                    return;
                }
                return;
            default:
                ln1 ln12 = mn1.G0;
                if (ln12 != null) {
                    bc7[] bc7Arr2 = CallTopPanelWidget.o;
                    pnf.o(((CallTopPanelWidget) ((o9g) ln12).b).n0().b.M0, sj1.D);
                    return;
                }
                return;
        }
    }
}
