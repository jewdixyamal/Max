package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zid  reason: default package */
public final class zid extends ffe implements a66 {
    public final /* synthetic */ String X;
    public final /* synthetic */ ajd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zid(String str, ajd ajd, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = ajd;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zid) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zid(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        khe khe = j15.a;
        pnf.o(this.Y.X, j15.a(this.X));
        return e5f.a;
    }
}
