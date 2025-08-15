package defpackage;

import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;

/* renamed from: px2  reason: default package */
public final /* synthetic */ class px2 implements xha {
    public final /* synthetic */ int a;
    public final /* synthetic */ dnd b;

    public /* synthetic */ px2(dnd dnd, int i) {
        this.a = i;
        this.b = dnd;
    }

    public final void I(yha yha) {
        dnd dnd = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatsListWidget.M0;
                dnd.b.invoke(yha);
                return;
            default:
                bc7[] bc7Arr2 = ContactListWidget.P0;
                dnd.b.invoke(yha);
                return;
        }
    }
}
