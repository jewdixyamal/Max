package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: am3  reason: default package */
public final class am3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((am3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new am3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jm3 jm3 = this.Y;
            kld kld = jm3.d;
            iv4 c = jm3.c();
            meb meb = (meb) jm3.b.getValue();
            boolean z = (meb == null || meb.a == null) ? false : true;
            c.getClass();
            eqe eqe = new eqe(vea.n);
            kl7 l = j1e.l();
            l.add(new mg3(sea.Y, new eqe(vea.o1), 3, false));
            l.add(new mg3(sea.a0, new eqe(vea.s), 3, false));
            l.add(new mg3(sea.Z, new eqe(vea.r), 3, false));
            if (z) {
                l.add(new mg3(sea.X, new eqe(vea.o), 1, false));
            }
            l.add(new mg3(sea.W, new eqe(vea.k), 2, false));
            rfb rfb = new rfb(eqe, (jqe) null, j1e.d(l));
            this.X = 1;
            if (kld.a(rfb, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
