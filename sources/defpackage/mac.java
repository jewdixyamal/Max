package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mac  reason: default package */
public final class mac extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cbc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mac(cbc cbc, Continuation continuation) {
        super(2, continuation);
        this.Y = cbc;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mac) n((uac) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mac mac = new mac(this.Y, continuation);
        mac.X = obj;
        return mac;
    }

    public final Object o(Object obj) {
        Object value;
        q0e q0e;
        Object value2;
        q0e q0e2;
        Object value3;
        od2.a0(obj);
        uac uac = (uac) this.X;
        cbc cbc = this.Y;
        jac jac = cbc.c;
        boolean z = (uac instanceof sac) || (uac instanceof rac);
        q0e q0e3 = jac.o;
        do {
            value = q0e3.getValue();
            ((Boolean) value).getClass();
        } while (!q0e3.c(value, Boolean.valueOf(z)));
        boolean x = cbc.x();
        do {
            q0e = jac.Y;
            value2 = q0e.getValue();
            ((Boolean) value2).getClass();
        } while (!q0e.c(value2, Boolean.valueOf(x)));
        if (cbc.b == bac.a) {
            boolean z2 = !(uac instanceof tac);
            do {
                q0e2 = jac.s0;
                value3 = q0e2.getValue();
                ((Boolean) value3).getClass();
            } while (!q0e2.c(value3, Boolean.valueOf(z2)));
        }
        return e5f.a;
    }
}
