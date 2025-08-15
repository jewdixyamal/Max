package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: med  reason: default package */
public final class med extends ffe implements a66 {
    public final /* synthetic */ ped X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public med(ped ped, Continuation continuation) {
        super(2, continuation);
        this.X = ped;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((med) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new med(this.X, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        LinkedHashMap linkedHashMap;
        od2.a0(obj);
        ped ped = this.X;
        ds3 ds3 = (ds3) ped.o.getValue();
        ds3.getClass();
        List<uj3> j = ds3.a.j(el3.r, el3.u);
        oq3 oq3 = (oq3) ped.Y.getValue();
        oq3.getClass();
        Collections.sort(j, new ca3(2, oq3));
        do {
            q0e = ped.t0;
            value = q0e.getValue();
            Map map = (Map) value;
            int Z = mz7.Z(z53.S(j, 10));
            if (Z < 16) {
                Z = 16;
            }
            linkedHashMap = new LinkedHashMap(Z);
            for (uj3 uj3 : j) {
                Long l = new Long(uj3.n());
                long n = uj3.n();
                String p = uj3.p(kk0.b);
                String d = uj3.d();
                if (d == null) {
                    d = "";
                }
                linkedHashMap.put(l, new wo0(n, p, d, uj3.m()));
            }
        } while (!q0e.c(value, linkedHashMap));
        return e5f.a;
    }
}
