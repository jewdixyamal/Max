package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zg0  reason: default package */
public final class zg0 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ bh0 Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zg0(bh0 bh0, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = bh0;
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((zg0) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zg0 zg0 = new zg0(this.Y, this.Z, continuation);
        zg0.X = ((Boolean) obj).booleanValue();
        return zg0;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        bc7[] bc7Arr = bh0.u0;
        bh0 bh0 = this.Y;
        vxd S = j47.S(bh0.a, ((w9a) bh0.b).b(), vx3.b, new yg0(bh0, this.Z, z, (Continuation) null));
        bh0.t0.o1(bh0, bh0.u0[0], S);
        return e5f.a;
    }
}
