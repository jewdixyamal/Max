package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/* renamed from: n0f  reason: default package */
public final class n0f implements ct0 {
    public final ct0 a;
    public final LongAdder b = new LongAdder();
    public final LongAdder c = new LongAdder();
    public final AtomicLong d = new AtomicLong();
    public final LongAccumulator e = new LongAccumulator(new Object(), 0);
    public final LongAdder f = new LongAdder();
    public final LongAdder g = new LongAdder();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.function.LongBinaryOperator, java.lang.Object] */
    public n0f(hk4 hk4) {
        this.a = hk4;
    }

    public final ByteBuffer a(int i) {
        long j = (long) i;
        this.b.add(j);
        this.d.addAndGet(j);
        this.f.increment();
        return this.a.a(i);
    }

    public final void b(ByteBuffer byteBuffer) {
        long capacity = (long) byteBuffer.capacity();
        this.c.add(capacity);
        LongAccumulator longAccumulator = this.e;
        AtomicLong atomicLong = this.d;
        longAccumulator.accumulate(atomicLong.longValue());
        atomicLong.addAndGet(-capacity);
        this.g.increment();
        this.a.b(byteBuffer);
    }
}
