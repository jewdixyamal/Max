package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ivf  reason: default package */
public final class ivf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vvf Z;
    public final /* synthetic */ evf s0;
    public final /* synthetic */ etf t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ivf(etf etf, evf evf, vvf vvf, Continuation continuation) {
        super(2, continuation);
        this.Z = vvf;
        this.s0 = evf;
        this.t0 = etf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ivf) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ivf ivf = new ivf(this.t0, this.s0, this.Z, continuation);
        ivf.Y = obj;
        return ivf;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List list = vvf.i;
            vvf vvf = this.Z;
            vvf.getClass();
            ga7 f = vvf.f((Throwable) this.Y);
            y83 g = vvf.g();
            String str = this.t0.b;
            this.X = 1;
            if (g.a(vvf.g, f, this.s0, str, this) == tx3) {
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
