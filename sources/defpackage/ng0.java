package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ng0  reason: default package */
public final class ng0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ug0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng0(ug0 ug0, Continuation continuation) {
        super(2, continuation);
        this.Y = ug0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ng0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ng0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            ig0 ig0 = ig0.a;
            this.X = 1;
            if (kld.a(ig0, this) == tx3) {
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
