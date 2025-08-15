package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* renamed from: f9e  reason: default package */
public final class f9e {
    public final Handler a;
    public final n75 b;
    public final AudioManager c;
    public int d = 3;
    public int e;
    public boolean f;

    public f9e(Context context, Handler handler, n75 n75) {
        Context applicationContext = context.getApplicationContext();
        this.a = handler;
        this.b = n75;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        np8.g(audioManager);
        this.c = audioManager;
        this.e = a(audioManager, 3);
        int i = this.d;
        this.f = maf.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        try {
            applicationContext.registerReceiver(new an(12, this), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (RuntimeException e2) {
            fm9.c("Error registering stream volume receiver", e2);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            fm9.c(sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b() {
        int i = this.d;
        AudioManager audioManager = this.c;
        int a2 = a(audioManager, i);
        int i2 = this.d;
        boolean isStreamMute = maf.a >= 23 ? audioManager.isStreamMute(i2) : a(audioManager, i2) == 0;
        if (this.e != a2 || this.f != isStreamMute) {
            this.e = a2;
            this.f = isStreamMute;
            this.b.a.x0.i(30, new cl3(a2, isStreamMute));
        }
    }
}
