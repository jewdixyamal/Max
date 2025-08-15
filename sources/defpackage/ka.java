package defpackage;

import android.view.View;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;

/* renamed from: ka  reason: default package */
public final /* synthetic */ class ka implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdminWaitingRoomScreen b;

    public /* synthetic */ ka(AdminWaitingRoomScreen adminWaitingRoomScreen, int i) {
        this.a = i;
        this.b = adminWaitingRoomScreen;
    }

    public final void onClick(View view) {
        AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = AdminWaitingRoomScreen.s0;
                ((qa) adminWaitingRoomScreen.a.getValue()).q(true);
                return;
            case 1:
                bc7[] bc7Arr2 = AdminWaitingRoomScreen.s0;
                ((qa) adminWaitingRoomScreen.a.getValue()).q(false);
                return;
            default:
                bc7[] bc7Arr3 = AdminWaitingRoomScreen.s0;
                adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                return;
        }
    }
}
