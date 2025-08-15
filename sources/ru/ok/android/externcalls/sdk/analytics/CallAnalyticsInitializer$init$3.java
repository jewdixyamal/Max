package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallAnalyticsInitializer$init$3 extends rd7 implements k56 {
    final /* synthetic */ k56 $uploadConfig;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAnalyticsInitializer$init$3(k56 k56) {
        super(0);
        this.$uploadConfig = k56;
    }

    public final Integer invoke() {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxEventCount());
        }
        return null;
    }
}
