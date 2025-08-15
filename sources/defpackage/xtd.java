package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xtd  reason: default package */
public final class xtd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z = 100;
    public final /* synthetic */ m56 s0;
    public final /* synthetic */ l17 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xtd(int i, utd utd, l17 l17, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.s0 = utd;
        this.t0 = l17;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xtd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xtd(this.Y, (utd) this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (j47.x(((long) this.Y) * this.Z, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.s0.invoke(this.t0);
        return e5f.a;
    }
}
