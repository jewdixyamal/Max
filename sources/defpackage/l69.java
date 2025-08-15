package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: l69  reason: default package */
public final class l69 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ l69(EndlessRecyclerView2 endlessRecyclerView2, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final void run() {
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                y6c y6c = messagesListWidget.W0;
                if (y6c != null) {
                    messagesListWidget.u0().s0(y6c);
                    messagesListWidget.u0().m(y6c);
                    y6c y6c2 = messagesListWidget.W0;
                    if (y6c2 != null) {
                        y6c2.g = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                bc7[] bc7Arr = MessagesListWidget.X0;
                messagesListWidget.p0().e(messagesListWidget.u0(), true);
                return;
        }
    }
}
