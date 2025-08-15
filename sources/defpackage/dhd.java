package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dhd  reason: default package */
public final class dhd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ v4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dhd(v4 v4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = v4Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dhd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((q6f) this.Y.c(q6f.class)).a(false, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
