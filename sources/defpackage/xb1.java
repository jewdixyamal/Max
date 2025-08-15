package defpackage;

import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: xb1  reason: default package */
public final /* synthetic */ class xb1 implements hnc {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ xb1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final void b() {
        boolean z = false;
        m38 m38 = m38.b;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
                vb1 q0 = callJoinLinkPreviewWidget.q0();
                if (((nb1) callJoinLinkPreviewWidget.q0().x0.getValue()).b == m38) {
                    z = true;
                }
                q0.r(!z);
                return;
            default:
                bc7[] bc7Arr2 = CallJoinLinkPreviewWidget.B0;
                vb1 q02 = callJoinLinkPreviewWidget.q0();
                if (((nb1) callJoinLinkPreviewWidget.q0().x0.getValue()).c == m38) {
                    z = true;
                }
                q02.s(!z);
                return;
        }
    }
}
