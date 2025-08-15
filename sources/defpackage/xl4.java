package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xl4  reason: default package */
public final class xl4 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yl4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl4(yl4 yl4, Continuation continuation) {
        super(2, continuation);
        this.Y = yl4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xl4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xl4(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            yl4 yl4 = this.Y;
            int i2 = ft4.o;
            m32 Q = nu0.Q((si9) yl4.c.getValue(), z7.R(1, kt4.SECONDS));
            xw xwVar = new xw(5, (Object) yl4);
            this.X = 1;
            Object d = Q.d(new zb(xwVar, 19, yl4), this);
            if (d != tx3) {
                d = e5f;
            }
            if (d == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
