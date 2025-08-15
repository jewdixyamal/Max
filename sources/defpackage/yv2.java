package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yv2  reason: default package */
public final class yv2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gw2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv2(gw2 gw2, Continuation continuation) {
        super(2, continuation);
        this.Z = gw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yv2) n((it6) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yv2 yv2 = new yv2(this.Z, continuation);
        yv2.Y = obj;
        return yv2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            q0e q0e = this.Z.E0;
            ov2 ov2 = new ov2(nv2.c, "", (it6) this.Y, nz4.a, false);
            this.X = 1;
            q0e.m((Object) null, ov2);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
