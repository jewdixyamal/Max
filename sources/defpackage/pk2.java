package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: pk2  reason: default package */
public final class pk2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.Y = chatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pk2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pk2 pk2 = new pk2(continuation, this.Y);
        pk2.X = obj;
        return pk2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        Set set = (Set) this.X;
        ChatMembersScreen chatMembersScreen = this.Y;
        if (set != null) {
            bc7[] bc7Arr = ChatMembersScreen.u0;
            chatMembersScreen.p0().c(String.valueOf(set.size()), Collections.singletonList(new zka(10101, jpc.y1, gpc.r0)), new qk2(0, chatMembersScreen), new zp1(set, 1, chatMembersScreen));
        } else {
            bc7[] bc7Arr2 = ChatMembersScreen.u0;
            chatMembersScreen.p0().a();
        }
        return e5f.a;
    }
}
