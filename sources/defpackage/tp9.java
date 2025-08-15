package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: tp9  reason: default package */
public final class tp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wp9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tp9(wp9 wp9, Continuation continuation) {
        super(2, continuation);
        this.Y = wp9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tp9) n((k4d) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tp9 tp9 = new tp9(this.Y, continuation);
        tp9.X = obj;
        return tp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        k4d k4d = (k4d) this.X;
        j4d j4d = k4d.a;
        h4d h4d = j4d instanceof h4d ? (h4d) j4d : null;
        Long l = h4d != null ? new Long(h4d.c) : null;
        l2b l2b = k4d.b;
        j2b j2b = l2b instanceof j2b ? (j2b) l2b : null;
        Long l2 = j2b != null ? new Long(j2b.b) : null;
        if (l == null) {
            l = l2;
        }
        q0e q0e = this.Y.X;
        Iterable<qo9> iterable = (Iterable) q0e.getValue();
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (qo9 qo9 : iterable) {
            arrayList.add(qo9.y(qo9, l != null && qo9.a == l.longValue()));
        }
        q0e.m((Object) null, arrayList);
        return e5f.a;
    }
}
