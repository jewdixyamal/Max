package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bbc  reason: default package */
public final class bbc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cbc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ byte[] s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bbc(cbc cbc, long j, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = cbc;
        this.Z = j;
        this.s0 = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bbc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bbc(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cbc cbc = this.Y;
            bac bac = cbc.b;
            this.X = 1;
            if (cbc.r(cbc, bac, this.Z, this.s0, this) == tx3) {
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
