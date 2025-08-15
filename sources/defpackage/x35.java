package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* renamed from: x35  reason: default package */
public abstract class x35 implements Runnable, Comparable, cm4, ThreadSafeHeapNode {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public x35(long j) {
        this.a = j;
    }

    public final int b(long j, y35 y35, z35 z35) {
        synchronized (this) {
            if (this._heap == b45.a) {
                return 2;
            }
            synchronized (y35) {
                try {
                    x35 x35 = (x35) y35.firstImpl();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z35.X;
                    z35.getClass();
                    if (z35.Z.get(z35) != 0) {
                        return 1;
                    }
                    if (x35 == null) {
                        y35.b = j;
                    } else {
                        long j2 = x35.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - y35.b > 0) {
                            y35.b = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = y35.b;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    y35.addImpl(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int compareTo(Object obj) {
        int i = ((this.a - ((x35) obj).a) > 0 ? 1 : ((this.a - ((x35) obj).a) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                Symbol symbol = b45.a;
                if (obj != symbol) {
                    y35 y35 = obj instanceof y35 ? (y35) obj : null;
                    if (y35 != null) {
                        y35.remove(this);
                    }
                    this._heap = symbol;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ThreadSafeHeap getHeap() {
        Object obj = this._heap;
        if (obj instanceof ThreadSafeHeap) {
            return (ThreadSafeHeap) obj;
        }
        return null;
    }

    public final int getIndex() {
        return this.b;
    }

    public final void setHeap(ThreadSafeHeap threadSafeHeap) {
        if (this._heap != b45.a) {
            this._heap = threadSafeHeap;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void setIndex(int i) {
        this.b = i;
    }

    public String toString() {
        return z7b.i(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
