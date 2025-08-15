package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zae  reason: default package */
public enum zae implements xae {
    ;

    public static void a(AtomicReference atomicReference) {
        xae xae;
        xae xae2 = (xae) atomicReference.get();
        zae zae = a;
        if (xae2 != zae && (xae = (xae) atomicReference.getAndSet(zae)) != zae && xae != null) {
            xae.cancel();
        }
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        xae xae = (xae) atomicReference.get();
        if (xae != null) {
            xae.j(j);
        } else if (d(j)) {
            ngg.b(atomicLong, j);
            xae xae2 = (xae) atomicReference.get();
            if (xae2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    xae2.j(andSet);
                }
            }
        }
    }

    public static boolean c(AtomicReference atomicReference, xae xae) {
        Objects.requireNonNull(xae, "s is null");
        while (!atomicReference.compareAndSet((Object) null, xae)) {
            if (atomicReference.get() != null) {
                xae.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                j47.Z(new IllegalStateException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(long j) {
        if (j > 0) {
            return true;
        }
        j47.Z(new IllegalArgumentException(ey8.h(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(xae xae, xae xae2) {
        if (xae2 == null) {
            j47.Z(new NullPointerException("next is null"));
            return false;
        } else if (xae == null) {
            return true;
        } else {
            xae2.cancel();
            j47.Z(new IllegalStateException("Subscription already set!"));
            return false;
        }
    }

    public final void cancel() {
    }

    public final void j(long j) {
    }
}
