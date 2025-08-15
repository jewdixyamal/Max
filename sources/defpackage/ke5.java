package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: ke5  reason: default package */
public final class ke5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ le5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ke5(le5 le5, Continuation continuation) {
        super(2, continuation);
        this.Y = le5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ke5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ke5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            le5 le5 = this.Y;
            this.X = 1;
            le5.getClass();
            if (ote.j(le5.a, new ia4(5, le5), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                hm9.p("FcmNotificationHistoryDao", "onLogout: clear failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
