package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: x59  reason: default package */
public final class x59 implements z19 {
    public final /* synthetic */ MessagesListWidget a;
    public final /* synthetic */ bxc b;

    public x59(MessagesListWidget messagesListWidget, bxc bxc) {
        this.a = messagesListWidget;
        this.b = bxc;
    }

    public final void b() {
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.a;
        if (messagesListWidget.r0().w() != 0) {
            MessagesListWidget.o0(messagesListWidget, this.b);
            messagesListWidget.r0().K.f(this);
        }
    }

    public final String getTag() {
        return "ScrollButton";
    }
}
