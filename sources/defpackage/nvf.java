package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nvf  reason: default package */
public final class nvf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vvf Y;
    public final /* synthetic */ yvf Z;
    public final /* synthetic */ evf s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nvf(evf evf, vvf vvf, yvf yvf, Continuation continuation) {
        super(2, continuation);
        this.Y = vvf;
        this.Z = yvf;
        this.s0 = evf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nvf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nvf(this.s0, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        evf evf = this.s0;
        vvf vvf = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ja7 ja7 = vvf.a;
            xbe xbe = new xbe(wbe.X, this.Z.b);
            ja7.getClass();
            x97 x97 = new x97(evf.a, ja7.b(xbe.Companion.serializer(), xbe));
            this.X = 1;
            if (vvf.g.o(x97, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vvf.e(vvf, evf.a);
        return e5f.a;
    }
}
