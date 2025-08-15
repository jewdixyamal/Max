package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gf1  reason: default package */
public final class gf1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ of1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf1(of1 of1, Continuation continuation) {
        super(2, continuation);
        this.Y = of1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gf1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gf1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            of1 of1 = this.Y;
            w7c w7c = ((cra) of1.o).w0;
            ff1 ff1 = new ff1(of1, (Continuation) null);
            this.X = 1;
            if (od2.r(w7c, ff1, this) == tx3) {
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
