package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: et  reason: default package */
public final class et implements oq8, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public et(int i) {
        od2.j(Boolean.valueOf(i > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = create;
            this.b = create.mapReadWrite();
            this.c = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int a2;
        bArr.getClass();
        this.b.getClass();
        a2 = ema.a(i, i3, getSize());
        ema.i(i, bArr.length, i2, a2, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, a2);
        return a2;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int a2;
        bArr.getClass();
        this.b.getClass();
        a2 = ema.a(i, i3, getSize());
        ema.i(i, bArr.length, i2, a2, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, a2);
        return a2;
    }

    public final void a(oq8 oq8, int i) {
        if (oq8 instanceof et) {
            od2.p(!isClosed());
            et etVar = (et) oq8;
            od2.p(!etVar.isClosed());
            this.b.getClass();
            etVar.b.getClass();
            ema.i(0, etVar.getSize(), 0, i, getSize());
            this.b.position(0);
            etVar.b.position(0);
            byte[] bArr = new byte[i];
            this.b.get(bArr, 0, i);
            etVar.b.put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    public final synchronized boolean isClosed() {
        return this.b == null || this.a == null;
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
        if (i < getSize()) {
            z = true;
        }
        od2.j(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }

    public final ByteBuffer r() {
        return this.b;
    }
}
