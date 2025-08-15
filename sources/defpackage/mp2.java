package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mp2  reason: default package */
public final class mp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mp2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        rq2 rq2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = (e52) rq2.Y0.a.getValue();
            if (e52 != null) {
                eyd eyd = (eyd) rq2.B0.getValue();
                String str = rq2.b;
                if (!(!(str == null || str.length() == 0))) {
                    str = null;
                }
                this.X = 1;
                if (eyd.a(e52.a, str, this) == tx3) {
                    return tx3;
                }
            }
            return e5f;
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rq2.b = null;
        return e5f;
    }
}
