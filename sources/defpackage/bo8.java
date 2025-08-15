package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bo8  reason: default package */
public final class bo8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ do8 Y;
    public final /* synthetic */ ps3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo8(do8 do8, ps3 ps3, Continuation continuation) {
        super(2, continuation);
        this.Y = do8;
        this.Z = ps3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bo8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bo8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            wn8 wn8 = new wn8(x53.D0(this.Z.b));
            this.X = 1;
            if (kld.a(wn8, this) == tx3) {
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
