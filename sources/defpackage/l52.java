package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatAdminsScreen;

/* renamed from: l52  reason: default package */
public final /* synthetic */ class l52 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAdminsScreen b;

    public /* synthetic */ l52(ChatAdminsScreen chatAdminsScreen, int i) {
        this.a = i;
        this.b = chatAdminsScreen;
    }

    public final Object invoke() {
        ChatAdminsScreen chatAdminsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatAdminsScreen.w0;
                return new MembersListWidget(chatAdminsScreen.o, new go8(chatAdminsScreen.n0(), ek2.ADMIN, (Integer) null, 12), (z84) null);
            case 1:
                bc7[] bc7Arr2 = ChatAdminsScreen.w0;
                return new u52(chatAdminsScreen.n0());
            default:
                bc7[] bc7Arr3 = ChatAdminsScreen.w0;
                f fVar = new f(1, chatAdminsScreen.m0(), u52.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0, 6);
                e11 e11 = new e11(0, chatAdminsScreen.m0(), u52.class, "getButtonActions", "getButtonActions()Lkotlinx/coroutines/flow/Flow;", 0, 3);
                long n0 = chatAdminsScreen.n0();
                xcb xcb = xcb.a;
                return new ro8((m56) fVar, (pc4) new k52(n0, xcb.c(), xcb.e(), xcb.getAccessor().d(u7b.class), xcb.d(), xcb.getAccessor().d(y7b.class), xcb.g()), (k56) e11);
        }
    }
}
