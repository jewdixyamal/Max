package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nza  reason: default package */
public final class nza extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pza Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nza(pza pza, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = pza;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nza) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nza(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            kq8 kq8 = this.Y.o;
            this.X = 1;
            xp8 xp8 = (xp8) kq8;
            xp8.getClass();
            Object k = j1e.k(new rp8(xp8, this.Z, (Continuation) null), this);
            if (k != tx3) {
                k = e5f;
            }
            if (k == tx3) {
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
