package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: dmc  reason: default package */
public final class dmc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dmc(hmc hmc, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = hmc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dmc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dmc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            s1e a = this.Y.a();
            this.X = 1;
            a.getClass();
            xlc a2 = xlc.a(1, "SELECT * FROM events WHERE id = ?");
            a2.j(1, this.Z);
            obj = ote.i(a.a, new CancellationSignal(), new r1e(a, a2, 1), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0e c0e = (c0e) obj;
        if (c0e == null) {
            return null;
        }
        long j = c0e.a;
        return new ps7(c0e.b, j, c0e.c, c0e.d);
    }
}
