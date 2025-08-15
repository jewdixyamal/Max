package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: po1  reason: default package */
public final class po1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ so1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public po1(so1 so1, Continuation continuation) {
        super(2, continuation);
        this.Y = so1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((po1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new po1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = so1.a(this.Y, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uj3 uj3 = (uj3) obj;
        long n = uj3.n();
        String d = uj3.d();
        if (d == null) {
            d = "";
        }
        return new baf(n, d, uj3.m(), uj3.w(), uj3.p(kk0.o));
    }
}
