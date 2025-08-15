package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zwf  reason: default package */
public final class zwf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dxf Z;
    public final /* synthetic */ gxf s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwf(dxf dxf, gxf gxf, Continuation continuation) {
        super(2, continuation);
        this.Z = dxf;
        this.s0 = gxf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zwf) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zwf zwf = new zwf(this.Z, this.s0, continuation);
        zwf.Y = obj;
        return zwf;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            dxf dxf = this.Z;
            ga7 e = dxf.e(dxf, (Throwable) this.Y);
            twf twf = twf.b;
            String str = this.s0.a;
            this.X = 1;
            if (((y83) dxf.c.getValue()).a(dxf.f, e, twf, str, this) == tx3) {
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
