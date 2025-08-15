package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vq5  reason: default package */
public final class vq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k56 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq5(gyc gyc, Continuation continuation) {
        super(2, continuation);
        this.Z = gyc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vq5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vq5 vq5 = new vq5((gyc) this.Z, continuation);
        vq5.Y = obj;
        return vq5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Object invoke = this.Z.invoke();
            this.X = 1;
            if (((on5) this.Y).a(invoke, this) == tx3) {
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
