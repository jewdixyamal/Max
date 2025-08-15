package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: dw9  reason: default package */
public final class dw9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ew9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw9(ew9 ew9, Continuation continuation) {
        super(2, continuation);
        this.Y = ew9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dw9(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ew9 ew9 = this.Y;
            this.X = 1;
            ew9.getClass();
            if (ote.j(ew9.a, new ia4(8, ew9), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                hm9.p("NotificationsDao", "fail to clear on logout", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
