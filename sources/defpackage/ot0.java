package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;

/* renamed from: ot0  reason: default package */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt0 b;

    public /* synthetic */ ot0(qt0 qt0, int i) {
        this.a = i;
        this.b = qt0;
    }

    public final void run() {
        int i = this.a;
        qt0 qt0 = this.b;
        switch (i) {
            case 0:
                qt0.k.set(false);
                qt0.g.stop();
                synchronized (qt0.e) {
                    qt0.f = null;
                    qt0.c.clear();
                }
                return;
            case 1:
                qt0.getClass();
                try {
                    qt0.g.start();
                    if (!qt0.k.getAndSet(true)) {
                        qt0.c();
                        return;
                    }
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            case 2:
                qt0.c();
                return;
            default:
                qt0.k.set(false);
                qt0.g.release();
                synchronized (qt0.e) {
                    qt0.f = null;
                    qt0.c.clear();
                }
                return;
        }
    }
}
