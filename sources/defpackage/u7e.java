package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u7e  reason: default package */
public final class u7e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m7e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u7e(m7e m7e, Continuation continuation) {
        super(2, continuation);
        this.Z = m7e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u7e) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u7e u7e = new u7e(this.Z, continuation);
        u7e.Y = obj;
        return u7e;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((on5) this.Y).a(this.Z, this) == tx3) {
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
