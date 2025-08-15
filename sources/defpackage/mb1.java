package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: mb1  reason: default package */
public final class mb1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vb1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb1(vb1 vb1, Continuation continuation) {
        super(2, continuation);
        this.Y = vb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mb1) n((t51) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mb1 mb1 = new mb1(this.Y, continuation);
        mb1.X = obj;
        return mb1;
    }

    public final Object o(Object obj) {
        Object value;
        nb1 nb1;
        String str;
        od2.a0(obj);
        t51 t51 = (t51) this.X;
        if (t51 instanceof l51) {
            long j = ((l51) t51).a;
            Long l = this.Y.z0;
            if (l != null && j == l.longValue()) {
                this.Y.z0 = null;
            }
        } else if (t51 instanceof m51) {
            m51 m51 = (m51) t51;
            long j2 = m51.a.a;
            Long l2 = this.Y.z0;
            if (l2 != null && j2 == l2.longValue()) {
                this.Y.z0 = null;
                vb1 vb1 = this.Y;
                q0e q0e = vb1.w0;
                do {
                    value = q0e.getValue();
                    nb1 = (nb1) value;
                    hi7 hi7 = m51.a;
                    dh6 dh6 = hi7.X;
                    if (dh6 == null || (str = dh6.X) == null) {
                        def def = hi7.Y;
                        str = def != null ? def.o : null;
                    }
                    def def2 = hi7.Y;
                    vb1.y0.o1(vb1, vb1.B0[0], j47.S(vb1.a, ((w9a) ((kke) vb1.u0.getValue())).b(), vx3.b, new tb1(def2.t0, def2.X, vb1, (Continuation) null)));
                } while (!q0e.c(value, nb1.a(nb1, (md0) null, (m38) null, (m38) null, false, str != null ? new iqe(str) : new eqe(b8a.c0), (ArrayList) null, (jqe) null, 111)));
            }
        }
        return e5f.a;
    }
}
