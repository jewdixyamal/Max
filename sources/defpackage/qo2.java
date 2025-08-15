package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: qo2  reason: default package */
public final class qo2 implements bha {
    public final /* synthetic */ ChatScreen a;

    public qo2(ChatScreen chatScreen) {
        this.a = chatScreen;
    }

    public final void I(CharSequence charSequence) {
        bc7[] bc7Arr = ChatScreen.k1;
        fl2 fl2 = this.a.J0().o;
        fl2.getClass();
        if (charSequence != null) {
            charSequence.toString();
        }
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        String str = obj;
        il2 il2 = (il2) fl2.a;
        il2.getClass();
        hm9.m("il2", "Search text changed ".concat(str), new Object[0]);
        il2.a();
        il2.c = str;
        if (str.length() == 0) {
            fl2 fl22 = il2.g;
            if (fl22 != null) {
                fl22.f();
                return;
            }
            return;
        }
        j47.T(il2.e, (lx3) null, (vx3) null, new gl2(il2, str, 0, (Continuation) null), 3);
    }

    public final void U() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            if (chatScreen.N0().b()) {
                chatScreen.N0().postDelayed(new cu1(12, chatScreen), 200);
            } else {
                chatScreen.N0().f(true);
            }
            chatScreen.J0().q();
        }
    }

    public final void g() {
        bc7[] bc7Arr = ChatScreen.k1;
        this.a.N0().f(false);
    }

    public final void n() {
        bc7[] bc7Arr = ChatScreen.k1;
        this.a.J0().r(true);
    }
}
