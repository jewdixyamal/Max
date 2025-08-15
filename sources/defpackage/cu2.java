package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cu2  reason: default package */
public final class cu2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;
    public final /* synthetic */ it2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu2(pu2 pu2, it2 it2, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2;
        this.Z = it2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cu2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cu2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (pu2.a(this.Y, (gt2) this.Z, this) == tx3) {
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
