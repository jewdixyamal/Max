package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cw2  reason: default package */
public final class cw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw2(gw2 gw2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cw2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        gw2 gw2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            el3 el3 = ((ds3) gw2.w0.getValue()).a;
            el3.getClass();
            long j = this.Z;
            cqc.a(new i82(el3, j, 1), el3.m, (f6) null, new un0(26), (ztc) null);
            iy2 s = gw2.s();
            this.X = 1;
            obj = ((jz2) s).u(j, this);
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
            pnf.o(gw2.H0, gy2.a2(gy2.c, e52.a));
        }
        return e5f.a;
    }
}
