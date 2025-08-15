package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: lqc  reason: default package */
public final class lqc implements Continuation, ux3 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(lqc.class, Object.class, "result");
    public final Continuation a;
    private volatile Object result;

    public lqc(Continuation continuation) {
        tx3 tx3 = tx3.b;
        this.a = continuation;
        this.result = tx3;
    }

    public final Object a() {
        Object obj = this.result;
        tx3 tx3 = tx3.b;
        tx3 tx32 = tx3.a;
        if (obj == tx3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, tx3, tx32)) {
                if (atomicReferenceFieldUpdater.get(this) != tx3) {
                    obj = this.result;
                }
            }
            return tx32;
        }
        if (obj == tx3.c) {
            return tx32;
        }
        if (!(obj instanceof njc)) {
            return obj;
        }
        throw ((njc) obj).a;
    }

    public final ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    public final lx3 getContext() {
        return this.a.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            tx3 tx3 = tx3.b;
            if (obj2 == tx3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, tx3, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != tx3) {
                    }
                }
                return;
            }
            tx3 tx32 = tx3.a;
            if (obj2 == tx32) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                tx3 tx33 = tx3.c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, tx32, tx33)) {
                    if (atomicReferenceFieldUpdater2.get(this) != tx32) {
                    }
                }
                this.a.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
