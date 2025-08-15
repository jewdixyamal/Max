package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l47  reason: default package */
public final class l47 extends hu3 {
    public final /* synthetic */ a66 X;
    public final /* synthetic */ Object Y;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l47(Continuation continuation, lx3 lx3, a66 a66, Object obj) {
        super(lx3, continuation);
        this.X = a66;
        this.Y = obj;
    }

    public final Object o(Object obj) {
        int i = this.o;
        if (i == 0) {
            this.o = 1;
            od2.a0(obj);
            a66 a66 = this.X;
            f8.c(2, a66);
            return a66.invoke(this.Y, this);
        } else if (i == 1) {
            this.o = 2;
            od2.a0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
