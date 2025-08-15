package defpackage;

import android.view.View;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: mk2  reason: default package */
public final /* synthetic */ class mk2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ mk2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = ChatMembersScreen.u0;
                chatMembersScreen.getRouter().C();
                return e5f;
            case 1:
                ((Long) obj).getClass();
                bc7[] bc7Arr2 = ChatMembersScreen.u0;
                return chatMembersScreen.n0().r();
            default:
                View view2 = (View) obj;
                bc7[] bc7Arr3 = ChatMembersScreen.u0;
                ro8 o0 = chatMembersScreen.o0();
                o0.Z.m((Object) null, wz4.a);
                return e5f;
        }
    }
}
