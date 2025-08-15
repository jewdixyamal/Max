package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f17  reason: default package */
public final class f17 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final oq1 d;
    public final lq1 e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public f17(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        c54.m(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.d = f8.g(new dt0(atomicReference, 5));
        lq1 lq1 = (lq1) atomicReference.get();
        lq1.getClass();
        this.e = lq1;
    }

    public final void a() {
        lq1 lq1 = this.e;
        if (!this.f.getAndSet(true)) {
            try {
                this.a.queueInputBuffer(this.b, 0, 0, 0, 0);
                lq1.b((Object) null);
            } catch (IllegalStateException e2) {
                lq1.d(e2);
            }
        }
    }

    public final void b() {
        lq1 lq1 = this.e;
        ByteBuffer byteBuffer = this.c;
        if (!this.f.getAndSet(true)) {
            try {
                this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
                lq1.b((Object) null);
            } catch (IllegalStateException e2) {
                lq1.d(e2);
            }
        }
    }
}
