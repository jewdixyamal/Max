package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zhb  reason: default package */
public final class zhb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jib Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zhb(jib jib, Continuation continuation) {
        super(2, continuation);
        this.Y = jib;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zhb) n((e52) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zhb zhb = new zhb(this.Y, continuation);
        zhb.X = obj;
        return zhb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) this.X;
        if (e52.J() && !e52.z()) {
            pnf.o(this.Y.B0, g43.b);
        }
        return e5f.a;
    }
}
