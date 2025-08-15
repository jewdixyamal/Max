package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vo8  reason: default package */
public final class vo8 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo8(List list, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vo8) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vo8 vo8 = new vo8(this.Z, continuation);
        vo8.Y = obj;
        return vo8;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((on5) this.Y).a(this.Z, this) == tx3) {
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
