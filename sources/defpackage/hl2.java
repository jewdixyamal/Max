package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hl2  reason: default package */
public final class hl2 extends ffe implements a66 {
    public pk X;
    public int Y;
    public final /* synthetic */ il2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hl2(il2 il2, Continuation continuation) {
        super(2, continuation);
        this.Z = il2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hl2(this.Z, continuation);
    }

    public final Object o(Object obj) {
        pk pkVar;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            il2 il2 = this.Z;
            pk pkVar2 = il2.b;
            this.X = pkVar2;
            this.Y = 1;
            obj = od2.A(il2.a, this);
            if (obj == tx3) {
                return tx3;
            }
            pkVar = pkVar2;
        } else if (i == 1) {
            pkVar = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        k4a k4a = (k4a) pkVar;
        k4a.getClass();
        k4a.v(k4a, new gq0(((p7b) k4a.y()).a.o(), longValue, 1));
        return e5f.a;
    }
}
