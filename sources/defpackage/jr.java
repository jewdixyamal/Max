package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jr  reason: default package */
public final class jr extends ffe implements a66 {
    public final /* synthetic */ kr X;
    public final /* synthetic */ wre Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jr(kr krVar, wre wre, Continuation continuation) {
        super(2, continuation);
        this.X = krVar;
        this.Y = wre;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jr) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jr(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        er erVar;
        od2.a0(obj);
        kr krVar = this.X;
        qp4 qp4 = krVar.y0;
        wre wre = this.Y;
        qp4.l(wre.b, true);
        do {
            q0e = krVar.z0;
            value = q0e.getValue();
            er erVar2 = (er) value;
            erVar = null;
            if (erVar2 != null) {
                List<wre> list = erVar2.a;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (wre wre2 : list) {
                    arrayList.add(tpa.f(wre2.b, wre.b) ? wre.k(wre2, true, (rre) null, 14) : wre.k(wre2, false, (rre) null, 14));
                }
                erVar = new er(arrayList, erVar2.b, krVar.s());
            }
        } while (!q0e.c(value, erVar));
        return e5f.a;
    }
}
