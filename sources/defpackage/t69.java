package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: t69  reason: default package */
public final class t69 extends f77 implements kre {
    public final /* synthetic */ MessagesListWidget N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t69(MessagesListWidget messagesListWidget, vge vge) {
        super(vge);
        this.N0 = messagesListWidget;
    }

    public final void onThemeChanged(fka fka) {
        vge vge = this.N0.y0;
        if (vge == null) {
            vge = null;
        }
        vge.onThemeChanged(fka);
    }
}
