package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d2g  reason: default package */
public final class d2g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ i2g Y;
    public final /* synthetic */ f2g Z;
    public final /* synthetic */ v1g s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d2g(v1g v1g, f2g f2g, i2g i2g, Continuation continuation) {
        super(2, continuation);
        this.Y = i2g;
        this.Z = f2g;
        this.s0 = v1g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d2g) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d2g(this.s0, this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        v1g v1g = this.s0;
        f2g f2g = this.Z;
        if (i == 0) {
            od2.a0(obj);
            i2g i2g = this.Y;
            xbe xbe = new xbe(i2g.d == null ? wbe.c : wbe.b, i2g.b);
            zt0 zt0 = f2g.e;
            String str = v1g.a;
            ja7 ja7 = f2g.a;
            ja7.getClass();
            x97 x97 = new x97(str, ja7.b(xbe.Companion.serializer(), xbe));
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
