package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: lk2  reason: default package */
public final /* synthetic */ class lk2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ lk2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    public final Object invoke() {
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMembersScreen.u0;
                return new bl2(62, chatMembersScreen.m0(), false);
            case 1:
                bc7[] bc7Arr2 = ChatMembersScreen.u0;
                e11 e11 = new e11(0, chatMembersScreen.n0(), bl2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 6);
                long m0 = chatMembersScreen.m0();
                xcb xcb = xcb.a;
                return new ro8((m56) new mk2(chatMembersScreen, 1), (pc4) new d9(m0, xcb.c(), xcb.getAccessor().d(u7b.class), xcb.d(), xcb.getAccessor().d(y7b.class), 1), (k56) e11);
            default:
                bc7[] bc7Arr3 = ChatMembersScreen.u0;
                long m02 = chatMembersScreen.m0();
                String string = chatMembersScreen.getArgs().getString("profile:memberslist:type");
                if (string == null) {
                    string = "";
                }
                return new MembersListWidget(chatMembersScreen.o, new go8(m02, ek2.valueOf(string), (Integer) null, 12), (z84) null);
        }
    }
}
