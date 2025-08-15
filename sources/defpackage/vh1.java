package defpackage;

import android.media.AudioManager;
import android.os.Vibrator;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vh1  reason: default package */
public final /* synthetic */ class vh1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh1 b;

    public /* synthetic */ vh1(xh1 xh1, int i) {
        this.a = i;
        this.b = xh1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 1:
                return (Vibrator) this.b.a.getSystemService("vibrator");
            default:
                qyc qyc = (qyc) this.b.c;
                qyc.getClass();
                return Boolean.valueOf(qyc.n(PmsKey.f106reconnectcallringtone, false));
        }
    }
}
