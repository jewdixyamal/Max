package ru.ok.android.externcalls.sdk.api;

import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!JK\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$JK\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010$J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J7\u0010/\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b1\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102¨\u00064"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiService;", "", "Lqpc;", "rxApiClient", "<init>", "(Lqpc;)V", "", "servers", "cid", "", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "", "opponentInternalIds", "opponentExternalIds", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Liqd;", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "startConversationImpl", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "peerId", "Lru/ok/android/externcalls/sdk/api/JoinByIdResponse;", "joinToConversation", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "anonToken", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getConversationParams", "(Ljava/lang/String;Ljava/lang/String;)Liqd;", "initialJoinLink", "getJoinConversationParamsExt", "(Ljava/lang/String;Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "opponents", "startConversation", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Liqd;", "opponentIds", "startConversationWithExternalIds", "createJoinLink", "(Ljava/lang/String;)Liqd;", "Lrk0;", "joinReq", "Le5f;", "addJoinToConversationParams", "(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lrk0;)V", "startReq", "addCreateConversationParams", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lrk0;)V", "addCreateConversationParamsByExternalOpponentIds", "Lqpc;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public class OkApiService {
    private static final Companion Companion = new Companion((z84) null);
    private static final String LOG_TAG = "OkApiService";
    private static final String METHOD_CREATE_JOIN_LINK = "vchat.createJoinLink";
    private static final String METHOD_GET_CONVERSATION_PARAMS = "vchat.getConversationParams";
    private static final String METHOD_JOIN_TO_CONVERSATION = "vchat.joinConversation";
    private static final String METHOD_START_CONVERSATION = "vchat.startConversation";
    private final qpc rxApiClient;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiService$Companion;", "", "()V", "LOG_TAG", "", "METHOD_CREATE_JOIN_LINK", "METHOD_GET_CONVERSATION_PARAMS", "METHOD_JOIN_TO_CONVERSATION", "METHOD_START_CONVERSATION", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public OkApiService(qpc qpc) {
        this.rxApiClient = qpc;
    }

    public static /* synthetic */ iqd getConversationParams$default(OkApiService okApiService, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return okApiService.getConversationParams(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationParams");
    }

    private final iqd startConversationImpl(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<Long> list, List<String> list2, StartCallApiParams startCallApiParams) {
        qpc qpc = this.rxApiClient;
        rk0 s = tu0.s(METHOD_START_CONVERSATION);
        s.b = kl.c;
        s.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo());
        s.b(ApiProtocol.PARAM_TURN_SERVERS, str);
        s.b(ApiProtocol.PARAM_CONVERSATION_ID, str2);
        s.c(ApiProtocol.PARAM_CREATE_JOIN_LINK, z);
        if (startCallApiParams.isMultipleDevicesEnabled()) {
            GlobalRTCLogger.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
            s.c.a(new l37(ApiProtocol.PARAM_PROTOCOL_VERSION, (long) 6));
        }
        String domainId = startCallApiParams.getDomainId();
        if (domainId != null) {
            s.b(ApiProtocol.PARAM_DOMAIN_ID, domainId);
        }
        String payload = startCallApiParams.getPayload();
        if (payload != null) {
            s.b(ApiProtocol.PARAM_PAYLOAD, payload);
        }
        if (list != null) {
            addCreateConversationParams(conversationParticipant, list, startCallApiParams, s);
        }
        if (list2 != null) {
            addCreateConversationParamsByExternalOpponentIds(conversationParticipant, list2, startCallApiParams, s);
        }
        s.c(ApiProtocol.PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE, !startCallApiParams.isWatchTogetherEnabledForAll());
        return qpc.a(s.a(CallInfo.PARSER)).i(ce.a());
    }

    public void addCreateConversationParams(ConversationParticipant conversationParticipant, List<Long> list, StartCallApiParams startCallApiParams, rk0 rk0) {
        if (!list.isEmpty()) {
            rk0.b(ApiProtocol.PARAM_UIDS, x53.n0(list, ",", (String) null, (String) null, (m56) null, 62));
        }
    }

    public void addCreateConversationParamsByExternalOpponentIds(ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, rk0 rk0) {
        if (!list.isEmpty()) {
            rk0.b(ApiProtocol.PARAM_EXTERNAL_IDS, x53.n0(list, ",", (String) null, (String) null, (m56) null, 62));
        }
    }

    public void addJoinToConversationParams(StartCallApiParams startCallApiParams, rk0 rk0) {
    }

    public final iqd createJoinLink(String str) {
        qpc qpc = this.rxApiClient;
        rk0 s = tu0.s(METHOD_CREATE_JOIN_LINK);
        s.b = kl.c;
        s.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        return qpc.a(s.a(new UnwrappingParser(ApiProtocol.KEY_JOIN_LINK, new ig5(28)))).i(ce.a());
    }

    public final iqd getConversationParams(String str, String str2) {
        qpc qpc = this.rxApiClient;
        rk0 s = tu0.s(METHOD_GET_CONVERSATION_PARAMS);
        s.b = kl.c;
        if (str != null) {
            s.b(ApiProtocol.PARAM_ANONYM_TOKEN, str);
        }
        if (str2 != null) {
            s.b(ApiProtocol.PARAM_CONVERSATION_ID, str2);
        }
        return qpc.a(s.a(ConversationParams.PARSER)).i(ce.a());
    }

    public final iqd getJoinConversationParamsExt(String str, String str2, long j, StartCallApiParams startCallApiParams) {
        rk0 s = tu0.s("vchat.joinConversationByLink");
        s.b = kl.c;
        s.b(ApiProtocol.PARAM_JOIN_LINK, str);
        s.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo());
        l37 l37 = new l37(ApiProtocol.PARAM_PEER_ID, j);
        el elVar = s.c;
        elVar.a(l37);
        s.b(ApiProtocol.PARAM_ANONYM_TOKEN, str2);
        if (startCallApiParams.getPayload() != null) {
            elVar.a(new u9e(ApiProtocol.PARAM_PAYLOAD, startCallApiParams.getPayload()));
        }
        if (startCallApiParams.isMultipleDevicesEnabled()) {
            elVar.a(new l37(ApiProtocol.PARAM_PROTOCOL_VERSION, (long) 6));
        }
        return this.rxApiClient.a(s.a(JoinByLinkResponse.PARSER)).h(OkApiService$getJoinConversationParamsExt$1.INSTANCE);
    }

    public final iqd joinToConversation(String str, long j, StartCallApiParams startCallApiParams) {
        rk0 s = tu0.s(METHOD_JOIN_TO_CONVERSATION);
        s.b = kl.c;
        s.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        l37 l37 = new l37(ApiProtocol.PARAM_PEER_ID, j);
        el elVar = s.c;
        elVar.a(l37);
        s.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo());
        Long chatId = startCallApiParams.getChatId();
        if (chatId != null) {
            elVar.a(new l37(ApiProtocol.PARAM_CHAT_ID, chatId.longValue()));
        }
        if (startCallApiParams.isMultipleDevicesEnabled()) {
            GlobalRTCLogger.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
            elVar.a(new l37(ApiProtocol.PARAM_PROTOCOL_VERSION, (long) 6));
        }
        addJoinToConversationParams(startCallApiParams, s);
        return this.rxApiClient.a(s.a(s5c.b)).h(OkApiService$joinToConversation$1.INSTANCE).i(ce.a());
    }

    public final iqd startConversation(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<Long> list, StartCallApiParams startCallApiParams) {
        return startConversationImpl(str, str2, z, conversationParticipant, list, (List<String>) null, startCallApiParams);
    }

    public final iqd startConversationWithExternalIds(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams) {
        return startConversationImpl(str, str2, z, conversationParticipant, (List<Long>) null, list, startCallApiParams);
    }
}
