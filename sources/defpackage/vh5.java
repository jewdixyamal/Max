package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vh5  reason: default package */
public final class vh5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bi5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vh5(bi5 bi5, Continuation continuation) {
        super(2, continuation);
        this.Y = bi5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vh5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vh5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            y77 y77 = this.Y.k;
            this.X = 1;
            if (y77.join(this) == tx3) {
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
