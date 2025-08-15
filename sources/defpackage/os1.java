package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* renamed from: os1  reason: default package */
public final class os1 implements ConversationEventsListener, qm1, MediaConnectionListener {
    public final khe a = new khe(new dk1(19));
    public final khe b = new khe(new dk1(20));

    public final void a(String str) {
        for (qm1 a2 : (CopyOnWriteArraySet) this.b.getValue()) {
            a2.a(str);
        }
    }

    public final CopyOnWriteArraySet b() {
        return (CopyOnWriteArraySet) this.a.getValue();
    }

    public final void c(um1 um1) {
        b().remove(um1);
    }

    public final void d(um1 um1) {
        b().add(um1);
    }

    public final void onAnonJoinForbiddenChanged(boolean z) {
        for (um1 onAnonJoinForbiddenChanged : b()) {
            onAnonJoinForbiddenChanged.onAnonJoinForbiddenChanged(z);
        }
    }

    public final void onCallAccepted() {
        for (um1 onCallAccepted : b()) {
            onCallAccepted.onCallAccepted();
        }
    }

    public final void onCallAcceptedForAll() {
        for (um1 onCallAcceptedForAll : b()) {
            onCallAcceptedForAll.onCallAcceptedForAll();
        }
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        for (um1 onCallEnded : b()) {
            onCallEnded.onCallEnded(conversationEndInfo);
        }
    }

    public final void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
        for (um1 onCallIsUnfeasibleError : b()) {
            onCallIsUnfeasibleError.onCallIsUnfeasibleError(signalingErrors$CallIsUnfeasibleError);
        }
    }

    public final void onCallParticipantsNetworkStatusChanged(List list) {
        for (um1 onCallParticipantsNetworkStatusChanged : b()) {
            onCallParticipantsNetworkStatusChanged.onCallParticipantsNetworkStatusChanged(list);
        }
    }

    public final void onCallSignalingConnected() {
        for (um1 onCallSignalingConnected : b()) {
            onCallSignalingConnected.onCallSignalingConnected();
        }
    }

    public final void onCallStartResolutionFailed(List list) {
        for (um1 onCallStartResolutionFailed : b()) {
            onCallStartResolutionFailed.onCallStartResolutionFailed(list);
        }
    }

    public final void onCameraBusy() {
        for (um1 onCameraBusy : b()) {
            onCameraBusy.onCameraBusy();
        }
    }

    public final void onCameraChanged() {
        for (um1 onCameraChanged : b()) {
            onCameraChanged.onCameraChanged();
        }
    }

    public final void onCustomData(JSONObject jSONObject) {
        for (um1 onCustomData : b()) {
            onCustomData.onCustomData(jSONObject);
        }
    }

    public final void onDestroyed() {
        for (um1 onDestroyed : b()) {
            onDestroyed.onDestroyed();
        }
    }

    public final void onJoinLinkUpdated(String str) {
        for (um1 onJoinLinkUpdated : b()) {
            onJoinLinkUpdated.onJoinLinkUpdated(str);
        }
    }

    public final void onLocalMediaChanged() {
        for (um1 onLocalMediaChanged : b()) {
            onLocalMediaChanged.onLocalMediaChanged();
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        for (um1 onMeInWaitingRoomChanged : b()) {
            onMeInWaitingRoomChanged.onMeInWaitingRoomChanged(z);
        }
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        for (um1 onMediaConnected : b()) {
            onMediaConnected.onMediaConnected(connectedInfo);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        for (um1 onMediaDisconnected : b()) {
            onMediaDisconnected.onMediaDisconnected(disconnectedInfo);
        }
    }

    public final void onMicChanged(boolean z) {
        for (um1 onMicChanged : b()) {
            onMicChanged.onMicChanged(z);
        }
    }

    public final void onMicrophoneForciblyMuted() {
        for (um1 onMicrophoneForciblyMuted : b()) {
            onMicrophoneForciblyMuted.onMicrophoneForciblyMuted();
        }
    }

    public final void onMigratedToServerTopology() {
        for (um1 onMigratedToServerTopology : b()) {
            onMigratedToServerTopology.onMigratedToServerTopology();
        }
    }

    public final void onMuteChanged(vi9 vi9) {
        for (um1 onMuteChanged : b()) {
            onMuteChanged.onMuteChanged(vi9);
        }
    }

    public final void onMuteStateInitialized(vi9 vi9) {
        for (um1 onMuteStateInitialized : b()) {
            onMuteStateInitialized.onMuteStateInitialized(vi9);
        }
    }

    public final void onOpponentFingerprintChanged(long j) {
        for (um1 onOpponentFingerprintChanged : b()) {
            onOpponentFingerprintChanged.onOpponentFingerprintChanged(j);
        }
    }

    public final void onOpponentMediaChanged() {
        for (um1 onOpponentMediaChanged : b()) {
            onOpponentMediaChanged.onOpponentMediaChanged();
        }
    }

    public final void onOpponentRegistered() {
        for (um1 onOpponentRegistered : b()) {
            onOpponentRegistered.onOpponentRegistered();
        }
    }

    public final void onParticipantsAdded(List list) {
        for (um1 onParticipantsAdded : b()) {
            onParticipantsAdded.onParticipantsAdded(list);
        }
    }

    public final void onParticipantsChanged(List list) {
        for (um1 onParticipantsChanged : b()) {
            onParticipantsChanged.onParticipantsChanged(list);
        }
    }

    public final void onParticipantsDeAnonymized(List list, Map map) {
        for (um1 onParticipantsDeAnonymized : b()) {
            onParticipantsDeAnonymized.onParticipantsDeAnonymized(list, map);
        }
    }

    public final void onParticipantsRemoved(List list) {
        for (um1 onParticipantsRemoved : b()) {
            onParticipantsRemoved.onParticipantsRemoved(list);
        }
    }

    public final void onParticipantsUpdated(Collection collection) {
        for (um1 onParticipantsUpdated : b()) {
            onParticipantsUpdated.onParticipantsUpdated(collection);
        }
    }

    public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        for (um1 onPinChanged : b()) {
            onPinChanged.onPinChanged(conversationParticipant, z);
        }
    }

    public final void onRateCall(RateCallData rateCallData) {
        for (um1 onRateCall : b()) {
            onRateCall.onRateCall(rateCallData);
        }
    }

    public final void onRecurringChanged(boolean z) {
        for (um1 onRecurringChanged : b()) {
            onRecurringChanged.onRecurringChanged(z);
        }
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        for (um1 onRolesChanged : b()) {
            onRolesChanged.onRolesChanged(conversationParticipant);
        }
    }

    public final void onStateChanged(ConversationParticipant conversationParticipant, dg1 dg1) {
        for (um1 onStateChanged : b()) {
            onStateChanged.onStateChanged(conversationParticipant, dg1);
        }
    }

    public final void onWaitingRoomEnabledChanged(boolean z) {
        for (um1 onWaitingRoomEnabledChanged : b()) {
            onWaitingRoomEnabledChanged.onWaitingRoomEnabledChanged(z);
        }
    }

    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        for (um1 onWaitingRoomParticipantsChanged : b()) {
            onWaitingRoomParticipantsChanged.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    public final void onDestroyed(String str) {
        for (um1 onDestroyed : b()) {
            onDestroyed.onDestroyed(str);
        }
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        for (um1 onDestroyed : b()) {
            onDestroyed.onDestroyed(conversationDestroyedInfo);
        }
    }
}
