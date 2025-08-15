package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: pa  reason: default package */
public final class pa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ qa Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pa(je7 je7, qa qaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
        this.Z = qaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pa) n((oa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pa paVar = new pa(this.Y, this.Z, continuation);
        paVar.X = obj;
        return paVar;
    }

    public final Object o(Object obj) {
        Object value;
        jqe eqe;
        ArrayList b;
        od2.a0(obj);
        oa oaVar = (oa) this.X;
        ((ir1) this.Y.getValue()).h(oaVar.c);
        qa qaVar = this.Z;
        q0e q0e = qaVar.o;
        do {
            value = q0e.getValue();
            na naVar = (na) value;
            Map map = oaVar.a;
            eqe = map.isEmpty() ? new eqe(b8a.g2) : new aqe(a8a.a, map.size());
            qaVar.b.getClass();
            b = qx7.b(map);
            naVar.getClass();
        } while (!q0e.c(value, new na(eqe, b)));
        return e5f.a;
    }
}
