package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: as7  reason: default package */
public final class as7 extends ffe implements a66 {
    public av0 X;
    public int Y;
    public final /* synthetic */ bs7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public as7(bs7 bs7, Continuation continuation) {
        super(2, continuation);
        this.Z = bs7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((as7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new as7(this.Z, continuation);
    }

    public final Object o(Object obj) {
        av0 av0;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        bs7 bs7 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            String str = bs7.Z;
            StringBuilder sb = new StringBuilder("onSuccess: tasksIds=");
            List list = bs7.X;
            sb.append(list);
            hm9.m(str, sb.toString(), new Object[0]);
            js7 o = bs7.o();
            this.Y = 1;
            hmc b = o.b();
            e5f t0 = j47.t0(((w9a) b.a).b(), new amc(b, list, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            av0 = this.X;
            od2.a0(obj);
            ((Number) obj).longValue();
            av0.c(new su(7));
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (bs7.Y) {
            av0 l = bs7.l();
            js7 o2 = bs7.o();
            this.X = l;
            this.Y = 2;
            hmc b2 = o2.b();
            Object t02 = j47.t0(((w9a) b2.a).b(), new zlc(b2, (Continuation) null), this);
            if (t02 == tx3) {
                return tx3;
            }
            av0 av02 = l;
            obj = t02;
            av0 = av02;
            ((Number) obj).longValue();
            av0.c(new su(7));
        }
        return e5f;
    }
}
