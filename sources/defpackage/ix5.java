package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ix5  reason: default package */
public final class ix5 extends ffe implements a66 {
    public hx5 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ jx5 s0;
    public final /* synthetic */ lec t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ix5(jx5 jx5, lec lec, Continuation continuation) {
        super(2, continuation);
        this.s0 = jx5;
        this.t0 = lec;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ix5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ix5 ix5 = new ix5(this.s0, this.t0, continuation);
        ix5.Z = obj;
        return ix5;
    }

    public final Object o(Object obj) {
        iab iab;
        hx5 hx5;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        jx5 jx5 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            iab iab2 = (iab) this.Z;
            hx5 = new hx5(this.t0, iab2);
            jx5.Y.i.add(hx5);
            Boolean valueOf = Boolean.valueOf(jx5.Y.c());
            this.Z = iab2;
            this.X = hx5;
            this.Y = 1;
            if (((fab) iab2).a.o(valueOf, this) == tx3) {
                return tx3;
            }
            iab = iab2;
        } else if (i == 1) {
            hx5 = this.X;
            iab = (iab) this.Z;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yf3 yf3 = new yf3(jx5, 11, hx5);
        this.Z = null;
        this.X = null;
        this.Y = 2;
        if (j47.j(iab, yf3, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
