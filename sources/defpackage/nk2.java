package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: nk2  reason: default package */
public final class nk2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.Y = chatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((nk2) n((kk2) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nk2 nk2 = new nk2(continuation, this.Y);
        nk2.X = obj;
        return nk2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kk2 kk2 = (kk2) this.X;
        bc7[] bc7Arr = ChatMembersScreen.u0;
        ChatMembersScreen chatMembersScreen = this.Y;
        chatMembersScreen.p0().setTitle(kk2.a);
        chatMembersScreen.p0().setSubtitle(kk2.b.b(chatMembersScreen.getContext()));
        chatMembersScreen.p0().setRightActions(kk2.c ? new pka(new xka(chatMembersScreen), new vka(woc.F, new mk2(chatMembersScreen, 2))) : new pka((yka) null, new xka(chatMembersScreen)));
        String str = (String) chatMembersScreen.o0().u0.a.getValue();
        if (str != null) {
            eha searchView = chatMembersScreen.p0().getSearchView();
            if (searchView != null) {
                searchView.setExpandWithAnimation(false);
            }
            eha searchView2 = chatMembersScreen.p0().getSearchView();
            if (searchView2 != null && searchView2.w0) {
                searchView2.c(true);
                je7 je7 = searchView2.C0;
                if (je7.a()) {
                    ((AppCompatEditText) je7.getValue()).setText(str);
                }
            }
            eha searchView3 = chatMembersScreen.p0().getSearchView();
            if (searchView3 != null) {
                searchView3.setExpandWithAnimation(true);
            }
        }
        return e5f.a;
    }
}
