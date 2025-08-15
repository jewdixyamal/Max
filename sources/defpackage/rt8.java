package defpackage;

import android.os.Bundle;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: rt8  reason: default package */
public final /* synthetic */ class rt8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ rt8(wm9 wm9, int i) {
        this.a = i;
        this.b = wm9;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        wm9 wm9 = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MessageContextMenuBottomSheet.Z0;
                u29.c.R1((c64) wm9);
                return e5f;
            case 1:
                bc7[] bc7Arr2 = MessagesListWidget.X0;
                gma gma = (gma) wm9;
                f64 P1 = u29.c.P1();
                P1.b(":call-user?opponent_id=" + gma.b + "&video_enabled=" + gma.c, (Bundle) null);
                return e5f;
            default:
                bc7[] bc7Arr3 = MessagesListWidget.X0;
                u29.c.P1().b(":call-join-link?link=".concat(((ula) wm9).d), (Bundle) null);
                return e5f;
        }
    }

    public /* synthetic */ rt8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, wm9 wm9) {
        this.a = 0;
        this.b = wm9;
    }
}
