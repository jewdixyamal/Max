package ru.ok.android.externcalls.sdk;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ChatHistoryEntry;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByIdResponse;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.UnwrappingParser;
import ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.AsrManagerImpl;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.capabilities.SignalingCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.HangupHint;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.internal.FeedbackManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.IdUtils;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.WatchTogetherPlayerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;
import ru.ok.tamtam.nano.Protos;

class ConversationImpl implements Conversation {
    private static final float AUDIO_LEVEL_CLAMP_MAX = 10000.0f;
    private static final float AUDIO_LEVEL_MIN = 1000.0f;
    private static final String LOG_TAG = "Conversation";
    private final AddParticipantsCommands addParticipantsCommands;
    private final bi animojiDataSupplier;
    private String anonToken;
    private final q2a api;
    private final OkApiService apiService;
    private final AsrListenerManagerImpl asrListenerManager;
    private final AsrManager asrManager;
    /* access modifiers changed from: private */
    public final AsrOnlineManagerImpl asrOnlineManager;
    /* access modifiers changed from: private */
    public final int audioLevelFrequencyMs;
    /* access modifiers changed from: private */
    public final AudioSampleEnergyCalculator audioSampleEnergyCalculator;
    /* access modifiers changed from: private */
    public boolean audioSampleEnergyCalculatorRegistered;
    /* access modifiers changed from: private */
    public final py0 call;
    private CallInfo callInfo;
    /* access modifiers changed from: private */
    public final ag1 callParams;
    /* access modifiers changed from: private */
    public final Runnable callParticipantResolutionRunnable;
    private final CameraManager cameraManager;
    private final ChatListenerManagerImpl chatListenerManager;
    private final ChatManagerImpl chatManager;
    /* access modifiers changed from: private */
    public final ChatStateListener chatStateListener;
    private final gw3 cidProvider;
    private final ContactCallManagerImpl contactCallManager;
    /* access modifiers changed from: private */
    public final ConversationFeatureListenersImpl conversationFeatureListeners;
    private final ConversationFeatureManagerImpl conversationFeatureManager;
    /* access modifiers changed from: private */
    public ConversationParams conversationParams;
    /* access modifiers changed from: private */
    public final ConversationStats conversationStats;
    private final ConversationFactory creator;
    private final DebugManager debugManager;
    private final DisplayLayoutSender displayLayoutSender;
    private final hc3 disposable;
    private final MultiEventListener eventListener;
    private final ExecutorService executorService;
    private boolean expectedChat;
    private final ExternalIdsResolver externalIdsResolver;
    /* access modifiers changed from: private */
    public final FeedbackListenerManagerImpl feedbackListenerManager;
    private final FeedbackManager feedbackManager;
    private boolean forceRelayPolicy;
    private final boolean hotStart;
    /* access modifiers changed from: private */
    public final IdMappingWrapper idMappingWrapper;
    private volatile boolean inited;
    private final String initialJoinLink;
    private ConversationParticipant initialOpponent;
    private final IdsMapper<ParticipantId, bg1> internalIdsMapper;
    private final InternalIdsResolver internalIdsResolver;
    private final boolean isAnswer;
    /* access modifiers changed from: private */
    public final boolean isCaller;
    private boolean isConcurrent;
    private boolean isConcurrentByApi;
    /* access modifiers changed from: private */
    public final ListenerImpl listener;
    /* access modifiers changed from: private */
    public final LocalIdMappings localIdMappings;
    private final Locale locale;
    /* access modifiers changed from: private */
    public final a4c log;
    private final b4c logConfiguration;
    /* access modifiers changed from: private */
    public final Handler mainThreadHandler;
    /* access modifiers changed from: private */

    /* renamed from: me  reason: collision with root package name */
    public final ConversationParticipant f146me;
    /* access modifiers changed from: private */
    public final MediaConnectionManagerImpl mediaConnectionManager;
    /* access modifiers changed from: private */
    public final MediaMuteListenerManagerImpl mediaMuteListenerManager;
    private final MediaMuteManagerImpl mediaMuteManager;
    private final MicrophoneManager microphoneManager;
    private final NetworkConnectionManager networkConnectionManager;
    private final NoiseSuppressionManager noiseSuppressionManager;
    /* access modifiers changed from: private */
    public final ParticipantStatesManagerImpl participantStatesManager;
    private final ParticipantsUpdater participantsUpdater;
    private final PeerIdGenerator peerIdGenerator;
    private final i7b preferencesHelper;
    private volatile boolean prepared;
    private final RateManagerImpl rateManager;
    private final RecordManagerImpl recordManager;
    private final ScreenCaptureManager screenCaptureManager;
    private final SessionRoomsManagerImpl sessionRoomManager;
    private final SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler;
    private final SessionRoomWatchTogetherHandler sessionRoomWatchTogetherHandler;
    private hrf signalingTransport;
    private final StartCallApiParams startCallApiParams;
    private final ExtLogger stat;
    private final AtomicReference<Conversation.State> state;
    private final Object stateTransitionLock = new Object();
    private final StereoRoomManagerImpl stereoRoomManager;
    /* access modifiers changed from: private */
    public final ParticipantStore store;
    private final UrlSharingListenerManagerImpl urlSharingListenerManager;
    private final UrlSharingManagerImpl urlSharingManager;
    private final String version;
    private final VideoRenderManager videoRenderManager;
    private final pg4 videoRendererProvider;
    /* access modifiers changed from: private */
    public final WaitingRoomParticipants waitingRoomParticipants;
    private volatile boolean wantsApiHangup;
    private volatile boolean wasHungUp;
    /* access modifiers changed from: private */
    public final WatchTogetherListenerManagerImpl watchTogetherListenerManager;
    private final WatchTogetherPlayer watchTogetherPlayer;

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$android$webrtc$CallEvents;

        /* JADX WARNING: Can't wrap try/catch for region: R(79:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(83:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(87:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(91:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|(3:103|104|106)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|106) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0103 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0081 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x00df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x00ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x00f7 */
        static {
            /*
                w51[] r0 = defpackage.w51.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$ok$android$webrtc$CallEvents = r0
                r1 = 1
                r2 = 2
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 13
                int[] r3 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0013 }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                r2 = 3
                r3 = 4
                int[] r4 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0019 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r4 = 5
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x001e }
                r5[r4] = r3     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                int[] r3 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0022 }
                r3[r2] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r2 = 6
                r3 = 18
                int[] r4 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0029 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                r4 = 7
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x002e }
                r5[r1] = r4     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                r1 = 8
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x003a }
                r5 = 9
                r2[r5] = r5     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                r2 = 10
                int[] r5 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0041 }
                r6 = 0
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                r5 = 11
                int[] r6 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0047 }
                r6[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x004d }
                r6 = 12
                r2[r6] = r6     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0051 }
                r2[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                r0 = 14
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0057 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0057 }
            L_0x0057:
                r1 = 15
                r2 = 19
                int[] r4 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r2] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                r4 = 16
                r6 = 20
                int[] r7 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0067 }
                r7[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                r7 = 17
                r8 = 22
                int[] r9 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x006f }
                r9[r8] = r7     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                r9 = 23
                int[] r10 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0075 }
                r10[r9] = r3     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r3 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x007b }
                r10 = 24
                r3[r10] = r2     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0081 }
                r3 = 27
                r2[r3] = r6     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0089 }
                r3 = 21
                r6 = 25
                r2[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x008f }
                r3 = 26
                r2[r3] = r8     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2[r5] = r9     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0099 }
                r3 = 24
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x009f }
                r3 = 25
                r2[r7] = r3     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r3 = 26
                r4 = 28
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00af }
                r3 = 27
                r4 = 32
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r3 = 28
                r4 = 29
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00bf }
                r3 = 29
                r4 = 30
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r3 = 30
                r4 = 31
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00cf }
                r3 = 31
                r4 = 35
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r3 = 32
                r4 = 36
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00df }
                r3 = 33
                r4 = 37
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r3 = 34
                r4 = 38
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00ef }
                r3 = 35
                r4 = 39
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r3 = 36
                r4 = 40
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r2 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x00fd }
                r3 = 37
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x0103 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0103 }
            L_0x0103:
                int[] r0 = $SwitchMap$ru$ok$android$webrtc$CallEvents     // Catch:{ NoSuchFieldError -> 0x010b }
                r1 = 39
                r2 = 21
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.AnonymousClass5.<clinit>():void");
        }
    }

    public class ListenerImpl implements my0, ly0, c71, ke1, jg1, WaitingRoomParticipants.Listener, bnd {
        private boolean callAcceptedFired;
        private boolean callAcceptedForwarded;
        /* access modifiers changed from: private */
        public ConversationEventsListener listener;

        public ListenerImpl(ConversationEventsListener conversationEventsListener) {
            this.listener = conversationEventsListener;
        }

        private void handleMuteParticipant(wi9 wi9) {
            boolean z = wi9.b;
            vi9 vi9 = wi9.a;
            if (!z || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                this.listener.onMuteChanged(vi9);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteChanged(vi9);
        }

        private void handleRolesChanged(fg1 fg1) {
            o61 o61;
            ParticipantId convert;
            bg1 bg1 = fg1.a;
            ConversationParticipant byInternal = bg1 != null ? ConversationImpl.this.store.getByInternal(bg1) : null;
            if (byInternal == null && ConversationImpl.this.callParams.B.j && (o61 = fg1.p) != null && (convert = CallExternalIdConverter.convert(o61)) != null) {
                byInternal = ConversationImpl.this.store.getParticipantById(convert);
            }
            if (byInternal != null) {
                if (byInternal.getCallParticipant() == null) {
                    byInternal.setCallParticipant(fg1, ConversationImpl.this.localIdMappings);
                }
                ConversationEventsListener conversationEventsListener = this.listener;
                if (conversationEventsListener != null) {
                    conversationEventsListener.onRolesChanged(byInternal);
                }
                if ((ConversationImpl.this.f146me.getInternalId() != null && ConversationImpl.this.f146me.getInternalId().equals(fg1.a)) || (ConversationImpl.this.callParams.B.j && byInternal == ConversationImpl.this.f146me)) {
                    ConversationImpl.this.waitingRoomParticipants.onIsMeAdminMayHaveChanged(ConversationImpl.this.isMeCreatorOrAdmin());
                }
            }
        }

        public void onCallParticipantFingerprint(fg1 fg1, long j) {
            fg1 fg12;
            ConversationEventsListener conversationEventsListener;
            if (ConversationImpl.this.call.p1.i().size() == 1) {
                kg1 kg1 = ConversationImpl.this.call.p1;
                int r = kg1.r();
                if (r == 0) {
                    fg12 = null;
                } else if (r == 1) {
                    fg12 = (fg1) kg1.i().iterator().next();
                } else {
                    throw new RuntimeException("group call");
                }
                if (fg12 == fg1 && (conversationEventsListener = this.listener) != null) {
                    conversationEventsListener.onOpponentFingerprintChanged(j);
                }
            }
        }

        public void onCallParticipantNetworkStatusChanged(List<fg1> list) {
            ConversationParticipant byInternal;
            ArrayList arrayList = new ArrayList();
            for (fg1 next : list) {
                bg1 bg1 = next.a;
                if (!(bg1 == null || (byInternal = ConversationImpl.this.store.getByInternal(bg1)) == null)) {
                    if (byInternal.getCallParticipant() == null) {
                        byInternal.setCallParticipant(next, ConversationImpl.this.localIdMappings);
                    }
                    if (ConversationImpl.this.store.getParticipantRoomId(byInternal) == ConversationImpl.this.store.getActiveRoomId()) {
                        arrayList.add(byInternal);
                    }
                }
            }
            if (this.listener != null && !arrayList.isEmpty()) {
                this.listener.onCallParticipantsNetworkStatusChanged(arrayList);
            }
        }

        public void onCustomData(bg1 bg1, JSONObject jSONObject) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onCustomData(jSONObject);
            }
        }

