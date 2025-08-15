package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: un5  reason: default package */
public final class un5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ xa3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public un5(mn5 mn5, y77 y77, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5;
        this.s0 = y77;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((un5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        un5 un5 = new un5(this.Z, (y77) this.s0, continuation);
        un5.Y = obj;
        return un5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tn5 tn5 = new tn5((iab) this.Y, 0);
            this.X = 1;
            if (this.Z.d(tn5, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((y77) this.s0).H();
        return e5f.a;
    }
}
