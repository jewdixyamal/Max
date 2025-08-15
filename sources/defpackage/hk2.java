package defpackage;

import java.util.function.Consumer;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hk2  reason: default package */
public final /* synthetic */ class hk2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ hk2(v8 v8Var, int i) {
        this.a = i;
        this.b = (m56) v8Var;
    }

    public final void accept(Object obj) {
        m56 m56 = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMembersCompactWidget.Z;
                m56.invoke(obj);
                return;
            case 1:
                bc7[] bc7Arr2 = ChatsListSearchScreen.J0;
                m56.invoke(obj);
                return;
            case 2:
                bc7[] bc7Arr3 = ChatsListWidget.M0;
                m56.invoke(obj);
                return;
            case 3:
                bc7[] bc7Arr4 = ChatsListWidget.M0;
                m56.invoke(obj);
                return;
            case 4:
                bc7[] bc7Arr5 = ContactListWidget.P0;
                m56.invoke(obj);
                return;
            case 5:
                bc7[] bc7Arr6 = MessagesListWidget.X0;
                m56.invoke(obj);
                return;
            case 6:
                bc7[] bc7Arr7 = MessagesListWidget.X0;
                m56.invoke(obj);
                return;
            case 7:
                m56.invoke(obj);
                return;
            case 8:
                m56.invoke(obj);
                return;
            case 9:
                m56.invoke(obj);
                return;
            case 10:
                bc7[] bc7Arr8 = StickersScreen.v0;
                m56.invoke(obj);
                return;
            case 11:
                bc7[] bc7Arr9 = StickersSettingsScreen.Y;
                m56.invoke(obj);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr10 = WebAppRootScreen.G0;
                m56.invoke(obj);
                return;
            default:
                bc7[] bc7Arr11 = WebAppRootScreen.G0;
                m56.invoke(obj);
                return;
        }
    }
}
