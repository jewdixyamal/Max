package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: dr9  reason: default package */
public final class dr9 implements qu7 {
    public final khe a;
    public final khe b;
    public final cr9 c;

    public dr9(je7 je7, je7 je72, je7 je73) {
        this.a = new khe(new dr(je72, je73, 7));
        khe khe = new khe(new yf3(this, 21, je7));
        this.b = khe;
        this.c = (cr9) khe.getValue();
    }

    public final void a() {
        ((cr9) this.b.getValue()).a();
    }

    /* JADX INFO: finally extract failed */
    public final void b(long j) {
        ar9 ar9 = (ar9) ((cr9) this.b.getValue());
        if (ar9.e()) {
            ReentrantLock reentrantLock = ar9.f;
            reentrantLock.lock();
            try {
                ar9.e.a(j);
                reentrantLock.unlock();
                ar9.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void c(gi9 gi9) {
        ar9 ar9 = (ar9) ((cr9) this.b.getValue());
        ar9.getClass();
        if (!gi9.i() && ar9.e()) {
            ReentrantLock reentrantLock = ar9.f;
            reentrantLock.lock();
            try {
                long[] jArr = gi9.b;
                long[] jArr2 = gi9.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ar9.e.a(jArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                reentrantLock.unlock();
                ar9.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Collection collection) {
        ar9 ar9 = (ar9) ((cr9) this.b.getValue());
        ar9.getClass();
        if (!collection.isEmpty() && ar9.e()) {
            ReentrantLock reentrantLock = ar9.f;
            reentrantLock.lock();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ar9.e.a(((Number) it.next()).longValue());
                }
                reentrantLock.unlock();
                ar9.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
