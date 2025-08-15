package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: rgc  reason: default package */
public final class rgc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh7 Z;
    public final /* synthetic */ fg7 s0;
    public final /* synthetic */ a66 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rgc(gh7 gh7, fg7 fg7, a66 a66, Continuation continuation) {
        super(2, continuation);
        this.Z = gh7;
        this.s0 = fg7;
        this.t0 = a66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rgc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rgc rgc = new rgc(this.Z, this.s0, this.t0, continuation);
        rgc.Y = obj;
        return rgc;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jd4 jd4 = ql4.a;
            cx7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            a66 a66 = this.t0;
            qgc qgc = new qgc(this.Z, this.s0, (sx3) this.Y, a66, (Continuation) null);
            this.X = 1;
            if (j47.t0(immediate, qgc, this) == tx3) {
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
