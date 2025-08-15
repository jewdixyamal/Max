package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lb2  reason: default package */
public final class lb2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb2(zb2 zb2, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lb2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            alc e = this.Y.e();
            this.X = 1;
            e.getClass();
            if (z04.e0(e.a, new wz7(28, e), this) == tx3) {
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
