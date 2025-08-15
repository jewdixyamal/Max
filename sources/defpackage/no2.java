package defpackage;

import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;

/* renamed from: no2  reason: default package */
public final class no2 implements yu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ no2(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    private final void c(uu3 uu3, uu3 uu32, boolean z) {
    }

    private final void d(uu3 uu3, uu3 uu32, boolean z) {
    }

    public final void a(uu3 uu3, uu3 uu32, boolean z) {
        switch (this.a) {
            case 0:
                if (uu3 instanceof vm9) {
                    ChatScreen chatScreen = (ChatScreen) this.b;
                    if (!tpa.f(uu3, chatScreen)) {
                        an9.g(chatScreen.X, ((vm9) uu3).o());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (uu32 != null) {
                    RootController rootController = (RootController) this.b;
                    if (rootController.T().a.a.size() > 0 && (uu3 instanceof Widget) && !((Widget) uu3).isDialog()) {
                        rootController.T().C();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void b(uu3 uu3, uu3 uu32, boolean z) {
        int i = this.a;
    }
}
