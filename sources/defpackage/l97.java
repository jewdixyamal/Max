package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l97  reason: default package */
public final class l97 extends ffe implements a66 {
    public final /* synthetic */ n97 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l97(n97 n97, Continuation continuation) {
        super(2, continuation);
        this.X = n97;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l97) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l97(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        n97 n97 = this.X;
        k4a k4a = (k4a) ((pk) n97.c.getValue());
        k4a.getClass();
        String str = n97.b;
        n97.o = (str == null || w9e.C0(str)) ? 0 : k4a.v(k4a, new oc2(((p7b) k4a.y()).a.o(), str, 0));
        return e5f.a;
    }
}
