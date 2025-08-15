package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: qt0  reason: default package */
public final class qt0 implements f70 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final q6d d;
    public final Object e;
    public pt0 f;
    public final f70 g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public qt0(h70 h70, n90 n90) {
        k40 k40;
        boolean z = false;
        if (k40.c != null) {
            k40 = k40.c;
        } else {
            synchronized (k40.class) {
                try {
                    if (k40.c == null) {
                        k40.c = new k40(0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            k40 = k40.c;
        }
        this.d = new q6d(k40);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = h70;
        int a2 = n90.a();
        this.h = a2;
        int i2 = n90.b;
        this.i = i2;
        c54.j("mBytesPerFrame must be greater than 0.", ((long) a2) > 0);
        c54.j("mSampleRate must be greater than 0.", ((long) i2) > 0 ? true : z);
        this.j = 500;
        this.l = a2 * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public final void a(ey1 ey1, q6d q6d) {
        c54.p("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.d.execute(new f5((Object) this, (Object) ey1, (Object) q6d, 4));
    }

    public final void b() {
        c54.p("AudioStream has been released.", !this.b.get());
    }

    public final void c() {
        if (this.k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.l);
            pt0 pt0 = new pt0(allocateDirect, this.g.read(allocateDirect), this.h, this.i);
            int i2 = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(pt0);
                    while (this.c.size() > i2) {
                        this.c.poll();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.k.get()) {
                this.d.execute(new ot0(this, 2));
            }
        }
    }

    public final q90 read(ByteBuffer byteBuffer) {
        boolean z;
        b();
        c54.p("AudioStream has not been started.", this.a.get());
        this.d.execute(new l40(byteBuffer.remaining(), 2, this));
        q90 q90 = new q90(0, 0);
        do {
            synchronized (this.e) {
                try {
                    pt0 pt0 = this.f;
                    this.f = null;
                    if (pt0 == null) {
                        pt0 = (pt0) this.c.poll();
                    }
                    if (pt0 != null) {
                        q90 = pt0.a(byteBuffer);
                        if (pt0.c.remaining() > 0) {
                            this.f = pt0;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = q90.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1);
                    continue;
                } catch (InterruptedException unused) {
                }
            }
        } while (z);
        return q90;
    }

    public final void release() {
        if (!this.b.getAndSet(true)) {
            this.d.execute(new ot0(this, 3));
        }
    }

    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.a;
        if (!atomicBoolean.getAndSet(true)) {
            FutureTask futureTask = new FutureTask(new ot0(this, 1), (Object) null);
            this.d.execute(futureTask);
            try {
                futureTask.get();
            } catch (InterruptedException | ExecutionException e2) {
                atomicBoolean.set(false);
                throw new Exception(e2);
            }
        }
    }

    public final void stop() {
        b();
        if (this.a.getAndSet(false)) {
            this.d.execute(new ot0(this, 0));
        }
    }
}
