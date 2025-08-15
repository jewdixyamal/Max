package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: m3  reason: default package */
public abstract class m3 implements bm7 {
    public static final Logger X;
    public static final mqd Y;
    public static final Object Z = new Object();
    public static final boolean o = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile Object a;
    public volatile i3 b;
    public volatile l3 c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: j3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: j3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: j3} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<l3> r2 = defpackage.l3.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            o = r3
            java.lang.Class<m3> r3 = defpackage.m3.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            X = r4
            j3 r4 = new j3     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<i3> r2 = defpackage.i3.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            k3 r4 = new k3
            r4.<init>()
        L_0x004a:
            Y = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = X
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3.<clinit>():void");
    }

    public static void c(m3 m3Var) {
        l3 l3Var;
        i3 i3Var;
        i3 i3Var2;
        i3 i3Var3;
        do {
            l3Var = m3Var.c;
        } while (!Y.e(m3Var, l3Var, l3.c));
        while (true) {
            i3Var = null;
            if (l3Var == null) {
                break;
            }
            Thread thread = l3Var.a;
            if (thread != null) {
                l3Var.a = null;
                LockSupport.unpark(thread);
            }
            l3Var = l3Var.b;
        }
        m3Var.b();
        do {
            i3Var2 = m3Var.b;
        } while (!Y.c(m3Var, i3Var2, i3.d));
        while (true) {
            i3Var3 = i3Var;
            i3Var = i3Var2;
            if (i3Var == null) {
                break;
            }
            i3Var2 = i3Var.c;
            i3Var.c = i3Var3;
        }
        while (i3Var3 != null) {
            i3 i3Var4 = i3Var3.c;
            e(i3Var3.a, i3Var3.b);
            i3Var3 = i3Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            X.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof g3) {
            Throwable th = ((g3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof h3) {
            throw new ExecutionException(((h3) obj).a);
        } else if (obj == Z) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public void b() {
    }

    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!Y.d(this, obj, o ? new g3(z, new CancellationException("Future.cancel() was called.")) : z ? g3.c : g3.d)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        i3 i3Var = this.b;
        i3 i3Var2 = i3.d;
        if (i3Var != i3Var2) {
            i3 i3Var3 = new i3(runnable, executor);
            do {
                i3Var3.c = i3Var;
                if (!Y.c(this, i3Var, i3Var3)) {
                    i3Var = this.b;
                } else {
                    return;
                }
            } while (i3Var != i3Var2);
        }
        e(runnable, executor);
    }

    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                l3 l3Var = this.c;
                l3 l3Var2 = l3.c;
                if (l3Var != l3Var2) {
                    l3 l3Var3 = new l3();
                    do {
                        mqd mqd = Y;
                        mqd.B(l3Var3, l3Var);
                        if (mqd.e(this, l3Var, l3Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(l3Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(l3Var3);
                        } else {
                            l3Var = this.c;
                        }
                    } while (l3Var != l3Var2);
                }
                return f(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String m3Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder k = au1.k(j, "Waited ", " ");
            k.append(timeUnit.toString().toLowerCase(locale));
            String sb = k.toString();
            if (nanos + 1000 < 0) {
                String g = au1.g(sb, " (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str = g + convert + " " + lowerCase;
                    if (z) {
                        str = au1.g(str, ",");
                    }
                    g = au1.g(str, " ");
                }
                if (z) {
                    g = g + nanos2 + " nanoseconds ";
                }
                sb = au1.g(g, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(au1.g(sb, " but future completed as timeout expired"));
            }
            throw new TimeoutException(rh4.j(sb, " for ", m3Var));
        }
        throw new InterruptedException();
    }

    public final void h(l3 l3Var) {
        l3Var.a = null;
        while (true) {
            l3 l3Var2 = this.c;
            if (l3Var2 != l3.c) {
                l3 l3Var3 = null;
                while (l3Var2 != null) {
                    l3 l3Var4 = l3Var2.b;
                    if (l3Var2.a != null) {
                        l3Var3 = l3Var2;
                    } else if (l3Var3 != null) {
                        l3Var3.b = l3Var4;
                        if (l3Var3.a == null) {
                        }
                    } else if (!Y.e(this, l3Var2, l3Var4)) {
                    }
                    l3Var2 = l3Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = Z;
        }
        if (!Y.d(this, (Object) null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public final boolean isCancelled() {
        return this.a instanceof g3;
    }

    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!Y.d(this, (Object) null, new h3(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof g3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            l3 l3Var = this.c;
            l3 l3Var2 = l3.c;
            if (l3Var != l3Var2) {
                l3 l3Var3 = new l3();
                do {
                    mqd mqd = Y;
                    mqd.B(l3Var3, l3Var);
                    if (mqd.e(this, l3Var, l3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(l3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    l3Var = this.c;
                } while (l3Var != l3Var2);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
