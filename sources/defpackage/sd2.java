package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sd2  reason: default package */
public final class sd2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ td2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sd2(td2 td2, Continuation continuation) {
        super(2, continuation);
        this.Y = td2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sd2) n((v50) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sd2 sd2 = new sd2(this.Y, continuation);
        sd2.X = obj;
        return sd2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        td2.w(this.Y, (v50) this.X);
        return e5f.a;
    }
}
