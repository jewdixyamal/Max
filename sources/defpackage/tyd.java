package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.startconversation.StartConversationScreen;

/* renamed from: tyd  reason: default package */
public final /* synthetic */ class tyd implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;
    public final /* synthetic */ RecyclerView c;

    public /* synthetic */ tyd(StartConversationScreen startConversationScreen, RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = startConversationScreen;
        this.c = recyclerView;
    }

    public final Object invoke(Object obj) {
        RecyclerView recyclerView = this.c;
        StartConversationScreen startConversationScreen = this.b;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                bc7[] bc7Arr = StartConversationScreen.I0;
                CharSequence m0 = startConversationScreen.m0();
                if (m0 == null || m0.length() == 0) {
                    return null;
                }
                int l = startConversationScreen.F0.l(intValue);
                if (l == z8a.m) {
                    return recyclerView.getResources().getString(yoc.z0);
                }
                if (l == z8a.p) {
                    return recyclerView.getResources().getString(yoc.B0);
                }
                if (l == z8a.s) {
                    return recyclerView.getResources().getString(yoc.C0);
                }
                return null;
            default:
                int intValue2 = num.intValue();
                bc7[] bc7Arr2 = StartConversationScreen.I0;
                CharSequence m02 = startConversationScreen.m0();
                if (!(!(m02 == null || m02.length() == 0)) && startConversationScreen.F0.l(intValue2) == z8a.s) {
                    return recyclerView.getResources().getString(aja.x);
                }
                return null;
        }
    }
}
