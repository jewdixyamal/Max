package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: uqc  reason: default package */
public final class uqc implements je7, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(uqc.class, Object.class, "b");
    public volatile k56 a;
    public volatile Object b;

    public final boolean a() {
        return this.b != qq9.v0;
    }

    public final Object getValue() {
        Object obj = this.b;
        qq9 qq9 = qq9.v0;
        if (obj != qq9) {
            return obj;
        }
        k56 k56 = this.a;
        if (k56 != null) {
            Object invoke = k56.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qq9, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != qq9) {
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
