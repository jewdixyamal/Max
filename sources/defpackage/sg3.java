package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: sg3  reason: default package */
public final class sg3 extends zt0 {
    public final int x0;

    public sg3(int i, int i2, m56 m56) {
        super(i, m56);
        this.x0 = i2;
        if (i2 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + nec.a(zt0.class).b() + " instead").toString());
        } else if (i < 1) {
            throw new IllegalArgumentException(wg0.g(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
    }

    public final Object K(Object obj, boolean z) {
        j42 j42;
        m56 m56;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        e5f e5f = e5f.a;
        if (this.x0 == 3) {
            Object n = super.n(obj);
            if ((!(n instanceof h42)) || (n instanceof g42)) {
                return n;
            }
            if (!z || (m56 = this.b) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(m56, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
                return e5f;
            }
            throw callUndeliveredElementCatchingException$default;
        }
        Object obj2 = obj;
        Symbol symbol = bu0.d;
        j42 j422 = (j42) zt0.s0.get(this);
        while (true) {
            long andIncrement = zt0.o.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean w = w(andIncrement, false);
            int i = bu0.b;
            long j2 = (long) i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (j422.id != j3) {
                j42 a = zt0.a(this, j3, j422);
                if (a != null) {
                    j42 = a;
                } else if (w) {
                    return new g42(t());
                }
            } else {
                j42 = j422;
            }
            long j4 = j2;
            int i3 = i;
            int d = zt0.d(this, j42, i2, obj, j, symbol, w);
            if (d == 0) {
                j42.cleanPrev();
                return e5f;
            } else if (d == 1) {
                return e5f;
            } else {
                if (d != 2) {
                    if (d == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (d != 4) {
                        if (d == 5) {
                            j42.cleanPrev();
                        }
                        j422 = j42;
                    } else {
                        if (j < zt0.X.get(this)) {
                            j42.cleanPrev();
                        }
                        return new g42(t());
                    }
                } else if (w) {
                    j42.onSlotCleaned();
                    return new g42(t());
                } else {
                    irf irf = symbol instanceof irf ? (irf) symbol : null;
                    if (irf != null) {
                        irf.a(j42, i2 + i3);
                    }
                    m((j42.id * j4) + ((long) i2));
                    return e5f;
                }
            }
        }
    }

    public final Object n(Object obj) {
        return K(obj, false);
    }

    public final Object o(Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object K = K(obj, true);
        if (!(K instanceof g42)) {
            return e5f.a;
        }
        i42.a(K);
        m56 m56 = this.b;
        if (m56 == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(m56, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            throw t();
        }
        j47.e(callUndeliveredElementCatchingException$default, t());
        throw callUndeliveredElementCatchingException$default;
    }

    public final boolean y() {
        return this.x0 == 2;
    }
}
