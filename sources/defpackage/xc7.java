package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: xc7  reason: default package */
public final class xc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardStickersWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xc7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardStickersWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xc7) n((l7e) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xc7 xc7 = new xc7(this.Y, continuation);
        xc7.X = obj;
        return xc7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l7e l7e = (l7e) this.X;
        KeyboardStickersWidget keyboardStickersWidget = this.Y;
        keyboardStickersWidget.Y.E(l7e.a);
        keyboardStickersWidget.Z.E(l7e.b);
        return e5f.a;
    }
}
