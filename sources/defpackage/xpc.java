package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: xpc  reason: default package */
public final class xpc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ uz9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xpc(zn5 zn5, ez9 ez9, Continuation continuation) {
        super(2, continuation);
        this.Z = zn5;
        this.s0 = ez9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xpc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xpc xpc = new xpc((zn5) this.Z, (ez9) this.s0, continuation);
        xpc.Y = obj;
        return xpc;
    }

    public final Object o(Object obj) {
        Throwable th;
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        uz9 uz9 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            try {
                mn5 mn5 = this.Z;
                xw xwVar = new xw(11, (Object) uz9);
                this.Y = sx32;
                this.X = 1;
                if (mn5.d(xwVar, this) == tx3) {
                    return tx3;
                }
                sx3 = sx32;
            } catch (Throwable th2) {
                sx3 sx33 = sx32;
                th = th2;
                sx3 = sx33;
                if (th instanceof CancellationException) {
                    ((ez9) uz9).b();
                } else if (!((ez9) uz9).e(th)) {
                    f46.S(sx3.getCoroutineContext(), th);
                }
                return e5f.a;
            }
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            try {
                od2.a0(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((ez9) uz9).b();
        return e5f.a;
    }
}
