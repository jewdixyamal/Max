package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", "T", "Lpse;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Llx3;", "context", "updateThreadContext", "(Llx3;)Ljava/lang/Object;", "oldState", "Le5f;", "restoreThreadContext", "(Llx3;Ljava/lang/Object;)V", "Lkx3;", "key", "minusKey", "(Lkx3;)Llx3;", "Ljx3;", "E", "get", "(Lkx3;)Ljx3;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "Ljava/lang/ThreadLocal;", "Lkx3;", "getKey", "()Lkx3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class ThreadLocalElement<T> implements pse {
    private final kx3 key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t, ThreadLocal<T> threadLocal2) {
        this.value = t;
        this.threadLocal = threadLocal2;
        this.key = new ThreadLocalKey(threadLocal2);
    }

    public <R> R fold(R r, a66 a66) {
        return a66.invoke(r, this);
    }

    public <E extends jx3> E get(kx3 kx3) {
        if (tpa.f(getKey(), kx3)) {
            return this;
        }
        return null;
    }

    public kx3 getKey() {
        return this.key;
    }

    public lx3 minusKey(kx3 kx3) {
        return tpa.f(getKey(), kx3) ? hz4.a : this;
    }

    public lx3 plus(lx3 lx3) {
        return ema.z(this, lx3);
    }

    public void restoreThreadContext(lx3 lx3, T t) {
        this.threadLocal.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    public T updateThreadContext(lx3 lx3) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }
}
