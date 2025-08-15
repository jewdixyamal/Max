package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: afb  reason: default package */
public final class afb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dfb Y;
    public final /* synthetic */ oi0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afb(dfb dfb, oi0 oi0, Continuation continuation) {
        super(2, continuation);
        this.Y = dfb;
        this.Z = oi0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((afb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new afb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            dfb dfb = this.Y;
            kld kld = dfb.a;
            oi0 oi0 = this.Z;
            web web = new web(new Long(oi0.a), dfb.a(dfb, oi0.b));
            this.X = 1;
            if (kld.a(web, this) == tx3) {
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
