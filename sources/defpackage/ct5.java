package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ct5  reason: default package */
public final class ct5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ et5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct5(et5 et5, Continuation continuation) {
        super(2, continuation);
        this.Y = et5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ct5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ct5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            et5 et5 = this.Y;
            zn5 b = et5.c.b();
            kld kld = et5.a;
            this.X = 1;
            if (b.d(kld, this) == tx3) {
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
