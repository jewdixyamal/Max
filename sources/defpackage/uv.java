package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uv  reason: default package */
public final class uv extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ta3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uv(bx bxVar, long j, ta3 ta3, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
        this.s0 = ta3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uv) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uv(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bx bxVar = this.Y;
            uu uuVar = bxVar.j;
            re6 re6 = new re6(3, (Object) this.s0);
            this.X = 1;
            if (bxVar.u(uuVar, this.Z, re6, this) == tx3) {
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
