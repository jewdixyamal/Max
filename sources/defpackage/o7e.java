package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o7e  reason: default package */
public final class o7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o7e(a8e a8e, Continuation continuation) {
        super(2, continuation);
        this.Y = a8e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o7e(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        a8e a8e = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((x9c) a8e.Y.getValue()).a(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e5f e5f = e5f.a;
        if (!booleanValue) {
            return e5f;
        }
        pnf.o(a8e.A0, new ued(woc.w, new eqe(hja.C)));
        return e5f;
    }
}
