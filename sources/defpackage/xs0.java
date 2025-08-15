package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xs0  reason: default package */
public final class xs0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ix Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xs0(ix ixVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.Y = ixVar;
        this.Z = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xs0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xs0(this.Y, (ArrayList) this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((a66) this.Y.f).invoke(this.Z, this) == tx3) {
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
