package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u96  reason: default package */
public final class u96 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ b86 Y;
    public final /* synthetic */ z96 Z;
    public final /* synthetic */ b86 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u96(b86 b86, z96 z96, b86 b862, Continuation continuation) {
        super(2, continuation);
        this.Y = b86;
        this.Z = z96;
        this.s0 = b862;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u96(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        z96 z96 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            b86 b86 = this.Y;
            if (b86 != null) {
                hq7 hq7 = z96.X;
                int i2 = z96.y0.b;
                this.X = 1;
                fz6 fz6 = (fz6) hq7;
                Object t0 = j47.t0(((w9a) fz6.c).b().plus(fz6.b), new ez6(fz6, b86.a, i2, (Continuation) null), this);
                if (t0 != tx3) {
                    t0 = e5f;
                }
                if (t0 == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z96.H0 = pnf.n(z96, ((w9a) z96.s()).e().plus(z96.o), (vx3) null, new g96(z96, this.s0, (Continuation) null), 2);
        return e5f;
    }
}
