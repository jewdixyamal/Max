package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010Jc\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001f\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u000e\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J_\u0010!\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b!\u0010\u001cJS\u0010\"\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#JY\u0010$\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\n\u0010\u0015\u001a\u00060\bj\u0002`\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010 JM\u0010%\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020'2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R0\u0010\f\u001a\u001e\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lpy0;", "getCall", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "Lzad;", "getActiveRoomId", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lk56;Lm56;Lk56;)V", "", "Lqd8;", "Lrd8;", "statesToUpdate", "participantId", "roomId", "Le5f;", "onSuccess", "", "onError", "updateMediaOptions", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;Lk56;Lm56;)V", "", "mediaOptions", "requestToEnableMedia", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lzad;Lk56;Lm56;)V", "updateMediaOptionsForParticipant", "updateMediaOptionsForAll", "(Ljava/util/Map;Lzad;Lk56;Lm56;)V", "requestToEnableMediaForParticipant", "requestToEnableMediaForAll", "(Ljava/util/Set;Lzad;Lk56;Lm56;)V", "Lsd8;", "getMediaOptionsForCall", "(Lzad;)Lsd8;", "getMediaOptionsForCurrentUser", "()Lsd8;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lk56;", "Lm56;", "Lud8;", "paramsCreator", "Lud8;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MediaMuteCommandExecutorImpl implements MediaMuteCommandExecutor {
    private final k56 getActiveRoomId;
    private final k56 getCall;
    private final m56 getInternalId;
    private final ud8 paramsCreator = new Object();
    private final SignalingProvider signalingProvider;

    /* JADX WARNING: type inference failed for: r1v1, types: [ud8, java.lang.Object] */
    public MediaMuteCommandExecutorImpl(SignalingProvider signalingProvider2, k56 k56, m56 m56, k56 k562) {
        this.signalingProvider = signalingProvider2;
        this.getCall = k56;
        this.getInternalId = m56;
        this.getActiveRoomId = k562;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: zad} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void requestToEnableMedia(java.util.Set<? extends defpackage.qd8> r3, ru.ok.android.externcalls.sdk.id.ParticipantId r4, defpackage.zad r5, defpackage.k56 r6, defpackage.m56 r7) {
        /*
            r2 = this;
            ru.ok.android.externcalls.sdk.signaling.SignalingProvider r0 = r2.signalingProvider
            rod r0 = ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt.get(r0, r7)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            m56 r1 = r2.getInternalId
            java.lang.Object r1 = r1.invoke(r4)
            bg1 r1 = (defpackage.bg1) r1
            if (r4 == 0) goto L_0x0022
            if (r1 != 0) goto L_0x0022
            if (r7 == 0) goto L_0x0021
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Participant is not prepared"
            r2.<init>(r3)
            r7.invoke(r2)
        L_0x0021:
            return
        L_0x0022:
            ud8 r4 = r2.paramsCreator     // Catch:{ JSONException -> 0x0030 }
            if (r5 != 0) goto L_0x0032
            k56 r2 = r2.getActiveRoomId     // Catch:{ JSONException -> 0x0030 }
            java.lang.Object r2 = r2.invoke()     // Catch:{ JSONException -> 0x0030 }
            r5 = r2
            zad r5 = (defpackage.zad) r5     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            r2 = move-exception
            goto L_0x0049
        L_0x0032:
            r4.getClass()     // Catch:{ JSONException -> 0x0030 }
            org.json.JSONObject r2 = defpackage.ud8.a(r3, r1, r5)     // Catch:{ JSONException -> 0x0030 }
            mt r3 = new mt     // Catch:{ JSONException -> 0x0030 }
            r4 = 5
            r3.<init>(r4, r6)     // Catch:{ JSONException -> 0x0030 }
            nt r4 = new nt     // Catch:{ JSONException -> 0x0030 }
            r5 = 7
            r4.<init>(r5, r7)     // Catch:{ JSONException -> 0x0030 }
            r0.j(r2, r3, r4)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0055
        L_0x0049:
            if (r7 == 0) goto L_0x0055
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Error while creating params"
            r3.<init>(r4, r2)
            r7.invoke(r3)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl.requestToEnableMedia(java.util.Set, ru.ok.android.externcalls.sdk.id.ParticipantId, zad, k56, m56):void");
    }

    /* access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$2(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestToEnableMedia$lambda$3(m56 m56, JSONObject jSONObject) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: zad} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateMediaOptions(java.util.Map<defpackage.qd8, ? extends defpackage.rd8> r3, ru.ok.android.externcalls.sdk.id.ParticipantId r4, defpackage.zad r5, defpackage.k56 r6, defpackage.m56 r7) {
        /*
            r2 = this;
            ru.ok.android.externcalls.sdk.signaling.SignalingProvider r0 = r2.signalingProvider
            rod r0 = ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt.get(r0, r7)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            m56 r1 = r2.getInternalId
            java.lang.Object r1 = r1.invoke(r4)
            bg1 r1 = (defpackage.bg1) r1
            if (r4 == 0) goto L_0x0022
            if (r1 != 0) goto L_0x0022
            if (r7 == 0) goto L_0x0021
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Participant is not prepared"
            r2.<init>(r3)
            r7.invoke(r2)
        L_0x0021:
            return
        L_0x0022:
            ud8 r4 = r2.paramsCreator     // Catch:{ JSONException -> 0x0030 }
            if (r5 != 0) goto L_0x0032
            k56 r2 = r2.getActiveRoomId     // Catch:{ JSONException -> 0x0030 }
            java.lang.Object r2 = r2.invoke()     // Catch:{ JSONException -> 0x0030 }
            r5 = r2
            zad r5 = (defpackage.zad) r5     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            r2 = move-exception
            goto L_0x004a
        L_0x0032:
            r4.getClass()     // Catch:{ JSONException -> 0x0030 }
            org.json.JSONObject r2 = defpackage.ud8.b(r3, r1, r5)     // Catch:{ JSONException -> 0x0030 }
            mt r3 = new mt     // Catch:{ JSONException -> 0x0030 }
            r4 = 6
            r3.<init>(r4, r6)     // Catch:{ JSONException -> 0x0030 }
            nt r4 = new nt     // Catch:{ JSONException -> 0x0030 }
            r5 = 8
            r4.<init>(r5, r7)     // Catch:{ JSONException -> 0x0030 }
            r0.j(r2, r3, r4)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0056
        L_0x004a:
            if (r7 == 0) goto L_0x0056
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Error while creating params"
            r3.<init>(r4, r2)
            r7.invoke(r3)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl.updateMediaOptions(java.util.Map, ru.ok.android.externcalls.sdk.id.ParticipantId, zad, k56, m56):void");
    }

    /* access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$0(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateMediaOptions$lambda$1(m56 m56, JSONObject jSONObject) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Error response " + jSONObject));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: zad} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.sd8 getMediaOptionsForCall(defpackage.zad r4) {
        /*
            r3 = this;
            k56 r0 = r3.getCall
            java.lang.Object r0 = r0.invoke()
            py0 r0 = (defpackage.py0) r0
            if (r4 != 0) goto L_0x0013
            k56 r3 = r3.getActiveRoomId
            java.lang.Object r3 = r3.invoke()
            r4 = r3
            zad r4 = (defpackage.zad) r4
        L_0x0013:
            if (r0 == 0) goto L_0x0029
            kd1 r3 = r0.L1
            hi9 r3 = r3.h(r4)
            sd8 r4 = new sd8
            rd8 r0 = r3.a
            rd8 r1 = r3.b
            rd8 r2 = r3.c
            rd8 r3 = r3.d
            r4.<init>(r0, r1, r2, r3)
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 != 0) goto L_0x0031
            sd8 r4 = new sd8
            r4.<init>()
        L_0x0031:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl.getMediaOptionsForCall(zad):sd8");
    }

    public sd8 getMediaOptionsForCurrentUser() {
        sd8 sd8;
        py0 py0 = (py0) this.getCall.invoke();
        if (py0 != null) {
            hi9 hi9 = py0.L1.i;
            sd8 = new sd8(hi9.a, hi9.b, hi9.c, hi9.d);
        } else {
            sd8 = null;
        }
        return sd8 == null ? new sd8() : sd8;
    }

    public void requestToEnableMediaForAll(Set<? extends qd8> set, zad zad, k56 k56, m56 m56) {
        requestToEnableMedia(set, (ParticipantId) null, zad, k56, m56);
    }

    public void requestToEnableMediaForParticipant(Set<? extends qd8> set, ParticipantId participantId, zad zad, k56 k56, m56 m56) {
        requestToEnableMedia(set, participantId, zad, k56, m56);
    }

    public void setAudioPlayoutMuted(boolean z) {
        py0 py0 = (py0) this.getCall.invoke();
        if (py0 != null) {
            qld qld = py0.k1;
            qld.getClass();
            qld.a.execute(new old(qld, z, 1));
        }
    }

    public void updateMediaOptionsForAll(Map<qd8, ? extends rd8> map, zad zad, k56 k56, m56 m56) {
        updateMediaOptions(map, (ParticipantId) null, zad, k56, m56);
    }

    public void updateMediaOptionsForParticipant(Map<qd8, ? extends rd8> map, ParticipantId participantId, zad zad, k56 k56, m56 m56) {
        updateMediaOptions(map, participantId, zad, k56, m56);
    }
}
