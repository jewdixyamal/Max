package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ip2  reason: default package */
public final class ip2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip2(rq2 rq2, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = rq2;
        this.Y = j;
        this.Z = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ip2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ip2(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        p82 l = ((jz2) this.X.X).l();
        e52 C = l.C(this.Y);
        if (C != null) {
            l.l(this.Z, C);
            ((k4a) ((pk) l.p.get())).r(C.a);
        }
        return e5f.a;
    }
}
