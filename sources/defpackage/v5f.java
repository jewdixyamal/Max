package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v5f  reason: default package */
public final class v5f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w5f Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ k56 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v5f(w5f w5f, e52 e52, k56 k56, Continuation continuation) {
        super(2, continuation);
        this.Y = w5f;
        this.Z = e52;
        this.s0 = k56;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v5f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v5f(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.Y.g = false;
            w5f w5f = this.Y;
            this.X = 1;
            if (w5f.a(this.Z, (l29) w5f.b.getValue(), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.s0.invoke();
        return e5f.a;
    }
}
