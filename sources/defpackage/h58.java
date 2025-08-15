package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h58  reason: default package */
public final class h58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h58(p58 p58, Continuation continuation) {
        super(2, continuation);
        this.Y = p58;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h58(this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [kec, java.lang.Object] */
    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            p58 p58 = this.Y;
            q0e q0e = p58.s0;
            xw xwVar = new xw(8, (Object) p58);
            this.X = 1;
            q0e.d(new zq((kec) new Object(), 1, (on5) xwVar), this);
            return tx3;
        } else if (i == 1) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
