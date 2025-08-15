package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e8a  reason: default package */
public final class e8a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ f8a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e8a(f8a f8a, Continuation continuation) {
        super(2, continuation);
        this.Y = f8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e8a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e8a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            f8a f8a = this.Y;
            long j = f8a.b;
            this.X = 1;
            obj = ((iy2) f8a.d.getValue()).d(j, this);
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
