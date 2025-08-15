package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: as1  reason: default package */
public final class as1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cs1 Y;
    public final /* synthetic */ hi7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public as1(cs1 cs1, hi7 hi7, Continuation continuation) {
        super(2, continuation);
        this.Y = cs1;
        this.Z = hi7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((as1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new as1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            m51 m51 = new m51(this.Z);
            this.X = 1;
            if (kld.a(m51, this) == tx3) {
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
