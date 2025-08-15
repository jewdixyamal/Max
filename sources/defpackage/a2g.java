package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a2g  reason: default package */
public final class a2g extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ r1g Z;
    public final /* synthetic */ f2g s0;
    public final /* synthetic */ v1g t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2g(r1g r1g, v1g v1g, f2g f2g, Continuation continuation) {
        super(2, continuation);
        this.Z = r1g;
        this.s0 = f2g;
        this.t0 = v1g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a2g) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f2g f2g = this.s0;
        a2g a2g = new a2g(this.Z, this.t0, f2g, continuation);
        a2g.Y = obj;
        return a2g;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        v1g v1g = this.t0;
        f2g f2g = this.s0;
        if (i == 0) {
            od2.a0(obj);
            r1g r1g = this.Z;
            u1g u1g = new u1g(r1g.b, r1g.c, (String) this.Y);
            zt0 zt0 = f2g.e;
            String str = v1g.a;
            ja7 ja7 = f2g.a;
            ja7.getClass();
            x97 x97 = new x97(str, ja7.b(u1g.Companion.serializer(), u1g));
            this.X = 1;
            if (zt0.o(x97, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f2g.e(f2g, v1g.a);
        return e5f.a;
    }
}
