package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: jw9  reason: default package */
public final class jw9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ kw9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw9(kw9 kw9, Continuation continuation) {
        super(2, continuation);
        this.Y = kw9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jw9(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kw9 kw9 = this.Y;
            this.X = 1;
            kw9.getClass();
            if (ote.j(kw9.a, new ia4(9, kw9), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                hm9.p("NotificationsReadMarksDao", "onLogout: clear failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
