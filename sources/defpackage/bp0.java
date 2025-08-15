package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bp0  reason: default package */
public final class bp0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ep0 Y;
    public final /* synthetic */ ps3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp0(ep0 ep0, ps3 ps3, Continuation continuation) {
        super(2, continuation);
        this.Y = ep0;
        this.Z = ps3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bp0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bp0(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            yo0 yo0 = new yo0(this.Z);
            this.X = 1;
            if (kld.a(yo0, this) == tx3) {
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
