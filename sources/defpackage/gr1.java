package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gr1  reason: default package */
public final class gr1 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr1(gh3 gh3, Continuation continuation) {
        super(2, continuation);
        this.Z = gh3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gr1) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gr1 gr1 = new gr1(this.Z, continuation);
        gr1.Y = obj;
        return gr1;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iab = (iab) this.Y;
            gh3 gh3 = this.Z;
            khe khe = new khe(new x2((Object) gh3, 18, (Object) iab));
            fab fab = (fab) iab;
            fab.n(gh3.d() ? u9f.a : u9f.b);
            gh3.c((fh3) khe.getValue());
            x2 x2Var = new x2((Object) gh3, 19, (Object) khe);
            this.X = 1;
            if (j47.j(fab, x2Var, this) == tx3) {
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
