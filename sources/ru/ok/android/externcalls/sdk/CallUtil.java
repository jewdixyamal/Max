package ru.ok.android.externcalls.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

public class CallUtil {
    static final a4c LOG = new a4c() {
        public /* bridge */ /* synthetic */ void log(String str, String str2) {
        }

        public /* bridge */ /* synthetic */ void logException(String str, String str2, Throwable th) {
        }

        public /* bridge */ /* synthetic */ void reportException(String str, String str2, Throwable th) {
        }
    };
    static final b4c LOG_CONFIGURATION = new b4c() {
        public /* bridge */ /* synthetic */ boolean shouldHideSensitiveInformation() {
            return false;
        }
    };

    public static List<String> collectOpponentExternalIds(ParticipantStore participantStore, ParticipantId participantId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getExternalId() != null && !next.getExternalId().equals(participantId)) {
                arrayList.add(next.getExternalId().id);
            }
        }
        return arrayList;
    }

    public static List<Long> collectOpponentInternalIds(ParticipantStore participantStore, bg1 bg1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getInternalId() != null && !next.getInternalId().equals(bg1)) {
                arrayList.add(Long.valueOf(next.getInternalId().a));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xf1, java.lang.Object] */
    public static xf1 createBitrates() {
        ? obj = new Object();
        obj.a = 204800;
        obj.b = 512000;
        obj.c = 2048000;
        obj.d = 2048000;
        obj.e = 16384;
        obj.f = 32768;
        obj.g = 65536;
        obj.h = 65536;
        return obj;
    }

    public static ag1 createCallParams(ConversationBuilder conversationBuilder) {
        ConversationBuilder conversationBuilder2 = conversationBuilder;
        xf1 xf1 = conversationBuilder2.bitrates;
        if (xf1 == null) {
            xf1 = createBitrates();
        }
        xf1 xf12 = xf1;
        yf1 yf1 = conversationBuilder2.experiments;
        zf1 zf1 = yf1.f;
        if (zf1 == null) {
            zf1 = new zf1(conversationBuilder2.mediaReceivingTimeoutMs);
        }
        zf1 zf12 = zf1;
        imc imc = r2;
        imc imc2 = new imc(new ar0(conversationBuilder2.isMediaAdaptationFeatureEnabledForP2PCall, conversationBuilder2.ptpCallMediaAdaptationConfig), new ar0(conversationBuilder2.isMediaAdaptationFeatureEnabledForGroupCall, conversationBuilder2.groupCallMediaAdaptationConfig), false, 7);
        ag1 ag1 = r2;
        ag1 ag12 = new ag1(xf12, zf12, conversationBuilder2.dnsResolverEnabled, conversationBuilder2.isConsumerUpdateEnabled, conversationBuilder2.isOnDemandTracksEnabled, conversationBuilder2.enableLossRttBadConnectionHandling, conversationBuilder2.additionalWhitelistedCodecPrefixes, conversationBuilder2.isDataChannelScreenshareRecvEnabled, conversationBuilder2.isDataChannelScreenshareSendEnabled, conversationBuilder2.videoTracksCount, conversationBuilder2.fastRecoverEnabled, conversationBuilder2.sessionIdEnabled, conversationBuilder2.isWaitingRoomActivated, conversationBuilder2.isSignalingDefaultValuesFilteringEnabled, conversationBuilder2.isWebRTCCodecFilteringEnabled, conversationBuilder2.audioCodecs, conversationBuilder2.videoCodecs, conversationBuilder2.showLocalVideoInOriginalQuality, conversationBuilder2.isSessionRoomsFeatureEnabled, imc, conversationBuilder2.isAsrOnlineEnabled, yf1, conversationBuilder2.isAudienceModeEnabled, conversationBuilder2.serverTopologySuspendBelowMinBitrate, conversationBuilder2.isFastScreenCaptureEnabled, conversationBuilder2.isDeviceAudioShareEnabled, conversationBuilder2.badNetworkIndicatorConfig);
        ag1 ag13 = ag1;
        ag13.c = true;
        return ag13;
    }
}
