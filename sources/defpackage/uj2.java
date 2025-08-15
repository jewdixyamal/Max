package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uj2  reason: default package */
public final class uj2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ck2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj2(ck2 ck2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uj2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        gef gef;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = ck2.d1;
            ck2 ck2 = this.Y;
            sb8 x = ck2.x();
            qb8 qb8 = x instanceof qb8 ? (qb8) x : null;
            if (qb8 == null || (gef = ((ej2) ck2.V0.getValue()).b) == null) {
                return e5f;
            }
            long c = gef.c();
            boolean c0 = gef.c0();
            this.X = 1;
            if (((wrc) ck2.C0.getValue()).a(qb8.a, qb8.X, this.Z, c, c0, this) == tx3) {
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
