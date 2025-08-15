package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nk1  reason: default package */
public final class nk1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ el1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk1(el1 el1, Continuation continuation) {
        super(2, continuation);
        this.Y = el1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nk1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nk1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            el1 el1 = this.Y;
            ac t = od2.t(el1.C0, el1.w0, el1.D0, new mk1(el1, (Continuation) null, 0));
            this.X = 1;
            if (od2.q(t, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
