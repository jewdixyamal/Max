package defpackage;

import android.media.MediaPlayer;

/* renamed from: uh1  reason: default package */
public final /* synthetic */ class uh1 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xh1 b;

    public /* synthetic */ uh1(boolean z, xh1 xh1) {
        this.a = z;
        this.b = xh1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (!this.a) {
            this.b.c();
        }
    }
}
