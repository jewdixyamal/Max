package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1 extends rd7 implements k56 {
    final /* synthetic */ m56 $onSuccess;
    final /* synthetic */ Collection<bg1> $participantIds;
    final /* synthetic */ zad $roomId;
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1(m56 m56, zad zad, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Collection<bg1> collection) {
        super(0);
        this.$onSuccess = m56;
        this.$roomId = zad;
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
        this.$participantIds = collection;
    }

    public final void invoke() {
        m56 m56 = this.$onSuccess;
        zad zad = this.$roomId;
        m56.invoke(new SessionRoomParticipants(zad, this.this$0.mapInternalIdsToSessionRoomParticipants(zad, this.$participantIds)));
    }
}
