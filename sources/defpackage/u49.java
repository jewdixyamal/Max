package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: u49  reason: default package */
public final class u49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u49(n59 n59, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((hu8) this.Y.L0.getValue()).a(false, this.Z, this) == tx3) {
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
