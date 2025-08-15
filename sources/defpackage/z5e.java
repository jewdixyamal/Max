package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: z5e  reason: default package */
public final class z5e extends ffe implements a66 {
    public u4e X;
    public int Y;
    public final /* synthetic */ b6e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z5e(b6e b6e, Continuation continuation) {
        super(2, continuation);
        this.Z = b6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z5e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z5e(this.Z, continuation);
    }

    public final Object o(Object obj) {
        u4e u4e;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        b6e b6e = this.Z;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((Long) b6e.f.get()).longValue();
            this.Y = 1;
            obj = y4e.d((y4e) b6e.b.getValue(), (String) null, longValue, this, 5);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            u4e = this.X;
            od2.a0(obj);
            b6e.f.updateAndGet(new y5e(u4e, 0));
            q0e q0e = b6e.d;
            q0e.m((Object) null, x53.t0((Collection) q0e.getValue(), (List) obj));
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u4e u4e2 = (u4e) obj;
        uqd c = ((a4e) b6e.a.getValue()).c(u4e2.a);
        this.X = u4e2;
        this.Y = 2;
        Object f = s36.f(c, this);
        if (f == tx3) {
            return tx3;
        }
        u4e u4e3 = u4e2;
        obj = f;
        u4e = u4e3;
        b6e.f.updateAndGet(new y5e(u4e, 0));
        q0e q0e2 = b6e.d;
        q0e2.m((Object) null, x53.t0((Collection) q0e2.getValue(), (List) obj));
        return e5f.a;
    }
}
