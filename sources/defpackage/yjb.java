package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: yjb  reason: default package */
public final class yjb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zjb Y;
    public final /* synthetic */ Map Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yjb(zjb zjb, HashMap hashMap, Continuation continuation) {
        super(2, continuation);
        this.Y = zjb;
        this.Z = hashMap;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yjb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yjb(this.Y, (HashMap) this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            zjb zjb = this.Y;
            if (!((gh3) zjb.Z.getValue()).f()) {
                kld kld = zjb.t0;
                Boolean bool = Boolean.TRUE;
                this.X = 1;
                if (kld.a(bool, this) == tx3) {
                    return tx3;
                }
            } else {
                e52 e52 = (e52) ((jz2) ((iy2) zjb.c.getValue())).m(zjb.b).a.getValue();
                if (e52 == null) {
                    return e5f;
                }
                zjb.y0.set(((k4a) ((pk) zjb.X.getValue())).l(e52.a, e52.b.a, 0, (String) null, false, (HashMap) this.Z));
                return e5f;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
