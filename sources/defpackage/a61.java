package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a61  reason: default package */
public final class a61 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ir1 Z;
    public final /* synthetic */ h61 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a61(ir1 ir1, h61 h61, Continuation continuation) {
        super(2, continuation);
        this.Z = ir1;
        this.s0 = h61;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a61) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a61 a61 = new a61(this.Z, this.s0, continuation);
        a61.Y = obj;
        return a61;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iab = (iab) this.Y;
            z51 z51 = new z51(iab);
            d04 d04 = (d04) this.Z.b().getValue();
            if (d04.f && !(d04.j instanceof f95)) {
                ((fab) iab).n(g51.c);
            }
            h61 h61 = this.s0;
            h61.b.d(z51);
            x2 x2Var = new x2((Object) h61, 7, (Object) z51);
            this.X = 1;
            if (j47.j(iab, x2Var, this) == tx3) {
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
