package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: b15  reason: default package */
public final class b15 extends MediaCodec.Callback {
    public final qi8 a;
    public final boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ d15 k;

    /* JADX WARNING: type inference failed for: r1v8, types: [qi8, java.lang.Object] */
    public b15(d15 d15) {
        this.k = d15;
        if (d15.c) {
            pq9 pq9 = d15.q;
            bue bue = d15.p;
            ? obj = new Object();
            obj.o = -1;
            obj.a = pq9;
            obj.b = bue;
            obj.c = (CameraUseInconsistentTimebaseQuirk) xi4.a.e(CameraUseInconsistentTimebaseQuirk.class);
            this.a = obj;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) xi4.a.e(CodecStuckOnFlushQuirk.class)) != null && "video/mp4v-es".equals(d15.d.getString("mime"))) {
            this.b = false;
        }
    }

    public final void a() {
        d15 d15;
        o05 o05;
        Executor executor;
        if (!this.e) {
            this.e = true;
            Future future = this.k.C;
            if (future != null) {
                future.cancel(false);
                this.k.C = null;
            }
            synchronized (this.k.b) {
                d15 = this.k;
                o05 = d15.r;
                executor = d15.s;
            }
            d15.l(new v05((Object) this, executor, (Object) o05, 1));
        }
    }

    public final void b(e05 e05, o05 o05, Executor executor) {
        d15 d15 = this.k;
        d15.n.add(e05);
        kq0.a(kq0.w(e05.X), new imc((Object) this, 17, (Object) e05), d15.h);
        try {
            executor.execute(new kl4((Object) o05, 16, (Object) e05));
        } catch (RejectedExecutionException unused) {
            e05.close();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.k.h.execute(new kl4((Object) this, 13, (Object) codecException));
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        this.k.h.execute(new l40(i2, 8, this));
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        this.k.h.execute(new t05((Object) this, (Object) bufferInfo, (Object) mediaCodec, i2, 1));
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.k.h.execute(new kl4((Object) this, 14, (Object) mediaFormat));
    }
}
