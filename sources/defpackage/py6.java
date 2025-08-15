package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: py6  reason: default package */
public final class py6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fz6 Y;
    public final /* synthetic */ b86 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public py6(fz6 fz6, b86 b86, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6;
        this.Z = b86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((py6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new py6(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        b86 b86 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            a86 a86 = b86.a;
            this.X = 1;
            obj = fz6.a(a86, this.Y, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return b86.a(b86, ((Number) obj).intValue(), false, 13);
    }
}
