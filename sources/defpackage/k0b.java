package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: k0b  reason: default package */
public final class k0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((k0b) n((c64) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k0b k0b = new k0b(continuation, this.Y);
        k0b.X = obj;
        return k0b;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        n0b.c.R1((c64) this.X);
        return e5f.a;
    }
}
