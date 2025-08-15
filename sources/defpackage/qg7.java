package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qg7  reason: default package */
public final class qg7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rg7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qg7(rg7 rg7, Continuation continuation) {
        super(2, continuation);
        this.Y = rg7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qg7) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qg7 qg7 = new qg7(this.Y, continuation);
        qg7.X = obj;
        return qg7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        rg7 rg7 = this.Y;
        if (rg7.a.d.compareTo(fg7.b) >= 0) {
            rg7.a.a(rg7);
        } else {
            pag.d(sx3.getCoroutineContext());
        }
        return e5f.a;
    }
}
