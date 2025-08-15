package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fi5  reason: default package */
public final class fi5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gi5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi5(gi5 gi5, Continuation continuation) {
        super(2, continuation);
        this.Y = gi5;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fi5) n((b00) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fi5 fi5 = new fi5(this.Y, continuation);
        fi5.X = obj;
        return fi5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.E((b00) this.X);
        return e5f.a;
    }
}
