package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: q69  reason: default package */
public final class q69 implements z19 {
    public final /* synthetic */ MessagesListWidget a;

    public q69(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    public final void b() {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "AutoPlayRegulator", "Player autoplay. Try start autoplay after recycler layout.", (Throwable) null);
        }
        MessagesListWidget messagesListWidget = this.a;
        bc7[] bc7Arr = MessagesListWidget.X0;
        EndlessRecyclerView2 u0 = messagesListWidget.u0();
        pla.a(u0, new l69(u0, this.a, 1));
        this.a.r0().K.f(this);
    }

    public final String getTag() {
        return "AutoPlayRegulator";
    }
}