        public void onEvent(py0 py0, w51 w51, Object obj) {
            ConversationImpl.this.log.log(ConversationImpl.LOG_TAG, "EVENT: " + w51);
            if (this.listener != null) {
                boolean z = false;
                ConversationParticipant conversationParticipant = null;
                switch (w51.ordinal()) {
                    case 0:
                        ConversationImpl.this.mediaConnectionManager.onIceConnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onConnected();
                        this.listener.onConnected();
                        if (!ConversationImpl.this.audioSampleEnergyCalculatorRegistered) {
                            ConversationImpl.this.audioSampleEnergyCalculatorRegistered = true;
                            AudioSampleEnergyCalculator W = ConversationImpl.this.audioSampleEnergyCalculator;
                            long V = (long) ConversationImpl.this.audioLevelFrequencyMs;
                            qld qld = py0.k1;
                            qld.getClass();
                            qld.a.execute(new tb2((Object) qld, (Object) W, V, 6));
                            return;
                        }
                        return;
                    case 1:
                        ConversationImpl.this.mediaConnectionManager.onIceDisconnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onDisconnected();
                        this.listener.onDisconnected();
                        return;
                    case 2:
                    case 13:
                        this.listener.onCallEnded(ConversationImpl.this.getCallEndInfo(py0.Q0, obj));
                        ConversationEventsListener conversationEventsListener = this.listener;
                        ConversationEndReason conversationEndReason = (ConversationEndReason) py0.k2.c;
                        if (conversationEndReason == null) {
                            conversationEndReason = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener.onCallEnded(new ConversationEndInfo(conversationEndReason));
                        return;
                    case 3:
                        this.listener.onCallEnded(new ConversationEventsListener.CallEndInfo(ji6.X, Collections.emptySet(), (String) null));
                        py0.k2.E(ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE);
                        ConversationEventsListener conversationEventsListener2 = this.listener;
                        ConversationEndReason conversationEndReason2 = (ConversationEndReason) py0.k2.c;
                        if (conversationEndReason2 == null) {
                            conversationEndReason2 = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener2.onCallEnded(new ConversationEndInfo(conversationEndReason2));
                        return;
                    case 4:
                        this.listener.onLocalMediaChanged();
                        return;
                    case 5:
                        this.listener.onOpponentMediaChanged();
                        return;
                    case 6:
                        this.listener.onCameraChanged();
                        return;
                    case 7:
                        this.listener.onDestroyed(ConversationImpl.this.getDestroyReason());
                        ConversationEventsListener conversationEventsListener3 = this.listener;
                        ConversationEndReason conversationEndReason3 = (ConversationEndReason) py0.k2.c;
                        if (conversationEndReason3 == null) {
                            conversationEndReason3 = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener3.onDestroyed(new ConversationDestroyedInfo(conversationEndReason3));
                        ConversationImpl.this.idMappingWrapper.scheduleWriteCacheToDisk();
                        return;
                    case 8:
                        ConversationImpl.this.resetSignaling();
                        return;
                    case 9:
                        if (!this.callAcceptedForwarded && (!ConversationImpl.this.isCaller || this.callAcceptedFired)) {
                            this.listener.onCallAccepted();
                            this.callAcceptedForwarded = true;
                        }
                        this.callAcceptedFired = true;
                        this.listener.onCallAcceptedForAll();
                        return;
                    case 10:
                        this.listener.onOpponentRegistered();
                        return;
                    case Protos.Attaches.Attach.PRESENT:
                        this.listener.onCameraBusy();
                        return;
                    case Protos.Attaches.Attach.LOCATION:
                        if (obj instanceof x61) {
                            ConversationImpl.this.conversationFeatureListeners.onFeatureSetChanged((x61) obj);
                            return;
                        }
                        return;
                    case Protos.Attaches.Attach.DAILY_MEDIA:
                        if (obj instanceof y61) {
                            ConversationImpl.this.conversationFeatureListeners.onFeaturesPerRoleChanged((y61) obj);
                            return;
                        }
                        return;
                    case 16:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatCreated(((Long) obj).longValue());
                            return;
                        }
                        return;
                    case LangUtils.HASH_SEED:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatUpdated(((Long) obj).longValue());
                            return;
                        }
                        return;
                    case 18:
                        this.listener.onMicrophoneForciblyMuted();
                        return;
                    case 19:
                        py0.E(true);
                        this.listener.onMicChanged(true);
                        return;
                    case 20:
                        py0.E(false);
                        this.listener.onMicChanged(false);
                        return;
                    case 21:
                        if (obj instanceof SignalingErrors$CallIsUnfeasibleError) {
                            this.listener.onCallIsUnfeasibleError((SignalingErrors$CallIsUnfeasibleError) obj);
                            return;
                        }
                        return;
                    case 22:
                        this.listener.onCallSignalingConnected();
                        return;
                    case 23:
                        if (obj instanceof fg1) {
                            handleRolesChanged((fg1) obj);
                            return;
                        }
                        return;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        if (obj instanceof Set) {
                            for (fg1 handleRolesChanged : (Set) obj) {
                                handleRolesChanged(handleRolesChanged);
                            }
                            return;
                        }
                        return;
                    case 25:
                    case 26:
                        bg1 bg1 = obj instanceof bg1 ? (bg1) obj : null;
                        if (bg1 != null) {
                            conversationParticipant = ConversationImpl.this.store.getByInternal(bg1);
                        }
                        ConversationEventsListener conversationEventsListener4 = this.listener;
                        if (w51 == w51.J0) {
                            z = true;
                        }
                        conversationEventsListener4.onPinChanged(conversationParticipant, z);
                        return;
                    case 27:
                        if (obj instanceof wi9) {
                            handleMuteParticipant((wi9) obj);
                            return;
                        }
                        return;
                    case 28:
                        this.listener.onAnonJoinForbiddenChanged(ConversationImpl.this.isAnonJoinForbidden());
                        return;
                    case 29:
                        this.listener.onRecurringChanged(ConversationImpl.this.isRecurring());
                        return;
                    case 30:
                        ConversationImpl.this.feedbackListenerManager.onFeedbackEnabledChanged(ConversationImpl.this.isFeedbackEnabled());
                        return;
                    case 31:
                        ConversationImpl.this.asrOnlineManager.onAsrAvailableChanged(py0.z0.contains(oy0.Y));
                        return;
                    case 32:
                        ConversationImpl.this.waitingRoomParticipants.onWaitingRoomEnabled(ConversationImpl.this.isWaitingRoomEnabled());
                        this.listener.onWaitingRoomEnabledChanged(ConversationImpl.this.isWaitingRoomEnabled());
                        return;
                    case 35:
                        if (obj instanceof vi9) {
                            vi9 vi9 = (vi9) obj;
                            this.listener.onMuteStateInitialized(vi9);
                            ConversationImpl.this.mediaMuteListenerManager.onMuteStateInitialized(vi9);
                            return;
                        }
                        return;
                    case 36:
                        this.listener.onMigratedToServerTopology();
                        ConversationImpl.this.asrOnlineManager.onMigratedToServerCallTopology();
                        return;
                    case LangUtils.HASH_OFFSET:
                        if (obj instanceof String) {
                            this.listener.onJoinLinkUpdated((String) obj);
                            return;
                        }
                        return;
                    case 38:
                        if (obj instanceof kd9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStarted((kd9) obj);
                            return;
                        }
                        return;
                    case 39:
                        if (obj instanceof md9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStatesUpdatedChanged((md9) obj);
                            return;
                        }
                        return;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        if (obj instanceof nd9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStopped((nd9) obj);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        public void onMeInWaitingRoomChanged(boolean z) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onMeInWaitingRoomChanged(z);
            }
        }

        public void onRateCall(JSONObject jSONObject) {
            RateCallData rateCallData;
            ConversationParams d0 = ConversationImpl.this.conversationParams;
            if (d0 != null && (rateCallData = d0.rateCallData) != null) {
                this.listener.onRateCall(rateCallData);
            }
        }

        public void onStateChanged(bg1 bg1, dg1 dg1) {
            if (this.listener != null) {
                ConversationParticipant byInternal = ConversationImpl.this.store.getByInternal(bg1);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(bg1, ConversationImpl.this.idMappingWrapper);
                }
                this.listener.onStateChanged(byInternal, dg1);
                ConversationImpl.this.participantStatesManager.onStateChanged(bg1, dg1);
            }
        }

        public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }

        public void release() {
            this.listener = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: wte} */
    /* JADX WARNING: type inference failed for: r7v3, types: [gw3, hw3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [hc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [vte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConversationImpl(ru.ok.android.externcalls.sdk.ConversationBuilder r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r37.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.stateTransitionLock = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r0.mainThreadHandler = r2
            ru.ok.android.externcalls.sdk.id.local.LocalIdMappings r3 = new ru.ok.android.externcalls.sdk.id.local.LocalIdMappings
            r3.<init>()
            r0.localIdMappings = r3
            ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator r4 = new ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator
            r4.<init>()
            r0.peerIdGenerator = r4
            ru.ok.android.externcalls.sdk.n r4 = new ru.ok.android.externcalls.sdk.n
            r5 = 4
            r4.<init>(r5, r0)
            r0.callParticipantResolutionRunnable = r4
            r4 = 0
            r0.audioSampleEnergyCalculatorRegistered = r4
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            ru.ok.android.externcalls.sdk.Conversation$State r6 = ru.ok.android.externcalls.sdk.Conversation.State.None
            r5.<init>(r6)
            r0.state = r5
            ru.ok.android.externcalls.sdk.ConversationFactory r6 = r1.creator
            r0.creator = r6
            q2a r6 = r1.api
            r0.api = r6
            java.util.concurrent.ExecutorService r7 = r1.executorService
            r0.executorService = r7
            java.lang.String r7 = r1.version
            r0.version = r7
            boolean r11 = r1.isCaller
            r0.isCaller = r11
            boolean r7 = r1.isAnswer
            r0.isAnswer = r7
            hw3 r7 = new hw3
            java.lang.String r8 = r1.cid
            if (r8 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            java.lang.String r8 = ""
        L_0x005c:
            r7.<init>()
            r7.a = r8
            r0.cidProvider = r7
            boolean r8 = r1.hotStart
            r0.hotStart = r8
            boolean r8 = r1.forceRelayPolicy
            r0.forceRelayPolicy = r8
            hc3 r8 = new hc3
            r8.<init>()
            r0.disposable = r8
            ru.ok.android.externcalls.sdk.log.ExtLogger r15 = r1.stat
            r0.stat = r15
            i7b r14 = new i7b
            android.content.Context r8 = r1.context
            r14.<init>(r8)
            r0.preferencesHelper = r14
            a4c r13 = r1.log
            r0.log = r13
            b4c r12 = r1.logConfiguration
            r0.logConfiguration = r12
            ru.ok.android.externcalls.sdk.id.IdMappingWrapper r10 = r1.idMappingWrapper
            r0.idMappingWrapper = r10
            java.lang.String r8 = r1.joinLink
            r0.initialJoinLink = r8
            ru.ok.android.externcalls.sdk.ConversationParticipant r8 = r1.f145me
            r0.f146me = r8
            r9 = 1
            r8.setReported(r9)
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r4 = new ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore
            r4.<init>(r8, r3)
            r0.store = r4
            int r9 = r1.audioLevelFrequencyMs
            r0.audioLevelFrequencyMs = r9
            ag1 r9 = ru.ok.android.externcalls.sdk.CallUtil.createCallParams(r38)
            r0.callParams = r9
            r18 = r9
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r9 = r37.createStartCallApiParams(r38)
            r0.startCallApiParams = r9
            r28 = r2
            bi r2 = r1.animojiRenderProvider
            r0.animojiDataSupplier = r2
            r19 = r14
            fg1 r14 = new fg1
            r20 = r10
            bg1 r10 = r8.getInternalId()
            r23 = r12
            r12 = 0
            r14.<init>(r10, r12, r12, r12)
            r8.setCallParticipant(r14, r3)
            ru.ok.android.externcalls.sdk.ConversationParticipant r3 = r1.initialOpponent
            if (r3 == 0) goto L_0x00dd
            ru.ok.android.externcalls.sdk.id.ParticipantId r3 = r3.getExternalId()
            ru.ok.android.externcalls.sdk.id.ParticipantId r8 = r8.getExternalId()
            boolean r3 = java.util.Objects.equals(r3, r8)
            if (r3 != 0) goto L_0x00dd
            ru.ok.android.externcalls.sdk.ConversationParticipant r12 = r1.initialOpponent
        L_0x00dd:
            r0.initialOpponent = r12
            if (r12 == 0) goto L_0x00eb
            r4.addToActiveSessionRoom(r12)
            ru.ok.android.externcalls.sdk.ConversationParticipant r3 = r0.initialOpponent
            r8 = 1
            r3.setReported(r8)
            goto L_0x00ec
        L_0x00eb:
            r8 = 1
        L_0x00ec:
            java.util.concurrent.CopyOnWriteArraySet r3 = new java.util.concurrent.CopyOnWriteArraySet
            r3.<init>()
            ru.ok.android.externcalls.sdk.events.ConversationEventsListener r10 = r1.eventListener
            if (r10 == 0) goto L_0x00f8
            r3.add(r10)
        L_0x00f8:
            ru.ok.android.externcalls.sdk.events.MultiEventListener r12 = new ru.ok.android.externcalls.sdk.events.MultiEventListener
            r12.<init>(r3)
            r0.eventListener = r12
            ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl r3 = new ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl
            r3.<init>(r12)
            r0.listener = r3
            wte r10 = new wte
            r10.<init>()
            r29 = r6
            py0 r6 = new py0
            r17 = r10
            android.content.Context r10 = r1.context
            r24 = r12
            boolean r12 = r1.isJoined
            ru.ok.android.externcalls.sdk.ConversationParticipant r8 = r0.initialOpponent
            if (r8 == 0) goto L_0x011e
            r16 = 1
            goto L_0x0120
        L_0x011e:
            r16 = 0
        L_0x0120:
            boolean r26 = r9.isVideo()
            gy9 r8 = r1.cameraCapturerFactory
            if (r8 != 0) goto L_0x012d
            gk3 r8 = new gk3
            r8.<init>(r13)
        L_0x012d:
            r30 = r8
            boolean r8 = r0.forceRelayPolicy
            r21 = r8
            dnc r8 = r1.rotationProvider
            r22 = r8
            ru.ok.android.externcalls.analytics.CallAnalyticsSender r8 = r1.analyticsSender
            r25 = r8
            yuc r8 = r1.screenCapturePermissionProvider
            r27 = r8
            r8 = r6
            r31 = r18
            r9 = r10
            r32 = r17
            r1 = r20
            r10 = r31
            r33 = r1
            r20 = r23
            r1 = r24
            r34 = r13
            r13 = r14
            r35 = r19
            r14 = r7
            r36 = r15
            r15 = r16
            r16 = r26
            r17 = r36
            r18 = r34
            r19 = r20
            r20 = r30
            r23 = r2
            r24 = r32
            r26 = r35
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.call = r6
            ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl r2 = new ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl
            r2.<init>(r6)
            r0.screenCaptureManager = r2
            ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl r2 = new ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl
            ru.ok.android.externcalls.sdk.a r8 = new ru.ok.android.externcalls.sdk.a
            r9 = 4
            r8.<init>(r0, r9)
            ru.ok.android.externcalls.sdk.a r9 = new ru.ok.android.externcalls.sdk.a
            r10 = 5
            r9.<init>(r0, r10)
            r2.<init>(r6, r8, r9)
            r0.cameraManager = r2
            ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl r2 = new ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl
            jw3 r8 = new jw3
            r9 = 0
            r8.<init>(r5, r9)
            ru.ok.android.externcalls.sdk.renderer.ConversationRenderers r9 = new ru.ok.android.externcalls.sdk.renderer.ConversationRenderers
            r9.<init>()
            r2.<init>(r8, r6, r9, r4)
            r0.videoRendererProvider = r2
            r0.videoRenderManager = r2
            ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl r2 = new ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl
            ru.ok.android.externcalls.sdk.a r8 = new ru.ok.android.externcalls.sdk.a
            r9 = 6
            r8.<init>(r0, r9)
            r2.<init>(r6, r8)
            r0.microphoneManager = r2
            ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl r2 = new ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl
            r2.<init>(r6)
            r0.noiseSuppressionManager = r2
            ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl r2 = new ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl
            r2.<init>(r6)
            r0.networkConnectionManager = r2
            ru.ok.android.externcalls.sdk.signaling.SignalingProvider r8 = r37.createSignalingProvider()
            ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl r9 = new ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl
            r12 = r9
            r13 = r6
            r14 = r36
            r15 = r7
            r16 = r34
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r0.debugManager = r9
            ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger r7 = new ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger
            r7.<init>(r8)
            ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl r1 = r0.createParticipantStatesManager(r4, r7, r1)
            r0.participantStatesManager = r1
            ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver r7 = r37.createIdMappingResolver()
            r9 = r33
            ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants r3 = r0.createWaitingRoomParticipants(r9, r7, r3)
            r0.waitingRoomParticipants = r3
            r3 = r32
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl r10 = r0.createStereoRoomManager(r8, r7, r3)
            r0.stereoRoomManager = r10
            r10 = r9
            r9 = r38
            ru.ok.android.externcalls.sdk.id.mapping.IdsMapper<ru.ok.android.externcalls.sdk.id.ParticipantId, bg1> r11 = r9.internalIdsMapper
            if (r11 == 0) goto L_0x01f2
            goto L_0x01fd
        L_0x01f2:
            ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper r11 = new ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper
            a4c r12 = r9.log
            r13 = r29
            r14 = r31
            r11.<init>(r13, r14, r12)
        L_0x01fd:
            r0.internalIdsMapper = r11
            ru.ok.android.externcalls.sdk.id.InternalIdsResolver r11 = r0.createInternalIdsResolver(r4, r10, r11)
            r0.internalIdsResolver = r11
            ru.ok.android.externcalls.sdk.id.mapping.IdsMapper<bg1, ru.ok.android.externcalls.sdk.id.ParticipantId> r11 = r9.externalIdsMapper
            ru.ok.android.externcalls.sdk.id.ExternalIdsResolver r11 = r0.createExternalIdsResolver(r4, r10, r11)
            r0.externalIdsResolver = r11
            ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands r11 = new ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands
            jw3 r12 = new jw3
            r13 = 0
            r12.<init>(r5, r13)
            r11.<init>(r8, r6, r10, r12)
            r0.addParticipantsCommands = r11
            ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl r5 = new ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl
            r5.<init>(r4)
            r0.watchTogetherListenerManager = r5
            ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl r6 = new ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl
            r6.<init>(r4)
            ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer r5 = r0.createWatchTogetherPlayer(r5, r8)
            r0.watchTogetherPlayer = r5
            ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl r11 = new ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl
            r11.<init>(r0, r4, r7, r10)
            r0.feedbackListenerManager = r11
            ru.ok.android.externcalls.sdk.feedback.FeedbackManager r11 = r0.createFeedbackManager(r11, r8)
            r0.feedbackManager = r11
            ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl r11 = new ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl
            r11.<init>(r4)
            r0.asrListenerManager = r11
            ru.ok.android.externcalls.sdk.asr.AsrManager r11 = r0.createAsrManager(r11, r4, r8)
            r0.asrManager = r11
            ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl r11 = new ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl
            boolean r12 = r9.answerAsContact
            r11.<init>(r4, r12)
            r0.contactCallManager = r11
            ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl r11 = r0.createAsrOnlineManager(r4)
            r0.asrOnlineManager = r11
            ru.ok.android.externcalls.sdk.chat.ChatStateListener r11 = r9.chatStateListener
            r0.chatStateListener = r11
            ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl r11 = r37.createConversationFeatureListeners()
            r0.conversationFeatureListeners = r11
            ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl r11 = r0.createFeatureManager(r8)
            r0.conversationFeatureManager = r11
            ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl r6 = r0.createSessionRoomManager(r6, r1, r7, r8)
            r0.sessionRoomManager = r6
            ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater r6 = r0.createParticipantsUpdater(r1)
            r0.participantsUpdater = r6
            ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl r6 = r0.createRecordManager(r7, r10, r8)
            r0.recordManager = r6
            java.util.Locale r6 = r9.locale
            r0.locale = r6
            ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler r6 = new ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler
            r6.<init>(r4, r5)
            r0.sessionRoomWatchTogetherHandler = r6
            ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler r1 = r0.createParticipantStatesHandler(r1)
            r0.sessionRoomParticipantStatesHandler = r1
            ru.ok.android.externcalls.sdk.stat.ConversationStats r1 = r0.createConversationStats(r3)
            r0.conversationStats = r1
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl r1 = r37.createUrlSharingListenerManager()
            r0.urlSharingListenerManager = r1
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl r1 = r37.createUrlSharingManager()
            r0.urlSharingManager = r1
            ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl r1 = r0.createChatListenerManager(r4)
            r0.chatListenerManager = r1
            ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl r1 = r0.createChatManager(r4, r1)
            r0.chatManager = r1
            ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl r1 = r37.createMediaMuteListenerManager()
            r0.mediaMuteListenerManager = r1
            ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl r1 = r0.createMediaMuteManager(r8, r1)
            r0.mediaMuteManager = r1
            ru.ok.android.externcalls.sdk.api.OkApiService r1 = r9.okApiService
            r0.apiService = r1
            ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl r1 = new ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl
            jy2 r3 = new jy2
            r5 = 7
            r3.<init>(r5, r4)
            ru.ok.android.externcalls.sdk.q r4 = new ru.ok.android.externcalls.sdk.q
            r5 = 1
            r4.<init>(r0, r5)
            r1.<init>(r3, r4)
            r0.displayLayoutSender = r1
            ru.ok.android.externcalls.sdk.ConversationImpl$1 r1 = new ru.ok.android.externcalls.sdk.ConversationImpl$1
            r3 = r28
            r1.<init>(r3)
            r0.audioSampleEnergyCalculator = r1
            ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl r1 = new ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl
            a4c r3 = r9.log
            ru.ok.android.externcalls.sdk.a r4 = new ru.ok.android.externcalls.sdk.a
            r5 = 7
            r4.<init>(r0, r5)
            ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings r5 = r9.mediaConnectionSettings
            r1.<init>(r3, r4, r5)
            r0.mediaConnectionManager = r1
            r2.plusAssign(r1)
            ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl r1 = new ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r2 = r9.rttRateHintConfig
            r3 = r34
            r1.<init>(r3, r2)
            r0.rateManager = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.<init>(ru.ok.android.externcalls.sdk.ConversationBuilder):void");
    }

    private void assertInited() {
        if (!this.inited) {
            throw new IllegalStateException("Conversation not initialized");
        } else if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private void assertPrepared() {
        if (!this.prepared) {
            throw new IllegalStateException("Conversation not ready");
        } else if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private String configureSignalingCapabilities() {
        SignalingCapabilities signalingCapabilities = new SignalingCapabilities();
        signalingCapabilities.setScreenTrackProducerEnabled(true);
        signalingCapabilities.setScreenTrackConsumerEnabled(true);
        signalingCapabilities.setVideoTracksEnabled(this.callParams.g > 0);
        signalingCapabilities.setWaitingHallEnabled(this.callParams.n);
        signalingCapabilities.setFilterDefaultValues(this.callParams.o);
        signalingCapabilities.setMuteNotificationForAdmin(true);
        signalingCapabilities.setWatchTogetherEnabled(true);
        signalingCapabilities.setSessionRoomsEnabled(this.callParams.t);
        this.animojiDataSupplier.getClass();
        signalingCapabilities.setAnimojiEnabled(false);
        signalingCapabilities.setContactCallsEnabled(true);
        signalingCapabilities.setAudienceModeEnabled(this.callParams.y);
        return signalingCapabilities.getSignalingCapabilitiesValue();
    }

    private AsrManager createAsrManager(AsrListenerManager asrListenerManager2, ParticipantStore participantStore, SignalingProvider signalingProvider) {
        return new AsrManagerImpl(new AsrCommandsExecutorImpl(signalingProvider, participantStore), asrListenerManager2);
    }

    private AsrOnlineManagerImpl createAsrOnlineManager(ParticipantStore participantStore) {
        return new AsrOnlineManagerImpl(new AsrOnlineCommandsExecutorImpl(new a(this, 2), createSignalingProvider()), new AsrOnlineListenerManagerImpl(participantStore), new a(this, 3));
    }

    private ChatListenerManagerImpl createChatListenerManager(ParticipantStore participantStore) {
        return new ChatListenerManagerImpl(participantStore);
    }

    private ChatManagerImpl createChatManager(ParticipantStore participantStore, ChatListenerManagerImpl chatListenerManagerImpl) {
        return new ChatManagerImpl(new ChatCommandExecutorImpl(createSignalingProvider(), participantStore), chatListenerManagerImpl);
    }

    private ConversationFeatureListenersImpl createConversationFeatureListeners() {
        return new ConversationFeatureListenersImpl();
    }

    private Prepare createConversationPrepare(ConversationParams conversationParams2) {
        return new Prepare(this.apiService, this.cidProvider, conversationParams2, this.internalIdsResolver, this.externalIdsResolver, this.startCallApiParams, this.peerIdGenerator, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.callParams);
    }

    private ConversationStats createConversationStats(vte vte) {
        py0 py0 = this.call;
        Objects.requireNonNull(py0);
        return new ConversationStats(new vx0(py0, 5), this.stat, this.cidProvider, getCallType(), vte);
    }

    private ExternalIdsResolver createExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper2, IdsMapper<bg1, ParticipantId> idsMapper) {
        MultiEventListener multiEventListener = this.eventListener;
        Objects.requireNonNull(multiEventListener);
        v02 v02 = new v02(29, multiEventListener);
        yv3 yv3 = new yv3(5);
        LocalIdMappings localIdMappings2 = this.localIdMappings;
        if (idsMapper == null) {
            idsMapper = new InternalToExternalIdsMapper(this.api, this.callParams, this.log);
        }
        return new ExternalIdsResolver(participantStore, idMappingWrapper2, v02, yv3, localIdMappings2, idsMapper);
    }

    private ConversationFeatureManagerImpl createFeatureManager(SignalingProvider signalingProvider) {
        return new ConversationFeatureManagerImpl(new ConversationFeatureCommandExecutorImpl(signalingProvider), this.conversationFeatureListeners);
    }

    private FeedbackManager createFeedbackManager(FeedbackListenerManager feedbackListenerManager2, SignalingProvider signalingProvider) {
        return new FeedbackManagerImpl(new FeedbackCommandsExecutorImpl(signalingProvider), feedbackListenerManager2);
    }

    private IdMappingResolver createIdMappingResolver() {
        return new IdMappingResolver() {
            public void resolveExternalsByInternalsIds(List<bg1> list, Runnable runnable, Runnable runnable2) {
                ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
            }

            public void withInternalId(ParticipantId participantId, rj3 rj3, Runnable runnable) {
                ConversationImpl.this.withInternalId(participantId, rj3, runnable);
            }
        };
    }

    private InternalIdsResolver createInternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper2, IdsMapper<ParticipantId, bg1> idsMapper) {
        return new InternalIdsResolver(participantStore, idMappingWrapper2, new yv3(4), this.localIdMappings, idsMapper);
    }

    private MediaMuteListenerManagerImpl createMediaMuteListenerManager() {
        return new MediaMuteListenerManagerImpl();
    }

    private MediaMuteManagerImpl createMediaMuteManager(SignalingProvider signalingProvider, MediaMuteListenerManager mediaMuteListenerManager2) {
        a aVar = new a(this, 1);
        q qVar = new q(this, 0);
        ParticipantStore participantStore = this.store;
        Objects.requireNonNull(participantStore);
        return new MediaMuteManagerImpl(new MediaMuteCommandExecutorImpl(signalingProvider, aVar, qVar, new es3(3, participantStore)), mediaMuteListenerManager2);
    }

    private SessionRoomParticipantStatesHandler createParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        return new SessionRoomParticipantStatesHandler(participantStatesManagerImpl, new a(this, 0));
    }

    private ParticipantStatesManagerImpl createParticipantStatesManager(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        return new ParticipantStatesManagerImpl(participantStore, participantStateChanger, conversationEventsListener, this.mainThreadHandler);
    }

    private ParticipantsUpdater createParticipantsUpdater(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        MultiEventListener multiEventListener = this.eventListener;
        ParticipantStore participantStore = this.store;
        IdMappingWrapper idMappingWrapper2 = this.idMappingWrapper;
        LocalIdMappings localIdMappings2 = this.localIdMappings;
        AnonymousClass2 r6 = new ParticipantsUpdater.MappingUpdater() {
            public void reportIfApplicable() {
                ConversationImpl.this.reportIfApplicable();
            }

            public void triggerMapUpdate() {
                ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
                ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
            }
        };
        ConversationParticipant conversationParticipant = this.f146me;
        Objects.requireNonNull(conversationParticipant);
        return new ParticipantsUpdater(multiEventListener, participantStore, participantStatesManagerImpl, idMappingWrapper2, localIdMappings2, r6, new v02(28, conversationParticipant), this.callParams);
    }

    private RecordManagerImpl createRecordManager(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper2, SignalingProvider signalingProvider) {
        return new RecordManagerImpl(this.log, this.store, idMappingResolver, idMappingWrapper2, signalingProvider, this.eventListener);
    }

    private SessionRoomsManagerImpl createSessionRoomManager(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingResolver idMappingResolver, SignalingProvider signalingProvider) {
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = new SessionRoomCommandExecutorImpl(participantStatesManagerImpl, signalingProvider);
        SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = new SessionRoomParticipantsDataProviderImpl(this.store, sessionRoomListenerManagerImpl, idMappingResolver, this.idMappingWrapper);
        return new SessionRoomsManagerImpl(sessionRoomListenerManagerImpl, sessionRoomCommandExecutorImpl, new SessionRoomAdminCommandExecutorImpl(signalingProvider, sessionRoomParticipantsDataProviderImpl), sessionRoomParticipantsDataProviderImpl);
    }

    private SignalingProvider createSignalingProvider() {
        py0 py0 = this.call;
        Objects.requireNonNull(py0);
        return new zx0(py0);
    }

    private StartCallApiParams createStartCallApiParams(ConversationBuilder conversationBuilder) {
        return new StartCallApiParams(conversationBuilder.domainId, conversationBuilder.payload, conversationBuilder.isWatchTogetherEnabledForAll, conversationBuilder.hasVideo, conversationBuilder.clientType, conversationBuilder.multipleDevicesEnabled, conversationBuilder.chatId);
    }

    private StereoRoomManagerImpl createStereoRoomManager(SignalingProvider signalingProvider, IdMappingResolver idMappingResolver, vte vte) {
        return new StereoRoomManagerImpl(this.log, this.store, idMappingResolver, new p(this), new StereoRoomCommandExecutorImpl(signalingProvider, this.log), this.idMappingWrapper, new StereoRoomListenerManagerImpl(), vte);
    }

    private UrlSharingListenerManagerImpl createUrlSharingListenerManager() {
        return new UrlSharingListenerManagerImpl(createIdMappingResolver(), this.idMappingWrapper, this.log);
    }

    private UrlSharingManagerImpl createUrlSharingManager() {
        return new UrlSharingManagerImpl(new UrlSharingCommandsExecutorImpl(createSignalingProvider()), this.urlSharingListenerManager);
    }

    private WaitingRoomParticipants createWaitingRoomParticipants(IdMappingWrapper idMappingWrapper2, IdMappingResolver idMappingResolver, final ListenerImpl listenerImpl) {
        return new WaitingRoomParticipants(new WaitingRoomParticipants.Listener() {
            public void onMeInWaitingRoomChanged(boolean z) {
                listenerImpl.onMeInWaitingRoomChanged(z);
            }

            public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
                listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }, idMappingWrapper2, idMappingResolver, this.log);
    }

    private WatchTogetherPlayer createWatchTogetherPlayer(WatchTogetherListenerManager watchTogetherListenerManager2, SignalingProvider signalingProvider) {
        py0 py0 = this.call;
        Objects.requireNonNull(py0);
        return new WatchTogetherPlayerImpl(new WatchTogetherCommandExecutorImpl(signalingProvider, new vx0(py0, 6)), watchTogetherListenerManager2);
    }

    private void doStartCall() {
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    this.log.log(LOG_TAG, "attempted to continue init after release, ignoring");
                    return;
                }
                assertPrepared();
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null) {
                    py0 py0 = this.call;
                    conversationParticipant.setCallParticipant(py0.p1.j(conversationParticipant.getInternalId()), this.localIdMappings);
                }
                py0 py02 = this.call;
                pg4 pg4 = this.videoRendererProvider;
                if (py02.i()) {
                    py02.v1 = pg4;
                    if (pg4 == null) {
                        py02.t1.s();
                    }
                }
                if (!this.isCaller) {
                    this.call.B(this.startCallApiParams.isVideo());
                }
                this.inited = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private <T> void executeOnBg(k56 k56, rj3 rj3, Runnable runnable) {
        this.disposable.a(CallsThreadUtilsKt.executeOnIoThread(k56, rj3, runnable));
    }

    private <P extends ActionParams, R extends ActionResult> iqd executeWithState(Conversation.State state2, Conversation.State state3, Action<P, R> action, P p) {
        AtomicReference<Conversation.State> atomicReference = this.state;
        while (!atomicReference.compareAndSet(state2, state3)) {
            if (atomicReference.get() != state2) {
                return iqd.f(new IllegalStateException("State " + this.state.get() + " doesn't match wanted state " + state2));
            }
        }
        return action.execute(p);
    }

    /* access modifiers changed from: private */
    public ConversationEventsListener.CallEndInfo getCallEndInfo(ji6 ji6, Object obj) {
        String str;
        HashSet hashSet;
        if (obj instanceof hi6) {
            hi6 hi6 = (hi6) obj;
            hashSet = new HashSet();
            if (hi6.a.contains(gi6.a)) {
                hashSet.add(HangupHint.SHOULD_RECONNECT);
            }
            str = hi6.b;
        } else {
            hashSet = null;
            str = null;
        }
        return new ConversationEventsListener.CallEndInfo(ji6, hashSet, str);
    }

    private fg1 getCallParticipantByExternalId(ParticipantId participantId) {
        ConversationParticipant byExternalWithAnyDevice = this.store.getByExternalWithAnyDevice(participantId);
        if (byExternalWithAnyDevice != null) {
            return byExternalWithAnyDevice.getCallParticipant();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public bg1 getCallParticipantId(ParticipantId participantId) {
        ConversationParticipant byExternal;
        fg1 callParticipant;
        if (participantId == null || (byExternal = this.store.getByExternal(participantId)) == null || (callParticipant = byExternal.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.a;
    }

    @Deprecated
    private ConversationParticipant getParticipantByExternalId(String str) {
        return this.store.getByExternalWithAnyDevice(ParticipantId.authorized(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$25(rj3 rj3, JSONObject jSONObject) throws JSONException {
        if (rj3 != null) {
            rj3.accept(jSONObject.optString("error", ""));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$26(Boolean bool, boolean z, rj3 rj3, Collection collection) {
        this.call.j((bg1) collection.iterator().next(), bool, Boolean.valueOf(z), new k(rj3, 0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$27(rj3 rj3, JSONObject jSONObject) throws JSONException {
        if (rj3 != null) {
            rj3.accept(jSONObject.optString("error", ""));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$28(boolean z, rj3 rj3, InternalIdResponse internalIdResponse) throws Throwable {
        this.call.j(new bg1(1, 0, internalIdResponse.okId), Boolean.valueOf(z), Boolean.FALSE, new k(rj3, 2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$29(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "failed to add participant", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipants$30(Boolean bool, boolean z, m56 m56, m56 m562, Collection collection) {
        this.addParticipantsCommands.addParticipants(collection, bool, z, m56, m562);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ py0 lambda$createAsrOnlineManager$5() {
        return this.call;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ py0 lambda$createAsrOnlineManager$6() {
        return this.call;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ py0 lambda$createMediaMuteManager$4() {
        return this.call;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$0() {
        return Boolean.valueOf(this.inited);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$1() {
        return Boolean.valueOf(this.prepared);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$2() {
        return Boolean.valueOf(this.prepared);
    }

    /* access modifiers changed from: private */
    public e5f lambda$new$3(List list) {
        py0 py0 = this.call;
        py0.getClass();
        py0.V0.log("OKRTCCall", "updateDisplayLayout " + list);
        if (py0.i()) {
            py0.t1.T(list);
            py0.E1.getClass();
            die die = py0.b2;
            ((wte) ((vte) die.b)).getClass();
            muc.a().b(new tb2((Object) die, (Object) list, SystemClock.elapsedRealtime(), 4));
        }
        return e5f.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performConfroomJoin$11(ConversationParams conversationParams2, rj3 rj3, rj3 rj32, JoinByIdResponse joinByIdResponse) throws Throwable {
        this.forceRelayPolicy |= joinByIdResponse.getP2pForbidden();
        performConnect(joinByIdResponse.getEndpoint(), conversationParams2, rj3, rj32);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$19(String str) {
        this.recordManager.onRecordError(new nh1(str));
    }

    /* access modifiers changed from: private */
    public void lambda$performConnect$20() {
        if (this.listener.listener != null) {
            hangup(new ii6(ji6.a));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$21() {
        this.mainThreadHandler.post(new n(0, this));
    }

    /* access modifiers changed from: private */
    public void lambda$performConnect$22(rj3 rj3, py0 py0) {
        this.conversationStats.connectedToSignalingStat.onConnectedToSignaling();
        this.isConcurrent = py0.R0;
        this.state.getAndSet(Conversation.State.Connected);
        ExtLogger extLogger = this.stat;
        d4a simpleBuilderAny = ExtLogger.simpleBuilderAny("callForceRelay");
        simpleBuilderAny.c("vcid", ((hw3) this.cidProvider).a);
        simpleBuilderAny.c("param", this.forceRelayPolicy ? "1" : "0");
        extLogger.log(simpleBuilderAny.a());
        if (rj3 != null) {
            rj3.accept(this);
        }
        jb9.e();
        py0.b1 = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$7(boolean z, rj3 rj3, boolean z2, rj3 rj32, Prepare.PrepareResult prepareResult) throws Throwable {
        ArrayList arrayList = new ArrayList(prepareResult.getUnresolvedParticipantIds());
        if (!arrayList.isEmpty()) {
            this.eventListener.onCallStartResolutionFailed(arrayList);
        }
        if (!z) {
            boolean z3 = !arrayList.isEmpty();
            Iterator<ConversationParticipant> it = this.store.iterator();
            int i = 0;
            while (it.hasNext()) {
                ConversationParticipant next = it.next();
                boolean equals = Objects.equals(next.getExternalId(), this.f146me.getExternalId());
                boolean z4 = next.getInternalId() != null;
                z3 &= !z4 || equals;
                i += (!z4 || equals) ? 0 : 1;
            }
            if (z3) {
                rj3.accept(new CallFailedException("no call targets left"));
                return;
            } else if (i == 1) {
                Iterator<ConversationParticipant> it2 = this.store.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ConversationParticipant next2 = it2.next();
                    if (next2.getInternalId() != null && !Objects.equals(next2.getExternalId(), this.f146me.getExternalId())) {
                        this.initialOpponent = next2;
                        break;
                    }
                }
            }
        }
        ConversationParams conversationParams2 = prepareResult.getConversationParams();
        if (conversationParams2 == null && !this.isCaller) {
            rj3.accept(new NullPointerException("Conversation parameters object MUST not be null for a not calling participant"));
        } else if (this.isCaller) {
            runStartConversation(conversationParams2, z, z2, rj32, rj3);
        } else if (this.expectedChat) {
            performConfroomJoin(conversationParams2, rj32, rj3);
        } else {
            performConnect(conversationParams2.endpoint, conversationParams2, rj32, rj3);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareJoinByLink$9(rj3 rj3, rj3 rj32, Prepare.PrepareResult prepareResult) throws Throwable {
        ConversationParams conversationParams2 = prepareResult.getConversationParams();
        if (conversationParams2 == null) {
            rj3.accept(new NullPointerException("Conversation parameters object MUST not be null"));
            return;
        }
        this.forceRelayPolicy |= conversationParams2.isP2PForbidden;
        performConnect(conversationParams2.endpoint, conversationParams2, rj32, rj3);
        this.call.F0 = this.initialJoinLink;
    }

    /* access modifiers changed from: private */
    public void lambda$promoteParticipant$32(boolean z, bg1 bg1) {
        py0 py0 = this.call;
        py0.Z.d(f46.r(bg1, z), false, new ey0(py0, bg1, 1), py0.o);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$queryChatHistory$38(Conversation.ChatHistoryCallback chatHistoryCallback, JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray("messages");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            ChatHistoryEntry[] chatHistoryEntryArr = new ChatHistoryEntry[length];
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    bg1 E = f46.E(optJSONObject);
                    ConversationParticipant byInternal = this.store.getByInternal(E);
                    if (byInternal == null) {
                        byInternal = ConversationParticipant.fromInternal(E, this.idMappingWrapper);
                    }
                    chatHistoryEntryArr[i] = new ChatHistoryEntry(optJSONObject.optString("message", ""), optJSONObject.optBoolean("direct", false), byInternal);
                }
            }
            chatHistoryCallback.onResponse(chatHistoryEntryArr);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshParams$13(Runnable runnable, ConversationParams conversationParams2) throws Throwable {
        this.conversationParams = conversationParams2;
        this.prepared = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeJoinLink$37(Runnable runnable, rj3 rj3, Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            runnable.run();
        } else {
            rj3.accept(new AssertionError("unreachable"));
        }
    }

    /* access modifiers changed from: private */
    public void lambda$removeParticipant$31(boolean z, bg1 bg1) {
        py0 py0 = this.call;
        py0.getClass();
        py0.V0.log("OKRTCCall", "removeParticipant, participant=" + bg1);
        if (py0.i()) {
            fg1 j = py0.p1.j(bg1);
            die die = py0.S1.g;
            Long g = ((ece) die.o).g();
            if (g != null) {
                long longValue = g.longValue();
                HashMap hashMap = new HashMap();
                qz7 qz7 = (qz7) die.a;
                hashMap.put("vcid", ((d4c) qz7.b).conversationId);
                hashMap.put("stat_time_delta", String.valueOf(longValue));
                hashMap.put("network_type", jb9.b((ConnectivityManager) die.b, (TelephonyManager) die.c));
                die.k(bg1, j, hashMap);
                ((d4c) qz7.b).log(d4c.COLLECTOR_WEBRTC, "callRemoveParticipant", (Map) hashMap);
            }
            try {
                if (bg1.equals(py0.I1)) {
                    py0.I1 = null;
                    py0.k(w51.I0, (Object) null);
                }
                rod rod = py0.Z;
                JSONObject jSONObject = new JSONObject();
                f46.d(bg1, jSONObject, false);
                jSONObject.put("ban", z);
                rod.h(f46.b(jSONObject, "remove-participant"), new ey0(py0, bg1, 0));
            } catch (JSONException e) {
                throw new RuntimeException("Remove participant command failed", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveExternalsByInternalsIds$39(Runnable runnable, Throwable th) throws Throwable {
        if (runnable != null) {
            runnable.run();
        }
        this.log.reportException(LOG_TAG, "failed to get mapping", th);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.hostname;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean lambda$runStartConversation$15(org.webrtc.PeerConnection.IceServer r1) {
        /*
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.hostname
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "turn"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.lambda$runStartConversation$15(org.webrtc.PeerConnection$IceServer):boolean");
    }

    /* access modifiers changed from: private */
    public void lambda$runStartConversation$17(rj3 rj3, ConversationParams conversationParams2, rj3 rj32, CallInfo callInfo2) throws Throwable {
        String str;
        this.callInfo = callInfo2;
        boolean z = true;
        this.wantsApiHangup = true;
        if (!callInfo2.isConcurrent && ((str = callInfo2.id) == null || str.equals(((hw3) this.cidProvider).a))) {
            z = false;
        }
        this.isConcurrentByApi = z;
        this.forceRelayPolicy |= callInfo2.isP2PForbidden;
        String str2 = callInfo2.id;
        if (str2 != null) {
            gw3 gw3 = this.cidProvider;
            if (gw3 instanceof hw3) {
                ((hw3) gw3).a = str2;
            }
        }
        String str3 = callInfo2.endpoint;
        if (str3 == null) {
            rj3.accept(new IllegalStateException("couldn't create call endpoint is null"));
            return;
        }
        if (conversationParams2 == null) {
            conversationParams2 = callInfo2.toParams();
        }
        performConnect(str3, conversationParams2, rj32, rj3);
        this.call.F0 = callInfo2.joinLink;
    }

    /* access modifiers changed from: private */
    public void lambda$runStartConversation$18(rj3 rj3, Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder("ok.api.error.");
        sb.append(th.getClass().getSimpleName());
        if (th instanceof ApiInvocationException) {
            ApiInvocationException apiInvocationException = (ApiInvocationException) th;
            if (apiInvocationException.a == 1104) {
                ExternErrorParser.ErrorDescription parse = new ExternErrorParser(this.log).parse(apiInvocationException);
                if (parse.getErrorCode() != 0) {
                    sb.append('.');
                    sb.append(parse.getErrorCode());
                }
                rj3.accept(new ExternApiException("external service failed", apiInvocationException, parse.getErrorCode(), parse.getExtendedError()));
            } else {
                rj3.accept(th);
            }
        } else {
            rj3.accept(th);
        }
        this.stat.logSimple(e0e.callError, ((hw3) this.cidProvider).a, sb.toString());
    }

    /* access modifiers changed from: private */
    public void lambda$setCallOptionEnabled$23(boolean z, oy0 oy0, rj3 rj3, JSONObject jSONObject) throws JSONException {
        if (z) {
            py0 py0 = this.call;
            py0.z0.add(oy0);
            py0.a(oy0);
        } else {
            py0 py02 = this.call;
            py02.z0.remove(oy0);
            py02.a(oy0);
        }
        if (rj3 != null) {
            rj3.accept((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCallOptionEnabled$24(rj3 rj3, JSONObject jSONObject) throws JSONException {
        if (rj3 != null) {
            rj3.accept(jSONObject.optString("error"));
        }
    }

    /* access modifiers changed from: private */
    public static void lambda$setMuteState$40(rod rod, boolean z, bg1 bg1) {
        try {
            rod.i(f46.b(new JSONObject().put("eId", (Object) bg1.c()).put("muteTarget", z), "switch-micro"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalId$33(ParticipantId participantId) {
        return this.internalIdsMapper.map(Collections.singleton(participantId));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalId$34(ParticipantId participantId, rj3 rj3, Map map) {
        bg1 bg1 = (bg1) map.get(participantId);
        if (bg1 != null) {
            rj3.accept(bg1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalIds$35(ArrayList arrayList) {
        return this.internalIdsMapper.map(arrayList);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalIds$36(rj3 rj3, ArrayList arrayList, Map map) {
        if (rj3 != null) {
            arrayList.addAll(map.values());
            rj3.accept(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public void onSignalingRefresh() {
        hrf hrf;
        ConversationParams conversationParams2;
        if (!this.call.A0 && (hrf = this.signalingTransport) != null && (conversationParams2 = this.conversationParams) != null) {
            String str = conversationParams2.token;
            hrf.n.onRestart();
            hrf.g.execute(new erf(hrf, str, 1));
        }
    }

    private void performConfroomJoin(ConversationParams conversationParams2, rj3 rj3, rj3 rj32) {
        hc3 hc3 = this.disposable;
        iqd retryApiCallForJoining = RetryKt.retryApiCallForJoining(this.apiService.joinToConversation(((hw3) this.cidProvider).a, this.peerIdGenerator.generatePeerId(), this.startCallApiParams), this.callParams.B.h, this.log);
        t tVar = new t(this, conversationParams2, rj3, rj32);
        i iVar = new i(rj32, 3);
        retryApiCallForJoining.getClass();
        iq1 iq1 = new iq1(tVar, 2, iVar);
        retryApiCallForJoining.k(iq1);
        hc3.a(iq1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void performConnect(java.lang.String r30, ru.ok.android.externcalls.sdk.api.ConversationParams r31, defpackage.rj3 r32, defpackage.rj3 r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            r2 = r33
            java.lang.Object r3 = r0.stateTransitionLock
            monitor-enter(r3)
            boolean r4 = r29.isDestroyed()     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0014
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r0 = move-exception
            goto L_0x0207
        L_0x0014:
            if (r1 != 0) goto L_0x002b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = "No conversation parameters in performConnect()"
            r1.<init>(r4)     // Catch:{ all -> 0x0011 }
            a4c r0 = r0.log     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = "Conversation"
            java.lang.String r5 = "An attempt to connect without conversation parameters"
            r0.reportException(r4, r5, r1)     // Catch:{ all -> 0x0011 }
            r2.accept(r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x002b:
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r4 = r0.startCallApiParams     // Catch:{ all -> 0x0011 }
            boolean r4 = r4.isMultipleDevicesEnabled()     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0043
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r0.f146me     // Catch:{ all -> 0x0011 }
            int r5 = r1.deviceIndex     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.id.local.LocalIdMappings r6 = r0.localIdMappings     // Catch:{ all -> 0x0011 }
            r4.setDeviceIndex(r5, r6)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r4 = r0.store     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r5 = r0.f146me     // Catch:{ all -> 0x0011 }
            r4.updateMe(r5)     // Catch:{ all -> 0x0011 }
        L_0x0043:
            r0.conversationParams = r1     // Catch:{ all -> 0x0011 }
            java.util.concurrent.atomic.AtomicReference<ru.ok.android.externcalls.sdk.Conversation$State> r4 = r0.state     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r5 = ru.ok.android.externcalls.sdk.Conversation.State.Preparing     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r6 = ru.ok.android.externcalls.sdk.Conversation.State.Starting     // Catch:{ all -> 0x0011 }
        L_0x004b:
            boolean r7 = r4.compareAndSet(r5, r6)     // Catch:{ all -> 0x0011 }
            if (r7 == 0) goto L_0x01c9
            ru.ok.android.externcalls.sdk.stat.ConversationStats r2 = r0.conversationStats     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat r2 = r2.startedStat     // Catch:{ all -> 0x0011 }
            r2.onConversationStarted()     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.f146me     // Catch:{ all -> 0x0011 }
            fg1 r2 = r2.getCallParticipant()     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r0.f146me     // Catch:{ all -> 0x0011 }
            bg1 r4 = r4.getInternalId()     // Catch:{ all -> 0x0011 }
            r2.a = r4     // Catch:{ all -> 0x0011 }
            boolean r4 = r0.isCaller     // Catch:{ all -> 0x0011 }
            if (r4 != 0) goto L_0x006e
            boolean r4 = r0.expectedChat     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0073
        L_0x006e:
            kpa r4 = defpackage.fg1.r     // Catch:{ all -> 0x0011 }
            r2.e(r4)     // Catch:{ all -> 0x0011 }
        L_0x0073:
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.initialOpponent     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0088
            bg1 r2 = r2.getInternalId()     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0088
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r0.initialOpponent     // Catch:{ all -> 0x0011 }
            bg1 r4 = r4.getInternalId()     // Catch:{ all -> 0x0011 }
            r2.H(r4)     // Catch:{ all -> 0x0011 }
        L_0x0088:
            boolean r2 = r0.isConcurrentByApi     // Catch:{ all -> 0x0011 }
            r4 = 1
            if (r2 == 0) goto L_0x0091
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            r2.R0 = r4     // Catch:{ all -> 0x0011 }
        L_0x0091:
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl r5 = r0.listener     // Catch:{ all -> 0x0011 }
            java.util.ArrayList r2 = r2.M0     // Catch:{ all -> 0x0011 }
            r2.add(r5)     // Catch:{ all -> 0x0011 }
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationImpl$ListenerImpl r5 = r0.listener     // Catch:{ all -> 0x0011 }
            r2.w1 = r5     // Catch:{ all -> 0x0011 }
            r29.subscribeCallListeners()     // Catch:{ all -> 0x0011 }
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            r0.setupSessionRoomWatchTogetherHandler(r2)     // Catch:{ all -> 0x0011 }
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            r0.setupSessionRoomHandHandler(r2)     // Catch:{ all -> 0x0011 }
            py0 r2 = r0.call     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.r r5 = new ru.ok.android.externcalls.sdk.r     // Catch:{ all -> 0x0011 }
            r5.<init>(r0)     // Catch:{ all -> 0x0011 }
            r2.d1 = r5     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.f146me     // Catch:{ all -> 0x0011 }
            bg1 r2 = r2.getInternalId()     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x00cc
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.f146me     // Catch:{ all -> 0x0011 }
            bg1 r2 = r2.getInternalId()     // Catch:{ all -> 0x0011 }
            long r5 = r2.a     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0011 }
        L_0x00ca:
            r8 = r2
            goto L_0x00ce
        L_0x00cc:
            r2 = 0
            goto L_0x00ca
        L_0x00ce:
            gw3 r2 = r0.cidProvider     // Catch:{ all -> 0x0011 }
            hw3 r2 = (defpackage.hw3) r2     // Catch:{ all -> 0x0011 }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x0011 }
            java.lang.String r7 = r1.token     // Catch:{ all -> 0x0011 }
            int r9 = r1.deviceIndex     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = r0.version     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r2 = r0.startCallApiParams     // Catch:{ all -> 0x0011 }
            java.lang.String r12 = r2.getClientType()     // Catch:{ all -> 0x0011 }
            java.lang.String r14 = r29.configureSignalingCapabilities()     // Catch:{ all -> 0x0011 }
            java.lang.Integer r15 = r1.ispAsNo     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = r1.ispAsOrg     // Catch:{ all -> 0x0011 }
            java.lang.String r13 = r1.locCc     // Catch:{ all -> 0x0011 }
            java.lang.String r10 = r1.locReg     // Catch:{ all -> 0x0011 }
            java.util.Locale r5 = r0.locale     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r4 = r0.startCallApiParams     // Catch:{ all -> 0x0011 }
            boolean r4 = r4.isMultipleDevicesEnabled()     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0105
            a4c r4 = r0.log     // Catch:{ all -> 0x0011 }
            r16 = r5
            java.lang.String r5 = "Conversation"
            r17 = r10
            java.lang.String r10 = "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6"
            r4.log(r5, r10)     // Catch:{ all -> 0x0011 }
            r4 = 6
            goto L_0x010a
        L_0x0105:
            r16 = r5
            r17 = r10
            r4 = 5
        L_0x010a:
            java.lang.String r5 = "conversation id must not be null"
            java.util.Objects.requireNonNull(r6, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "token must not be null"
            java.util.Objects.requireNonNull(r7, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "endpointBaseUrl must not be null"
            r10 = r30
            java.util.Objects.requireNonNull(r10, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "appVersion must not be null"
            java.util.Objects.requireNonNull(r11, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "clientType must not be null"
            java.util.Objects.requireNonNull(r12, r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "capabilities must not be null"
            java.util.Objects.requireNonNull(r14, r5)     // Catch:{ all -> 0x0011 }
            a25 r28 = new a25     // Catch:{ all -> 0x0011 }
            r19 = r16
            r5 = r28
            r18 = r17
            r10 = r30
            r17 = r13
            r13 = r4
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0011 }
            u2a r26 = new u2a     // Catch:{ all -> 0x0011 }
            r26.<init>()     // Catch:{ all -> 0x0011 }
            ag1 r2 = r0.callParams     // Catch:{ all -> 0x0011 }
            zf1 r2 = r2.b     // Catch:{ all -> 0x0011 }
            r2.getClass()     // Catch:{ all -> 0x0011 }
            r2 = 30000(0x7530, float:4.2039E-41)
            long r4 = (long) r2     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.n r2 = new ru.ok.android.externcalls.sdk.n     // Catch:{ all -> 0x0011 }
            r6 = 2
            r2.<init>(r6, r0)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.stat.ConversationStats r6 = r0.conversationStats     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat r6 = r6.wsSignalingStat     // Catch:{ all -> 0x0011 }
            java.util.concurrent.ExecutorService r7 = r0.executorService     // Catch:{ all -> 0x0011 }
            a4c r8 = r0.log     // Catch:{ all -> 0x0011 }
            b4c r9 = r0.logConfiguration     // Catch:{ all -> 0x0011 }
            ag1 r10 = r0.callParams     // Catch:{ all -> 0x0011 }
            zf1 r10 = r10.b     // Catch:{ all -> 0x0011 }
            r10.getClass()     // Catch:{ all -> 0x0011 }
            ag1 r10 = r0.callParams     // Catch:{ all -> 0x0011 }
            boolean r10 = r10.l     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "Signaling statistics is required"
            java.util.Objects.requireNonNull(r6, r11)     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "executor is required"
            java.util.Objects.requireNonNull(r7, r11)     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "log is required"
            java.util.Objects.requireNonNull(r8, r11)     // Catch:{ all -> 0x0011 }
            java.lang.String r11 = "log configuration is required"
            java.util.Objects.requireNonNull(r9, r11)     // Catch:{ all -> 0x0011 }
            hrf r11 = new hrf     // Catch:{ all -> 0x0011 }
            r18 = r11
            r19 = r4
            r21 = r2
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r27 = r10
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0011 }
            r0.signalingTransport = r11     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.b r2 = new ru.ok.android.externcalls.sdk.b     // Catch:{ all -> 0x0011 }
            r4 = 1
            r7 = r32
            r2.<init>(r0, r7, r4)     // Catch:{ all -> 0x0011 }
            py0 r4 = r0.call     // Catch:{ all -> 0x0011 }
            java.util.List<org.webrtc.PeerConnection$IceServer> r1 = r1.stunTurnServers     // Catch:{ all -> 0x0011 }
            boolean r5 = r0.hotStart     // Catch:{ all -> 0x0011 }
            r4.r(r11, r1, r5)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants r1 = r0.waitingRoomParticipants     // Catch:{ all -> 0x0011 }
            py0 r4 = r0.call     // Catch:{ all -> 0x0011 }
            r1.setCall(r4)     // Catch:{ all -> 0x0011 }
            r1 = 1
            r0.wantsApiHangup = r1     // Catch:{ all -> 0x0011 }
            r0.prepared = r1     // Catch:{ all -> 0x0011 }
            java.util.concurrent.atomic.AtomicReference<ru.ok.android.externcalls.sdk.Conversation$State> r1 = r0.state     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r4 = ru.ok.android.externcalls.sdk.Conversation.State.Connecting     // Catch:{ all -> 0x0011 }
            r1.set(r4)     // Catch:{ all -> 0x0011 }
            py0 r0 = r0.call     // Catch:{ all -> 0x0011 }
            r0.getClass()     // Catch:{ all -> 0x0011 }
            defpackage.jb9.e()     // Catch:{ all -> 0x0011 }
            boolean r1 = r0.w0     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x01c5
            r2.a(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x01c7
        L_0x01c5:
            r0.b1 = r2     // Catch:{ all -> 0x0011 }
        L_0x01c7:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x01c9:
            r10 = r30
            r7 = r32
            java.lang.Object r8 = r4.get()     // Catch:{ all -> 0x0011 }
            if (r8 == r5) goto L_0x004b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0011 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0011 }
            r4.<init>()     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = "Wrong state within performConnect(): "
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            java.util.concurrent.atomic.AtomicReference<ru.ok.android.externcalls.sdk.Conversation$State> r5 = r0.state     // Catch:{ all -> 0x0011 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0011 }
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = " expected state is "
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            ru.ok.android.externcalls.sdk.Conversation$State r5 = ru.ok.android.externcalls.sdk.Conversation.State.Preparing     // Catch:{ all -> 0x0011 }
            r4.append(r5)     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0011 }
            r1.<init>(r4)     // Catch:{ all -> 0x0011 }
            a4c r0 = r0.log     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = "Conversation"
            java.lang.String r5 = "An attempt to connect while conversation not in preparing state"
            r0.reportException(r4, r5, r1)     // Catch:{ all -> 0x0011 }
            r2.accept(r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            return
        L_0x0207:
            monitor-exit(r3)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.performConnect(java.lang.String, ru.ok.android.externcalls.sdk.api.ConversationParams, rj3, rj3):void");
    }

    private zl4 refreshParams(Runnable runnable, rj3 rj3) {
        iqd retryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(this.apiService.getConversationParams(this.anonToken, (String) null), this.callParams.B.h, this.log);
        o oVar = new o(this, runnable, 0);
        i iVar = new i(rj3, 2);
        retryApiCallForBackgroundWork.getClass();
        iq1 iq1 = new iq1(oVar, 2, iVar);
        retryApiCallForBackgroundWork.k(iq1);
        return iq1;
    }

    /* access modifiers changed from: private */
    public void reportIfApplicable() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (!(next.isReported() || next.getExternalId() == null || this.listener.listener == null)) {
                next.setReported(true);
                arrayList.add(next);
                this.store.addToActiveSessionRoom(next);
            }
        }
        if (this.listener.listener != null && !arrayList.isEmpty()) {
            this.listener.listener.onParticipantsAdded(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public void resetSignaling() {
        this.disposable.a(refreshParams(new n(3, this), new nj3(1)));
    }

    /* access modifiers changed from: private */
    public void resolveExternalsByInternalsIds(List<bg1> list, Runnable runnable, Runnable runnable2) {
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        za3 h = this.externalIdsResolver.resolveIds(list).h(ce.a());
        Objects.requireNonNull(runnable);
        iq1 iq1 = new iq1(new o(this, runnable2, 1), 0, new e5(6, runnable));
        h.i(iq1);
        this.disposable.a(iq1);
    }

    /* access modifiers changed from: private */
    public void resolveUnknownExternals() {
        resolveExternalsByInternalsIds(this.externalIdsResolver.collectExternalIdResolutionCandidates(), new n(1, this), (Runnable) null);
    }

    private void runStartConversation(ConversationParams conversationParams2, boolean z, boolean z2, rj3 rj3, rj3 rj32) {
        String join = conversationParams2 == null ? "" : TextUtils.join(",", new i77(new i77(conversationParams2.stunTurnServers, new Object(), 1), new Object(), 0));
        iqd retryApiCallForOutgoing = RetryKt.retryApiCallForOutgoing(this.callParams.B.j ? this.apiService.startConversationWithExternalIds(join, ((hw3) this.cidProvider).a, z, this.initialOpponent, CallUtil.collectOpponentExternalIds(this.store, this.f146me.getExternalId()), this.startCallApiParams) : this.apiService.startConversation(join, ((hw3) this.cidProvider).a, z, this.initialOpponent, CallUtil.collectOpponentInternalIds(this.store, this.f146me.getInternalId()), this.startCallApiParams), this.callParams.B.h, this.log);
        t tVar = new t(this, rj32, conversationParams2, rj3);
        b bVar = new b(this, rj32, 0);
        retryApiCallForOutgoing.getClass();
        iq1 iq1 = new iq1(tVar, 2, bVar);
        retryApiCallForOutgoing.k(iq1);
        this.disposable.a(iq1);
    }

    private void setupSessionRoomHandHandler(py0 py0) {
        py0.W1.a(this.sessionRoomParticipantStatesHandler);
        py0.W1.a.a.add(this.sessionRoomParticipantStatesHandler);
    }

    private void setupSessionRoomWatchTogetherHandler(py0 py0) {
        py0.W1.a(this.sessionRoomWatchTogetherHandler);
    }

    private void subscribeCallListeners() {
        id1 id1 = this.call.W1;
        id1.b.a.add(this.listener);
        id1 id12 = this.call.W1;
        id12.e.a.add(this.listener);
        id1 id13 = this.call.W1;
        ((CopyOnWriteArraySet) id13.c.b).add(this.participantsUpdater);
        id1 id14 = this.call.W1;
        id14.a.a.add(this.participantsUpdater);
        this.call.W1.a(this.participantsUpdater);
        this.call.W1.a(this.sessionRoomManager);
        this.call.W1.a(this.recordManager);
        this.call.W1.a(this.asrListenerManager);
        id1 id15 = this.call.W1;
        id15.i.a.add(this.recordManager);
        id1 id16 = this.call.W1;
        id16.j.a.add(this.feedbackListenerManager);
        id1 id17 = this.call.W1;
        id17.m.a.add(this.asrListenerManager);
        id1 id18 = this.call.W1;
        id18.n.a.add(this.listener);
        id1 id19 = this.call.W1;
        id19.o.a.add(this.asrOnlineManager);
        id1 id110 = this.call.W1;
        id110.k.a.add(this.contactCallManager);
        id1 id111 = this.call.W1;
        id111.p.a.add(this.listener);
        id1 id112 = this.call.W1;
        id112.d.a.add(this.waitingRoomParticipants);
        id1 id113 = this.call.W1;
        id113.d.a.add(this.stereoRoomManager);
        id1 id114 = this.call.W1;
        id114.q.a.add(this.urlSharingListenerManager);
        this.call.W1.a(this.urlSharingListenerManager);
        id1 id115 = this.call.W1;
        id115.r.a.add(this.chatListenerManager);
        id1 id116 = this.call.W1;
        ((CopyOnWriteArraySet) id116.s.b).add(this.mediaMuteListenerManager);
        id1 id117 = this.call.W1;
        id117.t.a.add(this.mediaConnectionManager);
        id1 id118 = this.call.W1;
        id118.u.a.add(this.rateManager);
    }

    /* access modifiers changed from: private */
    public void updateTalkingParticipants() {
        py0 py0 = this.call;
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant next : this.store.getParticipants()) {
            fg1 callParticipant = next.getCallParticipant();
            boolean z = getAdjustedAudioLevel(next) > 0.0f;
            if (callParticipant != null && z) {
                arrayList.add(callParticipant.a);
            }
        }
        py0.p1.q(arrayList);
    }

    private void withInternalId(ParticipantId participantId, rj3 rj3) {
        withInternalId(participantId, rj3, (Runnable) null);
    }

    private void withInternalIds(Collection<ParticipantId> collection, rj3 rj3) {
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (ParticipantId next : collection) {
            bg1 byExternal = this.idMappingWrapper.getByExternal(next);
            if (byExternal == null) {
                arrayList.add(next);
            } else {
                arrayList2.add(byExternal);
            }
        }
        if (!arrayList.isEmpty()) {
            executeOnBg(new e(this, arrayList, 0), new f(rj3, arrayList2), (Runnable) null);
        } else if (rj3 != null) {
            try {
                rj3.accept(arrayList2);
            } catch (Exception e) {
                this.log.reportException(LOG_TAG, "unable to use internal id", e);
            }
        }
    }

    public void addEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.add(conversationEventsListener);
    }

    public void addParticipant(ParticipantId participantId, Boolean bool, boolean z, rj3 rj3) {
        withInternalIds(Collections.singletonList(participantId), new c(this, bool, z, rj3));
    }

    public void addParticipantByLink(String str, Runnable runnable, rj3 rj3) {
        this.addParticipantsCommands.addParticipantByLink(str, runnable, rj3);
    }

    public void addParticipants(Collection<ParticipantId> collection, Boolean bool, boolean z, m56 m56, m56 m562) {
        withInternalIds(collection, new s(this, bool, z, m56, m562));
    }

    public void changeMyState(Map<String, String> map) {
        changeMyState(map, (qod) null);
    }

    public void connect() {
        assertInited();
        py0 py0 = this.call;
        if (py0.i() && !py0.i2) {
            py0.i2 = true;
            if (!py0.n1.c) {
                ji9 ji9 = py0.y1;
                if (ji9.e) {
                    ji9.e = false;
                    ji9.a();
                }
            }
            if (!py0.n1.d) {
                ji9 ji92 = py0.y1;
                if (ji92.f) {
                    ji92.f = false;
                    ji92.a();
                }
            }
            if (nsa.A().g && py0.y1.e) {
                if (!py0.n1.c && py0.n1.a() && py0.n1.c) {
                    qld qld = py0.k1;
                    qld.getClass();
                    qld.a.execute(new pld(qld, 0));
                } else if (nsa.A().g) {
                    qld qld2 = py0.k1;
                    qld2.getClass();
                    qld2.a.execute(new pld(qld2, 0));
                }
                qld qld3 = py0.k1;
                qld3.getClass();
                qld3.a.execute(new old(qld3, false, 0));
            }
            py0.V0.log("OKRTCCall", "createPeerConnectionIfReady");
            jb9.e();
            if (py0.P0) {
                py0.V0.log("OKRTCCall", "   peerConnectionCreated");
            } else if (py0.L0 != null) {
                py0.V0.log("OKRTCCall", "createPeerConnectionIfReady impl");
                py0.P0 = true;
                py0.c1 = true;
                py0.c(py0.t1);
                if (py0.n1.d) {
                    py0.k(w51.Z, (Object) null);
                }
            } else {
                throw new IllegalStateException("No ice servers");
            }
            py0.V0.log("OKRTCCall", "apply local media settings once connection requested");
            d dVar = py0.l1;
            dVar.X.a.add(dVar);
            dVar.i(dVar.X);
            py0.x();
        }
    }

    public void createJoinLink(rj3 rj3, rj3 rj32) {
        hc3 hc3 = this.disposable;
        iqd retryApiCallForFastWorkRequired = RetryKt.retryApiCallForFastWorkRequired(this.apiService.createJoinLink(((hw3) this.cidProvider).a), this.callParams.B.h, this.log);
        Objects.requireNonNull(rj3);
        iw3 iw3 = new iw3(rj3, 0);
        Objects.requireNonNull(rj32);
        iw3 iw32 = new iw3(rj32, 1);
        retryApiCallForFastWorkRequired.getClass();
        iq1 iq1 = new iq1(iw3, 2, iw32);
        retryApiCallForFastWorkRequired.k(iq1);
        hc3.a(iq1);
    }

    public float getAdjustedAudioLevel(ConversationParticipant conversationParticipant) {
        l60 audioLevel = getAudioLevel(conversationParticipant);
        if (audioLevel == null) {
            return 0.0f;
        }
        float f = audioLevel.b;
        if (conversationParticipant == this.f146me) {
            f *= 5.0f;
        }
        if (f < AUDIO_LEVEL_MIN) {
            return 0.0f;
        }
        if (f > AUDIO_LEVEL_CLAMP_MAX) {
            return 1.0f;
        }
        return f / 9000.0f;
    }

    public rh getAnimojiControl() {
        return this.call.n2;
    }

    public AsrManager getAsrManager() {
        return this.asrManager;
    }

    public AsrOnlineManager getAsrOnlineManager() {
        return this.asrOnlineManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.l60 getAudioLevel(ru.ok.android.externcalls.sdk.ConversationParticipant r3) {
        /*
            r2 = this;
            ru.ok.android.externcalls.sdk.ConversationParticipant r0 = r2.f146me
            if (r0 != r3) goto L_0x000b
            ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator r2 = r2.audioSampleEnergyCalculator
            l60 r2 = r2.getProcessor()
            return r2
        L_0x000b:
            py0 r2 = r2.call
            fg1 r3 = r3.getCallParticipant()
            boolean r0 = r2.A0
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r2 = r1
            goto L_0x002b
        L_0x0018:
            s04 r2 = r2.j1
            if (r3 == 0) goto L_0x0027
            java.lang.Object r2 = r2.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            java.lang.Object r2 = r2.get(r3)
            wk8 r2 = (defpackage.wk8) r2
            goto L_0x002b
        L_0x0027:
            r2.getClass()
            goto L_0x0016
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            l60 r1 = r2.a
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.getAudioLevel(ru.ok.android.externcalls.sdk.ConversationParticipant):l60");
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    public Conversation.CallType getCallType() {
        return this.isAnswer ? Conversation.CallType.Incoming : this.isCaller ? Conversation.CallType.Outgoing : Conversation.CallType.Join;
    }

    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    public rx1 getCameraStatProvider() {
        tv1 tv1;
        kq7 kq7 = this.call.l1.z0;
        if (kq7 == null || (tv1 = kq7.r) == null) {
            return null;
        }
        CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) tv1.c.b;
        if (cameraVideoCapturer instanceof jra) {
            return ((jra) cameraVideoCapturer).b;
        }
        return null;
    }

    public ChatManager getChatManager() {
        return this.chatManager;
    }

    public ContactCallManager getContactCallManager() {
        return this.contactCallManager;
    }

    public String getConversationId() {
        return ((hw3) this.cidProvider).a;
    }

    public DebugManager getDebugManager() {
        return this.debugManager;
    }

    public String getDestroyReason() {
        return this.call.v0;
    }

    public DisplayLayoutSender getDisplayLayoutSender() {
        return this.displayLayoutSender;
    }

    public ConversationFeatureManager getFeatureManager() {
        return this.conversationFeatureManager;
    }

    public FeedbackManager getFeedbackManager() {
        return this.feedbackManager;
    }

    public String getJoinLink() {
        String str = this.call.F0;
        if (str != null) {
            return str;
        }
        CallInfo callInfo2 = this.callInfo;
        return callInfo2 != null ? callInfo2.joinLink : this.initialJoinLink;
    }

    public ConversationParticipant getMe() {
        return this.f146me;
    }

    public MediaConnectionManager getMediaConnectionManager() {
        return this.mediaConnectionManager;
    }

    public MediaMuteManager getMediaMuteManager() {
        return this.mediaMuteManager;
    }

    public MicrophoneManager getMicrophoneManager() {
        return this.microphoneManager;
    }

    public NetworkConnectionManager getNetworkConnectionManager() {
        return this.networkConnectionManager;
    }

    public NoiseSuppressionManager getNoiseSuppressionManager() {
        return this.noiseSuppressionManager;
    }

    public ConversationParticipant getOpponent() {
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next != this.f146me) {
                return next;
            }
        }
        return null;
    }

    public wk8 getParticipantMediaStat(ConversationParticipant conversationParticipant) {
        py0 py0 = this.call;
        fg1 callParticipant = conversationParticipant.getCallParticipant();
        if (py0.A0) {
            return null;
        }
        s04 s04 = py0.j1;
        if (callParticipant != null) {
            return (wk8) ((Hashtable) s04.d).get(callParticipant);
        }
        s04.getClass();
        return null;
    }

    public ParticipantStatesManager getParticipantStatesManager() {
        return this.participantStatesManager;
    }

    public ParticipantCollection getParticipants() {
        return this.store;
    }

    public ConversationParticipant getPinnedParticipant() {
        bg1 bg1;
        py0 py0 = this.call;
        zad zad = py0.p1.k;
        if (zad instanceof yad) {
            tad x = py0.X1.x((yad) zad);
            bg1 = x == null ? null : x.f;
        } else {
            bg1 = py0.I1;
        }
        if (bg1 != null) {
            return this.store.getByInternal(bg1);
        }
        return null;
    }

    public RateManager getRateManager() {
        return this.rateManager;
    }

    public RecordManager getRecordManager() {
        return this.recordManager;
    }

    public ji6 getRejectReason() {
        return this.call.Q0;
    }

    public ScreenCaptureManager getScreenCaptureManager() {
        return this.screenCaptureManager;
    }

    public SessionRoomsManager getSessionRoomManager() {
        return this.sessionRoomManager;
    }

    public Conversation.State getState() {
        return this.state.get();
    }

    public StereoRoomManager getStereoRoomManager() {
        return this.stereoRoomManager;
    }

    public py0 getUnderlyingCall() {
        return this.debugManager.getUnderlyingCall();
    }

    public UrlSharingManager getUrlSharingManager() {
        return this.urlSharingManager;
    }

    public VideoRenderManager getVideoRenderManager() {
        return this.videoRenderManager;
    }

    public WatchTogetherPlayer getWatchTogetherPlayer() {
        return this.watchTogetherPlayer;
    }

    public void grantRoles(ParticipantId participantId, boolean z, eg1... eg1Arr) {
        bg1 bg1;
        fg1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId != null && (bg1 = callParticipantByExternalId.a) != null) {
            grantRoles(bg1, z, eg1Arr, (Runnable) null, (Runnable) null);
        }
    }

    public void hangup(ii6 ii6) {
        py0 py0 = this.call;
        py0.getClass();
        ji6 ji6 = ii6.a;
        if (ji6 == null) {
            boolean z = py0.B0;
            ji6 ji62 = ji6.o;
            if (z) {
                if (!py0.s() && py0.C1) {
                    ji6 = ji6.X;
                }
            } else if (!py0.s()) {
                ji6 = ji6.c;
            }
            ji6 = ji62;
        }
        py0.d(ji6);
        this.wasHungUp = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasRegisteredParticipnats() {
        /*
            r2 = this;
            py0 r2 = r2.call
            kg1 r2 = r2.p1
            java.util.Collection r2 = r2.i()
            java.util.Iterator r2 = r2.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            fg1 r0 = (defpackage.fg1) r0
            kpa r1 = r0.j
            if (r1 != 0) goto L_0x0024
            java.util.HashMap r0 = r0.f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000c
        L_0x0024:
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.hasRegisteredParticipnats():boolean");
    }

    public void init() {
        boolean z;
        this.log.log(LOG_TAG, "init called");
        doStartCall();
        if (this.startCallApiParams.isVideo()) {
            py0 py0 = this.call;
            kd1 kd1 = py0.L1;
            rd8 rd8 = kd1.i.b;
            rd8 rd82 = rd8.a;
            if (rd8 == rd82 && kd1.h(py0.p1.k).b == rd82) {
                z = true;
                this.call.B(z);
                this.call.G(z);
            }
        }
        z = false;
        this.call.B(z);
        this.call.G(z);
    }

    public void initAsConfJoin() {
        this.expectedChat = true;
    }

    public void initStore(Collection<ParticipantId> collection) {
        boolean z = collection.size() > 1;
        if (z && this.isCaller) {
            ExtLogger extLogger = this.stat;
            d4a simpleBuilder = ExtLogger.simpleBuilder(e0e.callStartMultiparty);
            simpleBuilder.c("vcid", ((hw3) this.cidProvider).a);
            extLogger.log(simpleBuilder.a());
        }
        for (ParticipantId fromExternal : collection) {
            ConversationParticipant fromExternal2 = ConversationParticipant.fromExternal(fromExternal, this.idMappingWrapper);
            this.store.addToActiveSessionRoom(fromExternal2);
            if (!z) {
                this.initialOpponent = fromExternal2;
                fromExternal2.setReported(true);
            }
        }
    }

    public boolean isAnonJoinForbidden() {
        py0 py0 = this.call;
        return py0.z0.contains(oy0.a);
    }

    public boolean isAnswered() {
        return this.call.s();
    }

    public boolean isAudioMixEnabled() {
        return this.call.t1.H(xxe.c);
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isConcurrent() {
        return this.isConcurrent;
    }

    @Deprecated
    public boolean isConditionAccepted() {
        return this.call.T0.b;
    }

    public boolean isConnected() {
        return this.call.K0;
    }

    public boolean isDestroyed() {
        return this.state.get() == Conversation.State.Finished;
    }

    public boolean isFeatureAddParticipantEnabled() {
        return this.call.x1;
    }

    public boolean isFeedbackEnabled() {
        py0 py0 = this.call;
        return py0.z0.contains(oy0.o);
    }

    public boolean isGroupCall() {
        return this.call.p1.r() > 1;
    }

    public boolean isInited() {
        return this.inited;
    }

    public boolean isInitialVideoEnabled() {
        return this.call.E0;
    }

    public boolean isMeCreatorOrAdmin() {
        return py0.t(this.call.p1.a);
    }

    public boolean isMeInWaitingRoom() {
        return this.call.K1;
    }

    public boolean isMuteParticipantsPermitted() {
        return this.call.a;
    }

    @Deprecated
    public boolean isParticipantAdmin(String str) {
        fg1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        for (eg1 eg1 : callParticipant.e) {
            if (eg1 == eg1.b) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isParticipantCreator(String str) {
        fg1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        for (eg1 eg1 : callParticipant.e) {
            if (eg1 == eg1.a) {
                return true;
            }
        }
        return false;
    }

    public boolean isParticipantCreatorOrAdmin(String str) {
        fg1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        return py0.t(callParticipant);
    }

    public boolean isPermissionsGranted() {
        aq7 aq7 = this.call.n1;
        return aq7.d || aq7.c || (aq7.a() && (aq7.d || aq7.c));
    }

    public boolean isPrepared() {
        return this.prepared;
    }

    public boolean isRecurring() {
        py0 py0 = this.call;
        return py0.z0.contains(oy0.c);
    }

    public boolean isVideoPermissionGranted() {
        py0 py0 = this.call;
        return py0.n1.d || (py0.n1.a() && py0.n1.d);
    }

    public boolean isWaitingRoomEnabled() {
        py0 py0 = this.call;
        return py0.z0.contains(oy0.b);
    }

    public void muteAll() {
        rod rod = this.call.Z;
        if (rod != null) {
            try {
                rod.i(f46.b(new JSONObject().put("all", true).put("muteTarget", true), "switch-micro"));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void pinParticipant(ParticipantId participantId, boolean z) {
        bg1 bg1;
        fg1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId != null && (bg1 = callParticipantByExternalId.a) != null) {
            py0 py0 = this.call;
            zad zad = py0.p1.k;
            py0.t1.K(bg1, zad, z, new by0(py0, z, bg1, zad));
        }
    }

    public void prepare(ConversationParams conversationParams2, rj3 rj3, rj3 rj32) {
        prepare(conversationParams2, false, false, rj3, rj32);
    }

    public void prepareJoinByLink(rj3 rj3, rj3 rj32, String str) {
        this.anonToken = str;
        hc3 hc3 = this.disposable;
        iqd executeWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare((ConversationParams) null), new Prepare.PrepareParams.PrepareJoin(this.initialJoinLink, str));
        h hVar = new h(this, rj32, rj3);
        i iVar = new i(rj32, 0);
        executeWithState.getClass();
        iq1 iq1 = new iq1(hVar, 2, iVar);
        executeWithState.k(iq1);
        hc3.a(iq1);
    }

    public void promoteParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new d(this, z, 1));
    }

    public void queryChatHistory(Integer num, Integer num2, Conversation.ChatHistoryCallback chatHistoryCallback) {
        rod rod = this.call.Z;
        if (rod != null) {
            try {
                ka6 b = f46.b((JSONObject) null, "chat-history");
                JSONObject jSONObject = b.a;
                jSONObject.put("offset", num.intValue());
                jSONObject.put(NewHtcHomeBadger.COUNT, num2.intValue());
                rod.h(b, new g(this, chatHistoryCallback));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void release() {
        SupportedCodecsStatistics.tryToReport(this.api, this.preferencesHelper, this.log, this.callParams);
        this.rateManager.logHints();
        this.disposable.d();
        this.waitingRoomParticipants.release();
        this.participantStatesManager.release();
        this.mediaConnectionManager.release();
        synchronized (this.stateTransitionLock) {
            try {
                if (this.wantsApiHangup && this.wasHungUp) {
                    ji6 ji6 = this.call.Q0;
                    if (ji6 == null) {
                        ji6 = ji6.X;
                    }
                    this.creator.hangup(ji6, ((hw3) this.cidProvider).a, this.anonToken);
                }
                this.call.w1 = null;
                py0 py0 = this.call;
                py0.d1 = null;
                py0.M0.remove(this.listener);
                py0 py02 = this.call;
                AudioSampleEnergyCalculator audioSampleEnergyCalculator2 = this.audioSampleEnergyCalculator;
                qld qld = py02.k1;
                qld.getClass();
                qld.a.execute(new flc(qld, 17, audioSampleEnergyCalculator2));
                this.call.p((ji6) null, "release");
                this.state.set(Conversation.State.Finished);
                this.listener.release();
                this.eventListener.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.remove(conversationEventsListener);
    }

    public void removeJoinLink(Runnable runnable, rj3 rj3) {
        hc3 hc3 = this.disposable;
        qpc c = this.api.c();
        rk0 s = tu0.s("vchat.removeJoinLink");
        s.b = kl.c;
        s.b(ApiProtocol.PARAM_CONVERSATION_ID, ((hw3) this.cidProvider).a);
        drd i = RetryKt.retryApiCallForFastWorkRequired(c.a(s.a(new UnwrappingParser("success", new ig5(29)))), this.callParams.B.h, this.log).i(ce.a());
        b bVar = new b(runnable, rj3, 2);
        Objects.requireNonNull(rj3);
        iq1 iq1 = new iq1(bVar, 2, new iw3(rj3, 1));
        i.k(iq1);
        hc3.a(iq1);
    }

    public void removeParticipant(ParticipantId participantId) {
        removeParticipant(participantId, false);
    }

    public void sendData(ConversationParticipant conversationParticipant, JSONObject jSONObject) {
        bg1 bg1;
        if (!this.call.A0 && conversationParticipant != null && (bg1 = conversationParticipant.getCallParticipant().a) != null) {
            this.call.Z.i(f46.j(bg1, jSONObject));
        }
    }

    public void setAnonJoinForbidden(boolean z) {
        setAnonJoinForbidden(z, (rj3) null);
    }

    public void setAudioCaptureEnabled(boolean z) {
        this.screenCaptureManager.setAudioCaptureEnabled(z);
    }

    public void setCallOptionEnabled(oy0 oy0, boolean z, rj3 rj3) {
        rod rod = this.call.Z;
        if (!isMeCreatorOrAdmin()) {
            if (rj3 != null) {
                rj3.accept("user is not creator or admin");
            }
            this.log.log(LOG_TAG, "user is not creator or admin");
        } else if (rod != null) {
            Set singleton = Collections.singleton(oy0);
            rod.d(z ? f46.h(singleton, (Set) null) : f46.h((Set) null, singleton), false, new m(this, z, oy0, rj3), new k(rj3, 1));
        }
    }

    public void setFeedbackEnabled(boolean z) {
        setFeedbackEnabled(z, (rj3) null);
    }

    public void setMuteState(ParticipantId participantId, boolean z) {
        rod rod = this.call.Z;
        if (rod != null) {
            withInternalId(participantId, new d(rod, z, 2));
        }
    }

    public void setWaitingRoomEnabled(boolean z) {
        setWaitingRoomEnabled(z, (rj3) null);
    }

    /* access modifiers changed from: private */
    public void withInternalId(ParticipantId participantId, rj3 rj3, Runnable runnable) {
        bg1 byExternal = this.idMappingWrapper.getByExternal(participantId);
        if (byExternal == null) {
            executeOnBg(new e(this, participantId, 1), new f(participantId, rj3), runnable);
            return;
        }
        try {
            rj3.accept(byExternal);
        } catch (Exception e) {
            if (runnable != null) {
                runnable.run();
            }
            this.log.reportException(LOG_TAG, "unable to use internal id", e);
        }
    }

    @Deprecated
    public void addParticipant(String str, boolean z, rj3 rj3) {
        sk0 resolveInternalRequest = IdUtils.resolveInternalRequest(str, false);
        hc3 hc3 = this.disposable;
        drd i = RetryKt.retryApiCallForFastWorkRequired(this.api.c().a(resolveInternalRequest), this.callParams.B.h, this.log).i(ce.a());
        iq1 iq1 = new iq1(new j(this, z, rj3), 2, new p(this));
        i.k(iq1);
        hc3.a(iq1);
    }

    public void changeMyState(Map<String, String> map, qod qod) {
        this.participantStatesManager.updateOwnState(map, qod);
    }

    public void prepare(ConversationParams conversationParams2, boolean z, boolean z2, rj3 rj3, rj3 rj32) {
        iqd executeWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare(conversationParams2), Prepare.PrepareParams.C0002Prepare.INSTANCE);
        l lVar = new l(this, z, rj32, z2, rj3);
        i iVar = new i(rj32, 1);
        executeWithState.getClass();
        iq1 iq1 = new iq1(lVar, 2, iVar);
        executeWithState.k(iq1);
        this.disposable.a(iq1);
    }

    public void removeParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new d(this, z, 0));
    }

    public void setAnonJoinForbidden(boolean z, rj3 rj3) {
        setCallOptionEnabled(oy0.a, z, rj3);
    }

    public void setFeedbackEnabled(boolean z, rj3 rj3) {
        setCallOptionEnabled(oy0.o, z, rj3);
    }

    public void setWaitingRoomEnabled(boolean z, rj3 rj3) {
        setCallOptionEnabled(oy0.b, z, rj3);
    }

    /* access modifiers changed from: private */
    public void grantRoles(bg1 bg1, boolean z, eg1[] eg1Arr, Runnable runnable, Runnable runnable2) {
        py0 py0 = this.call;
        List asList = Arrays.asList(eg1Arr);
        py0.t1.E(bg1, asList, z, new ay0(py0, bg1, z, asList, runnable, runnable2));
    }
}
