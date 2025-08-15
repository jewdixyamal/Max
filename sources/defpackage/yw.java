package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yw  reason: default package */
public final class yw extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ bx s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yw(q0e q0e, Continuation continuation, bx bxVar) {
        super(2, continuation);
        this.Z = q0e;
        this.s0 = bxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yw) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yw ywVar = new yw((q0e) this.Z, continuation, this.s0);
        ywVar.Y = obj;
        return ywVar;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xw xwVar = new xw((on5) this.Y, this.s0);
            this.X = 1;
            if (this.Z.d(xwVar, this) == tx3) {
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
