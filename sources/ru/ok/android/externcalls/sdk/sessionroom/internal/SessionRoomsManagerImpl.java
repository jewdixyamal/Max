package ru.ok.android.externcalls.sdk.sessionroom.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b!\u0010 J>\u0010)\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b)\u0010*J6\u0010+\u001a\u00020\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b+\u0010,J6\u0010-\u001a\u00020\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b-\u0010,J>\u0010/\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020.2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b/\u00100J>\u00102\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u0002012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b2\u00103J>\u00105\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u0002042\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b5\u00106J>\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u0002072\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b8\u00109J>\u0010;\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020:2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b;\u0010<J>\u0010>\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020=2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\b>\u0010?J@\u0010B\u001a\u00020\u00112\u0018\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@\u0012\u0004\u0012\u00020\u00110&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\bB\u0010CJF\u0010H\u001a\u00020\u00112\n\u0010F\u001a\u00060Dj\u0002`E2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00110&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\bH\u0010IJB\u0010J\u001a\u00020\u00112\u0006\u0010#\u001a\u00020G2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00110&2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0018\u00010&H\u0001¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010NR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010PR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010RR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010S¨\u0006T"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/SessionRoomsManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "Lrl1;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManager;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "commandExecutor", "adminCommandExecutor", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "Lnl1;", "params", "Le5f;", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lol1;", "onCurrentParticipantInvitedToRoom", "(Lol1;)V", "Lpl1;", "onRoomRemoved", "(Lpl1;)V", "Lql1;", "onRoomUpdated", "(Lql1;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "removeListener", "Lyad;", "roomId", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "joinRoom", "(Lyad;Lk56;Lm56;)V", "leaveRoom", "(Lk56;Lm56;)V", "requestAttention", "Ln7;", "activateRooms", "(Ln7;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lk56;Lm56;)V", "Lhgc;", "removeRooms", "(Lhgc;Lk56;Lm56;)V", "Lzge;", "switchRoom", "(Lzge;Lk56;Lm56;)V", "Lo6f;", "updateRooms", "(Lo6f;Lk56;Lm56;)V", "", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "getAllInRoomParticipants", "(Lm56;Lm56;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lzad;", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;)V", "getRoomParticipants", "(Lzad;Lm56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomsManagerImpl implements SessionRoomsManager, rl1, SessionRoomListenerManager, SessionRoomCommandExecutor, SessionRoomAdminCommandExecutor, SessionRoomParticipantsDataProvider {
    private final SessionRoomAdminCommandExecutor adminCommandExecutor;
    private final SessionRoomCommandExecutor commandExecutor;
    private final SessionRoomListenerManagerImpl listenerManager;
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;

    public SessionRoomsManagerImpl(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomCommandExecutor sessionRoomCommandExecutor, SessionRoomAdminCommandExecutor sessionRoomAdminCommandExecutor, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.listenerManager = sessionRoomListenerManagerImpl;
        this.commandExecutor = sessionRoomCommandExecutor;
        this.adminCommandExecutor = sessionRoomAdminCommandExecutor;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    public void activateRooms(n7 n7Var, k56 k56, m56 m56) {
        throw null;
    }

    public void addListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listenerManager.addListener(ownRoomsListener);
    }

    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, k56 k56, m56 m56) {
        this.adminCommandExecutor.assignParticipantsToRooms(assignParticipantsToRoomsParams, k56, m56);
    }

    public void getAllInRoomParticipants(m56 m56, m56 m562) {
        this.participantDataProvider.getAllInRoomParticipants(m56, m562);
    }

    public SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        return this.listenerManager.getOwnActiveRoom();
    }

    public SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        return this.listenerManager.getOwnProposedRoom();
    }

    public void getParticipantRoomId(ParticipantId participantId, m56 m56, m56 m562) {
        this.participantDataProvider.getParticipantRoomId(participantId, m56, m562);
    }

    public void getRoomParticipants(zad zad, m56 m56, m56 m562) {
        this.participantDataProvider.getRoomParticipants(zad, m56, m562);
    }

    public void joinRoom(yad yad, k56 k56, m56 m56) {
        this.commandExecutor.joinRoom(yad, k56, m56);
    }

    public void leaveRoom(k56 k56, m56 m56) {
        this.commandExecutor.leaveRoom(k56, m56);
    }

    public void moveParticipant(MoveParticipantParams moveParticipantParams, k56 k56, m56 m56) {
        this.adminCommandExecutor.moveParticipant(moveParticipantParams, k56, m56);
    }

    public void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        this.listenerManager.onCurrentParticipantActiveRoomChanged(nl1);
    }

    public void onCurrentParticipantInvitedToRoom(ol1 ol1) {
        this.listenerManager.onCurrentParticipantInvitedToRoom(ol1);
    }

    public void onRoomRemoved(pl1 pl1) {
        this.listenerManager.onRoomRemoved(pl1);
    }

    public void onRoomUpdated(ql1 ql1) {
        this.listenerManager.onRoomUpdated(ql1);
    }

    public void removeListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.listenerManager.removeListener(ownRoomsListener);
    }

    public void removeRooms(hgc hgc, k56 k56, m56 m56) {
        throw null;
    }

    public void requestAttention(k56 k56, m56 m56) {
        this.commandExecutor.requestAttention(k56, m56);
    }

    public void switchRoom(zge zge, k56 k56, m56 m56) {
        this.adminCommandExecutor.switchRoom(zge, k56, m56);
    }

    public void updateRooms(o6f o6f, k56 k56, m56 m56) {
        this.adminCommandExecutor.updateRooms(o6f, k56, m56);
    }
}
