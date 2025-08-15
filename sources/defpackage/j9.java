package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: j9  reason: default package */
public final class j9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ k9 Z;
    public final /* synthetic */ Set s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j9(int i, k9 k9Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = k9Var;
        this.s0 = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j9(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        k9 k9Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            boolean z = this.Y == wea.j;
            bc7[] bc7Arr = k9.i;
            List D0 = x53.D0(this.s0);
            this.X = 1;
            if (((jz2) ((iy2) k9Var.b.getValue())).e(k9Var.a, D0, this, z) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kld kld = k9Var.e;
        g43 g43 = g43.b;
        this.X = 2;
        if (kld.a(g43, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
