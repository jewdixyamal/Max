package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bxf  reason: default package */
public final class bxf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dxf Y;
    public final /* synthetic */ gxf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxf(dxf dxf, gxf gxf, Continuation continuation) {
        super(2, continuation);
        this.Y = dxf;
        this.Z = gxf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bxf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bxf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (dxf.f(this.Y, this.Z, this) == tx3) {
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
