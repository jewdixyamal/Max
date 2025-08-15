package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zn8  reason: default package */
public final class zn8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eo8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn8(eo8 eo8, Continuation continuation) {
        super(2, continuation);
        this.Y = eo8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zn8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zn8(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            cn8 cn8 = cn8.a;
            this.X = 1;
            if (kld.a(cn8, this) == tx3) {
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
