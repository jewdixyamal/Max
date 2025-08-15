package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xqa  reason: default package */
public final class xqa extends ffe implements a66 {
    public final /* synthetic */ cra X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqa(cra cra, Continuation continuation) {
        super(2, continuation);
        this.X = cra;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((xqa) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xqa(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.d();
        return e5f.a;
    }
}
