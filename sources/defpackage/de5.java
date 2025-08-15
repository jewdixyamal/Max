package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: de5  reason: default package */
public final class de5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ he5 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public de5(he5 he5, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = he5;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((de5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new de5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            he5 he5 = this.Y;
            long j = this.Z;
            this.X = 1;
            Object b = ((ew9) he5.Y.getValue()).b(j, this);
            return b == tx3 ? tx3 : b;
        } else if (i == 1) {
            try {
                od2.a0(obj);
                return obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                hm9.p("he5", "failed to read fcm notifications", th);
                return nz4.a;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
