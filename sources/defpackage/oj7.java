package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oj7  reason: default package */
public final class oj7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vj7 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oj7(vj7 vj7, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = vj7;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oj7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oj7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nj7 nj7 = new nj7(((zb2) ((ta2) this.Y.p.getValue())).g(), this.Z, 0);
            this.X = 1;
            obj = od2.C(nj7, this);
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
