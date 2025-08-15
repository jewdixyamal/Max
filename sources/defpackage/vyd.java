package defpackage;

import one.me.startconversation.StartConversationScreen;

/* renamed from: vyd  reason: default package */
public final /* synthetic */ class vyd implements in3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ vyd(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    public final boolean c(int i) {
        boolean z = false;
        StartConversationScreen startConversationScreen = this.b;
        switch (this.a) {
            case 0:
                if (i != startConversationScreen.z0.j() + startConversationScreen.D0.j() + startConversationScreen.y0.j()) {
                    if (i != startConversationScreen.F0.j()) {
                        return false;
                    }
                    CharSequence m0 = startConversationScreen.m0();
                    if (!(m0 == null || m0.length() == 0)) {
                        return false;
                    }
                }
                return true;
            default:
                bc7[] bc7Arr = StartConversationScreen.I0;
                CharSequence m02 = startConversationScreen.m0();
                if (m02 == null || m02.length() == 0) {
                    z = true;
                }
                return !z;
        }
    }
}
