package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vs4  reason: default package */
public final class vs4 implements lee, SurfaceTexture.OnFrameAvailableListener {
    public int X = 0;
    public boolean Y = false;
    public final AtomicBoolean Z = new AtomicBoolean(false);
    public final ts4 a;
    public final HandlerThread b;
    public final zh6 c;
    public final Handler o;
    public final LinkedHashMap s0 = new LinkedHashMap();
    public SurfaceTexture t0;
    public SurfaceTexture u0;

    public vs4(eu4 eu4, ge7 ge7, ge7 ge72) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new zh6(handler);
        this.a = new ts4(ge7, ge72);
        try {
            f8.g(new u00((Object) this, (Object) eu4, (Object) emptyMap, 8)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a(see see) {
        if (this.Z.get()) {
            see.d();
        } else {
            e(new kl4((Object) this, 3, (Object) see), new ae4(see, 0));
        }
    }

    public final void c(kee kee) {
        if (this.Z.get()) {
            kee.close();
            return;
        }
        kl4 kl4 = new kl4((Object) this, 4, (Object) kee);
        Objects.requireNonNull(kee);
        e(kl4, new dd4(1, kee));
    }

    public final void d() {
        if (this.Y && this.X == 0) {
            LinkedHashMap linkedHashMap = this.s0;
            for (kee close : linkedHashMap.keySet()) {
                close.close();
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new f5((Object) this, (Object) runnable2, (Object) runnable, 24));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.Z.get() && (surfaceTexture2 = this.t0) != null && this.u0 != null) {
            surfaceTexture2.updateTexImage();
            this.u0.updateTexImage();
            for (Map.Entry entry : this.s0.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                kee kee = (kee) entry.getKey();
                if (kee.c == 34) {
                    try {
                        this.a.w(surfaceTexture.getTimestamp(), surface, kee, this.t0, this.u0);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final void release() {
        if (!this.Z.getAndSet(true)) {
            e(new dd4(8, this), new kc(5));
        }
    }
}
