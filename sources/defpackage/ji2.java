package defpackage;

import android.view.View;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ji2  reason: default package */
public final /* synthetic */ class ji2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ ji2(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMediaViewerScreen.K0;
                i3a onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            default:
                bc7[] bc7Arr2 = ChatMediaViewerScreen.K0;
                chatMediaViewerScreen.D0().E(k8a.l);
                return e5f;
        }
    }
}
