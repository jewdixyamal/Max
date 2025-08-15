package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sp9  reason: default package */
public final class sp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wp9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sp9(wp9 wp9, Continuation continuation) {
        super(2, continuation);
        this.Y = wp9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sp9) n((e8b) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sp9 sp9 = new sp9(this.Y, continuation);
        sp9.X = obj;
        return sp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e8b e8b = (e8b) this.X;
        e5f e5f = e5f.a;
        if (e8b == null) {
            return e5f;
        }
        qo9 qo9 = e8b.c;
        this.Y.y0.setValue(e8b.a);
        this.Y.X.setValue(e8b.b);
        if (qo9 == null) {
            return e5f;
        }
        this.Y.o = qo9;
        this.Y.c.d(qo9);
        return e5f;
    }
}
