package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tvf  reason: default package */
public final class tvf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ hwf Z;
    public final /* synthetic */ vvf s0;
    public final /* synthetic */ evf t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvf(String str, hwf hwf, vvf vvf, evf evf, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = hwf;
        this.s0 = vvf;
        this.t0 = evf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tvf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tvf(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        evf evf = this.t0;
        vvf vvf = this.s0;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y;
            xbe xbe = new xbe((str == null || str.length() == 0) ? wbe.c : wbe.b, this.Z.b);
            zt0 zt0 = vvf.g;
            String str2 = evf.a;
            ja7 ja7 = vvf.a;
            ja7.getClass();
            x97 x97 = new x97(str2, ja7.b(xbe.Companion.serializer(), xbe));
            this.X = 1;
            if (zt0.o(x97, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vvf.e(vvf, evf.a);
        return e5f.a;
    }
}
