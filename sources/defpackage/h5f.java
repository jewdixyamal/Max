package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h5f  reason: default package */
public final class h5f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ j5f Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h5f(j5f j5f, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j5f;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h5f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h5f(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            ((yj3) this.Y.e.getValue()).a(this.Z);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
