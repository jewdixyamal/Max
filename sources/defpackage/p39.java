package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: p39  reason: default package */
public final class p39 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ da3 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p39(n59 n59, da3 da3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = da3;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p39(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        n59 n59 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            kt8 kt8 = (kt8) n59.M0.getValue();
            this.X = 1;
            kt8.getClass();
            Object a = kt8.a(this.Z, Collections.singletonList(new Long(this.s0)), this);
            if (a != tx3) {
                a = e5f;
            }
            if (a == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cx7 c = ((w9a) n59.Y).c();
        o39 o39 = new o39(n59, (Continuation) null);
        this.X = 2;
        return j47.t0(c, o39, this) == tx3 ? tx3 : e5f;
    }
}
