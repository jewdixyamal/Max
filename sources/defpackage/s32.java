package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: s32  reason: default package */
public abstract class s32 extends l32 {
    public final mn5 o;

    public s32(int i, int i2, lx3 lx3, mn5 mn5) {
        super(lx3, i, i2);
        this.o = mn5;
    }

    public final Object d(on5 on5, Continuation continuation) {
        Object d;
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        if (this.b == -3) {
            lx3 context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            ai0 ai0 = new ai0(11);
            lx3 lx3 = this.a;
            lx3 plus = !((Boolean) lx3.fold(bool, ai0)).booleanValue() ? context.plus(lx3) : v3c.m(context, lx3, false);
            if (tpa.f(plus, context)) {
                d = n(on5, continuation);
                if (d != tx3) {
                    return e5f;
                }
            } else {
                vu4 vu4 = vu4.b;
                if (tpa.f(plus.get(vu4), context.get(vu4))) {
                    lx3 context2 = continuation.getContext();
                    if (!(on5 instanceof z5d) && !(on5 instanceof gr9)) {
                        on5 = new y40(on5, context2);
                    }
                    d = f46.g0(plus, on5, ThreadContextKt.threadContextElements(plus), new r32(this, (Continuation) null), continuation);
                    if (d != tx3) {
                        return e5f;
                    }
                }
            }
            return d;
        }
        d = super.d(on5, continuation);
        if (d != tx3) {
            return e5f;
        }
        return d;
    }

    public final Object j(iab iab, Continuation continuation) {
        Object n = n(new z5d(iab), continuation);
        return n == tx3.a ? n : e5f.a;
    }

    public abstract Object n(on5 on5, Continuation continuation);

    public final String toString() {
        return this.o + " -> " + super.toString();
    }
}
