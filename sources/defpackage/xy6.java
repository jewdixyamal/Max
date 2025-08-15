package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xy6  reason: default package */
public final class xy6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fz6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xy6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xy6(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            String str = fz6.E0;
            fz6 fz6 = this.Y;
            fz6.getClass();
            Object k = j1e.k(new sy6(fz6, (Continuation) null), this);
            if (k != tx3) {
                k = e5f;
            }
            if (k == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
