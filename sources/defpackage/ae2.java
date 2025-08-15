package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ae2  reason: default package */
public final class ae2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k70 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae2(k70 k70, Continuation continuation) {
        super(2, continuation);
        this.Y = k70;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ae2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ae2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k70 k70 = this.Y;
            this.X = 1;
            obj = ((iy2) ((je7) k70.X).getValue()).d(k70.a, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
