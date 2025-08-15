package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ms9  reason: default package */
public final class ms9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ps9 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms9(ps9 ps9, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ps9;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ms9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((gb6) this.Y.f.getValue()).a(this.Z, false, this);
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
