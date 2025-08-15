package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* renamed from: gk2  reason: default package */
public final /* synthetic */ class gk2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    public /* synthetic */ gk2(ChatMembersCompactWidget chatMembersCompactWidget, int i) {
        this.a = i;
        this.b = chatMembersCompactWidget;
    }

    public final Object invoke() {
        ChatMembersCompactWidget chatMembersCompactWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMembersCompactWidget.Z;
                return new MembersListWidget(chatMembersCompactWidget.b, new go8(chatMembersCompactWidget.m0(), ek2.MEMBER, (Integer) 10, 4), (z84) null);
            case 1:
                bc7[] bc7Arr2 = ChatMembersCompactWidget.Z;
                return new bl2(60, chatMembersCompactWidget.m0(), true);
            default:
                bc7[] bc7Arr3 = ChatMembersCompactWidget.Z;
                e11 e11 = new e11(0, chatMembersCompactWidget.n0(), bl2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 5);
                long m0 = chatMembersCompactWidget.m0();
                xcb xcb = xcb.a;
                return new ro8((m56) new l(25, chatMembersCompactWidget), (pc4) new d9(m0, xcb.c(), xcb.getAccessor().d(u7b.class), xcb.d(), xcb.getAccessor().d(y7b.class), 1), (k56) e11);
        }
    }
}
