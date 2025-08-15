package defpackage;

import sun.misc.Unsafe;

/* renamed from: h1  reason: default package */
public final class h1 extends tpa {
    public static final Unsafe c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r3 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.g1());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    static {
        /*
            java.lang.String r0 = "a"
            java.lang.String r1 = "b"
            java.lang.Class<i1> r2 = defpackage.i1.class
            sun.misc.Unsafe r3 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x000b }
            goto L_0x0016
        L_0x000b:
            g1 r3 = new g1     // Catch:{ PrivilegedActionException -> 0x0056 }
            r3.<init>()     // Catch:{ PrivilegedActionException -> 0x0056 }
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)     // Catch:{ PrivilegedActionException -> 0x0056 }
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch:{ PrivilegedActionException -> 0x0056 }
        L_0x0016:
            java.lang.Class<k1> r4 = defpackage.k1.class
            java.lang.String r5 = "c"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r5 = r3.objectFieldOffset(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
            e = r5     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r5 = r4.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r5 = r3.objectFieldOffset(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
            d = r5     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r4 = r4.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r4 = r3.objectFieldOffset(r4)     // Catch:{ NoSuchFieldException -> 0x004f }
            f = r4     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r4 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            g = r4     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r0 = r2.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            h = r0     // Catch:{ NoSuchFieldException -> 0x004f }
            c = r3     // Catch:{ NoSuchFieldException -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0056:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1.<clinit>():void");
    }

    public final void C(i1 i1Var, i1 i1Var2) {
        c.putObject(i1Var, h, i1Var2);
    }

    public final void D(i1 i1Var, Thread thread) {
        c.putObject(i1Var, g, thread);
    }

    public final boolean i(k1 k1Var, v0 v0Var, v0 v0Var2) {
        return f1.a(c, k1Var, d, v0Var, v0Var2);
    }

    public final boolean j(k1 k1Var, Object obj, Object obj2) {
        return f1.a(c, k1Var, f, obj, obj2);
    }

    public final boolean k(k1 k1Var, i1 i1Var, i1 i1Var2) {
        return f1.a(c, k1Var, e, i1Var, i1Var2);
    }

    public final v0 p(k1 k1Var) {
        v0 v0Var;
        v0 v0Var2 = v0.d;
        do {
            v0Var = k1Var.b;
            if (v0Var2 == v0Var || i(k1Var, v0Var, v0Var2)) {
                return v0Var;
            }
            v0Var = k1Var.b;
            return v0Var;
        } while (i(k1Var, v0Var, v0Var2));
        return v0Var;
    }

    public final i1 q(k1 k1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.c;
        do {
            i1Var = k1Var.c;
            if (i1Var2 == i1Var || k(k1Var, i1Var, i1Var2)) {
                return i1Var;
            }
            i1Var = k1Var.c;
            return i1Var;
        } while (k(k1Var, i1Var, i1Var2));
        return i1Var;
    }
}
