package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: at0  reason: default package */
public final class at0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ix Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at0(ix ixVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ixVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((at0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new at0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ix ixVar = this.Y;
            zn5 zn5 = new zn5(od2.F(od2.N((kld) ixVar.j, new mqc(new vs0(ixVar.a, (Continuation) null)), (kld) ixVar.i), (nx3) ixVar.d), new ys0(ixVar, (Continuation) null));
            xw xwVar = new xw(2, (Object) ixVar);
            this.X = 1;
            if (zn5.d(xwVar, this) == tx3) {
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
