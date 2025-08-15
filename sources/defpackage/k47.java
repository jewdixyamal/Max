package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k47  reason: default package */
public final class k47 extends hjc {
    public int b;
    public final /* synthetic */ a66 c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k47(a66 a66, Object obj, Continuation continuation) {
        super(continuation);
        this.c = a66;
        this.o = obj;
    }

    public final Object o(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.b = 1;
            od2.a0(obj);
            a66 a66 = this.c;
            f8.c(2, a66);
            return a66.invoke(this.o, this);
        } else if (i == 1) {
            this.b = 2;
            od2.a0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
