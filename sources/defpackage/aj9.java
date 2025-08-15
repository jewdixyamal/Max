package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: aj9  reason: default package */
public final class aj9 extends f5d implements xi9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(aj9.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public aj9(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : bj9.a;
    }

    public final Object d(Continuation continuation) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        int i2;
        while (true) {
            atomicIntegerFieldUpdater = f5d.g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            i = this.a;
            if (i3 > i) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i2, i));
            } else {
                atomicReferenceFieldUpdater = h;
                if (i3 <= 0) {
                    z = true;
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, (Object) null);
                    z = false;
                    break;
                }
            }
        }
        e5f e5f = e5f.a;
        if (!z) {
            return e5f;
        }
        if (z) {
            sy1 o = nu0.o(v3c.u(continuation));
            try {
                zi9 zi9 = new zi9(this, o);
                while (true) {
                    int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement <= i) {
                        if (andDecrement > 0) {
                            Object obj = zi9.b;
                            aj9 aj9 = zi9.c;
                            atomicReferenceFieldUpdater.set(aj9, obj);
                            ga gaVar = new ga(aj9, 21, zi9);
                            sy1 sy1 = zi9.a;
                            sy1.v(e5f, sy1.resumeMode, new vq0(2, gaVar));
                            break;
                        } else if (b(zi9)) {
                            break;
                        }
                    }
                }
                Object m = o.m();
                tx3 tx3 = tx3.a;
                if (m != tx3) {
                    m = e5f;
                }
                return m == tx3 ? m : e5f;
            } catch (Throwable th) {
                o.u();
                throw th;
            }
        } else if (!z) {
            throw new IllegalStateException("unexpected".toString());
        } else {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
    }

    public final void e(Object obj) {
        while (Math.max(f5d.g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = bj9.a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(c54.u(this));
        sb.append("[isLocked=");
        boolean z = false;
        if (Math.max(f5d.g.get(this), 0) == 0) {
            z = true;
        }
        sb.append(z);
        sb.append(",owner=");
        sb.append(h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
