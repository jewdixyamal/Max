package ru.ok.android.externcalls.sdk.stat.connect;

import android.os.SystemClock;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "", "Lkotlin/Function0;", "Lm61;", "getEventualStatSender", "Lvte;", "timeProvider", "<init>", "(Lk56;Lvte;)V", "Le5f;", "report", "()V", "onConnectedToSignaling", "Lk56;", "Lvte;", "", "isReported", "Z", "", "startTimeMs", "J", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationConnectedToSignalingStat {
    private final k56 getEventualStatSender;
    private boolean isReported;
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private final vte timeProvider;

    public ConversationConnectedToSignalingStat(k56 k56, vte vte) {
        this.getEventualStatSender = k56;
        this.timeProvider = vte;
    }

    private final void report() {
        ((wte) this.timeProvider).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTimeMs;
        m61 m61 = (m61) this.getEventualStatSender.invoke();
        if (m61 != null) {
            ((n61) m61).c("signaling_connected", EventItemValueKt.toEventItemValue(elapsedRealtime), new EventItemsMap());
        }
    }

    public final void onConnectedToSignaling() {
        if (!this.isReported) {
            this.isReported = true;
            report();
        }
    }
}
