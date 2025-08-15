package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: do1  reason: default package */
public final class do1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eo1 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public do1(eo1 eo1, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = eo1;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((do1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new do1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        eo1 eo1 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((jz2) ((iy2) eo1.f.getValue())).u(this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j = ((e52) obj).a;
        kld kld = eo1.i;
        je1.c.getClass();
        kld.g(new c64(":profile?id=" + j + "&type=local_chat"));
        return e5f.a;
    }
}
