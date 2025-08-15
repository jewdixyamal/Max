package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: xt2  reason: default package */
public final class xt2 extends ffe implements m56 {
    public final /* synthetic */ pu2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xt2(pu2 pu2, Continuation continuation) {
        super(1, continuation);
        this.X = pu2;
    }

    public final Object invoke(Object obj) {
        xt2 xt2 = new xt2(this.X, (Continuation) obj);
        e5f e5f = e5f.a;
        xt2.o(e5f);
        return e5f;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pu2 pu2 = this.X;
        ArrayList e = pu2.a.e();
        boolean z = x53.q0(e) instanceof uk6;
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof nl2) {
                arrayList.add(next);
            }
        }
        ArrayList t0 = x53.t0(pu2.w0, x53.x0(arrayList, new fs4(14)));
        mt2 mt2 = new mt2(t0, z);
        String str = pu2.z0;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, zr6.h(t0.size(), "emitHistory "), (Throwable) null);
        }
        pu2.x0.m((Object) null, mt2);
        pu2.u0.set(e.isEmpty() && !z);
        return e5f.a;
    }
}
