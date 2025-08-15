package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lf1  reason: default package */
public final class lf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lf1(of1 of1, Continuation continuation) {
        super(2, continuation);
        this.Y = of1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lf1) n((jb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lf1 lf1 = new lf1(this.Y, continuation);
        lf1.X = obj;
        return lf1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jb jbVar = (jb) this.X;
        boolean z = jbVar instanceof eb;
        of1 of1 = this.Y;
        if (z) {
            pnf.o(of1.E0, wj1.k);
        } else if (jbVar instanceof fb) {
            pnf.o(of1.E0, wj1.l);
        } else if (jbVar instanceof ib) {
            pnf.o(of1.E0, wj1.m);
        } else if (jbVar instanceof bb) {
            pnf.o(of1.E0, wj1.n);
        } else if (jbVar instanceof gb) {
            pnf.o(of1.E0, wj1.o);
        }
        return e5f.a;
    }
}
