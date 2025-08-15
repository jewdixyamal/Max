package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mpd  reason: default package */
public final class mpd implements f70 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final int c;
    public final int d;
    public byte[] e;
    public long f;
    public ey1 g;
    public Executor h;

    public mpd(n90 n90) {
        this.c = n90.a();
        this.d = n90.b;
    }

    public final void a(ey1 ey1, q6d q6d) {
        c54.p("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.g = ey1;
        this.h = q6d;
    }

    public final void b() {
        c54.p("AudioStream has been released.", !this.b.get());
    }

    public final q90 read(ByteBuffer byteBuffer) {
        b();
        c54.p("AudioStream has not been started.", this.a.get());
        int i = this.c;
        long V = ote.V(i, (long) byteBuffer.remaining());
        long j = (long) i;
        boolean z = true;
        c54.j("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * V);
        if (i2 <= 0) {
            return new q90(0, this.f);
        }
        long k = this.f + ote.k(this.d, V);
        long nanoTime = k - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException unused) {
            }
        }
        if (i2 > byteBuffer.remaining()) {
            z = false;
        }
        c54.p((String) null, z);
        byte[] bArr = this.e;
        if (bArr == null || bArr.length < i2) {
            this.e = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.e, 0, i2).limit(position + i2).position(position);
        q90 q90 = new q90(i2, this.f);
        this.f = k;
        return q90;
    }

    public final void release() {
        this.b.getAndSet(true);
    }

    public final void start() {
        b();
        if (!this.a.getAndSet(true)) {
            this.f = System.nanoTime();
            ey1 ey1 = this.g;
            Executor executor = this.h;
            if (ey1 != null && executor != null) {
                executor.execute(new u3c(17, ey1));
            }
        }
    }

    public final void stop() {
        b();
        this.a.set(false);
    }
}
