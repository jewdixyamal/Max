package defpackage;

import android.os.SystemClock;
import org.webrtc.Size;

/* renamed from: qx1  reason: default package */
public final class qx1 implements rx1 {
    public final a4c a;
    public final cue b = new cue();
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public qx1(a4c a4c) {
        this.a = a4c;
    }

    public final String toString() {
        double b2 = this.b.b();
        Size size = this.c;
        return "fps estimation: " + b2 + ", frame size: " + size;
    }
}
