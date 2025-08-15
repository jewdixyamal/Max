package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oo5  reason: default package */
public final class oo5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ mn5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo5(long j, mn5 mn5, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = mn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oo5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oo5 oo5 = new oo5(this.Z, this.s0, continuation);
        oo5.Y = obj;
        return oo5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            mn5 mn5 = this.s0;
            no5 no5 = new no5(this.Z, mn5, (iab) this.Y, (Continuation) null);
            this.X = 1;
            if (j1e.k(no5, this) == tx3) {
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
