package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wqa  reason: default package */
public final class wqa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cra Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wqa(cra cra, Continuation continuation) {
        super(2, continuation);
        this.Y = cra;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wqa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wqa(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        cra cra = this.Y;
        if (i == 0) {
            od2.a0(obj);
            so1 so1 = cra.b;
            this.X = 1;
            obj = j47.t0(((w9a) ((kke) so1.c.getValue())).b(), new po1(so1, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fqa fqa = new fqa(mqa.a(), (bo1) obj);
        pqa pqa = (pqa) cra.s0.get();
        if (pqa == null) {
            cra.e(new pqa(fqa));
        } else {
            cra.e(new pqa(fqa, pqa.b, pqa.c, pqa.d, pqa.e, pqa.f, pqa.g, pqa.h));
        }
        cra.d();
        return e5f.a;
    }
}
