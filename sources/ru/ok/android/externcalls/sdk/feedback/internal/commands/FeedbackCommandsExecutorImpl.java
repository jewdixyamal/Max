package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feedback.exceptions.FeedbackException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "key", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lm56;Lk56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class FeedbackCommandsExecutorImpl implements FeedbackCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public FeedbackCommandsExecutorImpl(SignalingProvider signalingProvider2) {
        this.signalingProvider = signalingProvider2;
    }

    /* access modifiers changed from: private */
    public static final void sendFeedback$lambda$0(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void sendFeedback$lambda$1(m56 m56, JSONObject jSONObject) {
        if (m56 != null) {
            m56.invoke(new FeedbackException(jSONObject.toString(), (Throwable) null, 2, (z84) null));
        }
    }

    public void sendFeedback(String str, m56 m56, k56 k56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            try {
                ka6 b = f46.b((JSONObject) null, "feedback");
                b.a.put("key", (Object) str);
                rod.d(b, false, new mt(4, k56), new nt(4, m56));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
