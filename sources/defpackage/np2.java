package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: np2  reason: default package */
public final class np2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np2(rq2 rq2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((np2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new np2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2 = this.Y;
            ((jz2) rq2.X).l().Q(this.Z);
            x95 x95 = rq2.c;
            x95.a.f(x95);
            kld kld = rq2.a1;
            g43 g43 = g43.b;
            this.X = 1;
            if (kld.a(g43, this) == tx3) {
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
