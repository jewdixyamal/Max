package defpackage;

import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: p49  reason: default package */
public final class p49 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ List s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p49(n59 n59, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = n59;
        this.s0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p49 p49 = new p49(this.Z, this.s0, continuation);
        p49.Y = obj;
        return p49;
    }

    public final Object o(Object obj) {
        String[] strArr;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            EnumSet<E> noneOf = EnumSet.noneOf(da3.class);
            bc7[] bc7Arr = n59.D1;
            n59 n59 = this.Z;
            qyc qyc = (qyc) ((y7d) n59.D0.getValue());
            qyc.getClass();
            List h = qyc.h(PmsKey.f9availablecomplaints.name(), (List) null);
            if (h == null || (strArr = (String[]) h.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            for (String a : strArr) {
                try {
                    obj2 = da3.a(a);
                } catch (Throwable th) {
                    obj2 = new njc(th);
                }
                if (obj2 instanceof njc) {
                    obj2 = null;
                }
                da3 da3 = (da3) obj2;
                if (da3 != null) {
                    noneOf.add(da3);
                }
            }
            if (!noneOf.isEmpty()) {
                mg3 mg3 = hs8.a;
                eqe eqe = new eqe(oda.x);
                eqe eqe2 = new eqe(oda.w);
                kl7 l = j1e.l();
                if (noneOf.contains(da3.SPAM)) {
                    l.add(new mg3(mda.k, new eqe(oda.C), 3, false));
                }
                if (noneOf.contains(da3.PORNO)) {
                    l.add(new mg3(mda.j, new eqe(oda.B), 3, false));
                }
                if (noneOf.contains(da3.FAKE)) {
                    l.add(new mg3(mda.h, new eqe(oda.z), 3, false));
                }
                if (noneOf.contains(da3.EXTREMISM)) {
                    l.add(new mg3(mda.g, new eqe(oda.y), 3, false));
                }
                if (noneOf.contains(da3.THREAT)) {
                    l.add(new mg3(mda.l, new eqe(oda.D), 3, false));
                }
                if (noneOf.contains(da3.OTHER)) {
                    l.add(new mg3(mda.i, new eqe(oda.A), 3, false));
                }
                l.add(hs8.a);
                pnf.o(n59.u1, new fnd(this.s0, eqe, eqe2, j1e.d(l)));
            } else {
                cx7 c = ((w9a) n59.Y).c();
                o49 o49 = new o49(n59, (Continuation) null);
                this.X = 1;
                if (j47.t0(c, o49, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
