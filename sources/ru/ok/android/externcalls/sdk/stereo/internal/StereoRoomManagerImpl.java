package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002deBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010!J3\u0010#\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010!J3\u0010$\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010!J?\u0010(\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b*\u0010)J?\u0010+\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b+\u0010)J?\u0010,\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00182\u0006\u0010/\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00182\u0006\u0010/\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b?\u0010)J?\u0010@\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0004\b@\u0010)J?\u0010A\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bA\u0010)J#\u0010E\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`D2\n\u0010B\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\n\u0010G\u001a\u00060Cj\u0002`DH\u0002¢\u0006\u0004\bH\u0010IJ/\u0010M\u001a\u00020\u00182\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Cj\u0002`D0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002¢\u0006\u0004\bM\u0010NJA\u0010O\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bO\u0010)JI\u0010P\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d2\u0016\u0010L\u001a\u0012\u0012\b\u0012\u00060Cj\u0002`D\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\bP\u0010QJ1\u0010R\u001a\u00020\u00182\n\u0010'\u001a\u00060%j\u0002`&2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u001a\u0010\\\u001a\u00020[8\u0016X\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R$\u0010a\u001a\u00020;2\u0006\u0010`\u001a\u00020;8\u0016@RX\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lbq1;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "La4c;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idResolver", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "grantRolesRequest", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lvte;", "timeProvider", "<init>", "(La4c;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lvte;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "listener", "Le5f;", "removeListener", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Lk56;Lm56;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lk56;Lm56;)V", "revokePromotion", "rejectPromotionRequest", "unpromoteParticipant", "addListener", "Lmp1;", "event", "onAttendee", "(Lmp1;)V", "Lop1;", "onHandUp", "(Lop1;)V", "Lnp1;", "onFeedback", "(Lnp1;)V", "Lpp1;", "onPromotionUpdated", "(Lpp1;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "grantAdmin", "revokeAdmin", "revokeRoles", "externalId", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lbg1;", "internalId", "getExternalId", "(Lbg1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "", "ids", "block", "resolveIdsAndThen", "(Ljava/util/List;Lk56;)V", "unpromoteParticipantImpl", "withInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;)V", "idNotResolved", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;)V", "La4c;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "handsQueue", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "<set-?>", "isMePromoted", "Z", "()Z", "Companion", "GrantRolesRequest", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StereoRoomManagerImpl implements StereoRoomManager, bq1, StereoRoomListenerManager {
    private static final Companion Companion = new Companion((z84) null);
    @Deprecated
    public static final String LOG_TAG = "StereoRoomManagerImpl";
    /* access modifiers changed from: private */
    public final StereoRoomCommandExecutor commandExecutor;
    private final GrantRolesRequest grantRolesRequest;
    private final StereoRoomHandsQueueImpl handsQueue;
    private final IdMappingWrapper idMappingWrapper;
    private final IdMappingResolver idResolver;
    private boolean isMePromoted;
    /* access modifiers changed from: private */
    public final StereoRoomListenerManagerImpl listenersManager;
    private final a4c logger;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000e\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "revoke", "", "Leg1;", "roles", "Ljava/lang/Runnable;", "onSuccess", "onError", "Le5f;", "grantRoles", "(Lbg1;Z[Leg1;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface GrantRolesRequest {
        void grantRoles(bg1 bg1, boolean z, eg1[] eg1Arr, Runnable runnable, Runnable runnable2);
    }

    public StereoRoomManagerImpl(a4c a4c, ParticipantStore participantStore, IdMappingResolver idMappingResolver, GrantRolesRequest grantRolesRequest2, StereoRoomCommandExecutor stereoRoomCommandExecutor, IdMappingWrapper idMappingWrapper2, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, vte vte) {
        this.logger = a4c;
        this.store = participantStore;
        this.idResolver = idMappingResolver;
        this.grantRolesRequest = grantRolesRequest2;
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idMappingWrapper = idMappingWrapper2;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.handsQueue = new StereoRoomHandsQueueImpl(stereoRoomCommandExecutor, new StereoRoomManagerImpl$handsQueue$1(this), new StereoRoomManagerImpl$handsQueue$2(this), stereoRoomListenerManagerImpl, vte);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getExternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.sdk.id.ParticipantId getExternalId(defpackage.bg1 r2) {
        /*
            r1 = this;
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = r1.store
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r0.getByInternal(r2)
            if (r0 == 0) goto L_0x000e
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = r0.getExternalId()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r1 = r1.idMappingWrapper
            ru.ok.android.externcalls.sdk.id.ParticipantId r0 = r1.getByInternal(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.getExternalId(bg1):ru.ok.android.externcalls.sdk.id.ParticipantId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getInternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.bg1 getInternalId(ru.ok.android.externcalls.sdk.id.ParticipantId r2) {
        /*
            r1 = this;
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = r1.store
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r0.getByExternal(r2)
            if (r0 == 0) goto L_0x000e
            bg1 r0 = r0.getInternalId()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r1 = r1.idMappingWrapper
            bg1 r0 = r1.getByExternal(r2)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.getInternalId(ru.ok.android.externcalls.sdk.id.ParticipantId):bg1");
    }

    /* access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$0(k56 k56) {
        k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final void grantAdmin$lambda$2$lambda$1(m56 m56) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Grant admin failed"));
        }
    }

    private final void idNotResolved(ParticipantId participantId, m56 m56) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Can't resolve internal id of participant " + participantId));
        }
    }

    /* access modifiers changed from: private */
    public final void resolveIdsAndThen(List<bg1> list, k56 k56) {
        ArrayList arrayList = new ArrayList();
        for (bg1 bg1 : list) {
            if (getExternalId(bg1) == null) {
                arrayList.add(bg1);
            }
        }
        if (arrayList.isEmpty()) {
            k56.invoke();
        } else {
            this.idResolver.resolveExternalsByInternalsIds(arrayList, new yh0(9, k56), new yg3((Object) this, (Object) arrayList, (Object) list, (Object) k56, 15));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$10(StereoRoomManagerImpl stereoRoomManagerImpl, List list, List list2, k56 k56) {
        stereoRoomManagerImpl.logger.log(LOG_TAG, "Something went wrong during internal to external id list resolution");
        if (list.size() < list2.size()) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$9(k56 k56) {
        k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$3(k56 k56) {
        k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeAdmin$lambda$5$lambda$4(m56 m56) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Revoke admin failed"));
        }
    }

    private final void revokeRoles(ParticipantId participantId, k56 k56, m56 m56) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        fg1 callParticipant = byExternal != null ? byExternal.getCallParticipant() : null;
        if (callParticipant == null) {
            k56.invoke();
            return;
        }
        List list = callParticipant.e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        eg1 eg1 = eg1.b;
        if (list.contains(eg1)) {
            linkedHashSet.add(eg1);
        }
        eg1 eg12 = eg1.c;
        if (list.contains(eg12)) {
            linkedHashSet.add(eg12);
        }
        if (linkedHashSet.isEmpty()) {
            k56.invoke();
            return;
        }
        GrantRolesRequest grantRolesRequest2 = this.grantRolesRequest;
        bg1 bg1 = callParticipant.a;
        if (bg1 != null) {
            grantRolesRequest2.grantRoles(bg1, true, (eg1[]) linkedHashSet.toArray(new eg1[0]), new yh0(8, k56), new abd(1, m56));
        }
    }

    /* access modifiers changed from: private */
    public static final void revokeRoles$lambda$6(k56 k56) {
        k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final void revokeRoles$lambda$7(m56 m56) {
        if (m56 != null) {
            m56.invoke(new RuntimeException("Revoke all roles failed"));
        }
    }

    /* access modifiers changed from: private */
    public final void unpromoteParticipantImpl(ParticipantId participantId, k56 k56, m56 m56) {
        withInternalId(participantId, m56, new StereoRoomManagerImpl$unpromoteParticipantImpl$1(this, k56, m56));
    }

    private final void withInternalId(ParticipantId participantId, m56 m56, m56 m562) {
        this.idResolver.withInternalId(participantId, new oj3(4, m562), new ewc(this, participantId, m56, 4));
    }

    /* access modifiers changed from: private */
    public static final void withInternalId$lambda$11(m56 m56, bg1 bg1) {
        m56.invoke(bg1);
    }

    /* access modifiers changed from: private */
    public static final void withInternalId$lambda$12(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, m56 m56) {
        stereoRoomManagerImpl.idNotResolved(participantId, m56);
    }

    public void acceptPromotion(k56 k56, m56 m56) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(false), k56, m56);
    }

    public void addListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.addListener(stereoRoomManagerListener);
        stereoRoomManagerListener.onOwnPromotionChanged(isMePromoted());
    }

    public void cancelPromotionRequest(k56 k56, m56 m56) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(true), k56, m56);
    }

    public void grantAdmin(ParticipantId participantId, k56 k56, m56 m56) {
        bg1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, false, new eg1[]{eg1.b}, new yh0(10, k56), new abd(2, m56));
        }
    }

    public boolean isMePromoted() {
        return this.isMePromoted;
    }

    public void onAttendee(mp1 mp1) {
        resolveIdsAndThen(x53.t0(mp1.b, mp1.c), new StereoRoomManagerImpl$onAttendee$1(this, mp1));
    }

    public void onFeedback(np1 np1) {
    }

    public void onHandUp(op1 op1) {
        getHandsQueue().onHandUp(op1);
    }

    public void onMeInWaitingRoomChanged(boolean z) {
        this.isMePromoted = !z;
        this.listenersManager.onOwnPromotionChanged(isMePromoted());
    }

    public void onPromotionUpdated(pp1 pp1) {
        this.listenersManager.onPromotionRequestUpdated(new StereoRoomManagerListener.PromotionRequestUpdated(pp1.a));
    }

    public void promoteParticipant(ParticipantId participantId, k56 k56, m56 m56) {
        withInternalId(participantId, m56, new StereoRoomManagerImpl$promoteParticipant$1(this, k56, m56));
    }

    public void rejectPromotion(k56 k56, m56 m56) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(true), k56, m56);
    }

    public void rejectPromotionRequest(ParticipantId participantId, k56 k56, m56 m56) {
        unpromoteParticipantImpl(participantId, k56, m56);
    }

    public void removeListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.removeListener(stereoRoomManagerListener);
    }

    public void requestPromotion(k56 k56, m56 m56) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(false), k56, m56);
    }

    public void revokeAdmin(ParticipantId participantId, k56 k56, m56 m56) {
        bg1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, true, new eg1[]{eg1.b}, new yh0(11, k56), new abd(3, m56));
        }
    }

    public void revokePromotion(ParticipantId participantId, k56 k56, m56 m56) {
        unpromoteParticipantImpl(participantId, k56, m56);
    }

    public void unpromoteParticipant(ParticipantId participantId, k56 k56, m56 m56) {
        revokeRoles(participantId, new StereoRoomManagerImpl$unpromoteParticipant$1(this, participantId, k56, m56), m56);
    }

    public StereoRoomHandsQueueImpl getHandsQueue() {
        return this.handsQueue;
    }
}
