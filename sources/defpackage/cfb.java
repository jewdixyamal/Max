package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cfb  reason: default package */
public final class cfb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dfb Y;
    public final /* synthetic */ ts2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfb(dfb dfb, ts2 ts2, Continuation continuation) {
        super(2, continuation);
        this.Y = dfb;
        this.Z = ts2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cfb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cfb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            teb teb = new teb(this.Z.a);
            this.X = 1;
            if (kld.a(teb, this) == tx3) {
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
