package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: up8  reason: default package */
public final class up8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xp8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up8(Object obj, Continuation continuation, xp8 xp8) {
        super(2, continuation);
        this.X = obj;
        this.Y = xp8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((up8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new up8(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) this.X;
        if (e52.M()) {
            uj3 l = e52.l();
            if (l != null) {
                return ((tya) this.Y.e.getValue()).a(l, false);
            }
            throw new IllegalArgumentException("Dialog contact is not found".toString());
        }
        throw new IllegalArgumentException("Only dialogs are supported".toString());
    }
}
