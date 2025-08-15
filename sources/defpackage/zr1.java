package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zr1  reason: default package */
public final class zr1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cs1 Y;
    public final /* synthetic */ vz2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr1(cs1 cs1, vz2 vz2, Continuation continuation) {
        super(2, continuation);
        this.Y = cs1;
        this.Z = vz2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zr1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            e51 e51 = new e51(this.Z);
            this.X = 1;
            if (kld.a(e51, this) == tx3) {
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
