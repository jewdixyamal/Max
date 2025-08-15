package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cj5  reason: default package */
public final class cj5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dj5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cj5(dj5 dj5, Continuation continuation) {
        super(2, continuation);
        this.Y = dj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cj5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cj5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            aj5 aj5 = aj5.a;
            this.X = 1;
            if (kld.a(aj5, this) == tx3) {
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
