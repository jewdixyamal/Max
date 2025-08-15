package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xh2  reason: default package */
public final class xh2 extends ffe implements a66 {
    public Object X;
    public List Y;
    public int Z;
    public final /* synthetic */ gi2 s0;
    public final /* synthetic */ tf2 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xh2(gi2 gi2, tf2 tf2, Continuation continuation) {
        super(2, continuation);
        this.s0 = gi2;
        this.t0 = tf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xh2(this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        ti9 ti9;
        gi2 gi2;
        List list;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = gi2.R0;
            gi2 gi22 = this.s0;
            e52 v = gi22.v();
            es8 es8 = v != null ? v.c : null;
            Long valueOf = es8 != null ? Long.valueOf(es8.k()) : null;
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                tf2 tf2 = this.t0;
                hm9.m(tf2.a, "getHistoryItems: %d", Long.valueOf(longValue));
                list = tf2.b.f(longValue);
                this.X = gi22;
                this.Y = list;
                this.Z = 1;
                if (gi2.t(gi22, list, this) == tx3) {
                    return tx3;
                }
                gi2 = gi22;
            }
            return e5f.a;
        } else if (i == 1) {
            list = this.Y;
            gi2 = (gi2) this.X;
            od2.a0(obj);
        } else if (i == 2) {
            ti9 = (ti9) this.X;
            od2.a0(obj);
            ti9.setValue(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0e q0e = gi2.O0;
        this.X = q0e;
        this.Y = null;
        this.Z = 2;
        Object A = gi2.A(list, (Long) null, this);
        if (A == tx3) {
            return tx3;
        }
        q0e q0e2 = q0e;
        obj = A;
        ti9 = q0e2;
        ti9.setValue(obj);
        return e5f.a;
    }
}
