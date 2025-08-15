package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: sp5  reason: default package */
public final class sp5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ c66 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sp5(im4 im4, y03 y03, Continuation continuation) {
        super(2, continuation);
        this.Z = im4;
        this.s0 = y03;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sp5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sp5 sp5 = new sp5((im4) this.Z, (y03) this.s0, continuation);
        sp5.Y = obj;
        return sp5;
    }

    public final Object o(Object obj) {
        rp5 rp5;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            mn5 mn5 = this.Z;
            rp5 rp52 = new rp5(this.s0, (on5) this.Y);
            try {
                this.Y = rp52;
                this.X = 1;
                if (mn5.d(rp52, this) == tx3) {
                    return tx3;
                }
            } catch (AbortFlowException e) {
                e = e;
                rp5 = rp52;
                if (e.a != rp5) {
                    throw e;
                }
                return e5f.a;
            }
        } else if (i == 1) {
            rp5 = (rp5) this.Y;
            try {
                od2.a0(obj);
            } catch (AbortFlowException e2) {
                e = e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
