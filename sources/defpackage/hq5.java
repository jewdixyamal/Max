package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: hq5  reason: default package */
public final class hq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ si9 s0;
    public final /* synthetic */ Object t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq5(mn5 mn5, si9 si9, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5;
        this.s0 = si9;
        this.t0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hq5) n((vld) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hq5 hq5 = new hq5(this.Z, this.s0, this.t0, continuation);
        hq5.Y = obj;
        return hq5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int ordinal = ((vld) this.Y).ordinal();
            si9 si9 = this.s0;
            if (ordinal == 0) {
                this.X = 1;
                if (this.Z.d(si9, this) == tx3) {
                    return tx3;
                }
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    Symbol symbol = lld.a;
                    Object obj2 = this.t0;
                    if (obj2 == symbol) {
                        si9.f();
                    } else {
                        si9.g(obj2);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
