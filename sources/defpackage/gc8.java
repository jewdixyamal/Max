package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gc8  reason: default package */
public final class gc8 extends ffe implements a66 {
    public final /* synthetic */ hc8 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gc8(hc8 hc8, Continuation continuation) {
        super(2, continuation);
        this.X = hc8;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((gc8) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gc8(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        hc8 hc8 = this.X;
        hc8.e(!hc8.e);
        hc8.h.invoke();
        return e5f.a;
    }
}
