package defpackage;

import java.util.Objects;

/* renamed from: muc  reason: default package */
public abstract class muc {
    public static final trd a;
    public static final ld3 b;
    public static final u67 c;
    public static final u0f d = u0f.c;

    static {
        try {
            trd trd = luc.a;
            Objects.requireNonNull(trd, "Scheduler Supplier result can't be null");
            a = trd;
            try {
                ld3 ld3 = iuc.a;
                Objects.requireNonNull(ld3, "Scheduler Supplier result can't be null");
                b = ld3;
                try {
                    u67 u67 = juc.a;
                    Objects.requireNonNull(u67, "Scheduler Supplier result can't be null");
                    c = u67;
                    try {
                        Objects.requireNonNull(kuc.a, "Scheduler Supplier result can't be null");
                    } catch (Throwable th) {
                        throw q45.f(th);
                    }
                } finally {
                    RuntimeException f = q45.f(th);
                }
            } finally {
                RuntimeException f2 = q45.f(th);
            }
        } finally {
            RuntimeException f3 = q45.f(th);
        }
    }

    public static ztc a() {
        ld3 ld3 = b;
        b66 b66 = j47.t0;
        if (b66 == null) {
            return ld3;
        }
        try {
            return (ztc) b66.apply(ld3);
        } catch (Throwable th) {
            throw q45.f(th);
        }
    }

    public static ztc b() {
        u67 u67 = c;
        b66 b66 = j47.v0;
        if (b66 == null) {
            return u67;
        }
        try {
            return (ztc) b66.apply(u67);
        } catch (Throwable th) {
            throw q45.f(th);
        }
    }
}
