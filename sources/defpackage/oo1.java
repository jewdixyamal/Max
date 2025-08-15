package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: oo1  reason: default package */
public final class oo1 extends ffe implements a66 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ so1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo1(Set set, so1 so1, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = so1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oo1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oo1(this.X, this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qpd, java.lang.Object, us] */
    public final Object o(Object obj) {
        od2.a0(obj);
        Set set = this.X;
        boolean isEmpty = set.isEmpty();
        oz4 oz4 = oz4.a;
        if (isEmpty) {
            return oz4;
        }
        el3 el3 = ((ds3) this.Y.b.getValue()).a;
        el3.b();
        ? qpd = new qpd(0);
        el3.a.forEach(new k82(set, 2, qpd));
        if (qpd.isEmpty()) {
            return oz4;
        }
        qpd qpd2 = new qpd(qpd.c);
        Iterator it = ((ps) qpd.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            uj3 uj3 = (uj3) entry.getValue();
            Long l = new Long(longValue);
            String d = uj3.d();
            if (d == null) {
                d = "";
            }
            long n = uj3.n();
            qpd2.put(l, new baf(n, d, uj3.m(), uj3.w(), uj3.p(kk0.o)));
        }
        return qpd2;
    }
}
