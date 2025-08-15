package ru.ok.android.externcalls.sdk.waiting_room;

import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Le5f;", "run", "()V", "ru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1 implements Runnable {
    final /* synthetic */ sqd $emitter$inlined;
    final /* synthetic */ sqd $emitter$inlined$1;
    final /* synthetic */ cq1 $page$inlined;
    final /* synthetic */ List $waitingParticipants;
    final /* synthetic */ WaitingRoomParticipants this$0;

    public WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1(WaitingRoomParticipants waitingRoomParticipants, List list, sqd sqd, cq1 cq1, sqd sqd2) {
        this.this$0 = waitingRoomParticipants;
        this.$waitingParticipants = list;
        this.$emitter$inlined = sqd;
        this.$page$inlined = cq1;
        this.$emitter$inlined$1 = sqd2;
    }

    public final void run() {
        List access$getResolvedWaitingParticipantIds = this.this$0.getResolvedWaitingParticipantIds(this.$waitingParticipants);
        try {
            ((nqd) this.$emitter$inlined).a(new WaitingRoomParticipants.WaitingParticipantsPage(access$getResolvedWaitingParticipantIds, this.$page$inlined.b));
        } catch (Exception e) {
            ((nqd) this.$emitter$inlined$1).d(new RuntimeException(wg0.i("Can't resolve internal ids: ", e.getMessage())));
        }
    }
}
