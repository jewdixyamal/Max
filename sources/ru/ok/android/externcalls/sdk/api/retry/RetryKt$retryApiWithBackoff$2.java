package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "", "throwable", "", "attempt", "Le5f;", "invoke", "(Ljava/lang/Throwable;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RetryKt$retryApiWithBackoff$2 extends rd7 implements a66 {
    final /* synthetic */ a4c $logger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetryKt$retryApiWithBackoff$2(a4c a4c) {
        super(2);
        this.$logger = a4c;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, ((Number) obj2).intValue());
        return e5f.a;
    }

    public final void invoke(Throwable th, int i) {
        a4c a4c = this.$logger;
        a4c.log("CallsApiRetry", "retry attempt " + i + " after " + th);
    }
}
