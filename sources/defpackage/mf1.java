package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: mf1  reason: default package */
public final class mf1 extends ffe implements a66 {
    public final /* synthetic */ of1 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mf1(of1 of1, String str, Continuation continuation) {
        super(2, continuation);
        this.X = of1;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mf1) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mf1(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        of1 of1 = this.X;
        String str = this.Y;
        of1.y0 = str;
        pqa pqa = (pqa) ((cra) of1.o).w0.a.getValue();
        if (!w9e.C0(str)) {
            kl7 l = j1e.l();
            je7 je7 = of1.s0;
            if (((b0d) je7.getValue()).h(pqa.a.b.getName(), str)) {
                l.add(pqa.a);
            }
            Collection values = pqa.c.values();
            ArrayList arrayList = new ArrayList();
            for (Object next : values) {
                if (((b0d) je7.getValue()).h(((fqa) next).b.getName(), str)) {
                    arrayList.add(next);
                }
            }
            l.addAll(arrayList);
            of1.q(of1, j1e.d(l), pqa.g);
        } else {
            kl7 l2 = j1e.l();
            l2.add(pqa.a);
            l2.addAll(pqa.c.values());
            of1.q(of1, j1e.d(l2), pqa.g);
        }
        return e5f.a;
    }
}
