package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: mza  reason: default package */
public final class mza extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pza Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mza(pza pza, Continuation continuation) {
        super(2, continuation);
        this.Z = pza;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mza) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mza mza = new mza(this.Z, continuation);
        mza.Y = obj;
        return mza;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) this.Y;
            bc7[] bc7Arr = pza.s0;
            pza pza = this.Z;
            if (pza.r()) {
                list = pza.q(pza, list);
            }
            this.X = 1;
            pza.Y.setValue(list);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
