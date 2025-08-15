package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: if3  reason: default package */
public final class if3 extends ffe implements a66 {
    public /* synthetic */ boolean X;

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((if3) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, if3] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = ((Boolean) obj).booleanValue();
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return Boolean.valueOf(this.X);
    }
}
