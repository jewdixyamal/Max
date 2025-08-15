package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pm3  reason: default package */
public final class pm3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pm3(tm3 tm3, Continuation continuation) {
        super(2, continuation);
        this.Y = tm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pm3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            lm3 lm3 = lm3.a;
            this.X = 1;
            if (kld.a(lm3, this) == tx3) {
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
