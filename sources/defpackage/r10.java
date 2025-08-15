package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: r10  reason: default package */
public final class r10 {
    public long a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public s10 a() {
        return new s10(this);
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        Collection collection;
        m55 m55 = (m55) this.e;
        if (!m55.a.isTerminated() && !m55.a.isShutdown()) {
            boolean z = true;
            if (((AtomicBoolean) this.c).compareAndSet(true, false)) {
                this.b = m55.c(m55.g(), this.a);
                try {
                    m55.execute((dd4) this.d);
                } catch (RejectedExecutionException unused) {
                }
            } else if (ft4.c(m55.g(), this.b) > 0) {
                this.b = ft4.b;
                qv7 qv7 = m55.Z;
                ReentrantReadWriteLock.ReadLock readLock = m55.s0.readLock();
                readLock.lock();
                try {
                    if (qv7.f != 0) {
                        z = false;
                    }
                    if (z) {
                        collection = nz4.a;
                    } else {
                        Object[] objArr = qv7.d;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : objArr) {
                            urf urf = obj instanceof urf ? (urf) obj : null;
                            if (urf != null) {
                                arrayList.add(urf);
                            }
                        }
                        collection = arrayList;
                    }
                    readLock.unlock();
                    m55.b.d(collection);
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
        }
    }

    public o3g c(boolean z) {
        return z ? (i3g) ((khe) this.e).getValue() : (h3g) ((khe) this.d).getValue();
    }
}
