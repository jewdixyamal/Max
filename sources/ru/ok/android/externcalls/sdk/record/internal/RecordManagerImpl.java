package ru.ok.android.externcalls.sdk.record.internal;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00152\u000e\u0010)\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J=\u0010>\u001a\u00020\u00152\u0006\u00105\u001a\u0002082\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\b>\u0010?J=\u0010A\u001a\u00020\u00152\u0006\u00105\u001a\u00020@2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0EH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010\u001bJ\u0017\u0010M\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000e0[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R0\u0010`\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d`_8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR0\u0010b\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F`_8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl;", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "Lrl1;", "Lqh1;", "La4c;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "deprecatedRecordListener", "<init>", "(La4c;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "Lzad;", "oldRoomId", "newRoomId", "Le5f;", "notifyListenersWhenActiveRoomChanged", "(Lzad;Lzad;)V", "Loh1;", "info", "applyRecordStarted", "(Loh1;)V", "Lmh1;", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "toRecordDescription", "(Lmh1;)Lru/ok/android/externcalls/sdk/record/RecordDescription;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiatorId", "sessionRoomId", "current", "setMyRecordHistory", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "reportStarted", "()V", "whoStoppedRecordId", "reportStopped", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "", "description", "reportError", "(Ljava/lang/String;)V", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Lk56;Lm56;)V", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "getRecordAdmin", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onRecordStarted", "Lph1;", "onRecordStopped", "(Lph1;)V", "Lnh1;", "onRecordError", "(Lnh1;)V", "La4c;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "Laac;", "commandParamsCreator", "Laac;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sessionRoomToRecordInfo", "Ljava/util/HashMap;", "sessionRoomToRecordInfoHistory", "activeRoomId", "Lzad;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RecordManagerImpl implements RecordManager, rl1, qh1 {
    private static final Companion Companion = new Companion((z84) null);
    private static final String KEY_REMOVE_ERROR = "removeError";
    private static final String LOG_TAG = "RecordManagerImpl";
    private zad activeRoomId = xad.a;
    private final aac commandParamsCreator = new Object();
    private final RecordEventListener deprecatedRecordListener;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final CopyOnWriteArraySet<RecordEventListener> listeners = new CopyOnWriteArraySet<>();
    private final a4c logger;
    private final ParticipantStore participantStore;
    private final HashMap<zad, RecordDescription> sessionRoomToRecordInfo = new HashMap<>();
    private final HashMap<zad, RecordDescriptionHistory> sessionRoomToRecordInfoHistory = new HashMap<>();
    private final SignalingProvider signalingProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl$Companion;", "", "()V", "KEY_REMOVE_ERROR", "", "LOG_TAG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [aac, java.lang.Object] */
    public RecordManagerImpl(a4c a4c, ParticipantStore participantStore2, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2, SignalingProvider signalingProvider2, RecordEventListener recordEventListener) {
        this.logger = a4c;
        this.participantStore = participantStore2;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        this.signalingProvider = signalingProvider2;
        this.deprecatedRecordListener = recordEventListener;
    }

    private final void applyRecordStarted(oh1 oh1) {
        RecordDescription recordDescription = toRecordDescription(oh1.b);
        if (recordDescription != null) {
            ParticipantId initiator = recordDescription.getInitiator();
            zad zad = oh1.a;
            setMyRecordHistory(initiator, zad, recordDescription);
            this.sessionRoomToRecordInfo.put(zad, recordDescription);
            if (tpa.f(zad, this.activeRoomId)) {
                reportStarted();
            }
        }
    }

    private final void notifyListenersWhenActiveRoomChanged(zad zad, zad zad2) {
        if (this.sessionRoomToRecordInfo.get(zad) != null) {
            RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(zad);
            reportStopped(recordDescription != null ? recordDescription.getInitiator() : null);
        }
        if (this.sessionRoomToRecordInfo.get(zad2) != null) {
            reportStarted();
        }
    }

    /* access modifiers changed from: private */
    public static final void onRecordStarted$lambda$4(RecordManagerImpl recordManagerImpl, oh1 oh1) {
        recordManagerImpl.applyRecordStarted(oh1);
    }

    /* access modifiers changed from: private */
    public static final void onRecordStarted$lambda$5(RecordManagerImpl recordManagerImpl) {
        recordManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void reportError(String str) {
        this.deprecatedRecordListener.onRecordError(str);
        for (RecordEventListener onRecordError : this.listeners) {
            onRecordError.onRecordError(str);
        }
    }

    private final void reportStarted() {
        this.deprecatedRecordListener.onRecordStarted();
        for (RecordEventListener onRecordStarted : this.listeners) {
            onRecordStarted.onRecordStarted();
        }
    }

    private final void reportStopped(ParticipantId participantId) {
        ConversationParticipant byExternal = participantId != null ? this.participantStore.getByExternal(participantId) : null;
        this.deprecatedRecordListener.onRecordStopped(byExternal);
        for (RecordEventListener onRecordStopped : this.listeners) {
            onRecordStopped.onRecordStopped(byExternal);
        }
    }

    private final void setMyRecordHistory(ParticipantId participantId, zad zad, RecordDescription recordDescription) {
        ConversationParticipant me2 = this.participantStore.getMe();
        RecordDescription recordDescription2 = null;
        if (tpa.f(participantId, me2 != null ? me2.getExternalId() : null)) {
            HashMap<zad, RecordDescriptionHistory> hashMap = this.sessionRoomToRecordInfoHistory;
            RecordDescriptionHistory recordDescriptionHistory = hashMap.get(zad);
            if (recordDescriptionHistory != null) {
                recordDescription2 = recordDescriptionHistory.getCurrentState();
            }
            hashMap.put(zad, new RecordDescriptionHistory(recordDescription, recordDescription2));
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$0(RecordManager.StartParams startParams, k56 k56, JSONObject jSONObject) {
        if (startParams.getOnSuccess() != null) {
            startParams.getOnSuccess().invoke(new RecordManager.StartRecordInfo());
        } else if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$1(RecordManagerImpl recordManagerImpl, RecordManager.StartParams startParams, m56 m56, JSONObject jSONObject) {
        if ("error".equals(jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        m56 onError = startParams.getOnError();
        if (onError != null) {
            m56 = onError;
        }
        if (m56 != null) {
            m56.invoke(new RuntimeException("Can't start record " + jSONObject));
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$2(RecordManager.StopParams stopParams, k56 k56, JSONObject jSONObject) {
        if (stopParams.getOnSuccess() != null) {
            stopParams.getOnSuccess().invoke(new RecordManager.StopRecordInfo(stopParams.getRemoveRecord() ? jSONObject.has(KEY_REMOVE_ERROR) ? tpa.f(jSONObject.optString(KEY_REMOVE_ERROR), "record.remove_unsupported") ? RecordManager.StopRecordInfo.RemoveResult.NOT_SUPPORTED : RecordManager.StopRecordInfo.RemoveResult.NOT_REMOVED : RecordManager.StopRecordInfo.RemoveResult.REMOVED : RecordManager.StopRecordInfo.RemoveResult.NOT_REQUESTED));
        } else if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$3(RecordManagerImpl recordManagerImpl, RecordManager.StopParams stopParams, m56 m56, JSONObject jSONObject) {
        if ("error".equals(jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        m56 onError = stopParams.getOnError();
        if (onError != null) {
            m56 = onError;
        }
        if (m56 != null) {
            m56.invoke(new RuntimeException("Can't stop record " + jSONObject));
        }
    }

    private final RecordDescription toRecordDescription(mh1 mh1) {
        ParticipantId byInternal;
        ConversationParticipant byInternal2 = this.participantStore.getByInternal(mh1.c);
        if ((byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) && (byInternal = this.idMappingWrapper.getByInternal(mh1.c)) == null) {
            return null;
        }
        return new RecordDescription(byInternal, mh1.b, mh1.d, mh1.a, mh1.e, mh1.f);
    }

    public void addRecordListener(RecordEventListener recordEventListener) {
        this.listeners.add(recordEventListener);
    }

    public final ParticipantId getRecordAdmin() {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(this.activeRoomId);
        if (recordDescription != null) {
            return recordDescription.getInitiator();
        }
        return null;
    }

    public RecordDescription getRecordDescription() {
        return this.sessionRoomToRecordInfo.get(this.activeRoomId);
    }

    public Map<zad, RecordDescriptionHistory> getRecordDescriptionHistory() {
        return this.sessionRoomToRecordInfoHistory;
    }

    public void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        zad zad = this.activeRoomId;
        zad zad2 = nl1.a;
        if (!tpa.f(zad2, zad)) {
            zad zad3 = this.activeRoomId;
            this.activeRoomId = zad2;
            notifyListenersWhenActiveRoomChanged(zad3, zad2);
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1) {
    }

    public void onRecordError(nh1 nh1) {
        reportError(nh1.a);
    }

    public void onRecordStarted(oh1 oh1) {
        ParticipantStore participantStore2 = this.participantStore;
        mh1 mh1 = oh1.b;
        if (participantStore2.getByInternal(mh1.c) != null) {
            applyRecordStarted(oh1);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(mh1.c), new do9(this, 26, oh1), new u3c(3, this));
        }
    }

    public void onRecordStopped(ph1 ph1) {
        HashMap<zad, RecordDescription> hashMap = this.sessionRoomToRecordInfo;
        zad zad = ph1.a;
        RecordDescription recordDescription = hashMap.get(zad);
        ParticipantId participantId = null;
        setMyRecordHistory(recordDescription != null ? recordDescription.getInitiator() : null, zad, (RecordDescription) null);
        this.sessionRoomToRecordInfo.remove(zad);
        if (tpa.f(zad, this.activeRoomId)) {
            bg1 bg1 = ph1.b;
            ConversationParticipant byInternal = bg1 != null ? this.participantStore.getByInternal(bg1) : null;
            if (byInternal != null) {
                participantId = byInternal.getExternalId();
            }
            reportStopped(participantId);
        }
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1) {
    }

    public void removeRecordListener(RecordEventListener recordEventListener) {
        this.listeners.remove(recordEventListener);
    }

    public void startRecord(RecordManager.StartParams startParams, k56 k56, m56 m56) {
        RecordManager.StartParams startParams2 = startParams;
        m56 m562 = m56;
        rod rod = SignalingProviderKt.get(this.signalingProvider, m562);
        if (rod != null) {
            aac aac = this.commandParamsCreator;
            boolean isStream = startParams.isStream();
            Long movieId = startParams.getMovieId();
            zad sessionRoomId = startParams.getSessionRoomId();
            if (sessionRoomId == null) {
                sessionRoomId = this.activeRoomId;
            }
            Long groupId = startParams.getGroupId();
            Object name = startParams.getName();
            CharSequence description = startParams.getDescription();
            String privacy = startParams.getPrivacy();
            String albumId = startParams.getAlbumId();
            aac.getClass();
            Calendar instance = Calendar.getInstance();
            if (name == null) {
                name = String.format(Locale.getDefault(), "%4d-%2d-%2d %2d:%2d:%2d", Arrays.copyOf(new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)), Integer.valueOf(instance.get(13))}, 6));
            }
            try {
                ka6 b = f46.b(new JSONObject().put("movieId", (Object) movieId).put("name", name).put("description", (Object) description).put("privacy", (Object) privacy).put("groupId", (Object) groupId).put("albumId", (Object) albumId).put("streamMovie", isStream), "record-start");
                if (sessionRoomId instanceof yad) {
                    b.b(((yad) sessionRoomId).a, "roomId");
                }
                rod.d(b, false, new occ(startParams2, k56, 1), new hy0(this, startParams2, m562, 4));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopRecord(RecordManager.StopParams stopParams, k56 k56, m56 m56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            aac aac = this.commandParamsCreator;
            zad sessionRoomId = stopParams.getSessionRoomId();
            if (sessionRoomId == null) {
                sessionRoomId = this.activeRoomId;
            }
            boolean removeRecord = stopParams.getRemoveRecord();
            aac.getClass();
            ka6 b = f46.b((JSONObject) null, "record-stop");
            JSONObject jSONObject = b.a;
            jSONObject.put("command", (Object) "record-stop");
            if (sessionRoomId instanceof yad) {
                b.b(((yad) sessionRoomId).a, "roomId");
            }
            if (removeRecord) {
                jSONObject.put("remove", removeRecord);
            }
            rod.d(b, false, new occ(stopParams, k56, 0), new hy0(this, stopParams, m56, 3));
        }
    }
}
