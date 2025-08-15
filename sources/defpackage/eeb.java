package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eeb  reason: default package */
public final class eeb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ feb s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eeb(j31 j31, Continuation continuation, feb feb) {
        super(2, continuation);
        this.Z = j31;
        this.s0 = feb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eeb) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eeb eeb = new eeb((j31) this.Z, continuation, this.s0);
        eeb.Y = obj;
        return eeb;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            beb beb = new beb((on5) this.Y, this.s0, 1);
            this.X = 1;
            if (this.Z.d(beb, this) == tx3) {
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
