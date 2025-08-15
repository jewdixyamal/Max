package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ir  reason: default package */
public final class ir extends ffe implements a66 {
    public int X;
    public final /* synthetic */ kr Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ir(kr krVar, Continuation continuation) {
        super(2, continuation);
        this.Y = krVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ir) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ir(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        eqe eqe;
        tx3 tx3 = tx3.a;
        int i = this.X;
        kr krVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = kr.E0;
            nx3 b = ((w9a) ((kke) krVar.t0.getValue())).b();
            hr hrVar = new hr(krVar, (Continuation) null);
            this.X = 1;
            if (j47.t0(b, hrVar, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List e0 = x53.e0(((ConcurrentHashMap) ((je7) ((adb) krVar.y0.X).c).getValue()).values());
        ArrayList arrayList = new ArrayList(z53.S(e0, 10));
        Iterator it = ((ArrayList) e0).iterator();
        while (it.hasNext()) {
            sba sba = (sba) it.next();
            boolean f = tpa.f(sba.a, krVar.y0.g().a);
            Map map = krVar.y0.j() ? krVar.w0 : krVar.x0;
            String str = sba.a;
            Object obj2 = map.get(str);
            rre rre = obj2 instanceof rre ? (rre) obj2 : null;
            arrayList.add(new wre(f, str, sba, rre != null ? rre.a(0.45f) : null));
        }
        List<bq> D0 = x53.D0(bq.X);
        ArrayList arrayList2 = new ArrayList(z53.S(D0, 10));
        for (bq bqVar : D0) {
            Boolean valueOf = Boolean.valueOf(bqVar == krVar.B0);
            int i2 = fr.$EnumSwitchMapping$0[bqVar.ordinal()];
            if (i2 == 1) {
                eqe = new eqe(o4a.e);
            } else if (i2 == 2) {
                eqe = new eqe(o4a.b);
            } else if (i2 == 3) {
                eqe = new eqe(o4a.l);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new fq(bqVar, valueOf, eqe));
        }
        q0e q0e = krVar.z0;
        do {
            value = q0e.getValue();
            er erVar = (er) value;
        } while (!q0e.c(value, new er(arrayList, arrayList2, krVar.s())));
        return e5f.a;
    }
}
