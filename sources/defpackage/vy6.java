package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: vy6  reason: default package */
public final class vy6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fz6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vy6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vy6(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            fz6 fz6 = this.Y;
            fz6.v0.setValue((Object) null);
            hm9.m(fz6.E0, "cancel prefetchJob", new Object[0]);
            x77 x77 = fz6.y0;
            if (x77 != null) {
                x77.cancel((CancellationException) null);
            }
            fz6.y0 = null;
            fz6.f();
            x77 x772 = fz6.y0;
            if (x772 != null) {
                this.X = 1;
                if (x772.join(this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
