package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: tt0  reason: default package */
public final class tt0 implements irf {
    public Object a = bu0.p;
    public sy1 b;
    public final /* synthetic */ zt0 c;

    public tt0(zt0 zt0) {
        this.c = zt0;
    }

    public final void a(Segment segment, int i) {
        sy1 sy1 = this.b;
        if (sy1 != null) {
            sy1.a(segment, i);
        }
    }

    public final Object b(Continuation continuation) {
        j42 j42;
        Boolean bool;
        j42 j422;
        Object obj = this.a;
        boolean z = true;
        if (obj == bu0.p || obj == bu0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zt0.t0;
            zt0 zt0 = this.c;
            j42 j423 = (j42) atomicReferenceFieldUpdater.get(zt0);
            while (true) {
                if (zt0.x()) {
                    this.a = bu0.l;
                    Throwable s = zt0.s();
                    if (s == null) {
                        z = false;
                    } else {
                        throw StackTraceRecoveryKt.recoverStackTrace(s);
                    }
                } else {
                    long andIncrement = zt0.X.getAndIncrement(zt0);
                    long j = (long) bu0.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (j423.id != j2) {
                        j42 r = zt0.r(j2, j423);
                        if (r == null) {
                            continue;
                        } else {
                            j42 = r;
                        }
                    } else {
                        j42 = j423;
                    }
                    Object H = zt0.H(j42, i, andIncrement, (Object) null);
                    Symbol symbol = bu0.m;
                    if (H != symbol) {
                        Symbol symbol2 = bu0.o;
                        if (H == symbol2) {
                            if (andIncrement < zt0.u()) {
                                j42.cleanPrev();
                            }
                            j423 = j42;
                        } else if (H == bu0.n) {
                            zt0 zt02 = this.c;
                            sy1 o = nu0.o(v3c.u(continuation));
                            try {
                                this.b = o;
                                Object H2 = zt02.H(j42, i, andIncrement, this);
                                if (H2 == symbol) {
                                    a(j42, i);
                                } else {
                                    rt0 rt0 = null;
                                    m56 m56 = zt02.b;
                                    if (H2 == symbol2) {
                                        if (andIncrement < zt02.u()) {
                                            j42.cleanPrev();
                                        }
                                        j42 j424 = (j42) zt0.t0.get(zt02);
                                        while (true) {
                                            if (zt02.x()) {
                                                sy1 sy1 = this.b;
                                                this.b = null;
                                                this.a = bu0.l;
                                                Throwable s2 = zt0.s();
                                                if (s2 == null) {
                                                    sy1.resumeWith(Boolean.FALSE);
                                                } else {
                                                    sy1.resumeWith(new njc(s2));
                                                }
                                            } else {
                                                long andIncrement2 = zt0.X.getAndIncrement(zt02);
                                                long j3 = (long) bu0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (j424.id != j4) {
                                                    j42 r2 = zt02.r(j4, j424);
                                                    if (r2 != null) {
                                                        j422 = r2;
                                                    }
                                                } else {
                                                    j422 = j424;
                                                }
                                                Object H3 = zt02.H(j422, i2, andIncrement2, this);
                                                if (H3 == bu0.m) {
                                                    a(j422, i2);
                                                    break;
                                                } else if (H3 == bu0.o) {
                                                    if (andIncrement2 < zt02.u()) {
                                                        j422.cleanPrev();
                                                    }
                                                    j424 = j422;
                                                } else if (H3 != bu0.n) {
                                                    j422.cleanPrev();
                                                    this.a = H3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (m56 != null) {
                                                        rt0 = new rt0(m56, 0, H3);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                            }
                                        }
                                    } else {
                                        j42.cleanPrev();
                                        this.a = H2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (m56 != null) {
                                            rt0 = new rt0(m56, 0, H2);
                                        }
                                    }
                                    o.e(bool, rt0);
                                }
                                return o.m();
                            } catch (Throwable th) {
                                o.u();
                                throw th;
                            }
                        } else {
                            j42.cleanPrev();
                            this.a = H;
                        }
                    } else {
                        throw new IllegalStateException("unreachable".toString());
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.a;
        Symbol symbol = bu0.p;
        if (obj != symbol) {
            this.a = symbol;
            if (obj != bu0.l) {
                return obj;
            }
            Throwable s = this.c.s();
            if (s == null) {
                s = new NoSuchElementException("Channel was closed");
            }
            throw StackTraceRecoveryKt.recoverStackTrace(s);
        }
        throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
}
