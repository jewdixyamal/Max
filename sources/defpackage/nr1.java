package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nr1  reason: default package */
public final class nr1 extends ffe implements a66 {
    public wr1 X;
    public int Y;
    public final /* synthetic */ wr1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nr1(wr1 wr1, Continuation continuation) {
        super(2, continuation);
        this.Z = wr1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nr1(this.Z, continuation);
    }

    public final Object o(Object obj) {
        wr1 wr1;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        boolean z = true;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = wr1.K;
            wr1 wr12 = this.Z;
            xk1 xk1 = new xk1(((cra) wr12.t()).w0, 8);
            this.X = wr12;
            this.Y = 1;
            Object C = od2.C(xk1, this);
            if (C == tx3) {
                return tx3;
            }
            wr1 wr13 = wr12;
            obj = C;
            wr1 = wr13;
        } else if (i == 1) {
            wr1 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj == null) {
            z = false;
        }
        wr1.F = z;
        return e5f.a;
    }
}
