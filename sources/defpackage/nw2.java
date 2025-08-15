package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nw2  reason: default package */
public final class nw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nx2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nw2(nx2 nx2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nw2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        nx2 nx2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            iy2 r = nx2.r(nx2);
            this.X = 1;
            obj = ((jz2) r).u(this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        if (e52 != null) {
            pnf.o(nx2.O0, gy2.a2(gy2.c, e52.a));
        }
        return e5f.a;
    }
}
