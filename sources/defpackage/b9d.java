package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: b9d  reason: default package */
public final class b9d extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c9d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b9d(c9d c9d, Continuation continuation) {
        super(2, continuation);
        this.Y = c9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b9d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b9d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e8d e8d = this.Y.a;
            if (e8d == null) {
                e8d = null;
            }
            this.X = 1;
            s1e a = ((js7) e8d.w.getValue()).b().a();
            a.getClass();
            xlc a2 = xlc.a(0, "\n            SELECT id FROM events\n            WHERE status = 0 AND isCritical = 1\n        ");
            obj = ote.i(a.a, new CancellationSignal(), new r1e(a, a2, 3), this);
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
