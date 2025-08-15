package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1 extends rd7 implements k56 {
    final /* synthetic */ m56 $onSuccess;
    final /* synthetic */ Set<yad> $roomIds;
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1(Set<yad> set, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, m56 m56) {
        super(0);
        this.$roomIds = set;
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
        this.$onSuccess = m56;
    }

    public final void invoke() {
        ArrayList arrayList = new ArrayList();
        for (yad next : this.$roomIds) {
            SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = this.this$0;
            arrayList.add(new SessionRoomParticipants(next, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(next, sessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(next))));
        }
        this.$onSuccess.invoke(arrayList);
    }
}
