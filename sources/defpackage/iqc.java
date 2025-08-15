package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iqc  reason: default package */
public final class iqc extends hu3 implements on5 {
    public final lx3 X;
    public final int Y;
    public lx3 Z;
    public final on5 o;
    public Continuation s0;

    public iqc(on5 on5, lx3 lx3) {
        super(hz4.a, kb3.c);
        this.o = on5;
        this.X = lx3;
        this.Y = ((Number) lx3.fold(0, new ai0(23))).intValue();
    }

    public final Object a(Object obj, Continuation continuation) {
        try {
            Object r = r(continuation, obj);
            return r == tx3.a ? r : e5f.a;
        } catch (Throwable th) {
            this.Z = new cp4(continuation.getContext(), th);
            throw th;
        }
    }

    public final ux3 getCallerFrame() {
        Continuation continuation = this.s0;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    public final lx3 getContext() {
        lx3 lx3 = this.Z;
        return lx3 == null ? hz4.a : lx3;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object o(Object obj) {
        Throwable a = pjc.a(obj);
        if (a != null) {
            this.Z = new cp4(getContext(), a);
        }
        Continuation continuation = this.s0;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return tx3.a;
    }

    public final Object r(Continuation continuation, Object obj) {
        lx3 context = continuation.getContext();
        pag.j(context);
        lx3 lx3 = this.Z;
        if (lx3 != context) {
            if (lx3 instanceof cp4) {
                throw new IllegalStateException(x9e.b0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((cp4) lx3).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            } else if (((Number) context.fold(0, new bk(14, this))).intValue() == this.Y) {
                this.Z = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.X + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.s0 = continuation;
        Object invoke = kqc.a.invoke(this.o, obj, this);
        if (!tpa.f(invoke, tx3.a)) {
            this.s0 = null;
        }
        return invoke;
    }
}
