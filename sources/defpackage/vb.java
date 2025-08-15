package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vb  reason: default package */
public final class vb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bc Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb(bc bcVar, Continuation continuation) {
        super(2, continuation);
        this.Z = bcVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vb) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vb vbVar = new vb(this.Z, continuation);
        vbVar.Y = obj;
        return vbVar;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Z.Y;
            this.X = 1;
            if (kld.a((List) this.Y, this) == tx3) {
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
