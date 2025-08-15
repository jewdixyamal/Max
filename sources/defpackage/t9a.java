package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t9a  reason: default package */
public final class t9a extends ffe implements m56 {
    public int X;
    public final /* synthetic */ u9a Y;
    public final /* synthetic */ cu8 Z;
    public final /* synthetic */ e52 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t9a(u9a u9a, cu8 cu8, e52 e52, Continuation continuation) {
        super(1, continuation);
        this.Y = u9a;
        this.Z = cu8;
        this.s0 = e52;
    }

    public final Object invoke(Object obj) {
        return new t9a(this.Y, this.Z, this.s0, (Continuation) obj).o(e5f.a);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            a81 a81 = new a81(this.Y, this.Z, this.s0, 6);
            this.X = 1;
            obj = ema.C(a81, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
