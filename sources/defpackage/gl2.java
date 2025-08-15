package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gl2  reason: default package */
public final class gl2 extends ffe implements a66 {
    public il2 X;
    public pk Y;
    public int Z;
    public final /* synthetic */ il2 s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ long u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gl2(il2 il2, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.s0 = il2;
        this.t0 = str;
        this.u0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gl2(this.s0, this.t0, this.u0, continuation);
    }

    public final Object o(Object obj) {
        il2 il2;
        pk pkVar;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        if (i == 0) {
            od2.a0(obj);
            il2 = this.s0;
            pk pkVar2 = il2.b;
            this.X = il2;
            this.Y = pkVar2;
            this.Z = 1;
            Object A = od2.A(il2.a, this);
            if (A == tx3) {
                return tx3;
            }
            pkVar = pkVar2;
            obj = A;
        } else if (i == 1) {
            pkVar = this.Y;
            il2 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        k4a k4a = (k4a) pkVar;
        il2.i = k4a.v(k4a, new hf9(this.t0, ((p7b) k4a.y()).a.o(), longValue, this.u0));
        return e5f.a;
    }
}
