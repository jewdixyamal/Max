package defpackage;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: y74  reason: default package */
public final class y74 {
    public final AudioTrack a;
    public final x30 b;
    public x74 c = new x74(this);

    public y74(AudioTrack audioTrack, x30 x30) {
        this.a = audioTrack;
        this.b = x30;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    /* access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.c != null && audioRouting.getRoutedDevice() != null) {
            this.b.f(audioRouting.getRoutedDevice());
        }
    }

    public void c() {
        x74 x74 = this.c;
        x74.getClass();
        this.a.removeOnRoutingChangedListener(x74);
        this.c = null;
    }
}
