package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lkotlin/Function0;", "Lpy0;", "getCall", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lk56;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "isEnabled", "Le5f;", "enableAsrOnline", "(Z)V", "onMigratedToServerCallTopology", "()V", "Lk56;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "isAsrOnlineEnabled", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AsrOnlineCommandsExecutorImpl implements AsrOnlineCommandsExecutor {
    private final k56 getCall;
    private boolean isAsrOnlineEnabled;
    private final SignalingProvider signalingProvider;

    public AsrOnlineCommandsExecutorImpl(k56 k56, SignalingProvider signalingProvider2) {
        this.getCall = k56;
        this.signalingProvider = signalingProvider2;
    }

    public void enableAsrOnline(boolean z) {
        this.isAsrOnlineEnabled = z;
        py0 py0 = (py0) this.getCall.invoke();
        if (py0 != null) {
            if (py0.t1.H(xxe.b)) {
                ka6 b = f46.b((JSONObject) null, "request-asr");
                rod signaling = this.signalingProvider.getSignaling();
                if (signaling != null) {
                    signaling.i(b);
                    return;
                }
                return;
            }
            py0 py02 = (py0) this.getCall.invoke();
            if (py02 != null) {
                py02.t1.O(z);
            }
        }
    }

    public void onMigratedToServerCallTopology() {
        py0 py0;
        if (this.isAsrOnlineEnabled && (py0 = (py0) this.getCall.invoke()) != null) {
            py0.t1.O(this.isAsrOnlineEnabled);
        }
    }
}
