package defpackage;

import android.view.View;
import one.me.startconversation.StartConversationScreen;

/* renamed from: uyd  reason: default package */
public final /* synthetic */ class uyd implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ uyd(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    public final Object invoke(Object obj) {
        StartConversationScreen startConversationScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = StartConversationScreen.I0;
                i3a onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f.a;
            default:
                int intValue = ((Integer) obj).intValue();
                int j = startConversationScreen.D0.j() + startConversationScreen.y0.j();
                int j2 = startConversationScreen.z0.j() + j;
                a3g a3g = startConversationScreen.A0;
                int j3 = a3g.j() + j2;
                int j4 = startConversationScreen.E0.j();
                CharSequence m0 = startConversationScreen.m0();
                if (!(!(m0 == null || m0.length() == 0)) && intValue >= j && intValue >= j2 && intValue >= j4 && intValue < j3) {
                    return ((nn3) ((ol7) a3g.C(intValue - j2))).b;
                }
                return null;
        }
    }
}
