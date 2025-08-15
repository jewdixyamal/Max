package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fkd  reason: default package */
public final class fkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ csb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fkd(csb csb, Continuation continuation) {
        super(2, continuation);
        this.Y = csb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fkd) n((zjd) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fkd fkd = new fkd(this.Y, continuation);
        fkd.X = obj;
        return fkd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        zjd zjd = (zjd) this.X;
        csb csb = this.Y;
        if (zjd == null) {
            csb.setVisibility(8);
        } else {
            csb.setVisibility(0);
            CharSequence b = zjd.a.b(csb.getContext());
            if (b != null) {
                csb.setTitle(b);
                jqe jqe = zjd.b;
                csb.setBody(jqe != null ? jqe.b(csb.getContext()) : null);
                csb.a((String) null, zjd.c, (Integer) null, false);
                csb.setCounter(zjd.d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return e5f.a;
    }
}
