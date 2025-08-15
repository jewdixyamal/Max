package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yg0  reason: default package */
public final class yg0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bh0 Y;
    public final /* synthetic */ je7 Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yg0(bh0 bh0, je7 je7, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = bh0;
        this.Z = je7;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yg0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yg0(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        bh0 bh0 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            jh0 jh0 = bh0.c;
            this.X = 1;
            jh0.getClass();
            Object k = j1e.k(new ih0(jh0, (vg0) this.Z.getValue(), (Continuation) null), this);
            if (k != tx3) {
                k = e5f;
            }
            if (k == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bh0.Z.m((Object) null, bh0.q(this.s0));
        return e5f;
    }
}
