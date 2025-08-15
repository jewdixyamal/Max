package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: et0  reason: default package */
public final class et0 implements d05 {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final lq1 c;

    public et0(d05 d05) {
        MediaCodec.BufferInfo F = d05.F();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, F.size, F.presentationTimeUs, F.flags);
        this.b = bufferInfo;
        ByteBuffer r = d05.r();
        MediaCodec.BufferInfo F2 = d05.F();
        r.position(F2.offset);
        r.limit(F2.offset + F2.size);
        ByteBuffer allocate = ByteBuffer.allocate(F2.size);
        allocate.order(r.order());
        allocate.put(r);
        allocate.flip();
        this.a = allocate;
        AtomicReference atomicReference = new AtomicReference();
        f8.g(new dt0(atomicReference, 0));
        lq1 lq1 = (lq1) atomicReference.get();
        lq1.getClass();
        this.c = lq1;
    }

    public final MediaCodec.BufferInfo F() {
        return this.b;
    }

    public final boolean I() {
        return (this.b.flags & 1) != 0;
    }

    public final long Y() {
        return this.b.presentationTimeUs;
    }

    public final void close() {
        this.c.b((Object) null);
    }

    public final ByteBuffer r() {
        return this.a;
    }

    public final long size() {
        return (long) this.b.size;
    }
}
