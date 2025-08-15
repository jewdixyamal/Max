package defpackage;

import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: ord  reason: default package */
public final class ord implements go7 {
    public final long a = yn7.b.getAndIncrement();
    public final a34 b;
    public final u1e c;
    public byte[] o;

    public ord(t24 t24, a34 a34) {
        this.b = a34;
        this.c = new u1e(t24);
    }

    public final void a() {
    }

    public final void load() {
        u1e u1e = this.c;
        u1e.b = 0;
        try {
            u1e.G(this.b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) u1e.b;
                byte[] bArr = this.o;
                if (bArr == null) {
                    this.o = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                } else if (i2 == bArr.length) {
                    this.o = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.o;
                i = u1e.read(bArr2, i2, bArr2.length - i2);
            }
            mr0.i(u1e);
        } catch (Throwable th) {
            mr0.i(u1e);
            throw th;
        }
    }
}
