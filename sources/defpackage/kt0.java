package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: kt0  reason: default package */
public final class kt0 implements oq8, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = ((long) System.identityHashCode(this));

    public kt0(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int a2;
        bArr.getClass();
        od2.p(!isClosed());
        this.a.getClass();
        a2 = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, a2, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, a2);
        return a2;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int a2;
        bArr.getClass();
        od2.p(!isClosed());
        this.a.getClass();
        a2 = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, a2, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, a2);
        return a2;
    }

    public final void a(oq8 oq8, int i) {
        if (oq8 instanceof kt0) {
            od2.p(!isClosed());
            kt0 kt0 = (kt0) oq8;
            od2.p(!kt0.isClosed());
            this.a.getClass();
            ema.i(0, kt0.b, 0, i, this.b);
            this.a.position(0);
            ByteBuffer r = kt0.r();
            r.getClass();
            r.position(0);
            byte[] bArr = new byte[i];
            this.a.get(bArr, 0, i);
            r.put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        this.a = null;
    }

    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final int getSize() {
        return this.b;
    }

    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    public final long m() {
        return this.c;
    }

    public final void n(oq8 oq8, int i) {
        oq8.getClass();
        long m = oq8.m();
        long j = this.c;
        if (m == j) {
            Long.toHexString(j);
            Long.toHexString(oq8.m());
            od2.j(Boolean.FALSE);
        }
        if (oq8.m() < this.c) {
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
        this.a.getClass();
        return this.a.get(i);
    }

    public final synchronized ByteBuffer r() {
        return this.a;
    }
}
