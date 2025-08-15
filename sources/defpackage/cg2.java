package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: cg2  reason: default package */
public final class cg2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ eg2 Z;
    public final /* synthetic */ e52 s0;
    public cu8 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cg2(Object obj, Continuation continuation, eg2 eg2, e52 e52) {
        super(2, continuation);
        this.Y = obj;
        this.Z = eg2;
        this.s0 = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cg2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cg2(this.Y, continuation, this.Z, this.s0);
    }

    public final Object o(Object obj) {
        Exception e;
        cu8 cu8;
        tx3 tx3 = tx3.a;
        int i = this.X;
        eg2 eg2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            cu8 cu82 = (cu8) this.Y;
            try {
                e52 e52 = this.s0;
                this.t0 = cu82;
                this.X = 1;
                Object j = ((u9a) eg2.e.getValue()).j(e52, cu82, this);
                if (j == tx3) {
                    return tx3;
                }
                cu8 cu83 = cu82;
                obj = j;
                cu8 = cu83;
            } catch (Exception e2) {
                cu8 cu84 = cu82;
                e = e2;
                cu8 = cu84;
                ((cba) ((o45) eg2.f.getValue())).c(new RuntimeException("Error during mapping message=" + cu8, e), true);
                return null;
            }
        } else if (i == 1) {
            cu8 = this.t0;
            try {
                od2.a0(obj);
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (MessageModel) obj;
    }
}
