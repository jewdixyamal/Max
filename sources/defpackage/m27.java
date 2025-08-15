package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m27  reason: default package */
public final class m27 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ q27 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m27(q27 q27, Continuation continuation) {
        super(2, continuation);
        this.Y = q27;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m27) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m27(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.Z;
            this.X = 1;
            if (kld.a((Object) null, this) == tx3) {
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
