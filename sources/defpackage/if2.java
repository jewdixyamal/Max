package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: if2  reason: default package */
public final class if2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jf2 Y;
    public final /* synthetic */ hf2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if2(jf2 jf2, hf2 hf2, Continuation continuation) {
        super(2, continuation);
        this.Y = jf2;
        this.Z = hf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((if2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new if2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            this.X = 1;
            if (kld.a(this.Z, this) == tx3) {
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
