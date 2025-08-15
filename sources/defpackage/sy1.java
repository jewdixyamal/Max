package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: sy1  reason: default package */
public class sy1 extends ol4 implements ry1, ux3, irf {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = o7.a;
    public final Continuation a;
    public final lx3 b;

    static {
        Class<sy1> cls = sy1.class;
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        X = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public sy1(int i, Continuation continuation) {
        super(i);
        this.a = continuation;
        this.b = continuation.getContext();
    }

    public static void s(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object w(ir9 ir9, Object obj, int i, c66 c66) {
        if ((obj instanceof lb3) || !v3c.v(i)) {
            return obj;
        }
        if (c66 == null && !(ir9 instanceof iy1)) {
            return obj;
        }
        return new jb3(obj, ir9 instanceof iy1 ? (iy1) ir9 : null, c66, (CancellationException) null, 16);
    }

    public final void a(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        p(segment);
    }

    public final void b(nx3 nx3) {
        e5f e5f = e5f.a;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        v(e5f, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == nx3 ? 4 : this.resumeMode, (c66) null);
    }

    public final void c(iy1 iy1, Throwable th) {
        try {
            iy1.b(th);
        } catch (Throwable th2) {
            wmd.v(this.b, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean cancel(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z = false;
            if (!(obj instanceof ir9)) {
                return false;
            }
            if ((obj instanceof iy1) || (obj instanceof Segment)) {
                z = true;
            }
            bz1 bz1 = new bz1(this, th, z);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, bz1)) {
                    ir9 ir9 = (ir9) obj;
                    if (ir9 instanceof iy1) {
                        c((iy1) obj, th);
                    } else if (ir9 instanceof Segment) {
                        g((Segment) obj, th);
                    }
                    if (!r()) {
                        h();
                    }
                    i(this.resumeMode);
                    return true;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
        }
    }

    public final void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ir9) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof lb3)) {
                if (obj2 instanceof jb3) {
                    jb3 jb3 = (jb3) obj2;
                    if (!(jb3.e != null)) {
                        jb3 a2 = jb3.a(jb3, (iy1) null, (CancellationException) th, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            }
                        }
                        iy1 iy1 = jb3.b;
                        if (iy1 != null) {
                            c(iy1, th);
                        }
                        c66 c66 = jb3.c;
                        if (c66 != null) {
                            f(c66, th, jb3.a);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                jb3 jb32 = new jb3(obj2, (iy1) null, (c66) null, (CancellationException) th, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jb32)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final void d(m56 m56) {
        nu0.w(this, new hy1(1, m56));
    }

    public final void e(Object obj, c66 c66) {
        v(obj, this.resumeMode, c66);
    }

    public final void f(c66 c66, Throwable th, Object obj) {
        lx3 lx3 = this.b;
        try {
            c66.invoke(th, obj, lx3);
        } catch (Throwable th2) {
            wmd.v(lx3, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void g(Segment segment, Throwable th) {
        lx3 lx3 = this.b;
        int i = c.get(this) & 536870911;
        if (i != 536870911) {
            try {
                segment.onCancellation(i, th, lx3);
            } catch (Throwable th2) {
                wmd.v(lx3, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    public final ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    public final lx3 getContext() {
        return this.b;
    }

    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.a;
    }

    public final Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof jb3 ? ((jb3) obj).a : obj;
    }

    public final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        cm4 cm4 = (cm4) atomicReferenceFieldUpdater.get(this);
        if (cm4 != null) {
            cm4.dispose();
            atomicReferenceFieldUpdater.set(this, er9.a);
        }
    }

    public final void i(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z = i == 4;
                    Continuation continuation = this.a;
                    if (z || !(continuation instanceof DispatchedContinuation) || v3c.v(i) != v3c.v(this.resumeMode)) {
                        v3c.E(this, continuation, z);
                        return;
                    }
                    DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                    nx3 nx3 = dispatchedContinuation.dispatcher;
                    lx3 context = dispatchedContinuation.getContext();
                    if (nx3.isDispatchNeeded(context)) {
                        nx3.dispatch(context, this);
                        return;
                    }
                    a45 a2 = use.a();
                    if (a2.U()) {
                        a2.n(this);
                        return;
                    }
                    a2.S(true);
                    try {
                        v3c.E(this, continuation, true);
                        do {
                        } while (a2.m0());
                    } catch (Throwable th) {
                        a2.d(true);
                        throw th;
                    }
                    a2.d(true);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final boolean isActive() {
        return o.get(this) instanceof ir9;
    }

    public final boolean isCancelled() {
        return o.get(this) instanceof bz1;
    }

    public final Symbol j(Throwable th) {
        return x(new lb3(th, false), (c66) null);
    }

    public Throwable k(z87 z87) {
        return z87.getCancellationException();
    }

    public final Symbol l(Object obj, c66 c66) {
        return x(obj, c66);
    }

    public final Object m() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean r = r();
        do {
            atomicIntegerFieldUpdater = c;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (r) {
                        u();
                    }
                    Object obj = o.get(this);
                    if (!(obj instanceof lb3)) {
                        if (v3c.v(this.resumeMode)) {
                            x77 x77 = (x77) this.b.get(c32.X);
                            if (x77 != null && !x77.isActive()) {
                                CancellationException cancellationException = x77.getCancellationException();
                                cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
                                throw cancellationException;
                            }
                        }
                        return getSuccessfulResult$kotlinx_coroutines_core(obj);
                    }
                    throw ((lb3) obj).a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((cm4) X.get(this)) == null) {
            o();
        }
        if (r) {
            u();
        }
        return tx3.a;
    }

    public final void n() {
        cm4 o2 = o();
        if (o2 != null && (!(o.get(this) instanceof ir9))) {
            o2.dispose();
            X.set(this, er9.a);
        }
    }

    public final cm4 o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x77 x77 = (x77) this.b.get(c32.X);
        if (x77 == null) {
            return null;
        }
        cm4 q = pag.q(x77, true, new d03(this, 0));
        do {
            atomicReferenceFieldUpdater = X;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, q) || atomicReferenceFieldUpdater.get(this) != null) {
                return q;
            }
            atomicReferenceFieldUpdater = X;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return q;
    }

    public final void p(Object obj) {
        Object obj2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof o7) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            Throwable th = null;
            if ((obj2 instanceof iy1) || (obj2 instanceof Segment)) {
                s(obj, obj2);
            } else if (obj2 instanceof lb3) {
                lb3 lb3 = (lb3) obj2;
                lb3.getClass();
                if (!lb3.b.compareAndSet(lb3, 0, 1)) {
                    s(obj, obj2);
                    throw null;
                } else if (obj2 instanceof bz1) {
                    if (!(obj2 instanceof lb3)) {
                        lb3 = null;
                    }
                    if (lb3 != null) {
                        th = lb3.a;
                    }
                    if (obj instanceof iy1) {
                        c((iy1) obj, th);
                        return;
                    } else {
                        g((Segment) obj, th);
                        return;
                    }
                } else {
                    return;
                }
            } else if (obj2 instanceof jb3) {
                jb3 jb3 = (jb3) obj2;
                if (jb3.b != null) {
                    s(obj, obj2);
                    throw null;
                } else if (!(obj instanceof Segment)) {
                    iy1 iy1 = (iy1) obj;
                    Throwable th2 = jb3.e;
                    if (th2 != null) {
                        c(iy1, th2);
                        return;
                    }
                    jb3 a2 = jb3.a(jb3, iy1, (CancellationException) null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    return;
                } else {
                    return;
                }
            } else if (!(obj instanceof Segment)) {
                jb3 jb32 = new jb3(obj2, (iy1) obj, (c66) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jb32)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
        s(obj, obj2);
        throw null;
    }

    public final void q(Object obj) {
        i(this.resumeMode);
    }

    public final boolean r() {
        return this.resumeMode == 2 && ((DispatchedContinuation) this.a).isReusable$kotlinx_coroutines_core();
    }

    public final void resumeWith(Object obj) {
        Throwable a2 = pjc.a(obj);
        if (a2 != null) {
            obj = new lb3(a2, false);
        }
        v(obj, this.resumeMode, (c66) null);
    }

    public String t() {
        return "CancellableContinuation";
    }

    public final Object takeState$kotlinx_coroutines_core() {
        return o.get(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t());
        sb.append('(');
        sb.append(c54.a0(this.a));
        sb.append("){");
        Object obj = o.get(this);
        sb.append(obj instanceof ir9 ? "Active" : obj instanceof bz1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(c54.u(this));
        return sb.toString();
    }

    public final void u() {
        Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null && (tryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) != null) {
            h();
            cancel(tryReleaseClaimedContinuation$kotlinx_coroutines_core);
        }
    }

    public final void v(Object obj, int i, c66 c66) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ir9) {
                Object w = w((ir9) obj2, obj, i, c66);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, w)) {
                        if (!r()) {
                            h();
                        }
                        i(i);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                if (obj2 instanceof bz1) {
                    bz1 bz1 = (bz1) obj2;
                    bz1.getClass();
                    if (bz1.c.compareAndSet(bz1, 0, 1)) {
                        if (c66 != null) {
                            f(c66, bz1.a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        }
    }

    public final Symbol x(Object obj, c66 c66) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ir9) {
                Object w = w((ir9) obj2, obj, this.resumeMode, c66);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, w)) {
                        if (!r()) {
                            h();
                        }
                        return ty1.a;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                boolean z = obj2 instanceof jb3;
                return null;
            }
        }
    }
}
