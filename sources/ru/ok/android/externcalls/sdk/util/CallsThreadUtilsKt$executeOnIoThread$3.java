package ru.ok.android.externcalls.sdk.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Le5f;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CallsThreadUtilsKt$executeOnIoThread$3<T> implements qj3 {
    final /* synthetic */ Runnable $onError;

    public CallsThreadUtilsKt$executeOnIoThread$3(Runnable runnable) {
        this.$onError = runnable;
    }

    public final void accept(Throwable th) {
        Runnable runnable = this.$onError;
        if (runnable != null) {
            runnable.run();
        }
    }
}
