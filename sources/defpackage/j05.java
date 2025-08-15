package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: j05  reason: default package */
public final class j05 extends yqc implements sf6 {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final qy5 e;
    public final long f;
    public final AtomicLong g = new AtomicLong();
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;
    public p54 n;

    public j05(qy5 qy5, f1f f1f, hj9 hj9, x99 x99, long j2) {
        super(qy5, hj9);
        this.e = qy5;
        this.f = j2;
        x99.m(f1f);
    }

    public final void b(lv4 lv4, long j2, qy5 qy5, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j2);
    }

    public final p54 d() {
        if (this.n == null) {
            p54 p54 = (p54) this.h.poll();
            this.n = p54;
            if (!this.l) {
                if (p54 == null) {
                    p54 p542 = new p54(2);
                    this.n = p542;
                    p542.X = o;
                } else {
                    long j2 = this.m;
                    ByteBuffer byteBuffer = p54.X;
                    byteBuffer.getClass();
                    this.m = j2 - ((long) byteBuffer.capacity());
                }
            }
        }
        return this.n;
    }

    public final boolean f() {
        p54 p54 = this.n;
        p54.getClass();
        this.n = null;
        if (p54.f(4)) {
            this.j = true;
        } else {
            p54.Z = this.k + this.f + p54.Z;
            this.i.add(p54);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j2 = this.m;
            ByteBuffer byteBuffer = p54.X;
            byteBuffer.getClass();
            long capacity = j2 + ((long) byteBuffer.capacity());
            this.m = capacity;
            this.l = size >= 10 && (size >= 200 || capacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    public final sf6 j(lv4 lv4, qy5 qy5, int i2) {
        return this;
    }

    public final p54 k() {
        return (p54) this.i.peek();
    }

    public final qy5 l() {
        return this.e;
    }

    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    public final void o() {
    }

    public final void p() {
        p54 p54 = (p54) this.i.remove();
        p54.v();
        p54.Z = 0;
        this.h.add(p54);
    }
}
