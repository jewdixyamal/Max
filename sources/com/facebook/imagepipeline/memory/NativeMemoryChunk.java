package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

@pm4
public class NativeMemoryChunk implements oq8, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        hm9.M("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        od2.j(Boolean.valueOf(i > 0));
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    @pm4
    private static native long nativeAllocate(int i);

    @pm4
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @pm4
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @pm4
    private static native void nativeFree(long j);

    @pm4
    private static native void nativeMemcpy(long j, long j2, int i);

    @pm4
    private static native byte nativeReadByte(long j);

    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int a2;
        bArr.getClass();
        od2.p(!isClosed());
        a2 = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, a2, this.b);
        nativeCopyToByteArray(this.a + ((long) i), bArr, i2, a2);
        return a2;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int a2;
        bArr.getClass();
        od2.p(!isClosed());
        a2 = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, a2, this.b);
        nativeCopyFromByteArray(this.a + ((long) i), bArr, i2, a2);
        return a2;
    }

    public final void a(oq8 oq8, int i) {
        if (oq8 instanceof NativeMemoryChunk) {
            od2.p(!isClosed());
            NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) oq8;
            od2.p(!nativeMemoryChunk.isClosed());
            ema.i(0, nativeMemoryChunk.b, 0, i, this.b);
            long j = (long) 0;
            nativeMemcpy(nativeMemoryChunk.a + j, this.a + j, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    public final long e0() {
        return this.a;
    }

    public final void finalize() {
        if (!isClosed()) {
            Integer.toHexString(System.identityHashCode(this));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public final int getSize() {
        return this.b;
    }

    public final synchronized boolean isClosed() {
        return this.c;
    }

    public final long m() {
        return this.a;
    }

    public final void n(oq8 oq8, int i) {
        oq8.getClass();
        if (oq8.m() == this.a) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(oq8));
            Long.toHexString(this.a);
            od2.j(Boolean.FALSE);
        }
        if (oq8.m() < this.a) {
            synchronized (oq8) {
                synchronized (this) {
                    a(oq8, i);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (oq8) {
                a(oq8, i);
            }
        }
    }

    public final synchronized byte o(int i) {
        boolean z = false;
        od2.p(!isClosed());
        od2.j(Boolean.valueOf(i >= 0));
        if (i < this.b) {
            z = true;
        }
        od2.j(Boolean.valueOf(z));
        return nativeReadByte(this.a + ((long) i));
    }

    public final ByteBuffer r() {
        return null;
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0;
        this.c = true;
    }
}
