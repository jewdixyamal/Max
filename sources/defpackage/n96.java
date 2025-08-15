package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: n96  reason: default package */
public final class n96 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ z96 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n96(z96 z96, Continuation continuation) {
        super(2, continuation);
        this.Z = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n96) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n96 n96 = new n96(this.Z, continuation);
        n96.Y = obj;
        return n96;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        z96 z96 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            kpa kpa = (kpa) this.Y;
            int intValue = ((Number) kpa.a).intValue();
            v86 v86 = (v86) kpa.b;
            if (tpa.f(v86, t86.b)) {
                boolean b = ((eua) z96.s0.getValue()).b(eua.l);
                zt0 zt0 = z96.D0;
                if (b) {
                    e86 e86 = e86.a;
                    this.X = 1;
                    if (zt0.o(e86, this) == tx3) {
                        return tx3;
                    }
                } else {
                    f86 f86 = f86.a;
                    this.X = 2;
                    if (zt0.o(f86, this) == tx3) {
                        return tx3;
                    }
                }
            } else if (v86 instanceof u86) {
                s35 s35 = z96.Y.c;
                if (z96.b.a) {
                    intValue--;
                }
                pnf.o(s35, new n86(intValue, ((b86) z96.C0.a.getValue()).a.b(), ((u86) v86).c));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return e5f.a;
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(z96.Y.c, l86.a);
        return e5f.a;
    }
}
