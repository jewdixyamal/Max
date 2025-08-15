package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z73  reason: default package */
public final class z73 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ d83 Y;
    public final /* synthetic */ y73 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z73(d83 d83, y73 y73, Continuation continuation) {
        super(2, continuation);
        this.Y = d83;
        this.Z = y73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z73) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z73(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.c;
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
