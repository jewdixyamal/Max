package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dm4  reason: default package */
public enum dm4 implements zl4 {
    ;

    public static boolean a(AtomicReference atomicReference) {
        zl4 zl4;
        zl4 zl42 = (zl4) atomicReference.get();
        dm4 dm4 = a;
        if (zl42 == dm4 || (zl4 = (zl4) atomicReference.getAndSet(dm4)) == dm4) {
            return false;
        }
        if (zl4 == null) {
            return true;
        }
        zl4.g();
        return true;
    }

    public static boolean b(zl4 zl4) {
        return zl4 == a;
    }

    public static boolean c(AtomicReference atomicReference, zl4 zl4) {
        while (true) {
            zl4 zl42 = (zl4) atomicReference.get();
            if (zl42 != a) {
                while (true) {
                    if (atomicReference.compareAndSet(zl42, zl4)) {
                        return true;
                    }
                    if (atomicReference.get() != zl42) {
                    }
                }
            } else if (zl4 == null) {
                return false;
            } else {
                zl4.g();
                return false;
            }
        }
    }

    public static void d(AtomicReference atomicReference, zl4 zl4) {
        while (true) {
            zl4 zl42 = (zl4) atomicReference.get();
            if (zl42 == a) {
                zl4.g();
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(zl42, zl4)) {
                    if (zl42 != null) {
                        zl42.g();
                        return;
                    }
                    return;
                } else if (atomicReference.get() != zl42) {
                }
            }
        }
    }

    public static boolean e(AtomicReference atomicReference, zl4 zl4) {
        Objects.requireNonNull(zl4, "d is null");
        while (!atomicReference.compareAndSet((Object) null, zl4)) {
            if (atomicReference.get() != null) {
                zl4.g();
                if (atomicReference.get() == a) {
                    return false;
                }
                j47.Z(new IllegalStateException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(zl4 zl4, zl4 zl42) {
        if (zl42 == null) {
            j47.Z(new NullPointerException("next is null"));
            return false;
        } else if (zl4 == null) {
            return true;
        } else {
            zl42.g();
            j47.Z(new IllegalStateException("Disposable already set!"));
            return false;
        }
    }

    public final void g() {
    }

    public final boolean h() {
        return true;
    }
}
