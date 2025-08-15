package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012 \u0002*\b\u0018\u00010\u0000R\u00020\u00010\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;", "Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest;", "kotlin.jvm.PlatformType", "it", "Le5f;", "accept", "(Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SupportedCodecsStatistics$tryToReport$1<T> implements qj3 {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ i7b $preferencesHelper;
    final /* synthetic */ a4c $rtcLog;

    public SupportedCodecsStatistics$tryToReport$1(a4c a4c, i7b i7b, long j) {
        this.$rtcLog = a4c;
        this.$preferencesHelper = i7b;
        this.$currentTime = j;
    }

    public final void accept(SupportedCodecsApiRequest.Response response) {
        a4c a4c = this.$rtcLog;
        boolean success = response.getSuccess();
        a4c.log("SupportedCodecsStatistics", "Supported codecs are sent with success=" + success);
        if (response.getSuccess()) {
            i7b i7b = this.$preferencesHelper;
            i7b.a.edit().putLong("supportedCodecsLastUpdate", this.$currentTime).apply();
        }
    }
}
