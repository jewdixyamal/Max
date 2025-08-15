package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gzd  reason: default package */
public final class gzd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jzd Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gzd(jzd jzd, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = jzd;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gzd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gzd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        jzd jzd = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((jz2) ((iy2) jzd.X.getValue())).u(this.Z, this);
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
            pnf.o(jzd.y0, syd.c.Z1(e52.a));
        }
        return e5f.a;
    }
}
