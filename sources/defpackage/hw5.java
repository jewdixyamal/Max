package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hw5  reason: default package */
public final class hw5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ iw5 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hw5(iw5 iw5, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = iw5;
        this.Z = str;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hw5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hw5(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ta2 ta2 = this.Y.b;
            this.X = 1;
            zb2 zb2 = (zb2) ta2;
            zb2.getClass();
            Object t0 = j47.t0(zb2.Y, new kb2(zb2, this.Z, this.s0, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
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
