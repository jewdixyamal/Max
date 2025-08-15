package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liqd;", "Ltma;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Liqd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Prepare$executeWithJoinLink$1 extends rd7 implements k56 {
    final /* synthetic */ String $anonToken;
    final /* synthetic */ String $initialJoinLink;
    final /* synthetic */ Prepare this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Prepare$executeWithJoinLink$1(Prepare prepare, String str, String str2) {
        super(0);
        this.this$0 = prepare;
        this.$initialJoinLink = str;
        this.$anonToken = str2;
    }

    public final iqd invoke() {
        iqd retryApiCallForJoining = RetryKt.retryApiCallForJoining(this.this$0.okApiService.getJoinConversationParamsExt(this.$initialJoinLink, this.$anonToken, this.this$0.peerIdGenerator.generatePeerId(), this.this$0.startCallApiParams), this.this$0.callParams.B.h, this.this$0.log);
        final Prepare prepare = this.this$0;
        AnonymousClass1 r1 = new qj3() {
            public final void accept(ConversationParams conversationParams) {
                Prepare prepare = prepare;
                if (conversationParams.id != null) {
                    gw3 access$getCidProvider$p = prepare.cidProvider;
                    String str = conversationParams.id;
                    if (access$getCidProvider$p instanceof hw3) {
                        ((hw3) access$getCidProvider$p).a = str;
                    }
                }
            }
        };
        retryApiCallForJoining.getClass();
        return new rqd(retryApiCallForJoining, r1, 2).h(AnonymousClass2.INSTANCE);
    }
}
