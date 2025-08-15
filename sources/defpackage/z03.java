package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z03  reason: default package */
public final class z03 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qp4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z03(qp4 qp4, Continuation continuation) {
        super(2, continuation);
        this.Y = qp4;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z03) n((fka) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z03 z03 = new z03(this.Y, continuation);
        z03.X = obj;
        return z03;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        fka fka = (fka) this.X;
        ((q0e) this.Y.Z).setValue(fka);
        String str = (String) this.Y.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "big_flow: onEach " + fka + ", isEmitted=true", (Throwable) null);
        }
        return e5f.a;
    }
}
