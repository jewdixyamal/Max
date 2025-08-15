package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yeb  reason: default package */
public final class yeb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dfb Y;
    public final /* synthetic */ bhb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yeb(dfb dfb, bhb bhb, Continuation continuation) {
        super(2, continuation);
        this.Y = dfb;
        this.Z = bhb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yeb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yeb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            bhb bhb = this.Z;
            Long l = new Long(bhb.a);
            wm3 wm3 = bhb.b;
            ueb ueb = new ueb(l, wm3.a(), bre.c(wm3.w0), wm3.d(kk0.c));
            this.X = 1;
            if (kld.a(ueb, this) == tx3) {
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
