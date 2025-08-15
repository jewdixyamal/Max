package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: utf  reason: default package */
public final class utf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public utf(ouf ouf, Continuation continuation, boolean z) {
        super(2, continuation);
        this.Y = ouf;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((utf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new utf(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            w97 w97 = this.Y.l;
            kn0 kn0 = w97 instanceof kn0 ? (kn0) w97 : null;
            if (kn0 == null) {
                w97 w972 = this.Y.l;
                if (w972 != null) {
                    w972.b(new s0());
                }
                this.Y.l = null;
                return e5f;
            } else if (this.Z) {
                kn0.a(e5f);
                kld kld = this.Y.j;
                otf otf = otf.a;
                this.X = 1;
                if (kld.a(otf, this) == tx3) {
                    return tx3;
                }
            } else {
                kn0.b(new Throwable());
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y.l = null;
        return e5f;
    }
}
