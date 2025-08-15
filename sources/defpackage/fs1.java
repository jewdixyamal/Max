package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fs1  reason: default package */
public final class fs1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hs1 Y;
    public final /* synthetic */ b41 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fs1(hs1 hs1, b41 b41, Continuation continuation) {
        super(2, continuation);
        this.Y = hs1;
        this.Z = b41;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fs1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fs1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            w71 w71 = new w71(this.Z);
            this.X = 1;
            if (kld.a(w71, this) == tx3) {
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
