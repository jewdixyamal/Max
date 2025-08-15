package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: x49  reason: default package */
public final class x49 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ List Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x49(n59 n59, List list, Continuation continuation) {
        super(2, continuation);
        this.X = n59;
        this.Y = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x49(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        od2.a0(obj);
        n59 n59 = this.X;
        e52 e52 = (e52) n59.o1.a.getValue();
        e5f e5f = e5f.a;
        if (!(e52 == null || (l = (Long) x53.i0(this.Y)) == null)) {
            long longValue = l.longValue();
            if (e52.X != null) {
                n59 n592 = n59;
                pnf.n(n59, ((w9a) n59.Y).b(), (vx3) null, new m59(n592, e52.a, longValue, e52.b.a, (Continuation) null), 2);
            }
        }
        return e5f;
    }
}
