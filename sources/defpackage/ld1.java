package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: ld1  reason: default package */
public final class ld1 {
    public final je7 a;

    public ld1(je7 je7) {
        this.a = je7;
    }

    public final hg1 a(Conversation conversation, ConversationParticipant conversationParticipant, boolean z, boolean z2) {
        int i;
        boolean z3 = z;
        gg1 b = mqa.b(conversationParticipant.getExternalId());
        rd8 audioOptionState = conversationParticipant.getAudioOptionState();
        rd8 videoOptionState = conversationParticipant.getVideoOptionState();
        rd8 screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean isAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean booleanValue = (!z3 || !conversationParticipant.isScreenCaptureEnabled()) ? false : ((Boolean) ((xuc) this.a.getValue()).b.getValue()).booleanValue();
        llf llf = new llf(conversationParticipant.isVideoEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(olf.a).build(), z3);
        llf llf2 = new llf(conversationParticipant.isScreenCaptureEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(olf.b).build(), false);
        boolean isCallAccepted = conversationParticipant.isCallAccepted();
        long acceptCallEpochMs = conversationParticipant.getAcceptCallEpochMs();
        boolean isConnected = conversationParticipant.isConnected();
        boolean isPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean isTalking = conversationParticipant.isTalking();
        boolean isHandRaised = conversation.getParticipantStatesManager().isHandRaised(conversationParticipant.getExternalId());
        boolean isCreator = conversationParticipant.isCreator();
        boolean isAdmin = conversationParticipant.isAdmin();
        List<zc9> movies = conversationParticipant.getMovies();
        boolean hasRegisteredPeers = conversationParticipant.hasRegisteredPeers();
        boolean z4 = conversation.getParticipantMediaStat(conversationParticipant) != null;
        int ordinal = conversationParticipant.getNetworkStatus().ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else if (ordinal == 2) {
            i = 3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new hg1(b, audioOptionState, videoOptionState, screenshareOptionState, isAudioEnabled, booleanValue, llf, llf2, isCreator, isAdmin, z2, isConnected, isCallAccepted, acceptCallEpochMs, z, isPrimarySpeaker, isTalking, isHandRaised, hasRegisteredPeers, z4, movies, i);
    }
}
