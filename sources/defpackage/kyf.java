package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kyf  reason: default package */
public final class kyf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lyf Z;
    public final /* synthetic */ oyf s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kyf(lyf lyf, oyf oyf, Continuation continuation) {
        super(2, continuation);
        this.Z = lyf;
        this.s0 = oyf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kyf) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kyf kyf = new kyf(this.Z, this.s0, continuation);
        kyf.Y = obj;
        return kyf;
    }

    public final Object o(Object obj) {
        ga7 ga7;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = (Throwable) this.Y;
            lyf lyf = this.Z;
            lyf.getClass();
            gyf gyf = th instanceof gyf ? (gyf) th : null;
            if (gyf instanceof gyf) {
                ga7 = new ea7(new ha7("request_denied", 0));
            } else if (gyf == null) {
                ga7 = fa7.d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ga7 ga72 = ga7;
            hyf hyf = hyf.b;
            String str = this.s0.a;
            this.X = 1;
            if (((y83) lyf.c.getValue()).a(lyf.e, ga72, hyf, str, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
