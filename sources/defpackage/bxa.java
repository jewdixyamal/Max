package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bxa  reason: default package */
public final class bxa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dxa Y;
    public final /* synthetic */ tk2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxa(dxa dxa, tk2 tk2, Continuation continuation) {
        super(2, continuation);
        this.Y = dxa;
        this.Z = tk2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bxa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bxa(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            zwa zwa = new zwa(this.Z.a);
            this.X = 1;
            if (kld.a(zwa, this) == tx3) {
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
