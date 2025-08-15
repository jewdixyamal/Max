package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* renamed from: tq1  reason: default package */
public final class tq1 implements CallsAudioManager.DisabledAudioDeviceUsagePolicy {
    public final boolean isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType audioDeviceType) {
        return audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH;
    }
}
