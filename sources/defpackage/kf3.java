package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: kf3  reason: default package */
public final class kf3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ of3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kf3(of3 of3, Continuation continuation) {
        super(2, continuation);
        this.Y = of3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kf3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        of3 of3 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((i80) of3.s0.getValue()).a(of3.X, 2, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h80 h80 = (h80) obj;
        of3.o = h80.c;
        long S = z7.S(h80.X, kt4.MILLISECONDS);
        int i2 = ft4.o;
        of3.y0.m((Object) null, new Long(ft4.i(S, kt4.SECONDS)));
        vxd vxd = of3.D0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        of3.D0 = pnf.n(of3, (lx3) null, (vx3) null, new nf3(of3, (Continuation) null), 3);
        we6 we6 = (we6) ((cud) of3.u0.getValue());
        we6.g = of3.c;
        we6.b();
        return e5f.a;
    }
}
