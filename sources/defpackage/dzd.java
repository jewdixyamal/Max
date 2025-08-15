package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dzd  reason: default package */
public final class dzd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jzd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dzd(jzd jzd, Continuation continuation) {
        super(2, continuation);
        this.Z = jzd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dzd) n((dn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dzd dzd = new dzd(this.Z, continuation);
        dzd.Y = obj;
        return dzd;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            q0e q0e = this.Z.t0;
            this.X = 1;
            q0e.setValue((dn3) this.Y);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
