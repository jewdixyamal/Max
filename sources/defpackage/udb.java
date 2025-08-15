package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: udb  reason: default package */
public final class udb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ feb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public udb(feb feb, Continuation continuation) {
        super(2, continuation);
        this.Y = feb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((udb) n((pdb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        udb udb = new udb(this.Y, continuation);
        udb.X = obj;
        return udb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.y0.setValue((pdb) this.X);
        return e5f.a;
    }
}
