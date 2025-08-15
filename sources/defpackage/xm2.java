package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xm2  reason: default package */
public final class xm2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cn2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm2(cn2 cn2, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cn2;
        this.Z = j;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xm2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xm2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            cn2 cn2 = this.Y;
            Long j = cn2.j();
            if (j != null) {
                long longValue = j.longValue();
                List singletonList = Collections.singletonList(new Long(this.Z));
                this.X = 1;
                ((eh4) cn2.m.getValue()).a(cn2.a, longValue, singletonList, this.s0);
                if (e5f == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
