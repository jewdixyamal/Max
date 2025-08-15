package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ut2  reason: default package */
public final class ut2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wt2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut2(wt2 wt2, Continuation continuation) {
        super(2, continuation);
        this.Y = wt2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ut2) n((at5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ut2 ut2 = new ut2(this.Y, continuation);
        ut2.X = obj;
        return ut2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.c.setValue((at5) this.X);
        return e5f.a;
    }
}
