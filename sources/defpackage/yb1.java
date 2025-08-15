package defpackage;

import android.view.View;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: yb1  reason: default package */
public final /* synthetic */ class yb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ yb1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final void onClick(View view) {
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
                callJoinLinkPreviewWidget.r0();
                return;
            default:
                bc7[] bc7Arr2 = CallJoinLinkPreviewWidget.B0;
                vb1 q0 = callJoinLinkPreviewWidget.q0();
                nb1 nb1 = (nb1) q0.x0.getValue();
                m38 m38 = nb1.c;
                m38 m382 = m38.b;
                boolean z = false;
                boolean z2 = m38 == m382;
                if (nb1.b == m382) {
                    z = true;
                }
                pnf.o(q0.A0, new ea1(q0.b, z2, z, nb1.d));
                return;
        }
    }
}
