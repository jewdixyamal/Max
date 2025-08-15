package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aw2  reason: default package */
public final class aw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ gw2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aw2(Object obj, Continuation continuation, gw2 gw2) {
        super(2, continuation);
        this.Y = obj;
        this.Z = gw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new aw2(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nzc nzc = this.Z.Y;
            this.X = 1;
            obj = nzc.b((kzc) this.Y, this);
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
