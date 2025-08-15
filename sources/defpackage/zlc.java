package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: zlc  reason: default package */
public final class zlc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zlc(hmc hmc, Continuation continuation) {
        super(2, continuation);
        this.Y = hmc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zlc(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            s1e a = this.Y.a();
            this.X = 1;
            a.getClass();
            xlc a2 = xlc.a(0, "SELECT COUNT(*) FROM events");
            obj = ote.i(a.a, new CancellationSignal(), new r1e(a, a2, 0), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
