package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ehf  reason: default package */
public final class ehf extends ffe implements a66 {
    public final /* synthetic */ jhf X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ehf(jhf jhf, Continuation continuation) {
        super(2, continuation);
        this.X = jhf;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ehf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ehf(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        dkf dkf = this.X.d().X;
        if (dkf != null) {
            dkf.pause();
        }
        return e5f.a;
    }
}
