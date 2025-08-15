package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rzf  reason: default package */
public final class rzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;
    public final /* synthetic */ w97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rzf(zzf zzf, w97 w97, Continuation continuation) {
        super(2, continuation);
        this.Y = zzf;
        this.Z = w97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rzf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zzf zzf = this.Y;
            long t = ((hyc) zzf.Z).t();
            this.X = 1;
            obj = ((blb) zzf.y0.getValue()).a(t, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Z.a(String.valueOf(((oab) obj).a));
        return e5f.a;
    }
}
