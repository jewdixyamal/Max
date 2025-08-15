package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: j49  reason: default package */
public final class j49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j49(n59 n59, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        n59 n59 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long j = n59.b.a;
            this.X = 1;
            obj = ((u79) n59.H0.getValue()).b(j, this.Z, this);
            if (obj == tx3) {
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
        if (!((Boolean) obj).booleanValue()) {
            cx7 c = ((w9a) n59.Y).c();
            i49 i49 = new i49(n59, (Continuation) null);
            this.X = 2;
            if (j47.t0(c, i49, this) == tx3) {
                return tx3;
            }
        }
        return e5f.a;
    }
}
