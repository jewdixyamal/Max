package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x62  reason: default package */
public final class x62 extends ffe implements a66 {
    public final /* synthetic */ int X;
    public final /* synthetic */ k72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x62(int i, k72 k72, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((x62) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x62(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (this.X == sea.E0) {
            bc7[] bc7Arr = k72.x;
            k72 k72 = this.Y;
            vxd T = j47.T(k72.b, ((w9a) k72.p()).b(), (vx3) null, new v62(k72, false, (Continuation) null), 2);
            k72.s.o1(k72, k72.x[0], T);
        }
        return e5f.a;
    }
}
