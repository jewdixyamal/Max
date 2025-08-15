package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* renamed from: g70  reason: default package */
public final class g70 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ h70 a;

    public g70(h70 h70) {
        this.a = h70;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            h70 h70 = this.a;
            if (clientAudioSessionId == h70.a.getAudioSessionId()) {
                h70.d(audioRecordingConfiguration.isClientSilenced());
                return;
            }
        }
    }
}
