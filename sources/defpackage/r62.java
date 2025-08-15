package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r62  reason: default package */
public final class r62 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r62(k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Y = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((r62) n((o22) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r62 r62 = new r62(this.Y, continuation);
        r62.X = obj;
        return r62;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        o22 o22 = (o22) this.X;
        k72 k72 = this.Y;
        o22 o222 = (o22) k72.i.getValue();
        if ((o222 != null ? o222.b : null) == n22.c) {
            k72.i.setValue(o22);
        }
        bc7[] bc7Arr = k72.x;
        k72.d(k72.s());
        return e5f.a;
    }
}
