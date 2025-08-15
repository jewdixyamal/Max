package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xl3  reason: default package */
public final class xl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xl3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.d;
            gfb.c.getClass();
            c64 c64 = new c64(":logout");
            this.X = 1;
            if (kld.a(c64, this) == tx3) {
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
