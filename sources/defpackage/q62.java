package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q62  reason: default package */
public final class q62 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k72 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q62(k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Z = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q62) n((e52) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q62 q62 = new q62(this.Z, continuation);
        q62.Y = obj;
        return q62;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e52 e52 = (e52) this.Y;
            if (e52.J() && !e52.z()) {
                kld kld = this.Z.e;
                g43 g43 = g43.b;
                this.X = 1;
                if (kld.a(g43, this) == tx3) {
                    return tx3;
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
