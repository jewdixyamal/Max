package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qzf  reason: default package */
public final class qzf extends ffe implements a66 {
    public final /* synthetic */ zzf X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qzf(zzf zzf, Continuation continuation) {
        super(2, continuation);
        this.X = zzf;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qzf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qzf(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cpa cpa = cpa.a;
        zzf zzf = this.X;
        zzf.E0.m((Object) null, cpa);
        pnf.o(zzf.M0, czf.a);
        vsf vsf = (vsf) zzf.w0.getValue();
        wsf wsf = zzf.B0;
        if (wsf != null) {
            vsf.a(3, wsf.a, wsf.b, wsf.c, wsf.d, (String) null);
        }
        return e5f.a;
    }
}
