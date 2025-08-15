package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e2g  reason: default package */
public final class e2g extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ f2g Z;
    public final /* synthetic */ v1g s0;
    public final /* synthetic */ i2g t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2g(v1g v1g, f2g f2g, i2g i2g, Continuation continuation) {
        super(2, continuation);
        this.Z = f2g;
        this.s0 = v1g;
        this.t0 = i2g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e2g) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e2g e2g = new e2g(this.s0, this.Z, this.t0, continuation);
        e2g.Y = obj;
        return e2g;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            f2g f2g = this.Z;
            f2g.getClass();
            ga7 f = f2g.f((Throwable) this.Y);
            y83 g = f2g.g();
            String str = this.t0.b;
            this.X = 1;
            if (g.a(f2g.e, f, this.s0, str, this) == tx3) {
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
