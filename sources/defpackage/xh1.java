package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.IOException;

/* renamed from: xh1  reason: default package */
public final class xh1 {
    public static final long[] h = {500, 535, 458, 535, 825};
    public final Context a;
    public final wh1 b;
    public final y7d c;
    public final khe d = new khe(new vh1(this, 0));
    public final khe e = new khe(new vh1(this, 1));
    public final khe f = new khe(new vh1(this, 2));
    public MediaPlayer g;

    public xh1(Context context, wh1 wh1, y7d y7d) {
        this.a = context;
        this.b = wh1;
        this.c = y7d;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, android.media.MediaPlayer$OnPreparedListener] */
    public final void a(fd7 fd7, boolean z) {
        hm9.m("RingtoneManagerTag", " start ringtone", new Object[0]);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            hm9.m("RingtoneManagerTag", " stop ringtone", new Object[0]);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                MediaPlayer mediaPlayer = this.g;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                this.g = null;
                try {
                    c();
                    MediaPlayer mediaPlayer2 = new MediaPlayer();
                    Context context = this.a;
                    Integer num = (Integer) fd7.a;
                    if (num != null) {
                        try {
                            mediaPlayer2.setDataSource(context.getResources().openRawResourceFd(num.intValue()));
                        } catch (IOException e2) {
                            hm9.r("RingtoneManagerTag", e2, e2.getMessage(), new Object[0]);
                        }
                    }
                    mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(0).build());
                    mediaPlayer2.setLooping(z);
                    mediaPlayer2.setOnPreparedListener(new Object());
                    mediaPlayer2.setOnCompletionListener(new uh1(z, this));
                    mediaPlayer2.prepareAsync();
                    this.g = mediaPlayer2;
                } catch (IOException e3) {
                    hm9.p("RingtoneManagerTag", "Got error during init player", e3);
                }
            } else {
                throw new IllegalStateException("Main (UI) thread expected".toString());
            }
        } else {
            throw new IllegalStateException("Main (UI) thread expected".toString());
        }
    }

    public final void b() {
        hm9.m("RingtoneManagerTag", " startVibrate", new Object[0]);
        khe khe = this.e;
        if (((Vibrator) khe.getValue()).hasVibrator()) {
            ((Vibrator) khe.getValue()).cancel();
            ((Vibrator) khe.getValue()).vibrate(VibrationEffect.createWaveform(h, 0), new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
        }
    }

    public final void c() {
        hm9.m("RingtoneManagerTag", " stop all", new Object[0]);
        hm9.m("RingtoneManagerTag", " stop ringtone", new Object[0]);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
            this.g = null;
            hm9.m("RingtoneManagerTag", " stopVibrate", new Object[0]);
            ((Vibrator) this.e.getValue()).cancel();
            return;
        }
        throw new IllegalStateException("Main (UI) thread expected".toString());
    }
}
