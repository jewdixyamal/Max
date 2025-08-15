package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: us1  reason: default package */
public final class us1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vs1 Y;
    public final /* synthetic */ y21 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public us1(vs1 vs1, y21 y21, Continuation continuation) {
        super(2, continuation);
        this.Y = vs1;
        this.Z = y21;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((us1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new us1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Z.d;
            this.X = 1;
            obj = j47.t0(((w9a) ((kke) this.Y.a.getValue())).b(), new ss1(str, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
