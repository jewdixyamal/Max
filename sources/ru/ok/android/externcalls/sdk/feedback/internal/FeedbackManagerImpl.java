package ru.ok.android.externcalls.sdk.feedback.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!JE\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/FeedbackManagerImpl;", "Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;)V", "", "key", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lm56;Lk56;)V", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "ownFeedbackSent", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "removeListener", "", "millis", "setTimeout", "(J)V", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;Lm56;Lk56;)V", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class FeedbackManagerImpl implements FeedbackManager, FeedbackCommandsExecutor, FeedbackListenerManager {
    private final FeedbackCommandsExecutor commandExecutor;
    private final FeedbackListenerManager listenerManager;

    public FeedbackManagerImpl(FeedbackCommandsExecutor feedbackCommandsExecutor, FeedbackListenerManager feedbackListenerManager) {
        this.commandExecutor = feedbackCommandsExecutor;
        this.listenerManager = feedbackListenerManager;
    }

    public void addListener(FeedbackListener feedbackListener) {
        this.listenerManager.addListener(feedbackListener);
    }

    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.listenerManager.getOwnCurrentFeedback();
    }

    public void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource) {
        this.listenerManager.ownFeedbackSent(str, participantFeedbackSource);
    }

    public void removeListener(FeedbackListener feedbackListener) {
        this.listenerManager.removeListener(feedbackListener);
    }

    public void sendFeedback(String str, m56 m56, k56 k56) {
        this.commandExecutor.sendFeedback(str, m56, k56);
    }

    public void setTimeout(long j) {
        this.listenerManager.setTimeout(j);
    }

    public void sendFeedback(String str, ParticipantFeedbackSource participantFeedbackSource, m56 m56, k56 k56) {
        this.commandExecutor.sendFeedback(str, m56, k56);
        this.listenerManager.ownFeedbackSent(str, participantFeedbackSource);
    }
}
