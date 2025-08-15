package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ef1  reason: default package */
public final class ef1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ef1(of1 of1, Continuation continuation) {
        super(2, continuation);
        this.Y = of1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ef1) n((oa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ef1 ef1 = new ef1(this.Y, continuation);
        ef1.X = obj;
        return ef1;
    }

    public final Object o(Object obj) {
        q0e q0e;
        Object value;
        jqe eqe;
        List list;
        od2.a0(obj);
        oa oaVar = (oa) this.X;
        of1 of1 = this.Y;
        of1.Y.h(oaVar.c);
        do {
            q0e = of1.C0;
            value = q0e.getValue();
            na naVar = (na) value;
            Map map = oaVar.a;
            eqe = map.isEmpty() ? new eqe(b8a.g2) : new aqe(a8a.a, map.size());
            of1.Z.getClass();
            if (map.size() <= 5) {
                list = qx7.b(map);
            } else {
                kl7 l = j1e.l();
                Iterator it = map.entrySet().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        Map.Entry entry = (Map.Entry) next;
                        if (i >= 5) {
                            l.add(new aaf(new gqe(b8a.h2, ys.m0(new Object[]{Integer.valueOf(map.size())}))));
                            break;
                        }
                        l.add(qx7.d((gg1) entry.getKey(), (bo1) entry.getValue()));
                        i = i2;
                    } else {
                        y53.R();
                        throw null;
                    }
                }
                list = j1e.d(l);
            }
            naVar.getClass();
        } while (!q0e.c(value, new na(eqe, list)));
        return e5f.a;
    }
}
