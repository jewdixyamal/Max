package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: rd5  reason: default package */
public final class rd5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ud5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd5(ud5 ud5, Continuation continuation) {
        super(2, continuation);
        this.Y = ud5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rd5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rd5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ud5 ud5 = this.Y;
            this.X = 1;
            ud5.getClass();
            if (ote.j(ud5.a, new ia4(4, ud5), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                hm9.p("FcmAnalyticsDao", "onLogout: clear failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
