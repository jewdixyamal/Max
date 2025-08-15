package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pgb  reason: default package */
public final class pgb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pgb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pgb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pgb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gv4 gv4 = this.Y.b;
            this.X = 1;
            if (gv4.i() == tx3) {
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
