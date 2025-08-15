package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uwa  reason: default package */
public final class uwa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xwa Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ long[] s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwa(xwa xwa, e52 e52, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.Y = xwa;
        this.Z = e52;
        this.s0 = jArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uwa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uwa(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = xwa.l;
            xwa xwa = this.Y;
            if (!((gh3) xwa.f.getValue()).f()) {
                kld kld = xwa.g;
                rwa rwa = rwa.a;
                this.X = 1;
                if (kld.a(rwa, this) == tx3) {
                    return tx3;
                }
            } else {
                xwa.i.set(((k4a) ((pk) xwa.b.getValue())).d(xwa.a, this.Z.b.a, ys.l0(this.s0), true));
                return e5f;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
