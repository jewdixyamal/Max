package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pzf  reason: default package */
public final class pzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pzf(zzf zzf, Continuation continuation) {
        super(2, continuation);
        this.Y = zzf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pzf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        zzf zzf = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (((Boolean) zzf.G0.getValue()).booleanValue()) {
                this.X = 1;
                obj = od2.A(zzf.H0, this);
                if (obj == tx3) {
                    return tx3;
                }
            } else {
                pnf.o(zzf.M0, new yyf(false));
                return e5f.a;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(zzf.M0, new ezf((String) obj));
        return e5f.a;
    }
}
