package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: v30  reason: default package */
public final class v30 extends AudioDeviceCallback {
    public final /* synthetic */ x30 a;

    public v30(x30 x30) {
        this.a = x30;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        x30 x30 = this.a;
        x30.d(t30.b((Context) x30.b, (h30) x30.u0, (g40) x30.t0));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        x30 x30 = this.a;
        if (oaf.m(audioDeviceInfoArr, (g40) x30.t0)) {
            x30.t0 = null;
        }
        x30.d(t30.b((Context) x30.b, (h30) x30.u0, (g40) x30.t0));
    }
}
