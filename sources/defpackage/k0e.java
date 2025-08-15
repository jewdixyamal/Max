package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k0e  reason: default package */
public final class k0e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0e(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k0e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k0e(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (j47.y(this.Y, this) == tx3) {
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
