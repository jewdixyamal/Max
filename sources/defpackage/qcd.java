package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qcd  reason: default package */
public final class qcd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qcd(add add, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qcd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        add add = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mb6 mb6 = add.c;
            this.X = 1;
            obj = mb6.b(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(add.A0, new zfd((String) obj, new eqe(mha.w)));
        return e5f.a;
    }
}
