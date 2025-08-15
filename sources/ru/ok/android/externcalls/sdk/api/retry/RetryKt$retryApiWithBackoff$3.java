package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Le5f;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RetryKt$retryApiWithBackoff$3 extends rd7 implements m56 {
    final /* synthetic */ a4c $logger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetryKt$retryApiWithBackoff$3(a4c a4c) {
        super(1);
        this.$logger = a4c;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return e5f.a;
    }

    public final void invoke(Throwable th) {
        a4c a4c = this.$logger;
        a4c.log("CallsApiRetry", "retry failed with last exception " + th);
    }
}
