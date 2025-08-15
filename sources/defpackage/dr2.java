package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dr2  reason: default package */
public final class dr2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jr2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dr2(jr2 jr2, Continuation continuation) {
        super(2, continuation);
        this.Z = jr2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dr2) n((e52) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dr2 dr2 = new dr2(this.Z, continuation);
        dr2.Y = obj;
        return dr2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            k92 k92 = ((e52) this.Y).b;
            long j = k92.a;
            i92 i92 = k92.c;
            if (!(this.Z.h == j && this.Z.g == i92)) {
                this.Z.g = i92;
                this.Z.h = j;
                jr2 jr2 = this.Z;
                this.X = 1;
                jr2.c(j, this);
                if (e5f == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                hm9.p("jr2", "catch error in chatUpdateFlow.onEach", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
