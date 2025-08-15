package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tvc  reason: default package */
public final class tvc extends ffe implements a66 {
    public /* synthetic */ long X;
    public final /* synthetic */ vvc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvc(vvc vvc, Continuation continuation) {
        super(2, continuation);
        this.Y = vvc;
    }

    public final Object invoke(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Number) obj).longValue());
        e5f e5f = e5f.a;
        ((tvc) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tvc tvc = new tvc(this.Y, continuation);
        tvc.X = ((Number) obj).longValue();
        return tvc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long j = this.X;
        bc7[] bc7Arr = vvc.A0;
        vvc vvc = this.Y;
        vxd T = j47.T((jr1) vvc.c.getValue(), (lx3) null, (vx3) null, new mvc(j, vvc, (Continuation) null), 3);
        vvc.w0.o1(vvc, vvc.A0[0], T);
        return e5f.a;
    }
}
