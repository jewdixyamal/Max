package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: tz5  reason: default package */
public final class tz5 implements uc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ tz5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void m() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                qm0 qm0 = ((ForwardPickerScreen) widget).A0;
                if (qm0.a()) {
                    ((sv8) qm0.getValue()).e(false);
                    return;
                }
                return;
            case 1:
                bc7[] bc7Arr = MediaBarWidget.d1;
                ((MediaBarWidget) widget).w0().e(false);
                return;
            default:
                qm0 qm02 = ((ShareDataPickerScreen) widget).x0;
                if (qm02.a()) {
                    ((sv8) qm02.getValue()).e(false);
                    return;
                }
                return;
        }
    }
}
