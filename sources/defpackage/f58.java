package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: f58  reason: default package */
public final class f58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;
    public final /* synthetic */ Long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f58(p58 p58, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = p58;
        this.Z = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f58(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            long longValue = this.Z.longValue();
            this.X = 1;
            obj2 = ((r79) this.Y.c.getValue()).a(longValue, this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj2;
        if (cu8 == null) {
            return e5f;
        }
        p58 p58 = this.Y;
        bc7[] bc7Arr = p58.I0;
        p4d r = p58.r();
        r.getClass();
        if (cu8.n()) {
            int i2 = 0;
            while (true) {
                k8g k8g = cu8.z0;
                if (i2 >= k8g.i()) {
                    break;
                }
                j00 e = crd.e(k8g.h(i2), cu8.t0, cu8.c, (Uri) null, ((se5) r.i).v());
                if (e != null) {
                    r.r(e);
                }
                i2++;
            }
        }
        ArrayList x = dy7.x(this.Y.r());
        this.Y.x0.m((Object) null, x);
        this.Y.u0 = x;
        zt0 zt0 = this.Y.t0;
        d48 d48 = d48.a;
        this.X = 2;
        return zt0.o(d48, this) == tx3 ? tx3 : e5f;
    }
}
