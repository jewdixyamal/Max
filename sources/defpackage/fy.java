package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fy  reason: default package */
public final class fy {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public cy c;
    public final AtomicReference d = new AtomicReference();
    public final ae3 e;
    public boolean f;

    public fy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ae3 ae3 = new ae3(0, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = ae3;
    }

    public static dy b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    dy dyVar = new dy();
                    return dyVar;
                }
                dy dyVar2 = (dy) arrayDeque.removeFirst();
                return dyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                cy cyVar = this.c;
                cyVar.getClass();
                cyVar.removeCallbacksAndMessages((Object) null);
                ae3 ae3 = this.e;
                synchronized (ae3) {
                    ae3.b = false;
                }
                cy cyVar2 = this.c;
                cyVar2.getClass();
                cyVar2.obtainMessage(2).sendToTarget();
                ae3.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}
