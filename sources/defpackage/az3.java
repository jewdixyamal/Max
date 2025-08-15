package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: az3  reason: default package */
public final class az3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cz3 Y;
    public final /* synthetic */ h32 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az3(cz3 cz3, h32 h32, Continuation continuation) {
        super(2, continuation);
        this.Y = cz3;
        this.Z = h32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((az3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new az3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            h32 h32 = this.Z;
            yy3 yy3 = new yy3(h32.a, h32.b);
            this.X = 1;
            if (kld.a(yy3, this) == tx3) {
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
