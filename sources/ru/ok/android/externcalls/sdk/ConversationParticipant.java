package ru.ok.android.externcalls.sdk;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private fg1 callParticipant;
    private ParticipantId externalId;
    private bg1 internalId;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private boolean reported;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        bg1 byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(bg1 bg1, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(bg1);
        ParticipantId byInternal = idMappingWrapper.getByInternal(bg1);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(fg1 fg1, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = fg1;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        fg1 fg1 = this.callParticipant;
        if (fg1 != null) {
            return fg1.m;
        }
        return 0;
    }

    public String getAcceptedCallClientType() {
        fg1 fg1 = this.callParticipant;
        if (fg1 == null) {
            return null;
        }
        return fg1.k;
    }

    public String getAcceptedCallPlatform() {
        fg1 fg1 = this.callParticipant;
        if (fg1 == null) {
            return null;
        }
        return fg1.l;
    }

    public rd8 getAudioOptionState() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null ? fg1.b.a : rd8.a;
    }

    public fg1 getCallParticipant() {
        return this.callParticipant;
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public bg1 getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    public List<zc9> getMovies() {
        fg1 fg1 = this.callParticipant;
        return fg1 == null ? Collections.emptyList() : fg1.q;
    }

    public ao9 getNetworkStatus() {
        fg1 fg1 = this.callParticipant;
        return fg1 == null ? ao9.a : fg1.i;
    }

    public rd8 getScreenshareOptionState() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null ? fg1.b.c : rd8.a;
    }

    public rd8 getVideoOptionState() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null ? fg1.b.b : rd8.a;
    }

    public rd8 getWatchTogetherOptionState() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null ? fg1.b.d : rd8.a;
    }

    public boolean hasRegisteredPeers() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && (fg1.j != null || !fg1.f.isEmpty());
    }

    public boolean isAdmin() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.e.contains(eg1.b);
    }

    public boolean isAnimojiEnabled() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.c.g;
    }

    public boolean isAudioEnabled() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.c.e;
    }

    public boolean isCallAccepted() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.b();
    }

    public boolean isConnected() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.g;
    }

    public boolean isCreator() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.e.contains(eg1.a);
    }

    public boolean isPrimarySpeaker() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.c();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.c.b;
    }

    public boolean isTalking() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.callParticipant;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isUseable() {
        /*
            r1 = this;
            boolean r0 = r1.isReported()
            if (r0 == 0) goto L_0x0010
            fg1 r1 = r1.callParticipant
            if (r1 == 0) goto L_0x0010
            bg1 r1 = r1.a
            if (r1 == 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationParticipant.isUseable():boolean");
    }

    public boolean isVideoEnabled() {
        fg1 fg1 = this.callParticipant;
        return fg1 != null && fg1.c.f;
    }

    public void setCallParticipant(fg1 fg1, LocalIdMappings localIdMappings) {
        this.callParticipant = fg1;
        if (fg1 != null) {
            this.internalId = fg1.a;
        }
        localIdMappings.addMappings(this);
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        bg1 bg1;
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder n = rh4.n(i, "updateDeviceIndex ", " for ");
        n.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, n.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        bg1 bg12 = this.internalId;
        if (bg12 != null) {
            this.internalId = new bg1(bg12.b, i, bg12.a);
        }
        fg1 fg1 = this.callParticipant;
        if (!(fg1 == null || (bg1 = fg1.a) == null)) {
            fg1.a = new bg1(bg1.b, i, bg1.a);
            o61 o61 = fg1.p;
            if (o61 != null) {
                fg1.p = new o61(o61.a, o61.b, i);
            }
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(bg1 bg1) {
        this.internalId = bg1;
        fg1 fg1 = this.callParticipant;
        if (fg1 != null) {
            fg1.a = bg1;
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    public String toString() {
        return this.externalId + "|" + this.internalId + "|" + this.callParticipant;
    }
}
