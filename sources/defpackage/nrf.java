package defpackage;

import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: nrf  reason: default package */
public final /* synthetic */ class nrf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sqd b;

    public /* synthetic */ nrf(sqd sqd, int i) {
        this.a = i;
        this.b = sqd;
    }

    public final void run() {
        int i = this.a;
        sqd sqd = this.b;
        switch (i) {
            case 0:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(sqd);
                return;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1$lambda$0(sqd);
                return;
        }
    }
}
