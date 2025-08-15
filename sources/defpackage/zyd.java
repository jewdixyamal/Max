package defpackage;

import one.me.startconversation.StartConversationScreen;

/* renamed from: zyd  reason: default package */
public final class zyd implements bha {
    public final /* synthetic */ StartConversationScreen a;

    public zyd(StartConversationScreen startConversationScreen) {
        this.a = startConversationScreen;
    }

    public final void I(CharSequence charSequence) {
        bc7[] bc7Arr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        bc7[] bc7Arr2 = StartConversationScreen.I0;
        bc7 bc7 = bc7Arr2[0];
        startConversationScreen.c.b(startConversationScreen, Boolean.TRUE);
        bc7 bc72 = bc7Arr2[1];
        startConversationScreen.o.b(startConversationScreen, charSequence);
        jzd n0 = startConversationScreen.n0();
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((ti9) n0.v0.g.getValue()).setValue(obj);
    }

    public final void U() {
        bc7[] bc7Arr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        bc7 bc7 = StartConversationScreen.I0[2];
        startConversationScreen.X.b(startConversationScreen, Boolean.FALSE);
        startConversationScreen.H0.f(false);
    }

    public final void n() {
        bc7[] bc7Arr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        bc7 bc7 = StartConversationScreen.I0[2];
        startConversationScreen.X.b(startConversationScreen, Boolean.TRUE);
        startConversationScreen.H0.f(true);
    }
}
