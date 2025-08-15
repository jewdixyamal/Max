package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: hz5  reason: default package */
public final class hz5 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ iz5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hz5(iz5 iz5, Continuation continuation) {
        super(2, continuation);
        this.Z = iz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hz5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hz5(this.Z, continuation);
    }

    public final Object o(Object obj) {
        a06 a06;
        ti9 ti9;
        iz5 iz5;
        ti9 ti92;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        iz5 iz52 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            Set set = iz52.a;
            this.X = iz52;
            this.Y = 1;
            obj = ((r79) wy5.a.getAccessor().c(r79.class)).b(set, this);
            if (obj == tx3) {
                return tx3;
            }
            iz5 = iz52;
        } else if (i == 1) {
            iz5 = (iz5) this.X;
            od2.a0(obj);
        } else if (i == 2) {
            ti9 = (ti9) this.X;
            od2.a0(obj);
            a06 = (a06) obj;
            ti9.setValue(a06);
            return e5f;
        } else if (i == 3) {
            ti92 = (ti9) this.X;
            od2.a0(obj);
            a06 = (a06) obj;
            ti9.setValue(a06);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iz5.o = (List) obj;
        q0e q0e = iz52.m;
        int size = iz52.a.size();
        d06 d06 = iz52.b;
        if (size > 1) {
            cu8 cu8 = (cu8) x53.i0(iz52.o);
            if (cu8 == null) {
                return e5f;
            }
            List list = iz52.o;
            this.X = q0e;
            this.Y = 2;
            Object b = d06.b(cu8.t0, list, this);
            if (b == tx3) {
                return tx3;
            }
            q0e q0e2 = q0e;
            obj = b;
            ti9 = q0e2;
            a06 = (a06) obj;
            ti9.setValue(a06);
            return e5f;
        }
        cu8 cu82 = (cu8) x53.i0(iz52.o);
        if (cu82 == null) {
            return e5f;
        }
        this.X = q0e;
        this.Y = 3;
        Object a = d06.a(cu82, iz52.d, this);
        if (a == tx3) {
            return tx3;
        }
        q0e q0e3 = q0e;
        obj = a;
        ti92 = q0e3;
        a06 = (a06) obj;
        ti9.setValue(a06);
        return e5f;
    }
}
