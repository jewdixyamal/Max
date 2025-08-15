package ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/sessionroom/SessionRoomWatchTogetherHandler;", "Lrl1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherManager", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;)V", "Le5f;", "stopWatchTogetherForMe", "()V", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lzad;", "roomId", "Lzad;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomWatchTogetherHandler implements rl1 {
    private zad roomId = xad.a;
    private final ParticipantStore store;
    private final WatchTogetherPlayer watchTogetherManager;

    public SessionRoomWatchTogetherHandler(ParticipantStore participantStore, WatchTogetherPlayer watchTogetherPlayer) {
        this.store = participantStore;
        this.watchTogetherManager = watchTogetherPlayer;
    }

    private final void stopWatchTogetherForMe() {
        for (Map.Entry next : this.watchTogetherManager.getMovieStates().getStates().entrySet()) {
            cd9 cd9 = (cd9) next.getKey();
            ParticipantId participantId = ((MovieState) next.getValue()).getParticipantId();
            ConversationParticipant me2 = this.store.getMe();
            if (tpa.f(participantId, me2 != null ? me2.getExternalId() : null)) {
                WatchTogetherPlayer.stop$default(this.watchTogetherManager, cd9, (k56) null, (m56) null, 6, (Object) null);
            }
        }
    }

    public void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        zad zad = this.roomId;
        zad zad2 = nl1.a;
        if (!tpa.f(zad, zad2)) {
            stopWatchTogetherForMe();
        }
        this.roomId = zad2;
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1) {
    }
}
