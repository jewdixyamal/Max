package ru.ok.android.externcalls.sdk.audio.internal.impl;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CallsAudioManagerV2Impl$setOnAudioDeviceChangeListener$1 extends rd7 implements k56 {
    final /* synthetic */ CallsAudioManager.OnAudioDeviceInfoChangeListener $listener;
    final /* synthetic */ CallsAudioManagerV2Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsAudioManagerV2Impl$setOnAudioDeviceChangeListener$1(CallsAudioManagerV2Impl callsAudioManagerV2Impl, CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        super(0);
        this.this$0 = callsAudioManagerV2Impl;
        this.$listener = onAudioDeviceInfoChangeListener;
    }

    public final void invoke() {
        this.this$0.setOnAudioDeviceChangeListenerImpl(this.$listener);
    }
}
