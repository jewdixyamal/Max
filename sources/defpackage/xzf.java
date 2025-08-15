package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: xzf  reason: default package */
public final class xzf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zzf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xzf(zzf zzf, Continuation continuation) {
        super(2, continuation);
        this.Y = zzf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xzf) n((oxf) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xzf xzf = new xzf(this.Y, continuation);
        xzf.X = obj;
        return xzf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        oxf oxf = (oxf) this.X;
        zzf zzf = this.Y;
        w97 w97 = (w97) zzf.R0.get(new Long(oxf.a()));
        e5f e5f = e5f.a;
        if (w97 == null) {
            return e5f;
        }
        boolean z = oxf instanceof mxf;
        ConcurrentHashMap concurrentHashMap = zzf.R0;
        if (z) {
            w97.a(mwf.SUCCESS);
            concurrentHashMap.remove(new Long(((mxf) oxf).a));
        } else if (oxf instanceof lxf) {
            w97.a(mwf.CANCELLED);
            concurrentHashMap.remove(new Long(((lxf) oxf).a));
        } else if (oxf instanceof nxf) {
            w97.b(new Throwable());
            concurrentHashMap.remove(new Long(((nxf) oxf).a));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
