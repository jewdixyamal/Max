package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: yhb  reason: default package */
public final class yhb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jib Y;
    public final /* synthetic */ e52 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yhb(jib jib, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Y = jib;
        this.Z = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yhb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yhb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        jib jib = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (!((gh3) jib.Z.getValue()).f()) {
                this.X = 1;
                if (j47.x(500, this) == tx3) {
                    return tx3;
                }
            } else {
                e52 e52 = this.Z;
                jib.x0.set(((k4a) ((pk) jib.X.getValue())).l(e52.a, e52.b.a, 0, (String) null, true, (HashMap) null));
                return e5f;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kld kld = jib.Y;
        ez3 ez3 = ez3.a;
        this.X = 2;
        return kld.a(ez3, this) == tx3 ? tx3 : e5f;
    }
}
