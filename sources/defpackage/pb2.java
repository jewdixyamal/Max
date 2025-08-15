package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pb2  reason: default package */
public final class pb2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zb2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pb2(zb2 zb2, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pb2) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pb2 pb2 = new pb2(this.Z, continuation);
        pb2.Y = obj;
        return pb2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (zb2.j(this.Z, (List) this.Y, false, this) == tx3) {
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
