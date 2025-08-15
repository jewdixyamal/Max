package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: jn1  reason: default package */
public final /* synthetic */ class jn1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn1 b;

    public /* synthetic */ jn1(mn1 mn1, int i) {
        this.a = i;
        this.b = mn1;
    }

    public final Object invoke() {
        Object value;
        mn1 mn1 = this.b;
        switch (this.a) {
            case 0:
                ln1 ln1 = mn1.G0;
                if (ln1 != null) {
                    bc7[] bc7Arr = CallTopPanelWidget.o;
                    q0e q0e = ((vvc) ((CallTopPanelWidget) ((o9g) ln1).b).n0().c.i).s0;
                    do {
                        value = q0e.getValue();
                    } while (!q0e.c(value, wvc.a((wvc) value, (xvc) null, (kvc) null, true, (String) null, 11)));
                }
                return e5f.a;
            default:
                return qp4.u0.p(mn1).c;
        }
    }
}
