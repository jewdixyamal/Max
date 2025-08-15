package ru.ok.android.externcalls.sdk.factory;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "Ldwe;", "tokenProvider", "Lrl;", "tokenInfoProvider", "payload", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Luz1;", "frameInterceptor", "Lgy9;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Ldwe;Lrl;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Luz1;Lgy9;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "Ldwe;", "getTokenProvider", "()Ldwe;", "Lrl;", "getTokenInfoProvider", "()Lrl;", "getPayload", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class JoinByLinkParams extends BaseCallParams<Builder, JoinByLinkParams> {
    private final String link;
    private final String payload;
    private final rl tokenInfoProvider;
    private final dwe tokenProvider;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "<init>", "()V", "Ldwe;", "tokenProvider", "setTokenProvider", "(Ldwe;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Lrl;", "tokenInfoProvider", "setTokenInfoProvider", "(Lrl;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "setLink", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "payload", "setPayload", "build", "()Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Ljava/lang/String;", "Ldwe;", "Lrl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<JoinByLinkParams> {
        private String link;
        private String payload;
        private rl tokenInfoProvider;
        private dwe tokenProvider;

        public final Builder setLink(String str) {
            this.link = str;
            return this;
        }

        public final Builder setPayload(String str) {
            this.payload = str;
            return this;
        }

        public final Builder setTokenInfoProvider(rl rlVar) {
            this.tokenInfoProvider = rlVar;
            return this;
        }

        public final Builder setTokenProvider(dwe dwe) {
            this.tokenProvider = dwe;
            return this;
        }

        public JoinByLinkParams build() {
            String str = this.link;
            if (str != null) {
                ParticipantId myId = getMyId();
                if (myId != null) {
                    m56 onPrepared = getOnPrepared();
                    if (onPrepared != null) {
                        m56 onError = getOnError();
                        if (onError != null) {
                            ConversationEventsListener eventListener = getEventListener();
                            boolean shouldStartWithVideo = getShouldStartWithVideo();
                            getFrameInterceptor();
                            return new JoinByLinkParams(str, this.tokenProvider, this.tokenInfoProvider, this.payload, myId, onPrepared, onError, shouldStartWithVideo, eventListener, (uz1) null, getCameraCapturerFactory(), (z84) null);
                        }
                        throw new IllegalArgumentException("onError callback is required".toString());
                    }
                    throw new IllegalArgumentException("onPrepared callback is required".toString());
                }
                throw new IllegalArgumentException("Caller id is required".toString());
            }
            throw new IllegalArgumentException("Link is required".toString());
        }
    }

    public /* synthetic */ JoinByLinkParams(String str, dwe dwe, rl rlVar, String str2, ParticipantId participantId, m56 m56, m56 m562, boolean z, ConversationEventsListener conversationEventsListener, uz1 uz1, gy9 gy9, z84 z84) {
        this(str, dwe, rlVar, str2, participantId, m56, m562, z, conversationEventsListener, uz1, gy9);
    }

    public final String getLink() {
        return this.link;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final rl getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final dwe getTokenProvider() {
        return this.tokenProvider;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private JoinByLinkParams(String str, dwe dwe, rl rlVar, String str2, ParticipantId participantId, m56 m56, m56 m562, boolean z, ConversationEventsListener conversationEventsListener, uz1 uz1, gy9 gy9) {
        super(participantId, conversationEventsListener, m56, m562, z, uz1, gy9);
        this.link = str;
        this.tokenProvider = dwe;
        this.tokenInfoProvider = rlVar;
        this.payload = str2;
    }
}
