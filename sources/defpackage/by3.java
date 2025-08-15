package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: by3  reason: default package */
public final class by3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ ilc s0;
    public final /* synthetic */ on5 t0;
    public final /* synthetic */ String[] u0;
    public final /* synthetic */ Callable v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public by3(boolean z, ilc ilc, on5 on5, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.Z = z;
        this.s0 = ilc;
        this.t0 = on5;
        this.u0 = strArr;
        this.v0 = callable;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((by3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        by3 by3 = new by3(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        by3.Y = obj;
        return by3;
    }

    public final Object o(Object obj) {
        lx3 lx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            zt0 a = c37.a(-1, 0, 6);
            ay3 ay3 = new ay3(this.u0, a, 0);
            a.n(e5f);
            v0f v0f = (v0f) sx3.getCoroutineContext().get(v0f.c);
            if (v0f == null || (lx3 = v0f.a) == null) {
                boolean z = this.Z;
                ilc ilc = this.s0;
                lx3 = z ? f8.k(ilc) : f8.h(ilc);
            }
            zt0 a2 = c37.a(0, 0, 7);
            j47.T(sx3, lx3, (vx3) null, new zx3(this.s0, ay3, a, this.v0, a2, (Continuation) null), 2);
            this.X = 1;
            Object v = fp3.v(this.t0, a2, true, this);
            if (v != tx3) {
                v = e5f;
            }
            if (v == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
