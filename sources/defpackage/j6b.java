package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j6b  reason: default package */
public final class j6b extends ffe implements a66 {
    public final /* synthetic */ k56 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j6b(zja zja, Continuation continuation) {
        super(2, continuation);
        this.X = zja;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((j6b) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j6b((zja) this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.invoke();
        return e5f.a;
    }
}
