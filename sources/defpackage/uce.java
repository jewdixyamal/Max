package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: uce  reason: default package */
public final class uce extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yce Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uce(yce yce, Continuation continuation) {
        super(2, continuation);
        this.Y = yce;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uce) n((String) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uce uce = new uce(this.Y, continuation);
        uce.X = obj;
        return uce;
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        Object value2;
        Object value3;
        od2.a0(obj);
        String str = (String) this.X;
        yce yce = this.Y;
        int intValue = ((Number) yce.H0.getValue()).intValue();
        q0e q0e2 = yce.I0;
        if (str == null || w9e.C0(str)) {
            x77 x77 = (x77) yce.M0.T0(yce, yce.S0[0]);
            if (x77 != null) {
                x77.cancel((CancellationException) null);
            }
            do {
                q0e = yce.C0;
                value = q0e.getValue();
                kce kce = (kce) value;
            } while (!q0e.c(value, (Object) null));
            do {
                value2 = q0e2.getValue();
                rce rce = (rce) value2;
            } while (!q0e2.c(value2, (Object) null));
        } else {
            rce rce2 = (rce) q0e2.getValue();
            if (rce2 != null && !w9e.p0(str, rce2.k(), false)) {
                do {
                    value3 = q0e2.getValue();
                    rce rce3 = (rce) value3;
                } while (!q0e2.c(value3, (Object) null));
                yce.q(intValue, str.toString());
            } else {
                yce.q(intValue, str.toString());
            }
        }
        return e5f.a;
    }
}
