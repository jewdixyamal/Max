package ru.ok.android.externcalls.sdk.sessionroom;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002()J5\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00132\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00162\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00192\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001c2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH'¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Lk56;Lm56;)V", "Lyad;", "roomId", "joinRoom", "(Lyad;Lk56;Lm56;)V", "leaveRoom", "Ln7;", "params", "activateRooms", "(Ln7;Lk56;Lm56;)V", "Lo6f;", "updateRooms", "(Lo6f;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lk56;Lm56;)V", "Lhgc;", "removeRooms", "(Lhgc;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "removeListener", "OwnRoomsListener", "SessionRoomInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface SessionRoomsManager extends SessionRoomParticipantsDataProvider {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "event", "Le5f;", "onRoomUpdated", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;)V", "onProposedRoomChanged", "onActiveRoomChanged", "onRoomRemoved", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface OwnRoomsListener {
        void onActiveRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onProposedRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onRoomRemoved(SessionRoomInfo sessionRoomInfo);

        void onRoomUpdated(SessionRoomInfo sessionRoomInfo);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "", "Lzad;", "roomId", "Ltad;", "room", "<init>", "(Lzad;Ltad;)V", "component1", "()Lzad;", "component2", "()Ltad;", "copy", "(Lzad;Ltad;)Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzad;", "getRoomId", "Ltad;", "getRoom", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class SessionRoomInfo {
        private final tad room;
        private final zad roomId;

        public SessionRoomInfo(zad zad, tad tad) {
            this.roomId = zad;
            this.room = tad;
        }

        public static /* synthetic */ SessionRoomInfo copy$default(SessionRoomInfo sessionRoomInfo, zad zad, tad tad, int i, Object obj) {
            if ((i & 1) != 0) {
                zad = sessionRoomInfo.roomId;
            }
            if ((i & 2) != 0) {
                tad = sessionRoomInfo.room;
            }
            return sessionRoomInfo.copy(zad, tad);
        }

        public final zad component1() {
            return this.roomId;
        }

        public final tad component2() {
            return this.room;
        }

        public final SessionRoomInfo copy(zad zad, tad tad) {
            return new SessionRoomInfo(zad, tad);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRoomInfo)) {
                return false;
            }
            SessionRoomInfo sessionRoomInfo = (SessionRoomInfo) obj;
            return tpa.f(this.roomId, sessionRoomInfo.roomId) && tpa.f(this.room, sessionRoomInfo.room);
        }

        public final tad getRoom() {
            return this.room;
        }

        public final zad getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            int hashCode = this.roomId.hashCode() * 31;
            tad tad = this.room;
            return hashCode + (tad == null ? 0 : tad.hashCode());
        }

        public String toString() {
            zad zad = this.roomId;
            tad tad = this.room;
            return "SessionRoomInfo(roomId=" + zad + ", room=" + tad + ")";
        }
    }

    void activateRooms(n7 n7Var, k56 k56, m56 m56);

    void addListener(OwnRoomsListener ownRoomsListener);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, k56 k56, m56 m56);

    SessionRoomInfo getOwnActiveRoom();

    SessionRoomInfo getOwnProposedRoom();

    void joinRoom(yad yad, k56 k56, m56 m56);

    void leaveRoom(k56 k56, m56 m56);

    void moveParticipant(MoveParticipantParams moveParticipantParams, k56 k56, m56 m56);

    void removeListener(OwnRoomsListener ownRoomsListener);

    void removeRooms(hgc hgc, k56 k56, m56 m56);

    void requestAttention(k56 k56, m56 m56);

    void updateRooms(o6f o6f, k56 k56, m56 m56);
}
