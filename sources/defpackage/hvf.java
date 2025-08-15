package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hvf  reason: default package */
public final class hvf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vvf Z;
    public final /* synthetic */ etf s0;
    public final /* synthetic */ evf t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hvf(etf etf, evf evf, vvf vvf, Continuation continuation) {
        super(2, continuation);
        this.Z = vvf;
        this.s0 = etf;
        this.t0 = evf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hvf) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hvf hvf = new hvf(this.s0, this.t0, this.Z, continuation);
        hvf.Y = obj;
        return hvf;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        evf evf = this.t0;
        vvf vvf = this.Z;
        if (i == 0) {
            od2.a0(obj);
            ja7 ja7 = vvf.a;
            String str = this.s0.b;
            vbe vbe = wbe.Companion;
            htf htf = new htf(str, (String) this.Y);
            ja7.getClass();
            x97 x97 = new x97(evf.a, ja7.b(htf.Companion.serializer(), htf));
            this.X = 1;
            if (vvf.g.o(x97, this) == tx3) {
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
