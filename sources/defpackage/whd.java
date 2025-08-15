package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: whd  reason: default package */
public final class whd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cid Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public whd(cid cid, Continuation continuation) {
        super(2, continuation);
        this.Y = cid;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((whd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new whd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cid cid = this.Y;
            mtf mtf = (mtf) cid.y0.getValue();
            long t = ((hyc) cid.t()).t();
            this.X = 1;
            mtf.getClass();
            xlc a = xlc.a(1, "SELECT * FROM webapp_biometry WHERE user_id = ?");
            a.j(1, t);
            obj = ote.i(mtf.a, new CancellationSignal(), new jtf(mtf, a, 0), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boolean.valueOf(!((Collection) obj).isEmpty());
    }
}
