package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zr7  reason: default package */
public final class zr7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bs7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr7(bs7 bs7, Continuation continuation) {
        super(2, continuation);
        this.Y = bs7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zr7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zr7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bs7 bs7 = this.Y;
            String str = bs7.Z;
            StringBuilder sb = new StringBuilder("onFail: tasksIds=");
            List list = bs7.X;
            sb.append(list);
            hm9.m(str, sb.toString(), new Object[0]);
            js7 o = bs7.o();
            this.X = 1;
            hmc b = o.b();
            Object t0 = j47.t0(((w9a) b.a).b(), new gmc(b, list, 1, (Continuation) null), this);
            if (t0 != obj2) {
                t0 = obj3;
            }
            if (t0 != obj2) {
                t0 = obj3;
            }
            if (t0 == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
