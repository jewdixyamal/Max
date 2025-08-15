package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p3d  reason: default package */
public final class p3d extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ q3d s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p3d(m3d m3d, Continuation continuation, q3d q3d) {
        super(2, continuation);
        this.Z = m3d;
        this.s0 = q3d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p3d) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p3d p3d = new p3d((m3d) this.Z, continuation, this.s0);
        p3d.Y = obj;
        return p3d;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 11);
            this.X = 1;
            if (this.Z.d(zqVar, this) == tx3) {
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
