package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j6a  reason: default package */
public final class j6a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k6a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j6a(k6a k6a, Continuation continuation) {
        super(2, continuation);
        this.Y = k6a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j6a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j6a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        k6a k6a = this.Y;
        if (i == 0) {
            od2.a0(obj);
            xie xie = (xie) k6a.b.getValue();
            xie.getClass();
            sa3 sa3 = new sa3(0, new vpc((lx3) hz4.a, new rie(xie, (Continuation) null)));
            this.X = 1;
            if (s36.e(sa3, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hm9.m("PushToken", "Refresh current token succeed.", new Object[0]);
        xie xie2 = (xie) k6a.b.getValue();
        i6a i6a = new i6a(k6a);
        xie2.getClass();
        j47.T(xie2.s0, (lx3) null, (vx3) null, new sie(xie2, i6a, (Continuation) null), 3);
        return e5f.a;
    }
}
